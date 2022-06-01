import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  line = br.readLine();
        int N = Integer.parseInt(line);
        System.out.println(climbingStares(N));
    }

    private static int climbingStares(int n) {
        if(n<=1)
            return 1;

        return climbingStares(n-1)+climbingStares(n-2);
    }
}