public class QuickSort {

    public static int partition(int arr[], int l, int h){

        int pivot = arr[h];
        int i = l-1;

        for(int j=l; j<h; j++){
            if(arr[j] <pivot){
                i++;
                int temp;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j]= temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[h] = temp;
        return i;
    }

    public static void quickSort(int arr[], int l, int h){
        if(l <h){
            int pindx = partition(arr, l, h);

            quickSort(arr, l, pindx-1);
            quickSort(arr, pindx+1, h);
        }
    }
    
    public static void main(String[] args){
        int[] arr = {13, 14, 12, 15, 11};

        int num = arr.length;

        quickSort(arr, 0, num-1);

        // printing the array
        System.out.println("The sorted array is: ");
        for(int i=0; i<num; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
