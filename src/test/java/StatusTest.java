import io.restassured.RestAssured;
import org.junit.Test;

public class StatusTest extends Base {

    @Test
    public void Status() {

        RestAssured.
                get(server.getHost() + "/maps/api/geocode/json?address=Turkey").
                then().assertThat().
                statusCode(200);
    }

}