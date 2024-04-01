/**this algo works in nlogn time complexity in the best case and in the worst case it works in n^2 time complexity. 
 * this algorithm uses divide and conquer technique to sort the array
*/

public class Quicksort {

    public static void quicksort(int[] arr,int low,int high){

        if(low<high){

            int pi=partition(arr,low,high);
            quicksort(arr, low,pi-1 );
            quicksort(arr, pi+1, high);
        }

    }
    private static int partition(int[] arr,int low,int high){

        int pivot=arr[high];
        int i=low-1;
        for (int j=low;j<high;j++){
            if (arr[j]<pivot) {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;

        return i+1;

    }
      public static void main(String[] args){
        int arr[]={5,6,7,1,2,4,5,6,3,4,2};
        quicksort(arr, 0,arr.length-1);
        for(int num:arr){
            System.out.print(num+" ");
        }


      }
}
