package pl.jug.bydgoszcz.nutrition;

import org.wildfly.swarm.topology.Advertise;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * <br>
 * Date: 10/17/17
 */
@Path("/alive")
@Advertise("nutrition")
public class AliveEndpoint {
    @GET
    public Response isAlive() {
        return Response.ok().build();
    }
}
