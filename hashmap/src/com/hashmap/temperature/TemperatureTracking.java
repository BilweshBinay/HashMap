package com.hashmap.temperature;

import java.util.HashMap;
import java.util.Map;

public class TemperatureTracking {
    public static void main(String[] args) {
        HashMap<String, Double> temperature = new HashMap<>();

        temperature.put("Mumbai", 33.5);
        temperature.put("Chennai", 36.1);
        temperature.put("Delhi", 30.0);
        temperature.put("Bangalore", 25.4);
        temperature.put("Ahmedabad", 38.2);

        System.out.println("Temperature of Bangalore : "+temperature.get("Bangalore")+"°C");

        System.out.println("All city temperature....");
        for (Map.Entry<String, Double>entry: temperature.entrySet()){
            String city = entry.getKey();
            Double temp = entry.getValue();

            if (temp > 35){
                System.out.println(city +" -> "+temp+"°C High Alert area.");
            }else {
                System.out.println(city +" -> "+temp+"°C Low Alert area. ");
            }
        }
    }
}
