package resources;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReports {
	
	static ExtentReports extent;
	public static ExtentReports getReportObject() {
		
		String path= System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");		
		
		
		extent= new ExtentReports();
		
		
		//extent.attachReporter(reporter);
		//extent.setSystemInfo("Tester","Deepak");
		return extent;
	}

}
