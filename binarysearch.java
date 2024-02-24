public class binarysearch {
    public static int binary(int[] arr,int element){
        int low=0;
        int high =arr.length-1;
        while (low <= high) {
            int mid=(low+high)/2;
            if(element==arr[mid]){
                return mid;
            }
            else if(element>arr[mid]){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int search=binary(arr, 6);
        System.out.println(search);
    }
}
