import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        /*Ex1.Write a Java program to test if the first and the last element of an array of
          integers are same. */

//        System.out.println("Please enter number of element: ");
//        int numberElement = input.nextInt();
//
//        int[] number = new int[numberElement];
//
//        for (int i = 0; i < numberElement; i++) {
//            System.out.println("enter element: ");
//            int num = input.nextInt();
//            number[i]=num;
//        }
//        System.out.println(Arrays.toString(number));
//        if (number[0]==number[numberElement-1]){
//            System.out.println("true");
//        }else System.out.println("false");









        
        /*Ex2.Write a Java program to find the numbers greater than the average of the
numbers of a given array.
Original Array:
[1, 4, 17, 7, 25, 3, 100]  */

//        int[] number = {1,4,17,7,25,3,100};
//        System.out.println(Arrays.toString(number));
//        int sum =0;
//        for(int n : number){
//            sum += n;
//        }
//        double average = sum/number.length;
//        System.out.println("The average of the said array is : "+average);
//
//        System.out.print("The numbers in the said array that are greater than the average are: ");
//        for (int i = 0; i < number.length; i++) {
//            if (average<number[i])
//                System.out.print(number[i]+" ");
//        }








        /*Ex3.Write a Java program to get the larger value between first and last
element of an array of integers. */
//
//        System.out.println("Please enter number of element: ");
//        int numberElement = input.nextInt();
//
//        int[] number = new int[numberElement];
//
//        for (int i = 0; i < numberElement; i++) {
//            System.out.println("enter element: ");
//            int num = input.nextInt();
//            number[i]=num;
//        }
//        System.out.println(Arrays.toString(number));
//        if (number[0]>=number[numberElement-1]){
//            System.out.println("Larger value between first and last element: "+number[0]);
//        }else System.out.println("Larger value between first and last element: "+number[numberElement-1]);







        /*Ex4.Write a Java program to swap the first and last elements of an array and
create a new array.*/

//        System.out.println("Please enter number of element: ");
//        int numberElement = input.nextInt();
//
//        int[] number = new int[numberElement];
//        int [] swapNumber= new int[number.length];
//
//        for (int i = 0; i < numberElement; i++) {
//            System.out.println("enter element: ");
//            int num = input.nextInt();
//            number[i]=num;
//        }
//        System.out.println("The Original Array: "+Arrays.toString(number));
//
//        swapNumber[0]= number[number.length-1];
//        swapNumber[swapNumber.length-1]=number[0];
//        for (int i = 1; i < number.length-1 ; i++) {
//            swapNumber[i]=number[i];
//        }
//        System.out.println("New array after swapping the first and last elements: "+Arrays.toString(swapNumber));
//







        /*Ex5. Write a program that places the odd elements of an array before the
even elements. */

//        ArrayList<Integer> number = new ArrayList<>();
//        number.add(2);
//        number.add(3);
//        number.add(40);
//        number.add(1);
//        number.add(5);
//        number.add(9);
//        number.add(4);
//        number.add(10);
//        number.add(7);
//
//        System.out.println(number);
//
//        ArrayList<Integer> oddEven = new ArrayList<>();
//
//        for(int n : number){
//            if(n%2!=0){
//                oddEven.add(n);
//            }
//        }
//        for (int n : number){
//            if (n%2==0){
//                oddEven.add(n);
//            }
//        }
//        System.out.println(oddEven);















      /*  6. Write a program that test the equality of two arrays.*/

//        int[] arrayOne ={2,3,6,6,4};
//        int[] arrayTwo ={2,3,6,6,4};
//
//        boolean elementEquals = false;
//        boolean sizeEquals=false;
//
//
//        if (arrayOne.length==arrayTwo.length)
//            sizeEquals = true;
//
//        for (int i = 0; i < arrayOne.length; i++) {
//            if (arrayOne[i] == arrayTwo[i])
//                elementEquals = true;
//
//        }
//        if (elementEquals == sizeEquals)
//            System.out.println(true);
//        else System.out.println(false);

    }
}