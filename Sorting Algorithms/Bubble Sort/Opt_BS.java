/**how is this optimal? here i added a flag variable . if no comparision takes place that means the arr is already sorted so we can break out of the loop prematurely and return the result */
import java.util.Scanner;
public class Opt_BS {
    public static int[] bubblesort(int[] arr1,int n1){

        for(int i=0;i<n1-1-i;i++){
            int flag=0,temp=0;
            for(int j=0;j<n1-1;j++){
                if(arr1[j]>arr1[j+1]){
                    temp=arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                    flag=1;
                }

            }
            if(flag==0){
                break;
            }
        }

        return arr1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of the array to be sorted: ");
        int size =sc.nextInt();
        int []arr1 =new int[size];
        System.out.println("Enter the array elements to be sorted ");
        for (int i=0; i<size; i++) {
            arr1[i] =sc.nextInt();
        }
       
        int[] result=bubblesort(arr1,size);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
