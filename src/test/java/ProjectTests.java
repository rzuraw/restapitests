import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import pojo.Project;

import static io.restassured.RestAssured.given;

public class ProjectTests {

    private static final String USERNAME = "marcin.zurawiecki";
    private static final String PASSWORD = "samolot123";

    private final RequestSpecification requestSpec = new RequestSpecBuilder()
            .setContentType(ContentType.JSON)
            .setAccept(ContentType.JSON)
            .setBaseUri("http://localhost")
            .setPort(7130)
            .build();

    @Test
    public void getAllProjectsTest(){
        given()
                .auth().preemptive().basic(USERNAME,PASSWORD)
                .spec(requestSpec)
        .when()
                .log()
                .all()
                .get("/rest/api/2/project")
        .then()
                .assertThat()
                .statusCode(200)
                .extract()
                .response()
                .getBody()
                .prettyPrint();
    }

    @Test
    public void createProjectTest(){

        Project project = new Project()
                .setKey("SP")
                .setName("Serialized Project")
                .setProjectTypeKey("business")
                .setProjectTemplateKey("com.atlassian.jira-core-project-templates:jira-core-project-management")
                .setDescription("A project created with REST API")
                .setLead("marcin.zurawiecki")
                .setAssigneeType("PROJECT_LEAD")
                .setAvatarId(10200)
                .setPermissionScheme(10000)
                .setNotificationScheme(10000);

        given()
                .auth().preemptive().basic(USERNAME,PASSWORD)
                .spec(requestSpec)
                .body(project)
        .when()
                .post("/rest/api/2/project")
        .then()
                .assertThat()
                .statusCode(201);
    }
}
