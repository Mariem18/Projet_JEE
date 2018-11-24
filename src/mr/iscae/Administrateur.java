package mr.iscae;

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

	
	private static  Map<Integer, String> info_dir_general= new HashMap<>();
	private static  Map<Integer, String> info_dir_etude= new HashMap<>();
	private static  Map<String, String> info_mat= new HashMap<>();
	private static  List<String> MDP= new ArrayList<>();
	
	
	@PUT
	@Path("/modifierMDP")
	public void modifier_MDP(InfoAdmin admi ){
		MDP.add(admi.passWord);
	}
	@PUT
	@Path("/ajouterDirG")
	public void ajouterDirG(Directeur dir ){
		info_dir_general.put(dir.idDirGeneral,dir.nomDirGeneral);
	}
	@PUT
	@Path("/ajouterDirE")
	public void ajouterDirE(Directeur dir ){
		info_dir_etude.put(dir.idDirEtude,dir.nomDirEtude);
	}
	@PUT
	@Path("/ajouterMat")
	public void ajouterMat(Matiere  mat ){
		info_mat.put(mat.nom,mat.creneau);
	}
	
}
