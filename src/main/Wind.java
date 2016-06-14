package main;

import org.json.JSONObject;

public class Wind {
	JSONObject wind = Main.getJSONObj().getJSONObject("wind");

	double winSpeed = (double) wind.get("speed");
	int winSpeedNoDecs = (int) winSpeed;

	double degree = (double) wind.get("deg");
	int degreeNoDecs = (int) degree;

	boolean north = (degreeNoDecs >= 315 && degreeNoDecs <= 360) || (degreeNoDecs >= 0 && degreeNoDecs <= 44);
	boolean east = (degreeNoDecs >= 45 && degreeNoDecs <= 134);
	boolean south = (degreeNoDecs >= 135 && degreeNoDecs <= 224);
	boolean west = (degreeNoDecs >= 225 && degreeNoDecs <= 314);

	public StringBuffer getWindSpeed() {
		StringBuffer winds = new StringBuffer();
		winds.append("Wind Speed ");
		winds.append(winSpeedNoDecs);
		winds.append(" m/s");
		return winds;
	}

	public StringBuffer getDegree() {
		StringBuffer deg = new StringBuffer();
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
