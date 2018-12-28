package test.java.runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(features = "feature", glue = { "test.java.Ooyala" })
public class TestRun extends customRunner {

	public TestRun(Class<? extends customRunner> class1) {
		/*
		 * String br = null; 
		 * run_cukes(br); 
		 * new customRunner();
		 */
	}

	public TestRun() {
		System.out.println("Am here");
	}

}