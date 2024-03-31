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
        int []arr1 = {2,3,8,6,4,255,64,36,77};
        int n1=arr1.length;
        int[] result=bubblesort(arr1, n1);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
