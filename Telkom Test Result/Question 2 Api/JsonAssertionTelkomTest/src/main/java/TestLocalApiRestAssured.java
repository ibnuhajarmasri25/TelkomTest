import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class TestLocalApiRestAssured {
    @Test
    public void Order(){
//       baseURI = "http://localhost:3000";
       given().get("http://localhost:3000/product")
               .then()
               .statusCode(200);

    }
}
