import java.util.Scanner;

public class FrogCalc {

	static Scanner sc = new Scanner(System.in);

	public static void main (String[] args) {

		System.out.println("Enter Distance to cover");
		int distanceToCover = sc.nextInt();
		int time = getTime(distanceToCover);
		System.out.println("Time taken to cover " + distanceToCover + " = " + time);	

	}

	static int getTime(int distanceToCover) {

		int distanceCovered = 0;
		int time = 0;

		int[][] jumpToRestRatioArray = {{5,1},{3,2},{1,3}};

		while (distanceCovered < distanceToCover) {

			for (int[] jumpToRestRatio : jumpToRestRatioArray) {

				distanceCovered += jumpToRestRatio[0];

				if (distanceCovered >= distanceToCover) {
				
					break;

				}
				
				time += jumpToRestRatio[1];

			}

		}

		return time;

	}

}