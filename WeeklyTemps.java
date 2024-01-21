import java.util.ArrayList;
import java.util.Scanner;

public class WeeklyTemps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		ArrayList<String> daysOfWeek = new ArrayList<>();
		ArrayList<Double> dailyTemperatures = new ArrayList<>();
		
		// Input daily average temperatures and days
		for (int i = 0; i < 7; i++) {
			System.out.print("Enter day of the week (e.g., Monday): ");
			String day = scanner.nextLine();
			daysOfWeek.add(day);
			
			System.out.print("Enter daily average temperature for " + day + ": ");
			double temperature = scanner.nextDouble();
			scanner.nextLine(); // Consume the newline
			dailyTemperatures.add(temperature);
			
		}
       // Display the temperature for each day and weekly avg if "week"is enetered
		System.out.print("Enter 'week' to display weekly average: ");
		String input = scanner.nextLine();
		
		if (input.equalsIgnoreCase("week")) {
			double weeklySum = 0;
			
			for (int i = 0; i < 7; i++) {
				System.out.println(daysOfWeek.get(i) + ": " + dailyTemperatures.get(i) + "°C");
				weeklySum += dailyTemperatures.get(i);
				
			}
	
		double weeklyAverage = weeklySum / 7;
		System.out.println("Weekly Average Temperature: " + weeklyAverage + "°C");
		
		} else {
			System.out.println("Invalid input. Exiting program.");
		
		}
		
		scanner.close();
	
	}

}
