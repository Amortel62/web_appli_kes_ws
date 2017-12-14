package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DtoClient {

        private Long numero;
        private String nom;
        private String adresse;
        private int distanceKm;

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    /**
     * @return the numero
     */
    public Long getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(Long numero) {
        this.numero = numero;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the adresse
     */
    public String getAdresse() {
        return adresse;
    }

    /**
     * @param adresse the adresse to set
     */
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    /**
     * @return the distanceKm
     */
    public int getDistanceKm() {
        return distanceKm;
    }

    /**
     * @param distanceKm the distanceKm to set
     */
    public void setDistanceKm(int distanceKm) {
        this.distanceKm = distanceKm;
    }
    
    //</editor-fold> 
        
}
