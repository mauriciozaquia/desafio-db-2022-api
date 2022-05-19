package Test.ApiDeTarefas;

import TestBase.CriarContatoTestBase;
import Utilities.FileOperations;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostCriarContato extends CriarContatoTestBase {

    @Test
    public void criarContato() {
        id =
        given()
                .spec(requestSpec)
                .log().all()
        .when()
                .post()
        .then()
                .log().all()
                .spec(responseSpec).extract().path("data.id")
        ;

        FileOperations.setProperties("contact","id", id);
    }

}
