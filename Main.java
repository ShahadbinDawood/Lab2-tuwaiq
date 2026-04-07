import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //q1
        /*
        ArrayList<String> Words = new ArrayList<>();
        ArrayList<String> longWord = new ArrayList<>();
        System.out.println("how many words you want to enter :");
        int index = input.nextInt();
        input.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.print("enter your word : ");
            String text =input.nextLine();
            Words.add(text);
        }
        int max=0;
        for (int i = 0; i <Words.size() ; i++) {
            if (Words.get(i).length()>=max){
                max=Words.get(i).length();
            }
        }
        for (String s : Words ){
            if(s.length()==max){
                longWord.add(s);
            }
        }

        System.out.println(longWord);
        //take the words as input then see what is the longest  word than print it

         */

        //q2
        /*
        int[] arr ={1,1,1,3,3,5} ;
        ArrayList<String> results = new ArrayList<>();
        ArrayList<Integer> seen = new ArrayList<>();
        for (int i : arr) {
            if (!seen.contains(i)) {
                int num = 0;
                for (int j : arr) {
                    if (i == j) {
                        num++;
                    }
                }
                results.add(i + " occurs " + num + " times");
                seen.add(i);
            }
        }
         for (String s :results){
        System.out.println(s);}
         //used array list to add how many time the number have show in the array then   what I have  calculated and seen add it to seen so we can skip it


         */


        /*
        //q3
        ArrayList<Integer> nums = new ArrayList<>();
        int k ;
        System.out.println("how many number you want to enter :");
        int index = input.nextInt();
        input.nextLine();
        for (int i = 0; i < index; i++) {
            System.out.print("enter your number : ");
            int text =input.nextInt();
            nums.add(text);
        }
        System.out.println("how many largest number you want to see  ?");
        int numberOf =input.nextInt();
        if(numberOf<=nums.size()){
            nums.sort((a, b) -> { return -1 * a.compareTo(b); } );
            System.out.println(numberOf+" largest elements of the said array are: ");
            for (int i = 0; i <numberOf ; i++) {
                System.out.print (nums.get(i)+" ");

            }
        }else System.out.println("invalid input ");
        //input the numbers than sort them with method sort and then  print  the number wanted



         */
        /*
        //q4
        int[] arr = {5,4,3,2,1};
        reversd(arr);
        //used void method to print it in reversed

         */
        /*
        //q5
        ArrayList<String> element = new ArrayList<>();
        boolean countinue = true;
        int   max=99 ;

        while (element.size() < max){


            System.out.println("1.Accept elements of an array \n 2.Display elements of the array \n 3.Search the element within array \n 4. Sort the array \n 5.To stop the size of the array should be entered  by the user ");

            int i = input.nextInt() ;
            switch (i){
                case 1:{
                    System.out.print("enter the element :");
                    input.nextLine();
                    String s= input.nextLine();
                    element.add(s);
                    break;
                }
                case 2:{
                    for (int j = 0; j < element.size(); j++) {
                        System.out.println(element.get(j));

                    }break;
                }
                case 3:{
                    System.out.println("what do want to search ? ");
                    input.nextLine();
                    String s = input.nextLine();
                    for (int j = 0; j < element.size(); j++) {
                        String text = element.get(j);
                        if (text.contains(s)) {
                            System.out.println(text);
                        } else System.out.println(" ");
                    }
                    break;
                }
                case 4:{
                    element.sort((a, b) -> { return -1 * a.compareTo(b); } );

                    break;
                }
                case 5:{
                    System.out.println("current size : "+element.size()+" what size you want to stop at  ?");
                    max = input.nextInt();

                    break;
                }
                default:
                    System.out.println("input invalid ");
            }
        }
        //used switch for the menu  and used while to continue the code used sort to sort and used for to print the element

         */
        /*
        //q6
        int max , min ,num ;
        System.out.println("Enter the minimum value of the range: ");
        min=input.nextInt();
        System.out.println("Enter the maximum value of the range: ");
        max=input.nextInt();
        System.out.println("Enter the number of random numbers to generate:");
        num=input.nextInt();
        generateNum(min , max ,num);
        //used class random to generate random numbers in the method generateNum and entring the max and the min

         */
        /*
        //q7
        System.out.print("Enter a password : ");
        String pass = input.nextLine();
        System.out.println("password is "+check(pass));
        //Used 3 method to calculate  the score and then return the classification

         */
        //q8
        System.out.print("Enter the number of fibonacci sequence terms to generate : ");
        int num = input.nextInt();
        fibonacci(num);
        //using method having in it for loop divided by have the number wanted because we print 2 terms at one time




    }
    public static void reversd(int[] arr ){
        int num =arr.length;
        for(int i=0 ; i<arr.length;i++){
            System.out.print(arr[num-1]+" ");
            num--;


        }
    }
    public static void generateNum(int min , int max , int num) {
        Random rand = new Random();
        for (int i = 0; i <num ; i++) {
            System.out.print(rand.nextInt(min,max+1)+" ");
        }


    }
    public static String check(String s){
        int score =checkUpperCaseLowerCase(s)+checkLength(s)+checkSpecialCharacter(s);


        if(score>=8){
            return "strong";
        }else if (score>=5){
            return "moderately";
        }else return "weak";

    }
    public static int checkUpperCaseLowerCase(String s){
        if(s.matches("^(?=.*[a-z])(?=.*[A-Z]).+$"))
            return 3;
        else return 0;
    }
    public static int checkLength(String s ){
        if (s.length()<=5){
            return 0;
        } else if ((s.length()==7)||(s.length()==6)) {
            return 2;
        }else
            return 3;
    }
    public static int checkSpecialCharacter(String s){
        if ((s.matches(".*[^a-zA-Z0-9].*"))){
            return 2;
        } else return 0 ;
    }
    public static void fibonacci(int i){
        int num1=0 , num2=1 ;
        System.out.print(num1+" "+num2);
        for (int j = 0; j < (i-1)/2; j++) {
            num1=num2+num1;
            num2=num2+num1;
            System.out.print(" "+num1+" "+num2+ " ");
        }

    }

}