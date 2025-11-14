import java.lang.Math;

public class AhanaVersion{
	public static void main(String[] args) {
		//createSquareArray(4);
	}

  	public static void createSquareArray(int n) {
		int[][] arr = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = (int)(Math.random()*10)+1;
				//System.out.println(arr[i][j]);
			}
		}
  }
}
