package Sorting;

public class Selection_Sorting {
    public static void selectionSort(int arr[]){
       for(int i=0; i<arr.length-1; i++){
        int minPos = i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[minPos] > arr[j]){ // for decreasing order use greater than sign
                minPos = j;
            }
        }
        //swapping
        int temp = arr[minPos];
        arr[minPos] = arr[i];
        arr[i] = temp;
       }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,4,5,1,3};
        selectionSort(arr);
        printArr(arr);
    }
}
