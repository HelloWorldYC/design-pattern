package myc.observer_pattern;

import myc.observer_pattern.impl.CurrentConditionsDisplay;
import myc.observer_pattern.impl.CurrentConditionsDisplayThroughJavaAPI;
import myc.observer_pattern.impl.HeatIndexDisplay;
import myc.observer_pattern.impl.WeatherData;
import myc.observer_pattern.impl.WeatherDataThroughJavaAPI;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

        WeatherDataThroughJavaAPI weatherDataThroughJavaAPI = new WeatherDataThroughJavaAPI();
        CurrentConditionsDisplayThroughJavaAPI currentConditionsDisplayThroughJavaAPI = new CurrentConditionsDisplayThroughJavaAPI(weatherDataThroughJavaAPI);
        weatherDataThroughJavaAPI.setMeasurements(80, 65, 30.4f);
        weatherDataThroughJavaAPI.setMeasurements(82, 70, 29.2f);
        weatherDataThroughJavaAPI.setMeasurements(78, 90, 29.2f);
    }
}
