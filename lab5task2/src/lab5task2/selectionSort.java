
package lab5task2;


public class selectionSort {
    void selectionSort(int[] num){  
        for (int i = 0; i < num.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < num.length; j++){  
                if (num[j] < num[index]){  
                    index = j; 
                }  
            }  
            int smallerNumber = num[index];   
            num[index] = num[i];  
            num[i] = smallerNumber;  
        }
    }
}
