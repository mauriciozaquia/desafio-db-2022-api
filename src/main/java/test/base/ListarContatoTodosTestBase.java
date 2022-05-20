package test.base;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class ListarContatoTodosTestBase {

    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    protected String id;

    @BeforeAll
    public static void setUp() {
        buildRequestSpec();
        buildReponseSpec();
    }

    public static void buildRequestSpec() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api-de-tarefas.herokuapp.com")
                .setBasePath("/contacts/")
                .addHeader("Content-Type","application/json")
                .build();
    }

    public static void buildReponseSpec() {
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectContentType(ContentType.JSON)
                .build();
    }

}
