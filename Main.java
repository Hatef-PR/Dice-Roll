import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        String answer = "y";

        while (answer.equals("y")) {
            int numbers = random.nextInt(1, 7);
            DiceRoll(numbers);
            System.out.println("_______________________________");
            System.out.println("Press 'Y' or 'y' to continue and to quit press any key except 'y': ");
            answer = input.next().toLowerCase();
        }
    }

    static void DiceRoll(int num) {
        switch (num) {
            case 1:
                System.out.println("[       ]");
                System.out.println("[   *   ]");
                System.out.println("[       ]");
                break;
            case 2:
                System.out.println("[   *   ]");
                System.out.println("[       ]");
                System.out.println("[   *   ]");
                break;
            case 3:
                System.out.println("[   *   ]");
                System.out.println("[   *   ]");
                System.out.println("[   *   ]");
                break;
            case 4:
                System.out.println("[*     *]");
                System.out.println("[       ]");
                System.out.println("[*     *]");
                break;
            case 5:
                System.out.println("[*     *]");
                System.out.println("[   *   ]");
                System.out.println("[*     *]");
                break;
            case 6:
                System.out.println("[*     *]");
                System.out.println("[*     *]");
                System.out.println("[*     *]");
                break;
        }
    }
}