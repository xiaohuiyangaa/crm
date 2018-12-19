package cn.com.test;

import java.util.List;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;

public class Demo {

	public static void main(String[] args) {
		WeatherWS ww = new WeatherWS();
		WeatherWSSoap wsSoap = ww.getWeatherWSSoap();
		ArrayOfString weather = wsSoap.getWeather("北京", null);
		List<String> list = weather.getString();
		System.out.println(list);
		
	}
	
}
