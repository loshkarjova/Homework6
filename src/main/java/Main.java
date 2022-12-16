public class Main {
    public static void main(String[] args) {
        ArrayValueCalculator arrayValueCalculator = new ArrayValueCalculator();
        int i = arrayValueCalculator.doCalc(new String[][]{{"1", "1", "1","1", "1"},{"1", "1", "1", "1"},{"1", "1", "1", "1"},{"1", "1", "1", "1"} });
        System.out.println(i);
    }
}
