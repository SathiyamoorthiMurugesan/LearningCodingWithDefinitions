package pattern;

public class StepDownTriangle {
	public static void main(String[] args) {
		int size = 5;
		for(int i=0;i<=size;i++) {
			for(int j=i+1;j<=size;j++) {
				System.out.print("X ");
			}
			System.out.println(" ");
		}
	}

}
