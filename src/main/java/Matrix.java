public class Matrix {

    public boolean isSquareMatrix(int[][] matrix){
        if(matrix == null)
            return false;
        if(matrix.length == 0)
            return false;

        for (int[] ints : matrix) {
            if (matrix.length != ints.length) {
                return false;
            }
        }

        return true;
    }

    public boolean averageArrayElements(int[] array){
        if(array.== null) {
            return false;
        }
        if(array.length == 0) {
            return false;
        }
        int sum = 0;
        double avg = 0.0;
        for (int j : array) {
            sum += j;
        }

        avg = (double) sum / array.length;
        return avg;
    }
}
