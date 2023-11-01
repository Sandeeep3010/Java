package cloud;
import java.util.Scanner;

	public class romanToInterger{

		public static void main(String[] args) {
			        int ans = 0, num = 0;
			        System.out.println("Enter the roman number which you have into integer...");
			        Scanner sc =new  Scanner(System.in);
			        String S1=sc.next();
			        for (int i = S1.length()-1; i >= 0; i--) {
			            switch(S1.charAt(i)) {
			                case 'I': num = 1; break;
			                case 'V': num = 5; break;
			                case 'X': num = 10; break;
			                case 'L': num = 50; break;
			                case 'C': num = 100; break;
			                case 'D': num = 500; break;
			                case 'M': num = 1000; break;
			            }
			            if (4 * num < ans) ans -= num;
			            else ans += num;
			        }
			        System.out.println(ans);
			    }

			}
