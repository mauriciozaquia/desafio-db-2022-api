package Test.ApiDeTarefas;

import TestBase.EditarContatoTestBase;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PutEditarContato extends EditarContatoTestBase {

    @Test
    public void editarContato(){
        given()
                .spec(requestSpec)
                .log().all()
        .when()
                .put()
        .then()
                .log().all()
                .spec(responseSpec)
        ;
    }

}
