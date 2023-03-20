import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double armutKg ;
        double elmaKg;
        double domatesKg;
        double muzKg;
        double patlicanKg;

        Scanner armutKilosu = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo: ");
        armutKg = armutKilosu.nextDouble();

        Scanner elmaKilosu = new Scanner(System.in);
        System.out.println("Elma Kaç Kilo: ");
        elmaKg = elmaKilosu.nextDouble();

        Scanner domatesKilosu = new Scanner(System.in);
        System.out.println("Domates Kaç Kilo: ");
       domatesKg = domatesKilosu.nextDouble();

        Scanner muzKilosu = new Scanner(System.in);
        System.out.println("Muz Kaç Kilo: ");
        muzKg = muzKilosu.nextDouble();

        Scanner patlicanKilosu = new Scanner(System.in);
        System.out.println("Patlıcan Kaç Kilo: ");
        patlicanKg = patlicanKilosu.nextDouble();

        double toplamTutar;
        toplamTutar = (armutKg * 2.14) + (elmaKg * 3.67) + (domatesKg*1.11) + (muzKg*0.95) + (patlicanKg*5.00);
        System.out.println("Toplam TUTAR: "+toplamTutar);
    }
}