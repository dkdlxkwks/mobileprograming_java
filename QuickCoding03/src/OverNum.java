
public class OverNum {
	public void over(int a, int b) throws OverException {
		if(a >= 100 || b >= 100) {
			throw new OverException("3�ڸ� ���� �Ѿ����ϴ�.");
		}
	}
}
