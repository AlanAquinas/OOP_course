package lab.lab_1;

public class Car {
	public enum CarType {
		SEDAN, SUV, SPORTS, HATCHBACK
	}
	
	public static final int MAX_SPEED = 200; 
	
	private String make;
	private String model;
	private int year;
	private CarType type;
	private int currentSpeed;
	
	{
        make = "Unknown";
        model = "Unknown";
        year = 2023;
        type = CarType.SEDAN;
        currentSpeed = 0;
    }
	
	public Car() {
	}
	
	public Car(String make, String model, int year, CarType type) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.type = type;
	}
	
	// overloading
    public void accelerate(int mph) {
        currentSpeed += mph;
        System.out.println("Accelerating to " + currentSpeed + " mph");
    }

    public void accelerate() {
        accelerate(10); // Default acceleration
    }
    
    // Getter
    public String getMake() {
        return make;
    }

    // Setter
    public void setType(CarType type) {
        this.type = type;
    }

    // Using "this" keyword
    public void setModel(String model) {
        this.model = model;
    }
    
    public void setMake(String make) {
        this.make = make;
    }
   
    public void displayInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Type: " + type);
        System.out.println("Current Speed: " + currentSpeed + " mph");
    }
}
