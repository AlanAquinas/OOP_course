package practice2;

public class starTriangle {
    private int width;

    public starTriangle(int width) {
        this.width = width;
    }

    public String drawLeftAlignedPyramid() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                result.append("[*]");
            }
            result.append('\n');
        }
        return result.toString();
    }

    public String drawRightAlignedPyramid() {
        StringBuilder result = new StringBuilder();
        for(int i = 1; i<= width; i++) {
        	// spaces
        	for(int k = 1; k <= width-i; k++) {
        		result.append("   ");
        	}
        	// stars
        	for(int j = 1; j <= i; j++) {
    			result.append("[*]");
    		}
        	
        	result.append("\n");
        }
        return result.toString();
    }

    public String drawCenterAlignedPyramid() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= width; i++) {
            // Add spaces before stars
            for (int k = 1; k <= width - i; k++) {
                result.append("  "); // Two spaces for each missing star
            }
            // Add stars
            for (int j = 1; j <= i; j++) {
                result.append("[*]");
            }
            result.append('\n');
        }
        return result.toString();
    }

    @Override
    public String toString() {
        // Default to left alignment if no alignment is specified
        return drawLeftAlignedPyramid();
    }
}


