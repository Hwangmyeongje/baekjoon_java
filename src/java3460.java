import java.util.Scanner;

public class java3460 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i<T; i++)
        {
            int N= sc.nextInt();
            String Bin = Integer.toBinaryString(N);
            for(int j= Bin.length(); j>0; j--)
            {
                if(Bin.charAt(j-1)=='1')
                    System.out.print(Bin.length()-j+" ");

            }
            System.out.println();
        }

    }
}
