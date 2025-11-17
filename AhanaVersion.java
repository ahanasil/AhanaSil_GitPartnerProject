import java.lang.Math;

public class AhanaVersion{
	public static void main(String[] args) {
		int[][] arr = createSquareArray(4);

		int first_even = firstEven(arr);
		System.out.println("First even: " + first_even);

		int first_even_seventeen = firstEvenSeventeen(arr);
		System.out.println("First even with neigbors greater than 17: " + first_even_seventeen);
	}

  	public static int[][] createSquareArray(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				System.out.println(arr[i][j]);
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

	public static int firstEvenSeventeen(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int even = -1;
				int neighborSum = 0;
				if (arr[i][j] % 2 == 0) {
					even = arr[i][j];
				}
				if (j != 0) {
					neighborSum += arr[i][j - 1];
				}
				if (j != arr.length - 1) {
					neighborSum += arr[i][j + 1];
				}
				if (even != -1 && neighborSum > 17) {
					return even;
				}
			}
		}

		return -1;
	}
}
