package test.base;

import model.CriarContatoModel;
import utilities.FakersGeneratorPtBr;
import utilities.FileOperations;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.jupiter.api.BeforeAll;

import java.util.HashMap;
import java.util.Map;

public class CriarContatoTestBase {

    protected static RequestSpecification requestSpec;
    protected static ResponseSpecification responseSpec;
    private static Map<String, Object> objeto = new HashMap<String, Object>();
    private static CriarContatoModel pojoObjeto;
    private static FakersGeneratorPtBr fakerPtBr = new FakersGeneratorPtBr();
    protected String id;

    @BeforeAll
    public static void setUp() {
        buildPojoObject();
        buildRequestSpec();
        buildReponseSpec();
    }

    public static void buildRequestSpec() {
        requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api-de-tarefas.herokuapp.com")
                .setBasePath("/contacts")
                .addHeader("Content-Type","application/json")
                .setBody(pojoObjeto)
                .build();
    }

    public static void buildReponseSpec() {
        responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(201)
                .expectContentType(ContentType.JSON)
                .build();
    }

    public static void buildPojoObject(){
        String firstName = fakerPtBr.getFirstName();
        String lastName = fakerPtBr.getLastName();
        String email = fakerPtBr.getRandomEmail();
        String birthday = fakerPtBr.getBirthday();
        String mobilePhone = fakerPtBr.getMobilePhone();
        String streetName = fakerPtBr.getStreetName();
        String state = fakerPtBr.getState();
        String city = fakerPtBr.getCity();

        pojoObjeto = new CriarContatoModel(
                firstName,
                lastName,
                email,
                birthday,
                mobilePhone,
                streetName,
                state,
                city
        );

        FileOperations.setProperties("contact","firstName",firstName);
        FileOperations.setProperties("contact","lastName",lastName);
        FileOperations.setProperties("contact","email",email);
        FileOperations.setProperties("contact","birthday",birthday);
        FileOperations.setProperties("contact","mobilePhone",mobilePhone);
        FileOperations.setProperties("contact","streetName",streetName);
        FileOperations.setProperties("contact","state",state);
        FileOperations.setProperties("contact","city",city);
    }

}
