package Test.Extra;

import TestBase.ListarContatoTodosTestBase;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class GetListarContatoTodos extends ListarContatoTodosTestBase {

    @Test
    public void listarContatos() {
        given()
                .spec(requestSpec)
                .log().all()
        .when()
                .get()
        .then()
                .log().all()
        ;

    }

}
