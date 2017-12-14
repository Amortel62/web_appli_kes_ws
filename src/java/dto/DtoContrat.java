package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DtoContrat {
 
    private  Long    numcont;
    private  String  dateCont;
    private  Float   montantContrat;
    private  Float   coutAnnuelContrat;    
    private  Float   ecart;
    private  String  nomclient;
    private  String  adrclient;
    private  int     distanceKM;

    //<editor-fold defaultstate="collapsed" desc="Getters & Setters">
    
    public Long getNumcont() {
        return numcont;
    }
    
    public void setNumcont(Long numcont) {
        this.numcont = numcont;
    }
    
    public String getDateCont() {
        return dateCont;
    }
    
    public void setDateCont(String dateCont) {
        this.dateCont = dateCont;
    }
    
    public Float getMontantContrat() {
        return montantContrat;
    }
    
    public void setMontantContrat(Float montantContrat) {
        this.montantContrat = montantContrat;
    }
    
    public Float getCoutAnnuelContrat() {
        return coutAnnuelContrat;
    }
    
    public void setCoutAnnuelContrat(Float coutAnnuelContrat) {
        this.coutAnnuelContrat = coutAnnuelContrat;
    }
    
    public Float getEcart() {
        return ecart;
    }
    
    public void setEcart(Float ecart) {
        this.ecart = ecart;
    }
    
    public String getNomclient() {
        return nomclient;
    }
    
    public void setNomclient(String nomclient) {
        this.nomclient = nomclient;
    }
    
    public String getAdrclient() {
        return adrclient;
    }
    
    public void setAdrclient(String adrclient) {
        this.adrclient = adrclient;
    }
   
    public int getDistanceKM() {
        return distanceKM;
    }

    public void setDistanceKM(int distanceKM) {
        this.distanceKM = distanceKM;
    }
    
    
    //</editor-fold>   
}
