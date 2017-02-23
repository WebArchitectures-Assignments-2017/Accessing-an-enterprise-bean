/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beanPackage;
import javax.ejb.Remote;
/**
 *
 * @author davidelissoni
 */
@Remote
//bean remote interface
public interface RemoteInterface {
    public String dateTime();
    
}
