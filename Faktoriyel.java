package Donguler;
import java.util.Scanner;
public class Faktoriyel {

    static int fak(long x){
        Scanner scan = new Scanner(System.in);
        int result = 1 ;
        for(int i =1 ;i<=x;i++ ){
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n,r,combination;
        System.out.print("C(n,r) için n : ");
        n = scan.nextInt();
        System.out.print("r : ");
        r = scan.nextInt();

        combination = fak(n)/((long) fak(r) *fak(n-r));
        System.out.println("C("+n+","+r+") = "+ combination);

    }
}
