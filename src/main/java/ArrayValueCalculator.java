import exeptions.ArrayDataException;
import exeptions.ArraySizeException;

public class ArrayValueCalculator {

    public int doCalc(String[][] array) throws ArraySizeException, ArrayDataException {
        int element = 0;
        if (array.length != 4) {
            throw new ArraySizeException("Wrong array's length, use only [4][4]");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new ArraySizeException("Wrong array's length, use only [4][4]");
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    element += Integer.parseInt(array[i][j]);
                } catch (Exception e) {
                    throw new ArrayDataException("[" + i + "]" + "[" + j + "]"+" <= Wrong type.",e);
                }
            }

        }

        return element;
    }
}
