public class recursive {
    public static void main(String[] args) {
        int numtries = 10;
        float temp = 0;
        float array[] = new float[numtries];
        for (int j = 0; j < numtries; j++) {

            for (float i = 1; i < 100000; i++) {
                try {
                    zyxyx(i);
                } catch (java.lang.StackOverflowError e) {
                    System.out.println(e);
                    temp = i;
                    break;
                }
            }
            array[j] = temp;
        }
        System.out.println("Your recursion depths are:");
        for (float m : array) {
            System.out.println(m);
        }
    }

    public static float zyxyx(float num) {
        float sum = 0;
        if (num > 1)
            sum = num + zyxyx(num - 1);
        else
            sum = num;
        return sum;
    }
}