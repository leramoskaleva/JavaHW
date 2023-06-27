package HW;

public class Task2 {
    public static void main(String[] args) {
        for (int i = 2; i <= 1000; i++) {
            Boolean isSimple = i > 1;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple)
                System.out.println(i);
        }
    }
}