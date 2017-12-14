
package dao.consultation.contrat;

import entites.Contrat;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DaoContrat  implements Serializable{
    
    @PersistenceContext private EntityManager em;
    
    public Contrat getLeContrat(Long numcont){
      
       Contrat c= em.find(Contrat.class, numcont);
       return  c;
    } 
    
    public List<Contrat> getTousLesContrats(){
        
       return em.createQuery("Select c from Contrat c").getResultList();
    }
      
}
