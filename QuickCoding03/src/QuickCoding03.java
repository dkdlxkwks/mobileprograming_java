import java.util.Scanner;

public class QuickCoding03 {
	
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      OverNum on = new OverNum();
      
      System.out.print("1��° ���ڸ� �Է��ϼ���:");
      String num1 = sc.next();
      System.out.print("2��° ���ڸ� �Է��ϼ���:");
      String num2 = sc.next();
      
      try{
         System.out.print("�μ��� �������� ");
         on.over(Integer.parseInt(num1), Integer.parseInt(num2));
         System.out.println(Integer.parseInt(num1)/Integer.parseInt(num2));
      }
      catch(ArithmeticException ae){
         System.out.println("0���� �������� �� �� �����ϴ�.");
      }
      catch(IllegalArgumentException ae){
         System.out.println("���ڸ� �Է��ϼ̽��ϴ�.");
      }
      catch(Exception e){
    	  e.printStackTrace();
      }
   }
}