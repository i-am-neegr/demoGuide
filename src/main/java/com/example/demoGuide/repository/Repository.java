package com.example.demoGuide.repository;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;

import org.apache.tomcat.util.json.JSONParser;
import org.json.JSONObject;

public class Repository {
    JSONParser parser = new JSONParser();
    private JSONObject distanceMatrix = parser.parse(new FileReader("data/di"))
}
