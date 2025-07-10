//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        //TIP 캐럿을 강조 표시된 텍스트에 놓고 <shortcut actionId="ShowIntentionActions"/>을(를) 누르면
        // IntelliJ IDEA이(가) 수정을 제안하는 것을 확인할 수 있습니다.
        int num = 5;
        System.out.println(num == 5); // true

        boolean result = (5 > 3) && (10 > 5); // true

        int x = 5;
        x += 3; // x = x + 3 → 8
        System.out.println(x + 3);
        System.out.println(x / 4);

        int i = 1;
        i++; // i = 2


        int score = 85;
        String grade = (score >= 90) ? "A" : "B";
        if (score >= 90) {
            System.out.println("A");
        } else if (score <= 85) {
            System.out.println("B");
        }
        int n = 5; // 0101
        int m = 3; // 0011
        System.out.println(n & m); // 1 (0001)

    }
}