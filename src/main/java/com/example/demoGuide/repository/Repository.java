package com.example.demoGuide.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;

public class Repository {

    public static JSONObject getDistanceJSON() {
        StringBuilder jsonBuilder = new StringBuilder();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\dist_graph.json"))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new JSONObject(jsonBuilder.toString());
    }

    public static JSONObject allInfoJSON () {
        StringBuilder jsonBuilder = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("data\\all_info.json"))){
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                jsonBuilder.append(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return new JSONObject(jsonBuilder.toString());
    }

    public static JSONObject
}
