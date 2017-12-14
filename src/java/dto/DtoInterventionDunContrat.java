
package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DtoInterventionDunContrat {

    private Long     numcont;
    private Long     numInterv;
    private String   dateInterv;
    private int      duree;
    private Float    coutMO;
    private Float    coutKM;
    private Float    coutInterv;
    private String   nomTech;
    
    //<editor-fold defaultstate="collapsed" desc="gets et sets">
    
    public Long getNumcont() {
        return numcont;
    }
    
    public void setNumcont(Long numcont) {
        this.numcont = numcont;
    }
    
    public Long getNumInterv() {
        return numInterv;
    }
    
    public void setNumInterv(Long numInterv) {
        this.numInterv = numInterv;
    }
    
    public String getDateInterv() {
        return dateInterv;
    }
    
    public void setDateInterv(String dateInterv) {
        this.dateInterv = dateInterv;
    }
    
    public int getDuree() {
        return duree;
    }
    
    public void setDuree(int duree) {
        this.duree = duree;
    }
    
    public Float getCoutMO() {
        return coutMO;
    }
    
    public void setCoutMO(Float coutMO) {
        this.coutMO = coutMO;
    }
    
    public Float getCoutKM() {
        return coutKM;
    }
    
    public void setCoutKM(Float coutKM) {
        this.coutKM = coutKM;
    }
    
    public Float getCoutInterv() {
        return coutInterv;
    }
    
    public void setCoutInterv(Float coutInterv) {
        this.coutInterv = coutInterv;
    }
    
    public String getNomTech() {
        return nomTech;
    }
    
    public void setNomTech(String nomTech) {
        this.nomTech = nomTech;
    }
    //</editor-fold>    
}
