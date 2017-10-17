package pl.jug.bydgoszcz.nutrition;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import java.util.Random;

/**
 * @author Michal Szynkiewicz, michal.l.szynkiewicz@gmail.com
 * <br>
 * Date: 10/17/17
 */
@Path("/nutrition")
public class NutritionProvider {

    private static final Random random = new Random();

    @GET
    public Response getCalorieCount(@QueryParam("name") String name) throws InterruptedException {
        int calorieCount = random.nextInt(1000);
        int calculationTime = random.nextInt(1000);
        Thread.sleep(calculationTime);
        return Response.ok(calorieCount).build();
    }
}
