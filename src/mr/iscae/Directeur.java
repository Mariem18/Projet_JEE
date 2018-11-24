package mr.iscae;


import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/directeur")
@Produces("application/json")
public class Directeur {

	Integer idDirGeneral;
	String nomDirGeneral;
	Integer idDirEtude;
	String nomDirEtude;
	
	
	private static  Map<String, String> info_mat= new HashMap<>();
	@PUT
	//@Path("/ajouterMat")
	public void ajouterMat(Matiere  mat ){
		info_mat.put(mat.nom,mat.creneau);
	}
	
	
	
}
