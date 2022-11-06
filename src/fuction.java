import java.util.Scanner;

public class fuction {
    public static void main(String[] args) {
       int sdf =  func(2, 4) * func(3, 2);
      System.out.println(sdf);
    }

    public static int func(int a, int b){
        int result = 1;
        for (int i = 0; i<b; i++){
            result *= a;

        } System.out.println(result);
        return result;
    }

    public static int[] arr(){
        int[] abc;
        int m;
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        abc = new int[m];
        for (int i = 0; i<m; i++){
            abc[i]= scanner.nextInt();

        }
        for(int j = 0; j<m; j++){
            System.out.println(abc[j]);
        }
        return abc;
    }
}
