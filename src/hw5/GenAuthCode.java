package hw5;

//設計一個方法genAuthCode(),呼叫時會回傳一個8位數的驗證碼,內容包含英文大小寫與數字的亂數組合
public class GenAuthCode {
    public void genAuthCode() {
        for (int i = 0; i < 8; i++) {
            int randomNum = (int) (Math.random() * 10); //宣告randomNum為隨機整數
            char randomUpper = (char) (Math.random() * 26 + 65); //宣告randomUpper為隨機大寫字母
            char randomLower = (char) (Math.random() * 26 + 97); //宣告randomLower為隨機小寫字母

            //隨機產生整數,大寫字母,小寫字母三種情境
            int n = (int) (Math.random() * 3 + 1);
            switch (n) {
                case 1:
                    System.out.print(randomNum);
                    break;
                case 2:
                    System.out.print(randomUpper);
                    break;
                case 3:
                    System.out.print(randomLower);

            }

        }

    }

    public static void main(String[] args) {
        GenAuthCode g = new GenAuthCode();
        g.genAuthCode();
    }
}
