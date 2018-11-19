package mr.iscae;

import javax.ws.rs.PUT; 
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.ArrayList;
import java.util.List;


@Path("/administrateur")
@Produces("application/json")
public class Administrateur {

	private static  List<String> MDP= new ArrayList<>();
	@PUT
	public void modifier_MDP(InfoAdmin admi ){
		MDP.add(admi.passWord);
	}
}
