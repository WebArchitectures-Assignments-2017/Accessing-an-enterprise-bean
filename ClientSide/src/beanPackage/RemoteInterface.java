package beanPackage;
import javax.ejb.Remote;
/**
 *
 * @author davide lissoni
 */
@Remote
//client remote interface
public interface RemoteInterface {
    public String dateTime();
    
}