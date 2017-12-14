package bal.contrat;

import dao.consultation.contrat.DaoContrat;
import entites.Contrat;
import java.util.LinkedList;
import java.util.List;
import javax.inject.Inject;

public class BalContrat {
   
    @Inject private DaoContrat dao;
    
    public Float         ecartTotalAnnee(){
    
        Float resu=0F;
        for ( Contrat cont : dao.getTousLesContrats() ){ resu+=cont.ecart(); }   
        return resu;
    } 
    
    public List<Contrat> getLesContratsDeficitaires(Float seuil){
    
     List<Contrat> listeCont= new LinkedList();
     
     for (Contrat cont : dao.getTousLesContrats()){
     
       if (cont.ecart()<-seuil) { listeCont.add(cont);}
     }
     
     
     return listeCont;
    
    }
}