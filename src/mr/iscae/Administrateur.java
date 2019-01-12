package mr.iscae;

import javax.ws.rs.GET;




import javax.ws.rs.PUT; 
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Path("/administrateur")
@Produces("application/json")
public class Administrateur {

	
	
	private static  List<String> info_dir_general= new ArrayList<>(); 
	private static  List<String> info_dir_etude= new ArrayList<>(); 
	private static  Map<String ,Map<String,String>> info_ensg = new HashMap<>();
	private static  List<String> mdp= new ArrayList<>();
	
	
	
	
	@PUT
	@Path("/modifierMDP")
	public void modifier_MDP(InfoAdmin admi ){
		mdp.add(admi.passWord);
	}
	
	@PUT
	@Path("/ajouterDirG")
	public void ajouterDirG(Directeur dir ){
		info_dir_general.add(dir.nomDirGeneral);
	}
	
	@PUT
	@Path("/ajouterDirE")
	public void ajouterDirE(Directeur dir ){
		info_dir_etude.add(dir.nomDirEtude);
	}
	
	@PUT
	@Path("/ajouterEnsg")
	public void ajouterEnsg(Enseignant  eng){
		//"info_mat" contient les infos des  matiere "noms et creneaux"
		//nomEnsg nom de l'enseignant 
		info_ensg.put(eng.nomEnsg,eng.info_matiere);
		info_ensg.pu
		
		}
	
	
	 @GET
	 @Path("/affDirecteurG")
	  //pour afficher les infos des directeurs generales
		public List<String> getvalue1(){
			return info_dir_general;
	  }
	 

	 @GET
	  @Path("/affDirecteurE")
	  //pour afficher les infos des directeurs d'etudes
		public  List<String > getvalue2(){
		 return info_dir_etude;
	  }
	 
	 
	 @GET
	  @Path("/affEnseignant")
	//  pour afficher les infos des enseignants
	   public Map<String, Map<String,  String >> getvalue3(){
			return info_ensg;
	 } 
	  
}

