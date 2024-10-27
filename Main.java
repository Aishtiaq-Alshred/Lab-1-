import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        // sol-1
        System.out.println("enter the frist number");
        int number1= input.nextInt();
        System.out.println("enter the scound number");
        int number2= input.nextInt();
        int sum=number1+number2;
        int sub= number1-number2;
        int multiply =number1*number2;
        int divide =number1 / number2;
        int mod =number1 %number2;
        System.out.println(number1 +" + "+ number2+" = "+ sum +"\n"+number1 +" - "+ number2+" = "+ sub +"\n"+number1 +" * "+ number2+" = "+ multiply +"\n"+number1 +" / "+ number2+" = "+ divide +"\n"+number1 +" mod "+ number2+" = "+ mod +"\n");

        // sol-2
        System.out.println("enter a number to display its multiplication table");
        int num=input.nextInt();
        int multiplication=1;
        for(int i=1;i<=10;i++){
            multiplication=num*i;
            System.out.println(num+" * "+i +" = "+multiplication);
        }

//        //sol-3
        System.out.print("Enter the radius of the circle: ");
        double
        radius = input.nextDouble();

        double area = Math.PI * radius * radius;
        double perimeter = 2 * Math.PI * radius;

        System.out.println("Perimeter is: " + perimeter);
        System.out.println("Area is: " + area);


//        //sol-4
        System.out.println("Enter the count of numbers: ");
        int count0= input.nextInt();
        double sum2 = 0;
        for (int i = 0; i < count0; i++) {
            System.out.print("Enter an integer: ");
            int num0 = input.nextInt();
            sum2 =sum2+ num0;
        }
        double average = sum2 / count0;
        System.out.println("The average is: " + average);

        //sol-5
        System.out.println("Input the first number : ");
        int numberr = input.nextInt();
        System.out.println("Input the second number : ");
        int numbe = input.nextInt();
        System.out.println("Input the third number : ");
        int numbee = input.nextInt();
        int summ= numberr + numbe;
        if(summ == numbee ){
            System.out.println("The result is: true ");
        }else System.out.println("The result is: false ");

        //sol-6
        System.out.println("Input a word:");
        String word= input.nextLine();
        StringBuilder reverse=new StringBuilder(word).reverse();
        System.out.println("Reverse word:"+ reverse.toString());

        //sol-7
        System.out.println("Enter a number: ");
        int number4 = input.nextInt();
        if(number4 %2==0){
            System.out.println("The number is Even");
        }else System.out.println("The number is Odd");

//        //sol-8
        System.out.print("Enter temperature in Centigrade: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);



//        //sol-9
        System.out.println("Input a string: ");
        String inputs= input.nextLine();
        System.out.println("Input a number: ");
        int index= input.nextInt();
        if (index >= 0 && index < inputs.length()) {
            // Extract and print the character at the given index
            char character = inputs.charAt(index);
            System.out.println("The character at index " + index + " is: " + character);
        } else {
            // Handle invalid index
            System.out.println("Invalid index. Please enter an index between 0 and " + (inputs.length() - 1));
        }


//        //sol-10
        System.out.println("Width = ");
        double width = input.nextDouble();
        System.out.println("Height = ");
        double height = input.nextDouble();
        double areaa = width * height;
        double perimeterr = 2 * (width + height);
        System.out.println("Area is " + width + " * " + height + " = " + areaa);
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + perimeterr);

//   // sol-11
        System.out.println("Input Data: ");
        System.out.println("Input first integer:");
        int numberfrist= input.nextInt();
        System.out.println("Input second integer:");
        int numbersecond=input.nextInt();
        if(numberfrist!=numbersecond  ){
            System.out.println(numberfrist+" != "+numbersecond);
        } if (numberfrist<numbersecond) {
            System.out.println(numberfrist+" < "+numbersecond);
        }  if (numberfrist<=numbersecond) { System.out.println(numberfrist+" <= "+numbersecond);
        }

//
        // sol-12
        System.out.print("Input seconds: ");
        int totalSeconds = input.nextInt();
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);

        //sol-13
        System.out.println("Input first number:");
        int num6= input.nextInt();;
        System.out.println("Input second number:");
        int num7= input.nextInt();;
        System.out.println("Input third number:");
        int num8= input.nextInt();;
        System.out.println("Input fourth number:");
        int num9= input.nextInt();;
        if(num6==num7 && num7==num8 &&num8==num9){
            System.out.println("Numbers are equal!");
        }else
        System.out.println("Numbers are not equal!");

       // sol-14
        System.out.println("check the number");
        int check= input.nextInt();
        //int negative;
        //int zero;
        //int positive;
        if(check>0){
            System.out.println("Number is positive");
        }else if(check<0){
            System.out.println("Number is negative");
        } else System.out.println("Number is zero");

        //sol-15
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        int numb;
        do {
            System.out.print("Enter a number (enter -1 to quit): ");
            numb = input.nextInt();
            if (numb == -1) {
                break;
            }
            if (numb > 0) {
                positiveCount++;
            } else if (numb < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        } while (true);
        System.out.println("Positives: " + positiveCount);
        System.out.println("Negatives: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);

        //sol-16
        System.out.print("Enter an integer:");
        int n = input.nextInt();
        int reversedNumber = 0;
        while (n != 0) {
            int lastDigit = n % 10;
            reversedNumber = reversedNumber * 10 + lastDigit;
            n /= 10;
        }
        System.out.println("Reversed number: " + reversedNumber);

        //sol-17

        System.out.println("enter the try number : ");
        int nn = input.nextInt();
        int nn1;
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for (int n = 1; n <= nn; n++) {
            System.out.println("enter the number :");
            nn1 = input.nextInt();
            if (nn1 > large) {
                large = nn1;
            }
            if (nn1 < small) {
                small = nn1;
            }
        }
            System.out.println("the large number : " + large);
            System.out.println("the small number : " + small);


            //sol-18
            System.out.println("Enter a string:");
            String inputStringg = input.nextLine();
            int count = 0;

            for (char c : inputStringg.toCharArray()) {
                if (c == 'a' || c == 'A') {
                    count++;
                }
            }

            System.out.println("Number of 'a's: " + count);


        }
    }