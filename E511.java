package ch5;

import java.util.Scanner;

public class E511 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner in = new Scanner(System.in);

        final int BOIL_TEMPERATURE_AT_CELSIUS = 100;
        
        final int SOLID_TEMPERATURE_AT_CELSIUS = 0;
        
        final int BOIL_TEMPERATURE_AT_FAHRENHEIT = 212;
        
        final int SOLID_TEMPERATURE_AT_FAHRENHEIT = 32;
        
        
        System.out.println("Enter temperature: ");
        int temp = in.nextInt();
        
        
        System.out.println("Enter C for Celsius or F for Fahrenheit: ");
        char letter = in.next().toUpperCase().charAt(0);

        
        if (letter == 'C') {
        	
            if (temp < 0) {
                System.out.println("Solid");
            }
            
            else if (temp >= SOLID_TEMPERATURE_AT_CELSIUS
                    && temp <= BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Liquid");
            
            }
            
            else if (temp > BOIL_TEMPERATURE_AT_CELSIUS) {
                System.out.println("Gaseous");
            }
        }
        
        else if (letter == 'F') {
        
        	if (temp <= SOLID_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Solid");
            }
            
        	else if (temp > SOLID_TEMPERATURE_AT_FAHRENHEIT
                    && temp < BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Liquid");
            }
            
        	else if (temp >= BOIL_TEMPERATURE_AT_FAHRENHEIT) {
                System.out.println("Gaseous");
            }
        }

        
    }

}
