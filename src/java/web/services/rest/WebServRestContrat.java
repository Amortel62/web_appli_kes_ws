package web.services.rest;

import dto.DtoContrat;
import dto.DtoInterventionDunContrat;
import entites.Contrat;
import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("contrat")
public class WebServRestContrat {
    
    @Inject web.services.modeles.MethodesWeb mw;
     
    @GET
    @Path("infos/{numcont}")
    @Produces({"application/xml","application/json"})
    public DtoContrat getLeContrat(@PathParam("numcont")Long numcont) {
       
        return mw.getLeDtoContrat(numcont);
    }
    
    @GET
    @Path("interventions/{numcont}")
    @Produces({"application/xml","application/json"})
    public List<DtoInterventionDunContrat> getInterventionsContrat(@PathParam("numcont") Long numcont) {
         
        return mw.getLesDtoInterventionContrat(numcont);
    }  
    
     
    @GET
    @Path("arbrecontrat/{numcont}")
    @Produces({"application/xml","application/json"})
    public Contrat getArbreContrat(@PathParam("numcont") Long numcont) {
        
       return mw.getArbreContrat(numcont);   
       
    }  
    
}
