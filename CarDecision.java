package CarDecisionproject;

import java.util.Scanner;

    public class CarDecision {

        public static void main(String[] args) {
        	
            Scanner in = new Scanner(System.in);
            
            System.out.println("Please enter the miles per year: ");
            
            double milesPerYear = in.nextDouble();
            
            System.out.println("Please enter the cost of gas: ");
            
            double gasCost = in.nextDouble();




            String stickerHybrid = "Toyota,Prius";
            
            String stickerRegular= "Toyota,Corolla";
            
            String [] stuff2 = stickerHybrid.split(",");
            
            String [] stuff = stickerRegular.split(",");


            int costH = 31000;

            int costR = 28000;

            double [] corolla = new double [10];

            double [] prius = new double [10];

            int counter = 0;

            int year = 1;

            boolean isGreater = true;

            while (isGreater){
                
            	corolla[counter] = 28000 + (((milesPerYear/20) * gasCost )* year );
                
            	prius[counter] = 31000 + (((milesPerYear/30) * gasCost )* year );

                if (corolla[counter] > prius[counter]){
                    isGreater = false;
                }

                counter = counter + 1;
                year = year + 1;


            }
            
            int year2 = 1;
            
            for (int i=0; i<5; i++){

                System.out.print("Cost to own " + stuff[0] + " " + stuff[1] + " after year "+ year2 + ": "+ corolla[i]);

                System.out.println(" for " + stuff2[0] + stuff2[1] + ": " + prius[i]);
                year2 = year2 + 1;
            }
            
            System.out.println("The Toyota Prius pays back after 5 years");




        }


    }