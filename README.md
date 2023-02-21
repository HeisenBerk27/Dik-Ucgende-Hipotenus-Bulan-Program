# Dik-gende-Hipoten-s-Bulan-Program
www.patika.dev

-----------------------------------

import java.util.Scanner;

public class ucgenAlan {


	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);



    System.out.print("Üçgenin birinci kenarını giriniz: ");
    double a = scanner.nextDouble();

    System.out.print("Üçgenin ikinci kenarını giriniz: ");
    double b = scanner.nextDouble();

    System.out.print("Üçgenin üçüncü kenarını giriniz: ");
    double c = scanner.nextDouble();

    double u = (a + b + c) / 2;

    double alan = u * ((u - a) * (u - b) * (u - c));
    alan = Math.sqrt(alan);

    System.out.println("Üçgenin alanı: " + alan);
}
}
