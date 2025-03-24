import java.util.ArrayList;

public class Question8 {
    static void leaderOfArray(int arr[],ArrayList<Integer> list){
        int max = arr[arr.length-1];
        int j =arr.length-1;

        while(j>=0){
            if(arr[j]>=max){
                // System.out.println(arr[j]);
                list.add(arr[j]);
                max = arr[j];
            }
            j--;
        }
    }
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        ArrayList<Integer> list = new ArrayList<>();
        leaderOfArray(arr, list);

        System.out.println(list);
    }
}
