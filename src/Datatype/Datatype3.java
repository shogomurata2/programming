package Datatype;
import java.util.Scanner;

public class Datatype3 {
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
