package series;

public class StarPattern {

	public static void main(String[] args) {
		starPatternDecreasingWithLeftSpacing(5);
		starPatternIncreasingWithRightSpacing(5);
	}
	public static void starPatternDecreasingWithLeftSpacing(int Rows){
		/*
		 * 
		 *****
		  ****
		   ***
		    **
		     *
		 */

		for(int i=0; i<Rows;i++) {
			
			for(int k=0;k<i;k++) {
				System.out.print(" ");
			}
			for(int j=0;j<Rows-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


	public static void starPatternIncreasingWithRightSpacing(int Rows){
		/*
		 * 
		 *****
		  ****
		   ***
		    **
		     *
		 */

		for(int i=0; i<Rows;i++) {
			
//			for(int k=0;k<i;k++) {
//				System.out.print(" ");
//			}
			for(int j=0;j<Rows-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
