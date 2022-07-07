package behavioral.observer_.observer;

import behavioral.observer_.subject.Subject;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;

/**
 * @author hucc
 * 2022/7/5 22:58
 */
public class StatisticsDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private List<Float> temperatures;

    public StatisticsDisplay(Subject weatherData) {
        this.temperatures = new ArrayList<>();
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperatures.add(temperature);
        display();
    }

    @Override
    public void display() {
        DoubleSummaryStatistics stats = this.temperatures.stream()
                                .mapToDouble((x) -> x)
                                .summaryStatistics();
        System.out.println("Avg/Max/Min temperature = " + stats.getAverage() + "/" + stats.getMax()
            + "/" + stats.getMin());
    }
}
