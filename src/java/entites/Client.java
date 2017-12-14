package entites;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
public class Client implements Serializable {
    
    //<editor-fold defaultstate="collapsed" desc="Identifiant Clé primaire">
    
    @Id
    private Long     numero;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attributs informationnels">
    
    private String   nom;
    private String   adresse;
    private int      distanceKM;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Attrinuts navigationnels">
    
    @OneToMany(mappedBy = "leClient")
    private List<Contrat> lesContrats;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Getters et setters">
    
    public int getDistanceKM() {
        return distanceKM;
    }
    
    public void setDistanceKM(int distanceKM) {
        this.distanceKM = distanceKM;
    }
    
    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
     public List<Contrat> getLesContrats() {
        return lesContrats;
    }

    public void setLesContrats(List<Contrat> lesContrats) {
        this.lesContrats = lesContrats;
    }
    
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
  
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Hash Code & Equals">
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + (this.numero != null ? this.numero.hashCode() : 0);
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
        final Client other = (Client) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }
    //</editor-fold>
}
