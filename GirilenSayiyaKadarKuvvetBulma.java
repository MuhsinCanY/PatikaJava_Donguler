package Donguler;
import java.util.Scanner;
public class GirilenSayiyaKadarKuvvetBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üst Sınır Sayısı : ");
        int n =scan.nextInt();

        System.out.println("4'ün kuvvetleri : ");
        for(int i = 1;i<n;i*=4){
            System.out.println(i);
        }
        System.out.println("5'in kuvvetleri : ");
        for(int i = 1;i<n;i*=5){
            System.out.println(i);
        }


    }
}
