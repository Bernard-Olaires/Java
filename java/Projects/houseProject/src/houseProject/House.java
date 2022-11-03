package houseProject;

public class House {
	private int numberBedrooms;
	private int numberBathrooms;
	private String color;
	private int price;
	
	public House() {
		this.numberBedrooms = 2;
		
	}
	
	public int getNumberBedrooms() {
		return numberBedrooms;
	}
	public void setNumberBedrooms(int numberBedrooms) {
		this.numberBedrooms = numberBedrooms;
	}
	public int getNumberBathrooms() {
		return numberBathrooms;
	}
	public void setNumberBathrooms(int numberBathrooms) {
		this.numberBathrooms = numberBathrooms;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
