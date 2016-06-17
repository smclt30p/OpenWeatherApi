package main;

import org.json.JSONObject;

class Weather {

    private JSONObject main = Main.getJSONObj().getJSONObject("main");
    private double cels = main.getDouble("temp");
    private int hum = main.getInt("humidity");

    StringBuilder getTemp() {
        return new StringBuilder("Temperature in ")
                .append(Main.getJSONObj().get("name"))
                .append(" is: ")
                .append(cels)
                .append("c");
    }

    StringBuilder getHumidity() {
        return new StringBuilder("Humidity: ")
                .append(hum)
                .append("%");

    }

}
