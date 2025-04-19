public class RowColMatrix {
    public static void main(String[] args) {
        // row and column wise sorted matrix
        int matrix[][] = { 
            { 10, 20, 30, 40 },
            { 15, 25, 35, 45 },
            { 28, 29, 37, 49 },
            { 33, 34, 38, 50 }
        };

        int target = 29;
        int res[] = search(matrix, target);
        System.out.println(res[0] + " " + res[1]);


        // strictly sorted matrix
        int matrix2[][]={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };


    }


    static int[] binarySearch(int matrix[][], int row, int cStart, int cEnd, int target) {
        while(cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] < target) {
                cStart = mid + 1;
            } else if(matrix[row][mid] > target) {
                cEnd = mid - 1;
            } else {
                return new int[]{ row, mid };
            }
        }
        return new int[]{ -1, -1 };
    }

    static int[] searchInStrictlySortedMatrix(int matrix[][], int target) {
        int r = 0;
        int c = matrix[0].length;

        if(row==1){
            return binarySearch(matrix, 0, 0, c-1, target);
        }

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = c / 2;

        while (rStart < (rEnd-1)) {
            int mid = rStart + (rEnd - rStart) / 2;
            if (target==matrix[mid][cMid]) {
                return new int[]{ mid, cMid };
            }else if (target>matrix[mid][cMid]) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
            
        }

        if (matrix[rStart][cMid] == target) {
            return new int[]{ rStart, cMid };
        } 
        if (matrix[rStart+1][cMid] == target) {
            return new int[]{ rStart+1, cMid };
        } 
        
        if
    }


    // search in a row and column wise sorted matrix
    static int[] search(int matrix[][], int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{ r, c };
            } else if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{ -1, -1 };
    }
}
