import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MatrixTest {

    @Test
    public void testIsSquareMatrix() {
        Matrix matrixChecker = new Matrix();

        // Перевірка для квадратної матриці
        int[][] squareMatrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        Assertions.assertTrue(matrixChecker.isSquareMatrix(squareMatrix));

        // Перевірка для неквадратної матриці
        int[][] nonSquareMatrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        Assertions.assertFalse(matrixChecker.isSquareMatrix(nonSquareMatrix));

        // Перевірка для порожньої матриці
        int[][] emptyMatrix = {};
        Assertions.assertFalse(matrixChecker.isSquareMatrix(emptyMatrix));

        // Перевірка для null матриці
        int[][] nullMatrix = null;
        Assertions.assertFalse(matrixChecker.isSquareMatrix(nullMatrix));
    }

    @Test
    public void testAverageArrayElements() {
        Matrix matrixCalculator = new Matrix();

        // Перевірка для масиву з додатніми цілими числами
        int[] positiveArray = {1, 2, 3, 4, 5};
        assertEquals(3.0, matrixCalculator.averageArrayElements(positiveArray), 0.01);

        // Перевірка для масиву з від'ємними цілими числами
        int[] negativeArray = {-1, -2, -3, -4, -5};
        assertEquals(-3.0, matrixCalculator.averageArrayElements(negativeArray), 0.01);

        // Перевірка для порожнього масиву
        int[] emptyArray = {};
        assertEquals(0.0, matrixCalculator.averageArrayElements(emptyArray), 0.01);

        // Перевірка для null масиву
        int[] nullArray = null;
        assertEquals(0.0, matrixCalculator.averageArrayElements(nullArray), 0.01);
    }
}

