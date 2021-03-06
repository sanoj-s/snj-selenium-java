package snj.selenium.testcases;

import org.testng.annotations.Test;

import com.snj.action.UIActions;
import com.snj.action.WebActions;
import com.snj.exception.AutomationException;
import com.snj.reporting.AutomationReport;

import snj.selenium.runner.TestRunner;
import snj.selenium.testobjects.SampleObjects;

public class SampleTest extends TestRunner {
	public SampleTest() throws AutomationException {
		super();
	}

	@Test(enabled = true)
	public void TC001_sampleTestCase() throws AutomationException {
		new WebActions().loadWebApplication(driver, "https://www.google.com");
		new UIActions().type(driver, SampleObjects.txt_searchbox, "JourneyOfQuality");
		new AutomationReport().trackSteps("Data Entered");
	}

	@Test(enabled = true)
	public void TC002_sampleTestCase() throws AutomationException {
		new WebActions().loadWebApplication(driver, "https://automationbookstore.dev/");
//		new UIActions().click(driver, "li", "left", SampleObjects.btn_book);
//		new UIActions().click(driver, "li", "right", SampleObjects.btn_book1);
//		new UIActions().click(driver, "li", "above", SampleObjects.btn_book);
//		new UIActions().click(driver, "li", "below", SampleObjects.btn_book3);
//		new UIActions().click(driver, "li", "near", SampleObjects.btn_book2);
	}
}
