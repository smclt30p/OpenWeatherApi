package main;

import org.json.JSONObject;

class Wind {

    private JSONObject wind = Main.getJSONObj().getJSONObject("wind");

    private int winSpeed = wind.getInt("speed");
    private int degree = wind.getInt("deg");

    private boolean north = (degree >= 315 && degree <= 360) || (degree >= 0 && degree <= 44);
    private boolean east = (degree >= 45 && degree <= 134);
    private boolean south = (degree >= 135 && degree <= 224);
    private boolean west = (degree >= 225 && degree <= 314);

    StringBuilder getWindSpeed() {

        return new StringBuilder("Wind Speed ")
                .append(winSpeed)
                .append("m/s");

    }

    StringBuilder getDegree() {
        StringBuilder deg = new StringBuilder();
        deg.append("Wind Direction: ");

        if (north)
            deg.append("NORTH");
        if (east)
            deg.append("EAST");
        if (south)
            deg.append("SOUTH");
        if (west)
            deg.append("WEST");

        return deg;
    }

}
