package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class Connect {
	public static String start() {
		try {
			URL url = new URL(
					"http://api.openweathermap.org/data/2.5/weather?q=Belgrade&APPID=3b533332460a1f75c7b0cedb5ed99517");

			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

			String response = "";
			String jsonData = "";

			while (null != (response = br.readLine())) {
				jsonData += response;
			}
			return jsonData;
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
}
