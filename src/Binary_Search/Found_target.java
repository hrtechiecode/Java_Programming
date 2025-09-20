package Binary_Search;
//find index of target if not found return -1
public class Found_target {
    static int binarysearch(int []nums,int target){
                int start=0;
                int end=nums.length-1;
                while(start<=end){
                    int mid=(start+end)/2;
                    if(target==nums[mid]){
                        return mid;
//return true;
                    }
                    else if(target>nums[mid]){
                        start=mid+1;
                    }
                    else{
                        end=mid-1;
                    }
                }
                return -1;
                //return false;
            }
    public static void main(String[] args) {
        int[]arr={1,2,4,5,7,9,20};
        int target=9;
        System.out.println(binarysearch(arr,target));
    }
}