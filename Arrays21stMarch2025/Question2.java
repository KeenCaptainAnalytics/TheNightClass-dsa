import java.util.Arrays;

public class Question2 {

    static int[] minAndMax(int arr[]){
        int min = Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;

        // n =>  O(n) , O(1)
        for(int i =0 ;i <arr.length ;i++){
            if(min> arr[i]){
                min= arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int result[] = new int[2];
        result[0] = max;
        result[1] = min;

        return result;
    }
    public static void main(String[] args) {
        // 64bits long
        int arr[] = {2,5,1,4,8,9,5};
        //sort => n^2 , nlogn 
        // Arrays.sort(arr);
        // arr[0];
        // arr[arr.length-1];



        // oth => max and  1st => min
        // int result[] = minAndMax(arr);
        // System.out.println(result[0]+ "   "+ result[1]);   
    }
}
