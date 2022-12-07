package carLot;

class Car {
	
	private String carMake, carColor, carModel;
	private int carYear;
	private double carMiles, carValue;
	
	public Car(String make, String color, String model, int year, double miles, double value)
	{
		carMake = make;
		carColor = color;
		carModel = model;
		carYear = year;
		carMiles = miles;
		carValue = value;
	}
	
	public String getMake()
	{
		return carMake;
	}
	
	public String getColor()
	{
		return carColor;
	}
	
	public String getModel()
	{
		return carModel;
	}
	
	public int getYear()
	{
		return carYear;
	}
	public double getMiles()
	{
		return carMiles;
	}
	public double  getValue()
	{
		return carValue;
	}
	
}
