package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class Connect {

	private static final String APPID = "3b533332460a1f75c7b0cedb5ed99517";
	private static final String ENDPOINT = "http://api.openweathermap.org/data/2.5/weather";
	private static final String UNITS = "&units=metric";

	static String start() {

		try {

			URL url = new URL(ENDPOINT + "?q=Belgrade&APPID=" + APPID + UNITS);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			int response = con.getResponseCode();

			switch (response) {
				case HttpURLConnection.HTTP_OK:
					BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
					return in.readLine();
				case HttpURLConnection.HTTP_UNAUTHORIZED:
					throw new IOException("Invalid API key!");
				case HttpURLConnection.HTTP_NOT_FOUND:
					throw new IOException("Open Weather Map is not available!");
				default:
					throw new IOException("Invalid HTTP Response!: " + response);
			}

		} catch (MalformedURLException e) {
			/* Should never happen */
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("I/O Error: " + e.getMessage());
			System.exit(1);
		}
		throw new RuntimeException("Method fallthrough!");
	}
}
