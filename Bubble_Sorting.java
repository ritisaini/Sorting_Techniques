package Sorting;

public class Bubble_Sorting {
    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length-1; turn++){
          //  int swaps=0;
            for(int j=0; j<arr.length-1-turn; j++){
                if(arr[j] > arr[j+1]){
                    //swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
               // swaps++;(To modify the code with help of swapping so that time complexity becomes best)
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {2,3,1,5,4};
        bubbleSort(arr);
        printArr(arr);
    }
}
// Here Time complexity is o(n)^2 as 2 loops are running i.e worst Time complexity.