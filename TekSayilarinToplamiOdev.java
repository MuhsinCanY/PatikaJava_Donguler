package Donguler;
import java.util.Scanner;
public class TekSayilarinToplamiOdev {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,result=0;

        do {
        System.out.print("Sayı Giriniz : ");
        x =scan.nextInt();
        if(x % 4 == 0){
            result +=x;
        }

        }while (x%2==0);
        System.out.println("Tek Sayıların Toplamı : " + result);


    }
}
