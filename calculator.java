import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Choose a number");
        System.out.println("1 : Addition");
        System.out.println("2 : Subtraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.println("5 : Remainder");
        int num = sc.nextInt();

        if(num == 1){
            System.out.println(a+b);
        }else if(num == 2){
            System.out.println(a-b);
        }else if(num == 3){
            System.out.println(a*b);
        }else if(num == 4){
            System.out.println(a/b);
        }else if(num == 5){
            System.out.println(a%b);
        }else{
            System.out.println("Invalid input");
        }
    }
}
