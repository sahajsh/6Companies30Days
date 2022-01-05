// Problem 11: Given an unsorted array Arr of size N of positive integers. One number 'A' from     set {1, 2, …N} is missing and one number 'B'
occurs twice in array. Find these two numbers.

class Solve {
    int[] findTwoElement(int arr[], int n) {
        int rep =0;
        int mis=0;
        for(int i =0;i<n;i++){
            if(arr[Math.abs(arr[i])-1]<0){
                rep = Math.abs(arr[i]);
            }
            else{
                arr[Math.abs(arr[i])-1] = -arr[Math.abs(arr[i])-1];
            }
        }
        for(int i =0;i<n;i++){
            if(arr[i]>0){
                mis=i+1;
                break;
            }
        }
        int arr1[]=new int [2];
        arr1[0] =rep;
        arr1[1]=mis;
        return arr1;
        
    }
}
