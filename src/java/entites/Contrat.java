package entites;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import static utilitaires.UtilDate.*;

@XmlRootElement
@Entity
@SequenceGenerator(name = "SequenceIdCont", sequenceName = "SEQ_ID_CONT")

public class Contrat implements Serializable {
    
    @Id
    @GeneratedValue(generator = "SequenceIdCont")
    private Long numero;
   
    //<editor-fold defaultstate="collapsed" desc="Attributs informationnels">
    
    private Float    montantContrat;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private  Date dateCont;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attributs navigationnels">
    
    @OneToMany(mappedBy = "leContrat")
    private List<Intervention> lesInterventions;
    
    @ManyToOne
    private Client leClient;
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="BLL méthodes d'instance">
    
    public Float   ecart(){
        
        return this.montantContrat-coutTotalContrat(); 
    }
    
    public Float coutTotalContrat() {
        
        Float totalIntervs=0f;
        
        for (Intervention interv : lesInterventions){
            
            if (annee(interv.getDateInterv()) == anneeCourante()){
                
                totalIntervs+=interv.coutInterv();
            }    
        }
        return totalIntervs;
    }
    
    public List<Intervention> getInterventionsAnneeCourante(){
    
       return getInterventionsAnnee(utilitaires.UtilDate.anneeCourante()) ;       
    }
    
    public List<Intervention> getInterventionsAnnee(int pAnnee){
    
     List<Intervention> lesIntervs= new LinkedList();
     
     for (Intervention interv : this.lesInterventions){ 
         
          if ( annee(interv.getDateInterv())== pAnnee) lesIntervs.add(interv);
             
     }
     return lesIntervs;
      
    }
    
    //</editor-fold>   
     
    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">

    
    public Float getMontantContrat() {
        return montantContrat;
    }

    public void setMontantContrat(Float montantContrat) {
        this.montantContrat = montantContrat;
    }
   
    public Client getLeClient() {
        return leClient;
    }
    
    public void setLeClient(Client leClient) {
        this.leClient = leClient;
    }
   
    
    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
    
    public List<Intervention> getLesInterventions() {
        return lesInterventions;
    }

    public void setLesInterventions(List<Intervention> lesInterventions) {
        this.lesInterventions = lesInterventions;
    }
    
    public Date getDateCont() {
        return dateCont;
    }

    public void setDateCont(Date dateCont) {
        this.dateCont = dateCont;
    }
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="HashCode et Equals">
    
     @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + (this.numero != null ? this.numero.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contrat other = (Contrat) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }

    //</editor-fold>   
}
   
