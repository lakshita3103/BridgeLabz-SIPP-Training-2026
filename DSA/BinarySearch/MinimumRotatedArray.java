package DSA.BinarySearch;

public class MinimumRotatedArray {

    public static int findMinimum(int[] arr){

        int left=0;
        int right=arr.length-1;

        while(left<right){

            int mid=left+(right-left)/2;

            if(arr[mid] > arr[right])
                left=mid+1;
            else
                right=mid;
        }

        return arr[left];
    }

    public static void main(String[] args) {

        int arr[]={6,7,8,9,1,2,3};

        System.out.println(findMinimum(arr));
    }
}