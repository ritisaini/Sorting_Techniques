package Sorting;

public class Insertion_Sorting {
    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){  // loop running n times
            int curr = arr[i];
            int prev = i-1;
           //finding out the correct position to insert
            while(prev >= 0 && arr[prev] > curr) {  // loop running n times
                arr[prev+1] = arr[prev];
                prev--; 
            }
            //insertion
            arr[prev+1] = curr;
        }
       }
       public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
      public static void main(String args[]){
        int arr[] = {3,1,5,2,4};
        insertionSort(arr);
        printArr(arr);
    }
    }
// Here Time complexity is also o(n)^2 as worst case tc but it is ask in question form by interviewer .
