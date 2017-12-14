package web.controleurs;

import dao.consultation.contrat.DaoContrat;
import entites.Contrat;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped

public class C101_ContConsContrat {
  
    @Inject private DaoContrat dao;
    
    private Long       numcont;
    private Contrat    contrat;
    
    public void rechercher(){ contrat= dao.getLeContrat(numcont);}

    //<editor-fold defaultstate="collapsed" desc="Getters et Setters">
    
    public Long getNumcont() {
        return numcont;
    }

    public void setNumcont(Long numcont) {
        this.numcont = numcont;
    }
    
    
     public Contrat getContrat() {
        return contrat;
    }

    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
    
    
    //</editor-fold>      
}
