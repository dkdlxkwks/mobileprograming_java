import java.util.Scanner;

public class MainActivity {
	public static void main(String[] args) {
		Gn<String,String> gen = new Gn<String,String>("","");
		
		Scanner in = new Scanner(System.in);
		
		for(;;){
			System.out.print("숫자 또는 문자열을 입력하세요(종료하려면 stop입력):");
			String str = in.next();
			
			if(str.equals("stop")){
				System.out.print("입력된 문자열:");
				System.out.println(gen.str1);
				System.out.print("입력된 숫자:");
				System.out.println(gen.str2);
				break;
			}
			
			if(isStringDouble(str)){
				gen.str2 += str + " ";
			}
			else
				gen.str1 += str + " ";
		}
	}
	
	public static boolean isStringDouble(String s) {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
