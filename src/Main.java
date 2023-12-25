import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi, basValue, result = 0;

        Scanner scn = new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        sayi = scn.nextInt();
        int tempNumber = sayi;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber /= 10;
        }

        System.out.println(sayi + " sayısının basamak değeri toplamı : " + result);

    }
}