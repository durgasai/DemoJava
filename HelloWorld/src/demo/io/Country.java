package demo.io;

import java.io.Serializable;

public class Country implements Serializable{
	String name;
	long population;
	double area;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	public Country(String name, long population, double area) {
		this.name = name;
		this.population = population;
		this.area = area;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"/" + population + "/" + area;
	}
}
