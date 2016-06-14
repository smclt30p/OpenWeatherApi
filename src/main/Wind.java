package main;

import org.json.JSONObject;

public class Wind {
	JSONObject wind = Main.getJSONObj().getJSONObject("wind");

	long winSpeed = wind.getLong("speed");
	int winSpeedNoDecs = (int) winSpeed;

	long degree = wind.getLong("deg");
	int degreeNoDecs = (int) degree;

	boolean north = (degreeNoDecs >= 315 && degreeNoDecs <= 360) || (degreeNoDecs >= 0 && degreeNoDecs <= 44);
	boolean east = (degreeNoDecs >= 45 && degreeNoDecs <= 134);
	boolean south = (degreeNoDecs >= 135 && degreeNoDecs <= 224);
	boolean west = (degreeNoDecs >= 225 && degreeNoDecs <= 314);

	public StringBuilder getWindSpeed() {
		StringBuilder winds = new StringBuilder();
		winds.append("Wind Speed ");
		winds.append(winSpeedNoDecs);
		winds.append("m/s");
		return winds;
	}

	public StringBuilder getDegree() {
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
