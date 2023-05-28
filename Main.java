import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double perKm = 2.20, total, startPrice = 10;




        Scanner inp = new Scanner(System.in);
        System.out.print("Mesafeyi Giriniz : ");
        km = inp.nextInt();

        total = (km * perKm);
        total += startPrice;

        total = (total < 20) ? 20 : total;
        System.out.println("Toplam Tutar : " + total);




            }
}
