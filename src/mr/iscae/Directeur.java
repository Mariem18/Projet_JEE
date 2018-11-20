package mr.iscae;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/directeur")
@Produces("application/json")
public class Directeur {

	Integer idDirGeneral;
	String nomDirGeneral;
	Integer idDirEtude;
	String nomDirEtude;


}
