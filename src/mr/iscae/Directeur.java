package mr.iscae;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/directeur")
@Produces("application/json")
public class Directeur {

	
	String nomDirGeneral;
	String nomDirEtude;

	
    private  static  Set<Map<String, String>>  info_mat= new HashSet<>();  
    
    @PUT
	public void ajouterMat(Enseignant ensg){
		info_mat.add(ensg.info_matiere); 
	}
    
     
    @GET
	public  Set<Map<String, String>>  getvalue(){
		return info_mat;

	}
}
