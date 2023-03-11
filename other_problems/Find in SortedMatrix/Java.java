
public class Java {
    public static void main(String[] args) {
        
    }

    static int[] binarySearch(int[] matrix, int row, int cStart, intcEnd, int target){
        while(cStart < cEnd){
            int mid = cStart + (cEnd - cStart) / 2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid] < target){
                cStart = mid + 1;
            }else{
                cEnd = mid -1;
            }
        }

        return new int[]{-1,-1};fffffffffffffffffff
    }

    static int[] search(int[][] nums, target){
        int rows = matrix.length;
        int col = matrix[0].length;
        

    }
}
