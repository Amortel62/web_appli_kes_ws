
package entites;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
public class Intervention implements Serializable {
    
    //<editor-fold defaultstate="collapsed" desc="Identifiant Clé primaire">
    
    @Id
    private Long numero;
    
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Attributs informationnels">
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateInterv;
    
    private int duree;
    
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Attributs navigationnels">
    
    @ManyToOne
    private Technicien leTechnicien;
    
    @ManyToOne
    private Contrat    leContrat;
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="BLL  Methodes d'instance">
    
    public Float fraisKM() { return leContrat.getLeClient().getDistanceKM()*tarifKM();}
    
    public Float fraisMO() { return duree*leTechnicien.coutHoraireTechnicien();}
    
    public Float coutInterv(){ return fraisKM() + fraisMO(); }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="BLL méthodes de classe">
    
    public static Float tarifKM(){ return 0.35f;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="getters et setters">
    
    public Contrat getLeContrat() {
        return leContrat;
    }
    
    public void setLeContrat(Contrat leContrat) {
        this.leContrat = leContrat;
    }
    
    
    public Technicien getLeTechnicien() {
        return leTechnicien;
    }
    
    public void setLeTechnicien(Technicien leTechnicien) {
        this.leTechnicien = leTechnicien;
    }
    
    public int getDuree() {
        return duree;
    }
    
    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    public Long getNumero() {
        return numero;
    }
    
    public void setNumero(Long numero) {
        this.numero = numero;
    }
    
    public Date getDateInterv() {
        return dateInterv;
    }

    public void setDateInterv(Date dateInterv) {
        this.dateInterv = dateInterv;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="HashCode et Equals">
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + (this.numero != null ? this.numero.hashCode() : 0);
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
        final Intervention other = (Intervention) obj;
        if (this.numero != other.numero && (this.numero == null || !this.numero.equals(other.numero))) {
            return false;
        }
        return true;
    }
    //</editor-fold>   
}
