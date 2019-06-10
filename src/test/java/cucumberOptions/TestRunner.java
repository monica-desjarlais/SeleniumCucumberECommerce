package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = {"src/test/java/features"},
	    glue= "stepDefinitions",
        plugin= {"pretty", "html:target/cucumber-reports"},
        monochrome= true //displays the console in a proper readable format
         
        )
public class TestRunner extends AbstractTestNGCucumberTests  {

}
