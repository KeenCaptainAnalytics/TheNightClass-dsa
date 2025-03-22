public class Question4 {

    static void sort0_1(int arr[]){
        int i =0;  // i-1 index are sorted
        int j = 0; //traversal

        while(j< arr.length){
            if(arr[j]==0){
                int temp = arr[i];
                arr[i]  = arr[j];
                arr[j] = temp;

                i++;
            }
            j++;
        }
    }
    static void sortCount(int arr[]){
        int zeroCounter = 0;
        for(int i=0;i<arr.length ;i++){
            if(arr[i]==0){
                zeroCounter++;
            }
        }

        for(int i =0 ;i< arr.length ;i++){
            if(zeroCounter>0){
                arr[i] =0;
                zeroCounter--;
            }
            else{
                arr[i]=1;
            }
            
        }
    }

    static void dutchNationalFlag(int arr[]){
        int i =0;
        int j = arr.length-1;
        int k=0;//traversal

        while(k<=j){
            if(arr[k]==0){
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
                i++;
            }
            else if(arr[k]==1){
                k++;
            }
            else if(arr[k]==2){
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k]= temp;
                j--;
            }
        }
    }

    static void counter(int arr[]){
        int zero = 0 ;
         int one = 0;
          int two = 0;

          for(int i=0; i< arr.length ;i++ ){
            if(arr[i]==0){
                zero++;
            }
            else if(arr[i]==1){
                one++;
            }
            else {
                two++;
            }
          }


        //   int brr[] = new int[arr.length];
         
          for(int i = 0 ;i< arr.length ;i++){
            if(zero>0){
                arr[i] = 0;
                zero--;

            }
            else if(one> 0){
                arr[i]=1;
                one--;
            }
            else{
                arr[i]=2;
            }
          }


    }
   public static void main(String[] args) {
        int  arr[] = {1,0,0,1,2,2,1,2,0,2,2,1,0};


        counter(arr);
        // dutchNationalFlag(arr);
        for(int ele  : arr){
            System.out.print( ele + "  ");
        }
        // int arr[]={0,1,0,1,1,1,0,0,1,1};
        // sort0_1(arr);
        // sortCount(arr);
        // for(int ele : arr){
        //     System.out.print(ele+ " ");
        // }
   } 
}
