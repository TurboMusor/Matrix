import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgramTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void main() {

        Matrix matrixObject = new Matrix();


        int[][] squareMatrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        boolean isSquare1 = matrixObject.isSquareMatrix(squareMatrix);
        System.out.println("Is squareMatrix square? " + isSquare1);


        int[][] nonSquareMatrix = new int[][] {{1, 2, 3}, {4, 5, 6}};
        boolean isSquare2 = matrixObject.isSquareMatrix(nonSquareMatrix);
        System.out.println("Is nonSquareMatrix square? " + isSquare2);


        int[][] emptyMatrix = new int[0][0];
        boolean isSquare3 = matrixObject.isSquareMatrix(emptyMatrix);
        System.out.println("Is emptyMatrix square? " + isSquare3);


        int[][] nullMatrix = null;
        boolean isSquare4 = matrixObject.isSquareMatrix(nullMatrix);
        System.out.println("Is nullMatrix square? " + isSquare4);
    }
}
