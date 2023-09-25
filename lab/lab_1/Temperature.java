package lab.lab_1;

public class Temperature {
	private double value;
	private char scale;
	
	public Temperature() {
        this.value = 0.0; // Default to zero degrees Celsius
        this.scale = 'C';
    }

    public Temperature(double value) {
        this.value = value;
        this.scale = 'C'; // Default to Celsius
    }

    public Temperature(char scale) {
        this.value = 0.0; // Default to zero degrees
        this.scale = scale;
    }

    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }
    
    public double getCelsium() {
    	if(scale == 'F') {
            return (5.0 / 9.0) * (value - 32);
    	} else {
        	return value;
    	}
    }
    
    public double getFahrenheit() {
        if (scale == 'C') {
            return (9.0 / 5.0) * value + 32;
        } else {
            return value;
        }
    }
    
    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setValueAndScale(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    public char getScale() {
        return scale;
    }
    
}
