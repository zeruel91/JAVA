import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class triangularsum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //Scanner scan = new Scanner(System.in);
        //int n = scan.nextInt();
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n + 1][n + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 1; j <= i; j++) {
                dp[i][j] = Integer.parseInt(st.nextToken());
                //dp[i][j] = scan.nextInt(); // 배열에 입력값 저장
                // 바로 다음 행의 값 결정
                // 왼쪽 끝에서는 항상 오른쪽위의 값, 오른쪽 끝에서는 항상 왼쪽위의 값을 더하여 저장
                // 나머지는 왼쪽위의 값을 합친 값 vs 오른쪽위의 값을 합친 값 중 최댓값을 저장
                if (i == 1) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j];
                } else if (i == j) {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i][j];
                } else {
                    dp[i][j] = Math.max((dp[i - 1][j] + dp[i][j]), (dp[i - 1][j - 1] + dp[i][j]));
                }
                // 최댓값 바로 결정하기
                max = Math.max(max, dp[i][j]);
            }
        }
        System.out.println(max);
    }
}




