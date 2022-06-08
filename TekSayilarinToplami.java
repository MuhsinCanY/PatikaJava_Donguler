package Donguler;
import java.util.Scanner;
public class TekSayilarinToplami {
    public static void main(String[] args) {
        int n,total=0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Gİriniz : ");
            n = scan.nextInt();
            if (n>=0 && n%2==0){
                total +=n;
            }
        }while (n%2==0);

        System.out.println("Girilen Çift Sayıların Toplamı : "+ total);


    }
}
