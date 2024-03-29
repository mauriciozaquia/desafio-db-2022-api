package tests.api.de.tarefas;

import test.base.DeletarContatoTestBase;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostDeletarContato extends DeletarContatoTestBase {

    @Test
    public void deletarContato() {
        given()
                .spec(requestSpec)
        .when()
                .delete()
        .then()
                .log().all()
                .spec(responseSpec)
        ;
    }

}
