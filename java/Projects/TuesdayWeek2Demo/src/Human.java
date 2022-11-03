import java.util.ArrayList;

public class Human {
	// Four member variables (attributes) for the Human class - they're all private
	private double height;
	private String eyeColor;
	private int age;
	private String hairColor;
	private ArrayList<Pet> pets = ;
	
	
	public Human() {
		this.height = 66.0;
		this.eyeColor = "blue";
		this.age = 25;
		this.hairColor = "green";
		
	}
	
	
	
	public Human(double height, String eyeColor, int age, String hairColor) {
		this.height = height;
		this.eyeColor = eyeColor;
		this.age = age;
		this.hairColor = hairColor;
	}



	// setAttributeName
	public void setHeight(double height) {
		this.height = height;
	}
	
	// getAttributeName
	public double getHeight() {
		return this.height;
	}

	public String getEyeColor() {
		return eyeColor;
	}

	public void setEyeColor(String eyeColor) {
		this.eyeColor = eyeColor;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHairColor() {
		return hairColor;
	}

	public void setHairColor(String hairColor) {
		this.hairColor = hairColor;
	}
	
	
}

