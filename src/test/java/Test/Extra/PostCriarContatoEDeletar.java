package Test.Extra;

import TestBase.CriarContatoTestBase;
import Utilities.FileOperations;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

public class PostCriarContatoEDeletar extends CriarContatoTestBase {

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

        deletaContato();
    }

    public void deletaContato(){
        given()
        .when()
                .delete("https://api-de-tarefas.herokuapp.com/contacts/" + id)
        .then()
        ;
    }

}
