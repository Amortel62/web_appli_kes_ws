
package web.controleurs;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@SessionScoped
public class C001_ContIndex {
    
     public void initSession(){
     FacesContext.getCurrentInstance().getExternalContext().getSession( true );
    }

}
