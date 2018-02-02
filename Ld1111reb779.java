import java.util.Scanner;

public class Ld1111reb779 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = 0, y = 0;

		System.out.println("Artur Kuzmiks 12.gr. 111REB779");
		System.out.print("x=");
		if (sc.hasNextFloat())
			x = sc.nextFloat();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}

		System.out.print("y=");
		if (sc.hasNextFloat())
			y = sc.nextFloat();
		else {
			System.out.println("input-output error");
			sc.close();
			return;
		}
		sc.close();

		if (x < 4 && x > 3 && y < 7.5 && y > 6.5)
			System.out.println("Red");
		else if (x < 6 && y < 6 && y > 11 - x)
			System.out.println("Blue");
		else if ((x - 5) * (x - 5) + (y - 8) * (y - 8) <= 9 && y <= 8)
			System.out.println("Green");
		else if (x <= 10 && y <=8 && y >= 16 - x) 
			System.out.println("Blue");
		else
			System.out.println("White");
	}
}