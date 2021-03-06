package hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/hello")
public class MessageRestService {

	@GET
	@Path("/{param}")
	public Response printMessage(@PathParam("param") String msg) {
		
		
		String result = "<html><body><h2>Restful example : " + msg + "</h2></body></html>";
		return Response.status(200).entity(result).build();

	}

}
