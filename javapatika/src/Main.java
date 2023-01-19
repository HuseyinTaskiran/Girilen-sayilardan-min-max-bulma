import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
    int nmiktar;
    int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
            System.out.print("Kaç tane sayı gireceksin : ");
            nmiktar = inp.nextInt();
            while (nmiktar>0){
                System.out.print("Sayı giriniz : ");
                int n = inp.nextInt();
                nmiktar-=1;
                 if (n>max){
                     max=n;
                 }if (n<min){
                     min=n;
                 }

                }
        System.out.println("En büyük sayı : " + max);
        System.out.println("En küçük sayı : " + min);

            }

                }







