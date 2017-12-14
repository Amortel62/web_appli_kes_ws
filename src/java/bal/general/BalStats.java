package bal.general;


import entites.Contrat;
import javax.inject.Inject;


public class BalStats {
  
    @Inject dao.consultation.contrat.DaoContrat  daoCont;
    
    public Float totalMontantContratsAnnee(int pAnnee){
    
      Float resultat= 0F;
    
      for (Contrat cont : daoCont.getTousLesContrats()){
      
           if(utilitaires.UtilDate.annee(cont.getDateCont())==pAnnee)resultat+=cont.getMontantContrat();
      }
    
      return resultat;
    }
    
    
    public Float totalMontantContratsAnneeEnCours(){
    
        return totalMontantContratsAnnee(utilitaires.UtilDate.anneeCourante());
    }
}
