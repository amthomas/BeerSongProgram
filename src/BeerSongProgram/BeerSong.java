/* One of the things you'll read about in pragmatic programmers is the DRY principle: Don't Repeat Yourself.
Looking over your code I noticed two areas where you could possibly Refactor in order to eliminate code repetition.
Rewrite the code to see if you can get rid of the code duplication.

Hint: introduce a method and a constant.
*/

package BeerSongProgram;

public class BeerSong {
	public static void main (String[] args) {
		int beerNum = 99;
		String word = "bottles";
		
		while (beerNum > 0) {
			
			if (beerNum == 1) {
				word = "bottle"; //singular, ONE bottle
			}
		
			System.out.println(beerNum + " " + word + " of beer on the wall.");
			System.out.println(beerNum + " " + word + " of beer.");
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			beerNum = beerNum - 1;
		
			if (beerNum > 1) {
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else if (beerNum == 1) {
				word = "bottle";
				System.out.println(beerNum + " " + word + " of beer on the wall.");
			} else {
				System.out.println("No more bottles of beer on the wall.");
			}
		} // end while
	} //end main
} //end class
