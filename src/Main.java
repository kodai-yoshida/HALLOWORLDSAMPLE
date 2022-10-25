public class Main {
    public static void main(String[] args) {

        // for文を用いた複数処理
        for (int i = 1; i < 11; i++) {
            //10回目までの処理
            if (i < 10) {
                System.out.println("Hello world");
            }
            //10回目以降の処理
            else {
                System.out.println("Hello");
            }
        }
    }
}

