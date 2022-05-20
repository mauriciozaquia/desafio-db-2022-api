package tests.api.de.tarefas;

import test.base.EditarContatoTestBase;
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
