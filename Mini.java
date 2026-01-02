import java.util.Scanner;
public class Mini{
    // static boolean isPrime(int num){
    //     if(num<=1)
    //     return false;

    //     for(int i=2;i<=num/2;i++){
    //         if(num%i==0){
    //             return false;
    //         }
    //     }
    //     return true;
    // }

    // public static void main(String[] args) {
    //     Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter the number: ");
    //     int number=sc.nextInt();
        
    //     if(isPrime(number)){
    //     System.out.println("Prime"+number);
    //     }else{
    //         System.out.println("not prime"+number);
    //     }
        
    // }


    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.println("GCD = " + gcd(num1, num2));

        sc.close();
    }
}


