public class Reduce {
    public static void main(String[] args) {
        int init = 100;
        int step = 0;
        while (init > 0) {
            boolean divisibleby2 = init % 2 == 0;
            boolean notdivisibleby2 = init % 2 != 0;
            if (divisibleby2) {
                init = init / 2;
                step++;
            } else if (notdivisibleby2) {
                init = (init - 1) / 2;
                step++;

            }
        }
    System.out.println(step);
    }
}