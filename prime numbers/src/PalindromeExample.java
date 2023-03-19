import java.util.Scanner;

public class PalindromeExample {
        public static void main(String args[]){

            Scanner inputNumber = new Scanner(System.in);
            System.out.println("enter number");
            int number = inputNumber.nextInt();
            int r,sum=0,temp;
            int n=number;//It is the number variable to be checked for palindrome

            temp=n;
            while(n>0){
                r=n%10;  //getting remainder
                sum=(sum*10)+r;
                n=n/10;
            }
            if(temp==sum)
                System.out.println("palindrome number ");
            else
                System.out.println("not palindrome");
        }
}
