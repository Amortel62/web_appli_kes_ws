
package web.services.soap;

import dto.DtoContrat;
import dto.DtoInterventionDunContrat;
import entites.Contrat;
import java.util.List;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "WebServSoap")
public class WebServSoap {

    @Inject web.services.modeles.MethodesWeb mw;
    
    
    @WebMethod(operationName = "getInfoContrat")
    public DtoContrat getInfoContrat(@WebParam(name = "numcont") Long numcont) {
        
        return mw.getLeDtoContrat(numcont);
    }

    @WebMethod(operationName = "getInterventionsContrat")
    public List<DtoInterventionDunContrat> getInterventionsContrat(@WebParam(name = "numcont") Long numcont) {
           
        return mw.getLesDtoInterventionContrat(numcont);
    }

    @WebMethod(operationName = "getArbreContrat")
    public Contrat getArbreContrat(@WebParam(name = "numcont") Long numcont) {

        return mw.getArbreContrat(numcont);
    }
      
}
