package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\sonal\\eclipse-workspace\\14OctCucumber\\src\\main\\java\\features"},
        glue= {"steps"},
       
	plugin = {"pretty","html:Report"},
        	//	plugin = {"pretty","json:Report2"}
        		//plugin = {"pretty","junit:Report3"}
		//dryRun = true, // this option is used to findout if any steps doesnot have step definition file.
     dryRun=false, // this option will execute all the steps that have step definition file
	
		strict = true, //==> ensures every feature has a step definition associated with it
		// strict = false ==> doesnt check for association
		monochrome = true,// OR false, just displays output in better format, no impact on execution
		//tags = {"@Test1"}// in feature file if you give this tag and then only this scenario wil be executed.
		//tags = {"@Test4"}
		// tags = {"@Test5"}
     //	tags = {"@Test6"}
	   tags = {"@Test7"}
		)
public class TestRunner {

}
