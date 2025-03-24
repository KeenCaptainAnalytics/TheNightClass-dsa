public class Question6 {

    public static void rotateByOne(int num[]){
        int temp = num[num.length-1];
        int i = num.length-1;

        while(i>0){
            num[i]= num[i-1];
            i--;
        }

        num[0]=temp;
    }
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void reverse(int arr[], int i , int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }
    static void rotate2PAss(int arr[], int k){

        int lo =0 ;
        int hi = arr.length-1;
        int partition = hi-k;

        // two segments
        reverse(arr, lo, partition);
        reverse(arr, partition+1, hi);

        // final array
        reverse(arr, lo, hi);

    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
                    // [5,6,7,1,2,3,4]  
                    
         rotate2PAss(arr, 3);
         print(arr);           
        // int k = 3;

        // for(int i=0;i<k ;i++){
        //     rotateByOne(arr);
        // }
        // print(arr);
    }
}
