/**this is not the optimised solution for bubble sort */
public class BubbleSort {
    

    public static int[] bubblesort(int arr[],int n){

        int temp = 0;
        for(int i=0;i<n-1-i;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]>=arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
        }
       
    }
    return arr;
}

public static void main(String[] args) {
    int []arr = {2,3,8,6,4,255,64,36,77};
    int n=arr.length;
    int[] result=bubblesort(arr, n);
    for (int i=0;i<result.length;i++){
        System.out.print(result[i]+" ");
    }
}
}
