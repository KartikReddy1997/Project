package Variables;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.ObjectMapper;
import io.cucumber.java.Scenario;

import java.io.File;
import java.io.IOException;
import java.util.Map;


public class DataUtil {

    private static Scenario scenario;

    private static final String JSON_FILE_PATH = "D:\\gitfolder\\NewLearnings1\\src\\test\\Features\\Amazon.json";

    public static void setScenario(Scenario scenario) {
        DataUtil.scenario = scenario;
    }

    public static Scenario getScenario() {
        return scenario;
    }

    public static String getScenarioName() {
        return scenario != null ? scenario.getName() : "Unknown Scenario";
    }

    public static Map<String, String> getScenarioData() {
        try {
            // Load the JSON file into a Map
            ObjectMapper objectMapper = new ObjectMapper();

            // Get the current scenario name from ScenarioManager

            String scenarioName = DataUtil.getScenarioName();
            Map<String, Map<String, String>> allData = objectMapper.readValue(new File(JSON_FILE_PATH), Map.class);


            // Fetch data for the specific scenario

            return allData.getOrDefault(scenarioName, null);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error reading JSON file", e);
        }
    }

    public static String processScenarioData(String key) {
        Map<String, String> scenarioData = DataUtil.getScenarioData();

        if (scenarioData != null) {
            // Print all key-value pairs
            scenarioData.forEach((k, v) -> System.out.println("Key: " + k + ", Value: " + v));

            // Access specific data
            String value = scenarioData.get(key); // Fetch value for the specified key
            if (value != null) {
                System.out.println("Specific Value for '" + key + "': " + value);
                return value;
            } else {
                return "Key '" + key + "' not found in scenario data.";
            }
        } else {
            return "No data found for the current scenario";
        }
    }


}
