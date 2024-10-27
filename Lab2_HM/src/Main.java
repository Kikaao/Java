import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

//--------------------1--------------------------

        System.out.print("Give an intiger: ");
        int x = read.nextInt();

        if(x<0){
            x = x - (2*x);
        }

        System.out.println("Your absolute value is " + x);

//------------------------2---------------------------

        if(x%2==0){
            System.out.println("Your number is even");
        } else {
            System.out.println("Your number is odd");
        }

//---------------------3-----------------------------

        if(x%5==0){
            System.out.println("Your number is multiplied by 5");
        } else {
            System.out.println("Your number is not multiplied by 5");
        }

//--------------------4------------------------

        System.out.print("Type one number: ");
        float num1 = read.nextFloat();

        System.out.print("Type a second number: ");
        float num2 = read.nextFloat();

        if(num1>num2)
            System.out.println("The first number is bigger that the second");
        else if (num1<num2)
            System.out.println("The second number is bigger than the first");
        else
            System.out.println("The first number is equal with the second");

//---------------------5---------------------

        System.out.print("Type a Intiger: ");
        int a = read.nextInt();

        if (a == 0)
            System.out.println("The number is 0");
        else if (a>0)
            System.out.println("The number is positive");
        else
            System.out.println("The number is negative");

//----------------------6-------------------------

        //We will take number a from question 5

        System.out.print("Give me two numbers: ");
        int num3 = read.nextInt();
        int num4 = read.nextInt();

        if(num3>num4){
            if (a>num4 && a<num3){
                System.out.println("The number is within the limits");
            }else
                System.out.println("The number is out of the limits");
        }else {
            if (a<num4 && a>num3){
                System.out.println("The number is within the limits");
            }else
                System.out.println("The number is out of the limits");
        }

//-----------------------7-----------------------

        for(int u = 1; u < num3; u++){
            num4+=num3;
        }
        System.out.println("The first number * the second equal " + num4);

//-----------------------10---------------------

//-----------------------11------------------------
        System.out.print("Type how many seconds you want to convert: ");
        int secs = read.nextInt();

        System.out.println(secs +" seconds is " + (secs/60) +" minutes and " + ((secs/60)/60) + " hours");

//------------------------12------------------------

        System.out.println("Type a two digit Intiger: ");
        int rev = read.nextInt();

        int dig1 = rev/10;
        int dig2 = rev%10;

        System.out.println("The reversed Intiger is " + dig2 + dig1);

//---------------------14---------------------

        System.out.println("Enter how many Fahrenheit you want to convert into Celsius");
        int fah = read.nextInt();

        int cel = (fah-32)*5/9;

        System.out.println(cel + "C");


    }
}