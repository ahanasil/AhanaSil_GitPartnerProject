import java.lang.Math;

public class AhanaVersion{
	public static void main(String[] args) {
		int[][] arr = createSquareArray(4);

		int first_even = firstEven(arr);
		System.out.println("First even: " + first_even);

		int first_even_seventeen = firstEvenSeventeen(arr);
		System.out.println("First even with left-right neigbors sum greater than 17: " + first_even_seventeen);

		int first_odd_thirty_three = firstOddThirtyThree(arr);
		System.out.println("First odd with left-right & top-bottom neighbors sum greater than 33: " + first_odd_thirty_three);
	}

  	public static int[][] createSquareArray(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
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
				int value = arr[i][j];
				if (value % 2 != 0) {
					continue;
				}

				int neighborSum = 0;
				if (j != 0) {
					neighborSum += arr[i][j - 1];
				}
				if (j != arr[0].length - 1) {
					neighborSum += arr[i][j + 1];
				}
				if (neighborSum > 17) {
					return value;
				}
			}
		}

		return -1;
	}

	public static int firstOddThirtyThree(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				int value = arr[i][j];
				if (value % 2 != 1) {
					continue;
				}

				int neighborSum = 0;
				if (i != 0) {
					neighborSum += arr[i - 1][j];
				}
				if (i != arr.length - 1) {
					neighborSum += arr[i + 1][j];
				}
				if (j != 0) {
					neighborSum += arr[i][j - 1];
				}
				if (j != arr[0].length - 1) {
					neighborSum += arr[i][j + 1];
				}
				if (neighborSum > 33) {
					return value;
				}
			}
		}

		return -1;
	}
}
