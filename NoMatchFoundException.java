//A-2 Ques21

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class NoMatchFoundException extends Exception {
    public NoMatchFoundException(String message) {
        super(message);
    }
}

public class CountryCapitalFinder {

    // Method to get the capital of the country
    public static String getCapital(String country) throws NoMatchFoundException{
        Map<String, String> countryCapitalMap = new HashMap<>();
        countryCapitalMap.put("USA", "Washington, D.C.");
        countryCapitalMap.put("Canada", "Ottawa");
        countryCapitalMap.put("India", "New Delhi");
        countryCapitalMap.put("Germany", "Berlin");
        countryCapitalMap.put("France", "Paris");
        countryCapitalMap.put("Australia", "Canberra");
        countryCapitalMap.put("Japan", "Tokyo");
        countryCapitalMap.put("Brazil", "Brasília");
        countryCapitalMap.put("China", "Beijing");
        countryCapitalMap.put("Russia", "Moscow");
        if (countryCapitalMap.containsKey(country)) {
            return countryCapitalMap.get(country);
        } else {
            throw new NoMatchFoundException("No match found for country: " + country);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of a country: ");
        String country = scanner.nextLine().trim();

        try {
            String capital = getCapital(country);
            System.out.println("The capital of " + country + " is " + capital + ".");
        } catch (NoMatchFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}