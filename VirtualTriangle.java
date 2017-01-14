import java.util.Scanner;

/*
 @author - meghna
 This class checks if a point lies inside a triangle or not.
*/

public class VirtualTriangle {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first coordinate (x,y)");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		
		System.out.println("Enter the second coordinate (x,y)");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		
		System.out.println("Enter the third coordinate (x,y)");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		
		System.out.println("Enter the point (x,y)");
		int px=sc.nextInt();
		int py=sc.nextInt();
		
		if(area(x1,y1,x2,y2,x3,y3)==area(x1,y1,x2,y2,px,py)+area(x1,y1,x3,y3,px,py)+area(x2,y2,x3,y3,px,py))
			System.out.println("Point lies inside the triangle");
		else
			System.out.println("Point lies outside the triangle");
		
		
	}
	
	public static float area(int x1,int y1,int x2,int y2,int x3,int y3){
		float calcArea = Math.abs((x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2))/2);
		return calcArea;
	}

}


