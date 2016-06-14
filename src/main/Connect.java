package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

class Connect {
	static String start() {
		try {
			URL url = new URL(
					"http://api.openweathermap.org/data/2.5/weather?q=Belgrade&APPID=3b533332460a1f75c7b0cedb5ed99517");
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			return br.readLine();

		} catch (MalformedURLException e) {
			/* Should never happen */
			e.printStackTrace();
		} catch (IOException e) {
			System.err.println("I/O Error: " + e.getMessage());
			System.exit(1);
		}
		return "";
	}
}
