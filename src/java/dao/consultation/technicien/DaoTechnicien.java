package dao.consultation.technicien;

import entites.Technicien;
import java.io.Serializable;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DaoTechnicien implements Serializable{
    
 @PersistenceContext private EntityManager em;
 
 public Technicien getLeTechnicien(Long numTech){
 
     return em.find(Technicien.class, numTech);
 }

}
