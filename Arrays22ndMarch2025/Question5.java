class Question5{

    static void re_order1(int arr[]){
        int i =0; 
        int j =0;

        while(j<arr.length){
            if(arr[j]<0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                 i++;
            }
            j++;
        }
    }
    static void print(int arr[]){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static void reverse(int arr[]){
        int i = 0;
        // this loop is checking for the first positive value
        while(i<arr.length){
            if(arr[i]>0){
                break;
            }
            i++;
        }

        // this loop is reversing the elements of positve part of the array
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--;
        }

    }
    public static void main(String[] args) {
       int arr[]= { -12, 11, -13, -5, 6, -7, 5, -3, -6};
    //    {-12 , -13, -5, -7, -3, -6, 11,6,5 }
    
        print(arr);
        re_order1(arr);
        reverse(arr);
        print(arr);
    }
}