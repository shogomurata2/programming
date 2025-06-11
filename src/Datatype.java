import java.util.Scanner;

public class Datatype {
    public static void main(String[] args) {
        import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("点数を入力してください: ");
        int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("合格です");
        }

        System.out.println("処理を終了します");
        scanner.close();
    }
}// ソースコードをここに記述
    }
}

import java.util.Scanner;

public class Conditional {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("点数を入力してください: ");
        int score = scanner.nextInt();

        if (score >= 60) {
            System.out.println("合格です");
            System.out.println("おめでとうございます！");
        } else {
            System.out.println("不合格です");
            System.out.println("もっとがんばりましょう");
        }
        
        System.out.println("処理を終了します");
        scanner.close();
    }
}

            System.out.println("もっとがんばりましょう");

            public class Loop {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}