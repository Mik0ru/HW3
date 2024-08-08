public class HW3 {
    public static void main(String[] args) {
        float [] numbers = {1, 2 , 3.4f, 6.6f, -4, -20.5f, 15.8f, 3.5f, -12, 6.7f, 12, 15.5f, -4.6f, 1.4f, 2.5f};
        boolean negativeFound = false;
        float sum = 0;
        int numOfElements = 0;
        for (float number : numbers) {
            if (!negativeFound && number < 0) {
                negativeFound = true;
            }
            if (negativeFound && number > 0) {
                numOfElements++;
                sum += number;
            }

        }
        float average = sum / numOfElements;
        System.out.println("Average is " + average);






    }
}