
package dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DtoStatsAnnee {

    
    private Float montantTotalContrat;

    public Float getMontantTotalContrat() {
        return montantTotalContrat;
    }

    public void setMontantTotalContrat(Float montantTotalContrat) {
        this.montantTotalContrat = montantTotalContrat;
    }
    
    
    
}
