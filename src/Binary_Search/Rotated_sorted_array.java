package Binary_Search;

public class Rotated_sorted_array {
    //find index of minimum element
    public static int indexofmin(int []arr){
        int n=arr.length;
        int start=0;
        int end=n-1;
        int ans=-1;
        while(start<=end){
            int mid=(start+end)/2;
                if(arr[mid]<=arr[n-1]){
                    ans=mid;
                    end=mid-1;
                }
                else{
                    start=mid+1;
                }
            }
        return ans;
    }
    //find index of target
        public static int indexoftar(int[] arr, int target) {
            int start = 0;
            int end = arr.length - 1;

            while (start <= end) {
                int mid = (start + end) / 2;

                if (arr[mid] == target) {
                    return mid;
                }

                // Check if left half is sorted
                if (arr[start] <= arr[mid]) {
                    // Target lies in left half
                    if (target >= arr[start] && target < arr[mid]) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
                // Else, right half is sorted
                else {
                    if (target > arr[mid] && target <= arr[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }
                }
            }
            return -1; // Not found
        }


        public static void main(String[] args) {
        int[]arr={4,5,1,2,3};
        System.out.println(indexofmin(arr));
        int target=4;
        System.out.println(indexoftar(arr,target));

    }
}
