import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in) ;

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine() ;
        StringBuilder result = new StringBuilder();
        for (int i=0; i<s1.length() ;i++)
        {
            if (s1.charAt(i) !=s2.charAt(i))
            {
                result.append('1') ;
            }
            else
                result.append('0') ;
        }
        System.out.println(result);



    }
}