package lab.lab_1;

public class Data {
	private double sum;
	private double max;
	private int count;
	
	public Data() {
		sum = 0;
		max = Double.MIN_VALUE;
		count = 0;
	}
	
	public void addNum(double num) {
		sum+=num;
		count++;
		if(num > max) {
			max = num;
		}
	}
	
	public double getAverage() {
		if(count == 0) {
			return 0;
		}
		return sum/count;
	}
	
	public double getMax() {
		return max;
	}
	
	@Override
	public String toString() {
		String result = "Average = " + getAverage() + "\n" + "Maximum = " + getMax();
		return result;
	}
	
}
