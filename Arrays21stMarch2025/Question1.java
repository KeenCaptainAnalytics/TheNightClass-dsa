public class Question1 {
    
    public static int[] reverse1(int arr[]){
        int brr[]= new int[arr.length]; 
        int i =0;  // arr
        int j = arr.length-1 ; // brr pointer

        while(i<arr.length){
            brr[j]= arr[i];
            i++;
            j--;
        }

        return brr;
    }

    static void reverse2(int arr[]){


        int i =0;
        int j= arr.length-1;

        while(i<j){
            // swapping 
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j] = temp;

            i++;
            j--;

        }

        // for(int i=0 , j = arr.length-1;i<j ;i++, j--){

        // }
    }
    public static void main(String[] args) {
        int arr[] ={3,2,5,6,8,2};

        for(int ele : arr){
            System.out.print(ele + "  ");
        }
        System.out.println();
        reverse2(arr);

        for(int ele : arr){
            System.out.print(ele + "  ");
        }

        // int brr[] = reverse1( arr);

        // space complexity O(n)  input = 10000 extra space => 10000
        
        // for(int i=0;i< brr.length ;i++){
        //     System.out.print(brr[i]+ "  ");
        // }


    }
}
