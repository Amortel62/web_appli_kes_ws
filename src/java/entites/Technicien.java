
package entites;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;
import static utilitaires.UtilDate.nombreAnneesEcouleesDepuis;

@XmlRootElement
@Entity
public class Technicien implements Serializable {
    
    //<editor-fold defaultstate="collapsed" desc="Identifiant Clé primaire">
    
    @Id
    private Long   numero;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attributs informationnels">
    
    private String nom;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateEmbauche;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attributs navigationnels">
    
    @OneToMany(mappedBy = "leTechnicien")
    private List<Intervention> lesInterventions;
    
    @ManyToOne
    private Grade leGrade;
    
    //</editor-fold>
     
    //<editor-fold defaultstate="collapsed" desc="BLL Méthodes d'instance">
    
    public Float coutHoraireTechnicien(){
        
        Float resu=0f;
        
        Float coutInitial= leGrade.getTauxHoraire();
        
        int anc=nombreAnneesEcouleesDepuis(dateEmbauche);
        
        Float coeff=1f;
        
        if ( anc>4)
            
            if(anc <11) coeff=1.05f;
            
            else if( anc<16) coeff=1.08f;
            
            else coeff=1.12f;
        
        resu= coeff*coutInitial;
        
        return resu;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
    
    public Grade getLeGrade() {
        return leGrade;
    }
    
    public void setLeGrade(Grade leGrade) {
        this.leGrade = leGrade;
    }
    
    public Date getDateEmbauche() {
        return dateEmbauche;
    }
    
    public void setDateEmbauche(Date dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public List<Intervention> getLesInterventions() {
        return lesInterventions;
    }

    public void setLesInterventions(List<Intervention> lesInterventions) {
        this.lesInterventions = lesInterventions;
    }
    
    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
     public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="HashCode & Equals">
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + (this.numero != null ? this.numero.hashCode() : 0);
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
        final Technicien other = (Technicien) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }
    //</editor-fold>   
}
