import java.util.Scanner;
public class CarDecisionV1 {

public static void main(String[] args) {
 
 Scanner in = new Scanner(System.in);
 
 System.out.println("Please enter Cost of regular car: ");
 double costOfRegularCar = in.nextDouble();
 
 
 System.out.println("Please enter Miles per gallon of regular car: ");
 double milespgRegularCar = in.nextDouble();
 
 
 System.out.println("Please enter cost of hybrid car: ");
 double costOfHybridCar = in.nextDouble();
 
 
 System.out.println("Please enter Miles per gallon of hybrid car: ");
 double milespgHybridCar = in.nextDouble();
 
 
 System.out.println("Please enter miles traveled in a year: ");
 double milesTraveledInAYear = in.nextDouble();
 
 
 System.out.println("Please enter cost per gallon of gas: ");
 double costPerGallon = in.nextDouble();
 
 
 double firstYearRegCarCost = (costOfRegularCar + (milesTraveledInAYear / milespgRegularCar * costPerGallon));
 
 
 double firstYearHybridCarCost = (costOfHybridCar + ( milesTraveledInAYear / milespgHybridCar * costPerGallon));
 
 
 System.out.println("Cost to own after year 1 for regular car: " + firstYearRegCarCost + " for hybrid car: " + firstYearHybridCarCost);
 
 
 double secondYearRegCarCost = (costOfRegularCar + (milesTraveledInAYear * 2 / milespgRegularCar * costPerGallon));

 
 double secondYearHybridCarCost = (costOfHybridCar + ( milesTraveledInAYear * 2 / milespgHybridCar * costPerGallon));

 
 System.out.println("Cost to own after year 2 for regular car: " + secondYearRegCarCost + " for hybrid car: " + secondYearHybridCarCost);

 
 double thirdYearRegCarCost = (costOfRegularCar + (milesTraveledInAYear * 3 / milespgRegularCar * costPerGallon));

 
 double thirdYearHybridCarCost = (costOfHybridCar + ( milesTraveledInAYear * 3 / milespgHybridCar * costPerGallon));

 
 System.out.println("Cost to own after year 3 for regular car: " + thirdYearRegCarCost + " for hybrid car: " + thirdYearHybridCarCost);

 
 double fourthYearRegCarCost = (costOfRegularCar + (milesTraveledInAYear * 4 / milespgRegularCar * costPerGallon));

 
 double fourthYearHybridCarCost = (costOfHybridCar + ( milesTraveledInAYear * 4 / milespgHybridCar * costPerGallon));

 
 System.out.println("Cost to own after year 4 for regular car: " + fourthYearRegCarCost + " for hybrid car: " + fourthYearHybridCarCost);

 
 double fifthYearRegCarCost = (costOfRegularCar + (milesTraveledInAYear * 5 / milespgRegularCar * costPerGallon));

 
 double fifthYearHybridCarCost = (costOfHybridCar + ( milesTraveledInAYear * 5 / milespgHybridCar * costPerGallon));

 
 System.out.println("Cost to own after year 5 for regular car: " + fifthYearRegCarCost + " for hybrid car: " + fifthYearHybridCarCost);

 
 if (fifthYearRegCarCost > fifthYearHybridCarCost) {
 System.out.println("The hybrid car pays back after 5 years");
 
 
 
 }else {
  System.out.println("The hybrid car does not pay back after 5 years");
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 

}

}
