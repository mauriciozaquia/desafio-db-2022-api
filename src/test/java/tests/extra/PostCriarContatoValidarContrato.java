package tests.extra;

import test.base.CriarContatoTestBase;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostCriarContatoValidarContrato extends CriarContatoTestBase {

    @Test
    public void criarContatoValidandoContrato() {
        Response payLoad =
                given()
                        .spec(requestSpec)
                        .log().all()
                .when()
                        .post()
                .then()
                        .log().all()
                        .spec(responseSpec).extract().response()
                ;

        //FileOperations.setProperties("contact","id", id);
        id = payLoad.then().extract().path("data.id");
        payLoad.then().body(JsonSchemaValidator.matchesJsonSchemaInClasspath("Schemas/PostCriarContatoJsonSchema.json"));
    }

}
