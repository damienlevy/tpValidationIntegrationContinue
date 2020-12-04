package fr.ul.additionneurrest.story;

import net.serenitybdd.junit.spring.integration.SpringIntegrationSerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import fr.ul.additionneurrest.serenity.AdderServiceSteps;

@RunWith(SpringIntegrationSerenityRunner.class)
public class AdderStoryOLD {
    @Steps
    private AdderServiceSteps adderSteps;

    @Test
    public void testGivenBasesAndAdder(){
        adderSteps.givenBaseAndAdder(10,5);
        adderSteps.whenAdd();
        adderSteps.summedUp();
    }


}
