
package dao.maj;

import java.io.Serializable;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DaoMaj implements Serializable{
  
    @PersistenceContext
    private EntityManager em;
    
    public void enregistrerEntite(Object entite) { em.persist(entite);}
    
    public void supprimerEntite(Object entite) {
        
        Object asupp=em.merge(entite);
        em.remove(asupp);
    }
 
    public void mettreAJourEntite(Object entite) { em.merge(entite); }
    
    public void detacherEntite(Object entite) {em.detach(entite); }
     
    public void rafraichirEntite(Object entite) { em.refresh(entite); }
   
    public EntityManager getEm() { return em; }
    
}
