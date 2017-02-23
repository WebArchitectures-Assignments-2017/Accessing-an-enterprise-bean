/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanPackage;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
/**
 *
 * @author davidelissoni
 */
@Stateless
//bean body
public class ServerClass implements RemoteInterface{

    @Override
    public String dateTime() {
        //get date and time
  GregorianCalendar gc = new GregorianCalendar();
int year = gc.get(Calendar.YEAR);
int month = gc.get(Calendar.MONTH) + 1;
int day = gc.get(Calendar.DATE);
int hour = gc.get(Calendar.HOUR);
int min = gc.get(Calendar.MINUTE);
int sec = gc.get(Calendar.SECOND);

//return formatted date and time
 return "date: "+day+"/"+month+"/"+year+" hour: "+hour+":"+min+":"+sec;
    
}
}