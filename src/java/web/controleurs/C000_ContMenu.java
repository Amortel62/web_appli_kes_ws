
package web.controleurs;

import java.io.Serializable;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class C000_ContMenu  implements Serializable{
    
    private String langue="fr";
    
    public void changerLangue(String lg){
     
       langue=lg; 
       
        System.out.println("OK");
     }
    
    //<editor-fold defaultstate="collapsed" desc="get & set">
    public String getLangue() {
        return langue;
    }
    
    public void setLangue(String langue) {
        this.langue = langue;
        System.out.println(langue);
    }
    //</editor-fold>
      
}
