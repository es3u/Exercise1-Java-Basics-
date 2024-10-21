import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        1. Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
//                          • •
//        Input: Weight (kg) = 70, Height (m) = 1.75 Expected Output: BMI = 22.86
//
        int weight  ;
        float height ;
       double bmi ;

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your weight");
       weight = input.nextInt();

       System.out.println("please enter your height");
       height = input.nextFloat();
      System.out.println("the BMI is " + (bmi = weight/(height * height)) );

        // ***********The end of quation 1***************


      // 2. Write a program that takes the obtained marks and total marks as input and calculates the percentage, then prints it.

       //           • •
        //Input: Obtained Marks = 85, Total Marks = 100 Expected Output: Percentage = 85.0%

        double obtained_marks;
        int total_marks = 100;
        double percentage;

        System.out.println("how many your Obtained Marks?");
        obtained_marks = input.nextDouble();

        percentage = (obtained_marks / total_marks)  * 100 ;
        System.out.println("Percentage is " + percentage);

        // *********** The end of quation 2 ***************

//        3. Create a program that takes an amount in one currency and an exchange rate
//        as input, then converts and prints the amount in another currency.
//
//        • •
//        Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85 Expected Output: Amount in EUR = 85.0



        double amountـinـSAR ;
        double  SAR_to_USD = 3.75;
        double  amount ;

        System.out.println("please enter your amountin SAR");
        amountـinـSAR = input.nextDouble();

        amount = amountـinـSAR/SAR_to_USD;
        System.out.println("Amount in USD  " + amount);

        //  *********** The end of quation 3 ***************


//         4. Create a program that takes a string as input, calculates its length,
//         and then reverses the string using the StringBuilder class,
//         finally printing both the length and reversed string.
//
//
//        Input: "Hello, World!"
//        Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"
//

        StringBuilder s = new StringBuilder();


        String s_builder;


        System.out.println("give me full name");
        s_builder = input.nextLine();


        System.out.println("Length of the string:" + s_builder.length());

        s.append(s_builder);

        System.out.println("Reversed string:" + s.reverse());


        //  *********** The end of quation 4 ***************

       /*5. Develop a program that takes a sentence as input and extracts a substring from it, then prints the extracted substring.

        * Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index = 10, End Index = 20  
        * Expected Output: "brown fox" */



        String sentence ;

        System.out.println("can you write a sentence");
        sentence = input.nextLine();

        System.out.println(sentence);

        System.out.println("Determine where you want to start and finish printing    \n" + (sentence.substring(input.nextInt() , input.nextInt())));

        //  *********** The end of quation 5 ***************

     /*  6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present in the sentence and prints the result.
• •
        Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
        Expected Output: Keyword "jumps" is present in the sentence.*/

        String sentence1 ;
        String kayword;


        System.out.println("Enter your sentence ");
        sentence1 = input.nextLine();
        System.out.println("Enter your kayword");
        kayword = input.nextLine();


        System.out.println(" sentence :" + sentence1);
        System.out.println("kay word :" + kayword );

        System.out.println(sentence1.contains(kayword) && kayword.equals(kayword));

        System.out.println("Keyword "+ kayword +" is present in the sentence");

        System.out.println( "*********** The end of quation 6 ***************" );

        //  "*********** The end of quation 6 ***************"

//       7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences of the word with another word and prints
//        the modified sentence.
//        input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
//        Expected Output: "The quick brown cat jumps over the lazy dog"

        System.out.println("enter your kayword");
        kayword = input.nextLine();

        System.out.println("enter your replace");
        String rep = input.nextLine();

         String sen = sentence1.replaceAll(kayword, rep);

        System.out.println("replace   " + sen);

        //System.out.println(sentence1);

        //  "*********** The end of quation 7 ***************"


       /* 8.Write a program that takes two strings as input and check if they are equal, ignoring the case, then prints whether they are equal or not.

* Input: String 1 = "Hello", String 2 = "hello"
* Expected Output: Strings are equal (ignoring case). */

        System.out.print("Enter the first String  ");
        String s_a = input.nextLine();
        System.out.print("Enter the second String  " );
        String s_b = input.nextLine();
        boolean s_c ;

     System.out.println(s_c =  s_a.equals(s_b) );
     System.out.println(s_a +"   " +s_b);


      System.out.println("Strings are equal (ignoring case)  " );

        //  "*********** The end of quation 8 ***************"



























































    }
}