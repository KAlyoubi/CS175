

		public class MultiplicationTable {

			public static void main(String[] args) {  
				// TODO Auto-generated method stub


				int result;

				System.out.print("     ");

				for (int j = 1; j <= 10; j++) {

					System.out.printf("%5d" , j);

			}

				System.out.println();


				for (int j = 1; j < 56; j++) {

					System.out.print("_");

			}  

				System.out.println();

				for (int outer = 1; outer <= 10; outer++) {

					System.out.printf("%2d | ", outer);

					
					for (int inner = 1; inner <= 10; inner++) {

						result = outer * inner;



						System.out.printf("%5d" , result);




			}  



					System.out.println();



		}  



			}



			}

