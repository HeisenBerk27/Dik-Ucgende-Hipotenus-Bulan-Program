package temelKavramlar;

import java.util.Scanner;

public class ucgenAlan {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);



    System.out.print("Üçgenin birinci kenarını giriniz: ");
    double a = input.nextDouble();

    System.out.print("Üçgenin ikinci kenarını giriniz: ");
    double b = input.nextDouble();

    System.out.print("Üçgenin üçüncü kenarını giriniz: ");
    double c = input.nextDouble();

    double u = (a + b + c) / 2;

    double alan  = u * ((u - a) * (u - b) * (u - c));
    
    alan = alan / u;

    System.out.println("Üçgenin alanı: " + alan);
}
}