import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);


//------------------------1---------------------------------

//        System.out.println("Type an intiger");
//        int x = read.nextInt();
//
//        if(x%2==0)
//            System.out.println(x + "Is an even number");
//        else
//            System.out.println(x + "Is an odd number");

//----------------------2---------------------------------

//        System.out.println("Enter the grade of the student");
//        int y = read.nextInt();
//
//        if(y>=40)
//            System.out.println("You passed");
//        else if(y<0)
//            System.out.println("Wrong number");
//        else
//            System.out.println("You failed");

//--------------------4------------------------------

//        System.out.print("What's your favourite month: ");
//
//        int mon = read.nextInt();
//
//        switch (mon){
//            case 1: System.out.println("January"); break;
//            case 2: System.out.println("February");break;
//            case 3: System.out.println("Mars");break;
//            case 4: System.out.println("April");break;
//            case 5: System.out.println("May");break;
//            case 6: System.out.println("June");break;
//            case 7: System.out.println("July");break;
//            case 8: System.out.println("Augast");break;
//            case 9: System.out.println("September");break;
//            case 10: System.out.println("Octomber");break;
//            case 11: System.out.println("November");break;
//            case 12: System.out.println("December"); break;
//            default: System.out.println("Wrong number");
//        }

//----------------------------5---------------------------

//        System.out.print("Enter your mark: ");
//            int mark = read.nextInt();
//
//        if (mark>100)
//            System.out.println("Wrong number");
//        else if (mark<0)
//            System.out.println("Wrong number");
//        else if (mark>=70)
//            System.out.println("Class I");
//        else if (mark>=60)
//            System.out.println("Class Ii");
//        else if (mark>=50)
//            System.out.println("Class Iii");
//        else if (mark>=45)
//            System.out.println("Class III");
//        else if (mark>=40)
//            System.out.println("Pass");
//        else
//            System.out.println("Fail");


//-------------------------------6--------------------------

//        System.out.print("Enter grade for the assingment: ");
//        double mark1 = read.nextDouble();
//
//        System.out.print("Enter grade of the final result: ");
//        double mark2 = read.nextDouble();
//
//        if (mark1<40 || mark2<40)
//            System.out.println("You FAILED GET BETTER!!!!!!!!");
//        else {
//            double fmark = (0.3*mark1) + (0.7*mark2);
////            if (fmark>39)
//                System.out.println("You passed with: " + fmark);
////            else
////                System.out.println("You failed ;(");
//
//        }


//----------------------------7------------------------------

//        System.out.print("Type c for Celsius\nType f for Fahrenheit: ");
//        char th = read.next().charAt(0);
//
//        if (th=='c')
//        {
//            System.out.print("How many Celsius do you want to convert into Fahrenheit:");
//            int c = read.nextInt();
//            int f = (9*c)/5 + 32;
//            System.out.println(c + " Equals " + f);
//
//
//        } else if (th=='f') {
//            System.out.print("How many Fahrenheit do you want to convert into Celsius:");
//            int f = read.nextInt();
//            int c = 5*(f-32)/9;
//            System.out.println(f + " Equals " + c);
//        }else
//            System.out.println("Wrong Char");

//-----------------------------8--------------------------------------

//        System.out.println("Type R for Rectangle Calculation \nType T for Triangle Calculation\nType C for Circle Calculation");
//        char shape = read.next().charAt(0);
//
//        if (shape=='R'){
//            System.out.print("Give the 2 sides of the rectangle: ");
//            float x = read.nextFloat();
//            float y = read.nextFloat();
//
//            float Area = x*y;
//            float perim = (x*2) + (y*2);
//
//            System.out.println("The Area of the rectangle is " + Area + ". The perimeter of the rectangle is " + perim + ".");
//
//        } else if (shape=='T') {
//            System.out.print("Give me the length of the 2 sides of the tringle: ");
//            float a = read.nextFloat();
//            float b = read.nextFloat();
//            System.out.print("Give me the base of the tringle: ");
//            float base = read.nextFloat();
//
//            System.out.print("Give me the high of tringle: ");
//            float high = read.nextFloat();
//
//            float leght = a+b+base;
//            System.out.print("The legnth of the tringle is:" + leght);
//
//            float Area = (high*base)/2;
//            System.out.println("The area of the tringle is " + Area);
//
//        }else if (shape=='C'){
//            System.out.println("Give me the radius of the cicle");
//            double radius = read.nextDouble();
//
//            double Perim = Math.PI * (2 * radius);
//
//            double Area = Math.PI * Math.pow(radius, 2);
//
//            System.out.println("The Area of the cicle is " + Area + ". The Perimetre is " + Perim);
//        }else
//            System.out.println("Wrong Char");


    }
}