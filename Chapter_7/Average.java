public class Average {

    public static int countGreaterThanPreviousAverage(int[] numbers) {
        int count = 0;
        int sum = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            double average = (double) sum / i;

            if (numbers[i] > average) {
                count++;
            }

            sum += numbers[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};
        int result = countGreaterThanPreviousAverage(responseTimes);
        System.out.println("Number of elements greater than previous average: " + result);
    }
}
