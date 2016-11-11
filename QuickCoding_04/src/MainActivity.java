import java.util.Scanner;

public class MainActivity {
	public static void main(String[] args) {
		Gn<String,String> gen = new Gn<String,String>("","");
		
		Scanner in = new Scanner(System.in);
		
		for(;;){
			System.out.print("���� �Ǵ� ���ڿ��� �Է��ϼ���(�����Ϸ��� stop�Է�):");
			String str = in.next();
			
			if(str.equals("stop")){
				System.out.print("�Էµ� ���ڿ�:");
				System.out.println(gen.str1);
				System.out.print("�Էµ� ����:");
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
