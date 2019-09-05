package chapter2;

import java.util.ArrayList;

public class WeatherData implements Subject {

	private ArrayList<Observer> Observers;
	private float temp;
	private float humidity;
	private float pressure;

	public WeatherData() {
		Observers = new ArrayList<Observer>();

	}

	@Override
	public void registerObserver(Observer O) {
		Observers.add(O);

	}

	@Override
	public void removeObserver(Observer O) {
		int index = Observers.indexOf(O);
		if (index >= 0) {
			Observers.remove(index);

		}
	}

	@Override
	public void notifyObservers() {
		for (Observer observer : Observers) {
			observer.update(temp, humidity, pressure);
		}

	}

	public void measurementChanged() {
		notifyObservers();
	}

	public void setMeasurements(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementChanged();
	}

}
