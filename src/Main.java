import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut, elma, domts, muz, patl;
        double arPrice = 2.14, elPrice = 3.67, domPrice = 1.11, muzPrice = 0.95, patPrice = 5;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo? ");
        armut = input.nextDouble();
        System.out.print("Elma kaç kilo? ");
        elma = input.nextDouble();
        System.out.print("Domates kaç kilo? ");
        domts = input.nextDouble();
        System.out.print("Muz kaç kilo? ");
        muz = input.nextDouble();
        System.out.print("Patlıcan kaç kilo? ");
        patl = input.nextDouble();

        double total = armut * arPrice + elma * elPrice + domts * domPrice + muz * muzPrice + patl * patPrice;
        System.out.print("Toplam Tutar: " + total + " TL");
    }
}