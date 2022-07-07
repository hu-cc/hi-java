package behavioral.observer_;

import behavioral.observer_.observer.CurrentConditionDisplay;
import behavioral.observer_.observer.StatisticsDisplay;
import behavioral.observer_.subject.WeatherData;

/**
 * @author hucc
 * 2022/7/5 22:44
 */
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);

    }
}
