
//Approach 1;
// SC - O(m+n)
// TC - O(m*n)
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;
        
        //boolean [][] vis  = new boolean[m][n];
        boolean row [] = new boolean[n];
        boolean col [] = new boolean[m];
        
        //Marking the row and col with value=0
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix[i][j] == 0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        //changing the values in the array according to the marking
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
        }
    }

    //Approach 2
    public static void setZeros(int matrix[][]) {
        // Write your code here..
        int n = matrix.length;
        int m = matrix[0].length;
        
        boolean col =false;
        //Marking the row and col with value=0
        for(int i=0; i<n; i++){
            if(matrix[i][0] == 0) col = true;
            for(int j=1; j<m; j++){
                if(matrix[i][j] == 0){
                  matrix[i][0] = 0;
                  matrix[0][j] = 0;
                }
            }
        }
        
        //changing the values in the array according to the marking
        for(int i=n-1; i>=0; i--){
            for(int j=m-1; j>=1; j--){
                if(row[i] || col[j]){
                    matrix[i][j] = 0;
                }
            }
            if(col){
                matrix[i][0] = 0;
            }
        }
    }