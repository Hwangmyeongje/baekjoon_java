import java.util.Scanner;
public class java2501 {
    public static void main(String[] args) {
        int n,k;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        int cnt=0, measure=0;
        for(int i=1;i<=n; i++)
        {
            if(n%i ==0)
                cnt++;
            if(cnt == k) {
                measure = i;
                break;
            }
        }
        System.out.println(measure);
    }
}
