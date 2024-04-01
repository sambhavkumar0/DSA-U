import java.util.Scanner;

/**Insertion sort is a simple sorting algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and placed at the correct position in the sorted part. */


public class insertion {
    public static int[] Insertion_Sort(int[] array, int n){

        for(int i=1;i<array.length;i++){

            int key = array[i];
            int j=i-1;//previous element
            while(j>=0 && array[j]>key){
                array[j+1]=array[j];
                j=j-1;
            }
            array[j+1]=key;
        }


        return array;
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
       
        int[] result=Insertion_Sort(arr1,size);
        System.out.println("The array is now sorted ");
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
