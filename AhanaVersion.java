import java.lang.Math;

public class AhanaVersion{
	public static void main(String[] args) {
		int[][] arr = createSquareArray(4);
		int first_even = firstEven(arr);
		//System.out.println("First even: " + first_even);
	}

  	public static int[][] createSquareArray(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				//System.out.println(arr[i][j]);
			}
		}

		return arr;
  	}

  	public static int firstEven(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if (arr[i][j] % 2 == 0) {
					return arr[i][j];
				}
			}
		}

		return -1;
	}
}
