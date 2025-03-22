import java.util.Arrays;

public class Question3 {
    public static void main(String[] args) {
        int arr[] = {3, 5, 4, 1, 9, 8};
        int k =3;

        Arrays.sort(arr);
        int n = arr.length;
        int kthmin = arr[k-1];
        int kthmax = arr[n-k];
        System.out.println(kthmin+"  "+kthmax); 
    }
}
