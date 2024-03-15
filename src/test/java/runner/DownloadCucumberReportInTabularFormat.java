package runner;

import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

public class DownloadCucumberReportInTabularFormat {
    public static void main(String[] args) {
        // Specify the path to the Cucumber HTML report file
        String reportFilePath = "C:\\Users\\prana\\Desktop\\Intellij Projects\\PhonoLogixAutomation\\target\\cucumber-report-html\\cucumber-html-reports\\feature-overview.html";

        // Parse the HTML report file and extract tabular data
        String tabularData = parseHTMLReport(reportFilePath);

        // Save the tabular data to a file
        saveTabularDataToFile(tabularData, "tabular_report.txt");
    }

    private static String parseHTMLReport(String filePath) {
        StringBuilder tabularData = new StringBuilder();

        try {
            // Parse the HTML file using Jsoup
            File input = new File(filePath);
            Document doc = Jsoup.parse(input, "UTF-8", "");

            // Select the table containing the test results
            Elements tables = doc.select("table");
            Element table = tables.get(0); // Assuming the first table contains the test results

            // Iterate over table rows
            for (Element row : table.select("tr")) {
                Elements columns = row.select("td"); // Get all columns in the current row

                // Append tabular data to the StringBuilder
                for (Element column : columns) {
                    tabularData.append(column.text()).append("\t"); // Assuming tab delimiter
                }
                tabularData.append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tabularData.toString();
    }

    private static void saveTabularDataToFile(String tabularData, String outputPath) {
        try {
            FileWriter writer = new FileWriter(outputPath);
            writer.write(tabularData);
            writer.close();
            System.out.println("Tabular data saved to: " + outputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

