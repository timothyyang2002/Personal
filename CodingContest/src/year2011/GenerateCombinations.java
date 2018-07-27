package year2011;

import java.util.ArrayList;
import java.util.Scanner;

public class GenerateCombinations {
	
	//ONLY PROBLEM IS THAT IT PRINTS A [] AT THE END
	
	public static void comb() {
		System.out.print("Enter n: ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int k = 3;
	 
		ArrayList<Integer> result = new ArrayList<Integer>();
		combineNumbers(n, k, 1, result);
		System.out.println(result);
	}

	private static void combineNumbers(int n, int k, int startPos, ArrayList<Integer> result) {
		int count = 0;
		if (result.size() == k) {
			for(int i=0; i<result.size(); i++) {
				count++;
				System.out.print(result.get(i));
			}
			System.out.println();
			return;
		}
	 

		for (int i = startPos; i <= n; i++) {
			result.add(i);
			combineNumbers(n, k, i+1, result);
			result.remove(result.size() - 1);
			}
		}

	public static void main(String[] args) {
		comb();
	}
}

