package mr.iscae;


import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/enseignant")
@Produces("application/json")
public class Enseignant {

	String nomEnsg;
	//nom et creneau de la matiere
    Map<String, String> info_mat= new HashMap<>(); 

}
