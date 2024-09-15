import service.CurrentConditionsDisplay;
import service.StatisticsDisplay;
import service.WeatherData;
import service.WeatherDataV2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WheaterStation {
    public static void main(String[] args) {
        //the first example we have created our own Observer and Subject interfaces and impl
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30.4f);
        weatherData.setMeasurements(80.3f,63,32.7f);
        weatherData.setMeasurements(82,65,30.4f);
        weatherData.setMeasurements(76,70,28);
        weatherData.setMeasurements(70,72,37);

        //this second example we are using the JAVA API to implement the Observer pattern

        WeatherDataV2 weatherDataV2 = new WeatherDataV2();

        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherDataV2);

        weatherDataV2.setMeasurements(80,65,30.4f);
        weatherDataV2.setMeasurements(80.3f,63,32.7f);
        weatherDataV2.setMeasurements(82,65,30.4f);
        weatherDataV2.setMeasurements(76,70,28);
        weatherDataV2.setMeasurements(70,72,37);

    }
}