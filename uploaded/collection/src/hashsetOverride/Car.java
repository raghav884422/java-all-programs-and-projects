package hashsetOverride;

import java.util.Objects;

public class Car {
	private String model;
	private int year;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return Objects.equals(model, other.model) && year == other.year;
	}
	public Car(String model, int year) {
		super();
		this.model = model;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Car {model=" + model + ", year=" + year + "}";
	}
	

}
