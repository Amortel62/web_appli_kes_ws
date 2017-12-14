package dao.consultation.client;

import entites.Client;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DaoClient implements Serializable{
    
 @PersistenceContext private EntityManager em;
 
 public Client getLeClient(Long numcli){
 
     return em.find(Client.class, numcli);
 }

}
