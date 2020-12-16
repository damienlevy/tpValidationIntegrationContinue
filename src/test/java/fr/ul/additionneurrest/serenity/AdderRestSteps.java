package fr.ul.additionneurrest.serenity;

import org.hamcrest.Matchers;

import static io.restassured.RestAssured.*;

public class AdderRestSteps {

    private int result = 0;


    public void givenCurrentNumber() {
        given().param("base",5).when().post("/adder/changeBase");
        result = 5;
    }

    public void whenAddNumber(int num) {
        given().param("num",num).when().post("/adder/accumulate");
        result += num;
    }

    public void thenSummedUp() {
        when().get("/adder/current").then().assertThat().body(Matchers.equalTo(""+result));
    }
}
