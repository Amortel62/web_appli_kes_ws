
package web.services.rest;

import dto.DtoStatsAnnee;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Stateless
@Path("stats")
public class WebServRestStats {
   
    @Inject bal.general.BalStats              balstat;    
    
    @GET
    @Path("montantContratsAnneeCourante")
    @Produces("text/plain")
    public String totalMontantAnneeCourante(){
        return balstat.totalMontantContratsAnneeEnCours().toString();
    }
 
    @GET
    @Path("toutes")
    @Produces({"application/xml","application/json"})
    public DtoStatsAnnee statsAnneeCourante(){
       
        DtoStatsAnnee dto=new DtoStatsAnnee();
        dto.setMontantTotalContrat(balstat.totalMontantContratsAnneeEnCours());
        return dto;
    }
    
}
