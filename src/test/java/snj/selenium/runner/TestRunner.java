package snj.selenium.runner;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;

import com.snj.action.WebActions;
import com.snj.base.AutomationEngine;
import com.snj.exception.AutomationException;
import com.snj.reporting.AutomationReport;

@Listeners(AutomationReport.class)
public class TestRunner extends AutomationEngine {
	@BeforeClass
	@Parameters({ "browserName", "nodeIP", "nodePort" })
	public void setup(String browserName, String nodeIP, String nodePort) throws Exception {
		startBrowser(browserName, nodeIP, nodePort);
	}

	@AfterSuite
	public void tearDownMethod() throws AutomationException, InterruptedException {
		WebActions webObj = new WebActions();
		webObj.closeBrowser(driver);
	}
}
