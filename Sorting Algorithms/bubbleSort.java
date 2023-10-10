public class bubbleSort {

    public static void bubbleSort(int arr[]){
        int n = arr.length;

        for(int i=0;i<n-1;i++){
            for(int j = i+1;j<n-i;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[] = {3,1,4,9,2,5};

        bubbleSort(arr);
    }    
}
