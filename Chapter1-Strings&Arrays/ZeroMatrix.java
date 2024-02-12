public class ZeroMatrix {
    public static void main(String[] args) {
        int[][] trial = { {1, 2, 3}, {0, 1, 2}, {1, 2, 3} };
        System.out.println(zeroMatrixTransformation(trial));
    }

    public static int[][] zeroMatrixTransformation(int[][] input){

        for (int i = 0; i < input.length; i++){
            for (int j = 0; j < input[0].length; j++){
                if (input[i][j] == 0){
                    for (int k = 0; k < input.length; k++){
                        input[k][j] = 0;
                    }
                    for (int k = 0; k < input[0].length; k++){
                        input[i][k] = 0;
                    }
                }
            }
        }
        return input;
    }
}

/*
 Write an algorithm such that if an element in an M*N matrix is 0, its entire column and row are set to 0

 Questions
 1) Are there cases where m = 0 || n == 0? no
 
 Method 1 - Brute Force ~ O(m^2*+2nm +n^2*m) 
 - iterate through all boxes and check if 0 ~ O(m*n)
    - if 0 is found, both row and values are set to 0 ~ O(m+n) 
 */