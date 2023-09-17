package practice2;

public class starTriangle {
	private int width;
	
	public starTriangle(int width) {
		this.width = width;
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(int i = 1; i <= width; i++) {
			 for(int j = 1; j <= i; j++) {
				 result.append("[*]");
			 }
			 result.append('\n');
		}
		return result.toString();
	}
}

