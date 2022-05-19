package Test.ApiDeTarefas;

import TestBase.ListarContatoUnicoTestBase;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetListarContatoUnico extends ListarContatoUnicoTestBase {

    @Test
    public void listarContato() {
        given()
                .spec(requestSpec)
                .log().all()
        .when()
                .get()
        .then()
                .log().all()
                .spec(responseSpec).extract().path("data.id")
        ;
    }
}
