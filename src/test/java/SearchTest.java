import io.restassured.RestAssured;
import org.junit.Test;

import static org.hamcrest.Matchers.equalTo;

public class SearchTest extends Base {

    @Test
    public void Search() {

        RestAssured.
                get(server.getHost() + "/maps/api/geocode/json?address=Istanbul").
                then().assertThat().
                body("results.address_components[0].long_name[0]", equalTo("Istanbul"));
    }

}