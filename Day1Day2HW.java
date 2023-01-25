import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day1Day2HW {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Double> numbers = new ArrayList<>();
		
		for(int i=0; i<5; ++i) {
			System.out.println("Enter a number: ");
			numbers.add(Double.parseDouble(input.nextLine()));
		}
		System.out.println(numbers); 	
		
		double smallest = 9999999;
		double largest = -9999999; 
		
		double sum=0.0;
		double product = 1.0;
		for(int i=0; i<numbers.size(); ++i) {
			double current = numbers.get(i);
			sum += current; 
			product *= current;
			
			smallest = Math.min(smallest, current);
			largest = Math.max(largest, current); 
			
			if(current < smallest) {
				smallest = current; 
			}
			if(current > largest) {
				largest = current; 
			}
		}
		
		System.out.printf("Sum: %f Product: %f\n", sum, product);
		
		Collections.sort(numbers); 
		System.out.printf("Largest: %f Smallest: %f\n", 
				largest, smallest); 
		

	}

}


