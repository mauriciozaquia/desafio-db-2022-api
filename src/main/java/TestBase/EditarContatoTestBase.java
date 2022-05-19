package TestBase;

import Model.EditarContatoModel;
import Utilities.FakersGeneratorPtBr;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

public class EditarContatoTestBase {

    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    private static final String id = "1691";
    private static EditarContatoModel pojoObjeto;
    private static FakersGeneratorPtBr fakerPtBr = new FakersGeneratorPtBr();

    @BeforeAll
    public static void setUp() {
        //buildPojoObject();
        buildPojoObjectFaker();
        buildRequestSpec();
        buildReponseSpec();
    }

    public static void buildRequestSpec() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api-de-tarefas.herokuapp.com")
                .setBasePath("/contacts/" + id)
                .addHeader("Content-Type", "application/json")
                .addHeader("Accept", "application/vnd.tasksmanager.v2")
                .addHeader("Location", "/contacts/"+id)
                .setBody(pojoObjeto)
                .build();
    }

    public static void buildReponseSpec() {
        responseSpec = new ResponseSpecBuilder()
                //.expectStatusCode(201) //da erro no teste
                .expectStatusCode(200) //não da erro no teteo
                .expectContentType(ContentType.JSON)
                .build();
    }

    public static void buildPojoObject() {
        pojoObjeto = new EditarContatoModel(
                "Mauricio1",
                "Zaquia1",
                "mauricio.zaquia@teste.com",
                "30",
                "51888888888",
                "Rua dois",
                "RS",
                "Cachoeirinha"
        );
    }

    public static void buildPojoObjectFaker(){
        pojoObjeto = new EditarContatoModel(
                fakerPtBr.getFirstName(),
                fakerPtBr.getLastName(),
                fakerPtBr.getRandomEmail(),
                fakerPtBr.getBirthday(),
                fakerPtBr.getMobilePhone(),
                fakerPtBr.getStreetName(),
                fakerPtBr.getState(),
                fakerPtBr.getCity()
        );
    }

}
