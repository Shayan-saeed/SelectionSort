
package lab5task2;
import java.util.Scanner;

public class Lab5task2 {

   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 10 numbers:");
        int[] arr={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        
         System.out.println("Before Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }  
        System.out.println();  
          
        selectionSort obj=new selectionSort();
        obj.selectionSort(arr);
         
        System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
          
    }
    
    }

   
}

    
