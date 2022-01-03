//Problem 12: Find total number of Squares in a N*N chessboard

class Solution {
    static Long squaresInChessBoard(Long N) {
        return  (N*(N+1)*(2*N+1))/6;
    }
};
