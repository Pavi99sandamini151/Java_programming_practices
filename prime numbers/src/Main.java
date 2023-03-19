import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,m=0,flag=0;
        Scanner number = new Scanner(System.in);
        System.out.println("enter number");
        int number1 = number.nextInt();
        System.out.println(number1);
        m=number1/2;
        if(number1==0 || number1==1){
            System.out.println(number1 + " is not a prime number");
        } else {
            for(i=2;i<=m;i++){
                if(number1%i == 0){
                    System.out.println(number1+ " is not a prime number");
                    flag=1;
                    break;
                }
            }
        }
        if(flag == 0){
            System.out.println(number1+ " is a prime number");
        }
    }
}