import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

// PlusMinus: https://docs.google.com/document/d/1SSD7KZFN9mI6m1xnpIBCxO2MJ7LE-0O_R8BXyvbk3y8/edit
class Result {
	public static void plusMinus(List<Integer> arr) {
		int length = arr.size();
		double positive = 0;
		double negative = 0;
		double zero = 0;

		for(int i=0; i<length; i++) {
			int check = Integer.signum(arr.get(i));
			switch(check) {
				case 1:
					positive ++;
					break;
				case -1:
					negative ++;
					break;
				case 0:
					zero ++;
					break;
				default:
					System.out.println("Something is wrong");
			}
		}
		System.out.printf("%.6f %n", positive/length);
		System.out.printf("%.6f %n", negative/length);
		System.out.printf("%.6f %n", zero/length);
	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());
		// input space-separated numbers
		List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
				.map(Integer::parseInt)
				.collect(toList());

		Result.plusMinus(arr);

		bufferedReader.close();
	}
}
