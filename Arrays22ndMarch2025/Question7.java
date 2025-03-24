public class Question7 {
    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        int max = Integer.MIN_VALUE;
        int i =0 ;
        int windowSum =0 ;
        while (i<arr.length) {
            windowSum = windowSum +  arr[i];

            if(max< windowSum){
                max = windowSum;
            }
            if(windowSum<0){
                windowSum = 0;
            }

            i++;
        }


        System.out.println(max);
    }
}
