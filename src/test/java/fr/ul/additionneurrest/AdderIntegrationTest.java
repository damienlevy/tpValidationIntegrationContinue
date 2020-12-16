package fr.ul.additionneurrest;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.annotations.BeforeStories;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class AdderIntegrationTest extends SerenityStories {

    @BeforeStories
    public void inti(){
        System.out.println("DÉBUT DES TEST ");

    }
}
