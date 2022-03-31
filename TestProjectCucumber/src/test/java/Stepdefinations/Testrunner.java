package Stepdefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src/test/resources/Feature",glue= {"Stepdefinations"},

plugin= {"pretty","html:target/Html/Htmlreport.html","json:target/Jsonreport/report.json","junit:target/Junit/report.xml"})

public class Testrunner {
	


}
