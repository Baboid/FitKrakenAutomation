package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.Base;

public class Hooks extends Base {

	@Before
	public void beforeValidation() {
		System.out.println("jebeni hook");

	}

	@After
	public void afterValidation() {
		driver.close();
	}

}
