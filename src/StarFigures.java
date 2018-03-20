/*
  	ISYS 320
  	Name(s):
  	Date: 
*/

// 4. Your pseudocode algorithm for how to break down the figure
/*
 *   drawDoubleBars
 *   drawX
 *   
 *   drawDoubleBars
 *   drawX
 *   drawDoubleBars
 *   
 *   drawSingleStar
 *   drawSingleStar
 *   drawSingleStar
 *   drawDoubleBar
 *   drawX
 */

public class StarFigures {

	public static void main(String[] args) {
		drawDoubleBars();
		drawX();
		System.out.println(" ");
		System.out.println(" ");
		drawDoubleBars();
		drawX();
		drawDoubleBars();
		System.out.println(" ");
		System.out.println(" ");
		drawSingleStar();
		drawSingleStar();
		drawSingleStar();
		drawDoubleBars();
		drawX();
		
	}
		public static void drawDoubleBars() {
			System.out.println("*****");
			System.out.println("*****");
		}
		public static void drawX() {
			System.out.println(" * * ");
			System.out.println("  *  ");
			System.out.println(" * * ");
		}
		public static void drawSingleStar() {
			System.out.println("  *  ");
		}
}
