public class MergeSort{
    // time complexity:  nlogn  [it will take linear time]
    public static void conquer(int arr[], int si, int mid, int ei){
        int merged[] = new int[ei - si + 1];

        int ind1 = si;
        int ind2 = mid+1;
        int m = 0;
        // coquer take O(n) time
        while(ind1 <= mid && ind2 <= ei){
            if(arr[ind1] <= arr [ind2]){
                merged[m++] = arr[ind1++];
            }else{
                merged[m++]= arr[ind2++];
            }
        }

        while(ind2 <= ei){
            merged[m++]= arr[ind2++]; // if the size of element of  the divided array is not same 
        }
        while(ind1 <=mid){
           merged[m++] = arr[ind1++]; 
        }

        for(int i =0, j=si ; i<merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int si, int ei ){
        if(si >= ei){
            return;
        }
        // Divide Ologn time
       int  mid = si +(ei -si)/2;  // (si+ei)/2 this method will take more time in bigger problem
        divide(arr, si, mid);
        divide(arr, mid+1,ei);

        conquer(arr, si,mid, ei);
    }
    public static void main(String args[]){
        int arr[] = {16,13,11,14,12,15};

        int n = arr.length;

        divide(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
    }
}
