package Binary_Search;

public class Choclate_distribution {
    public  static boolean isDivisionpossible(int []a,int m,int max){
int numofstudent=1;
int choc=0;//number of choc current student have
for(int i=0;i<a.length;i++){
    if(a[i]>max){
        return false;
    }
    if(choc+a[i]<=max){
        choc+=a[i];
    }
    else{
        numofstudent++;
        choc=a[i];
    }
    if(numofstudent>m) return false;

}
return true;
    }
    public static int distributedchoc(int[]a,int m){
        if(a.length < m) return -1;
         //no. of boxes is less than student then dist.is not possible

        int s=0;
        int e=(int)1e9;
        int ans=-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(isDivisionpossible(a,m,mid)){
ans=mid;
e=mid-1;
            }
else {
                    s = mid + 1;
                }

            }
        return ans;
    }
    public static void main(String[] args) {
        int[]a={5,3,1,4,2};
        int m=3;
        System.out.println(distributedchoc(a,m));
    }
}
