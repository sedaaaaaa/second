package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

public class runnerrrrr {
	
	
@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"features\\feat.feature"},
		glue = "steps\\stepdef.java",
		tags = "@SEDA",
		monochrome = false,
		dryRun = false,
		plugin = {
				
		}
		)
public class LoginRunner{
	
}
		
		
		
		
		
//	monochrome false ise ciktiyi renkli yapacak.
//true ise renksiz yapacak.
//dryrun ise stepdef ile feature karsilastirir eslenip eslenmedigini
		//true ya da false olarak calisir. eger true ayarlarsak feature dosyasindaki
		//her adimin karsiliginin olup olmadigiyla ilgili bize mesaj verecek.
		
		

}