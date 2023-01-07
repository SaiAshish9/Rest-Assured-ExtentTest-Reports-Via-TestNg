package org.example;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentManager {

    private static ExtentReports report;

    public static ExtentReports getInstance(){
        if(report == null){
            ExtentSparkReporter spark = new ExtentSparkReporter("spark.html");
            report = new ExtentReports();
            spark.config().setTheme(Theme.DARK);
            spark.config().setEncoding("utf-8");
            spark.config().setDocumentTitle("Test");
            spark.config().setReportName("report");
            report.attachReporter(spark);
        }
        return report;
    }

}
