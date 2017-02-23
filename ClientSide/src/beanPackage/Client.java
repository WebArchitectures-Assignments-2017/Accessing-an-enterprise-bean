package beanPackage;

import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
	//server naming requirements for lookup
	private static final String app = "ServerSide";
    private static final String module = "ServerSide-ejb";
    private static final String bean = "ServerClass";
    private static final String viewClass = "beanPackage.RemoteInterface";

    public static void main(String[] args) {

        try {
        	//wildfly access requirements
            Properties jndiProps = new Properties();
            jndiProps.put(Context.INITIAL_CONTEXT_FACTORY, "org.jboss.naming.remote.client.InitialContextFactory");
            jndiProps.put(Context.PROVIDER_URL, "http-remoting://localhost:8080");
            jndiProps.put(Context.SECURITY_PRINCIPAL, "admin");
            jndiProps.put(Context.SECURITY_CREDENTIALS, "admin");
            jndiProps.put("jboss.naming.client.ejb.context", true);

            InitialContext initialContext = new InitialContext(jndiProps);

            RemoteInterface beaninterface = (RemoteInterface) initialContext.lookup(app + "/" + module + "/" + bean + "!" + viewClass);
            //call twice the method on the bean and print out the result
            System.out.println("\n" + beaninterface.dateTime() + "\n"+ beaninterface.dateTime());
         

        } catch (NamingException e) {
            System.err.println(e);
        }
	
}
}
