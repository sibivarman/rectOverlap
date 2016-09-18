import java.awt.Point;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter the x and y point of rectangle");
		Point p = new Point();
		p.x = in.nextInt();
		p.y = in.nextInt();
		System.out.println("Enter the lenght and widht of rectangle");
		int widht1 = in.nextInt();
		int height1 = in.nextInt();
		System.out.println("Enter the x and y point of rectangle");
		Point p2 = new Point();
		p2.x = in.nextInt();
		p2.y = in.nextInt();
		System.out.println("Enter the lenght and widht of rectangle");
		int widht2 = in.nextInt();
		int height2 = in.nextInt();
		
		boolean len = false,width = false;
		
		if(p.x <= p2.x+widht2 && p.x >= p2.x){
			len = true;
		}
		if(p.y <= p2.y+widht2 && p.y >= p2.y){
			width = true;
		}
		
		if(len == true && width == true){
			System.out.println("overlap");
	}
		else{
			System.out.println("does not overlap");
		}

	}

}
