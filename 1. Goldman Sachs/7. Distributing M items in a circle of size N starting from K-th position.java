// Problem 7: Distributing M items in a circle of size N starting from K-th position

class Solution {
  public:
    int findPosition(int N , int M , int K) {
        
        int n = (M + K - 1) % N;
        if(n==0){
            return N;
        }
        return n;
    }
};
