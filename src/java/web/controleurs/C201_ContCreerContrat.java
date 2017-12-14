package web.controleurs;

import entites.Client;
import entites.Contrat;
import java.io.Serializable;
import java.util.Date;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.inject.Inject;

@ManagedBean
@ViewScoped
public class C201_ContCreerContrat implements Serializable {

    @Inject dao.consultation.client.DaoClient daoclient;
    @Inject dao.maj.DaoMaj                    daoMaj;
    
    private Long    numcli;
    private Client  client;
    
    private Contrat contrat= new Contrat();
    
    private boolean fait=false;
    
    @PostConstruct
    public void init(){ contrat.setDateCont(new Date()); }
    
    public void rechercherClient(){
         
        client= daoclient.getLeClient(numcli);
    }
    
    public void traiter(){
        
        fait=false;
        contrat.setLeClient(client);
        daoMaj.enregistrerEntite(contrat);
        fait=true;
    }

    public void raz(){
    
        numcli  = null;
        client  = new Client();
        contrat = new Contrat();
        contrat.setDateCont(new Date());
        fait    = false;
    }
    
    //<editor-fold defaultstate="collapsed" desc="getters & setters">
    
    public Long getNumcli() {
        return numcli;
    }
    
    public void setNumcli(Long numcli) {
        this.numcli = numcli;
    }
    
    public Client getClient() {
        return client;
    }
    
    public void setClient(Client client) {
        this.client = client;
    }
    
    public Contrat getContrat() {
        return contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }
    
    public boolean isFait() {
        return fait;
    }

    public void setFait(boolean fait) {
        this.fait = fait;
    }
    
    //</editor-fold>       
}
