package fr.ul.additionneurrest;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import io.restassured.http.ContentType;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)

class AdditionneurrestApplicationTests {

    @Test
    void change_base() {
        given().param("base",5).when().post("/adder/changeBase");
        when().get("/adder/current").then().assertThat().body(equalTo("5"));
    }

    @Test
    void rand(){
        //when().get("/adder/random").then().assertThat().body()
    }

}
