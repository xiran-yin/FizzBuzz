public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 1000; i++) {
            boolean divisibleby3 = i % 3 == 0;
            boolean divisibleby5 = i % 5 == 0;
            if (divisibleby3) {
                System.out.println(i);
                count ++;
            }else if (divisibleby5) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }
}
