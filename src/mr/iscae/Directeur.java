package mr.iscae;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
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

	
    private  static  Set<Map<String, String>> info_matiere= new HashSet<>();  
    
    @PUT
	public void ajouterMat(Enseignant  eng){
		info_matiere.add(eng.info_mat);
	}
    
     
    @GET
	public  Set<Map<String, String>> getvalue(){
		return info_matiere;

	}
}
