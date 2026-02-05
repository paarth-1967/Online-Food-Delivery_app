import java.util.Scanner;
   class ArrayExample{
   public static void main(){
       Scanner sc=new Scanner(System.in);
       int marks[] = {12,14,16,18,20};// Array elements
       System.out.println("Using for each loop");
       for (int i : marks){ // Using for each loop
           System.out.println(""+i);
       }
           
       System.out.println(marks[1]);// Accessing element at specific index
       System.out.println("Update Array Elemets:");
       marks[3]=100;   ///Update element by their index.
       
       System.out.println("Array elements: ");
       for(int i =0;i<marks.length;i++){
           System.out.println(marks[i]); //Printing elements
       }
       System.out.println("Enter your element: ");
       int m=sc.nextInt();
       for(int i=0;i<marks.length;i++){
           if(marks[i]==m){
               System.out.println("Number found at idx: "+i); //index specific element
           }
   }
   }
   }