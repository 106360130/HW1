package test_p34;

public class Sample12
{
	public static void main(String[] arg)
	{
		int num1 = 10;
		int num2 = 5;
		
		System.out.println("nmu1�Mnmu2���U�عB��:");
		System.out.println("nmu1+num2����" + (num1+num2));
		System.out.println("nmu1-num2����" + (num1-num2));
		System.out.println("nmu1*num2����" + (num1*num2));
		System.out.println("nmu1/num2����" + (num1/num2));
		System.out.println("nmu1%num2����" + (num1%num2));
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		b = a++;
		c = ++a;
		
		System.out.println("�]���O�b���w�Ȥ���~���W�A�ҥHb���Ȭ�" + b);
		System.out.println("�]���O�b���W����~���w�ȡA�ҥHc���Ȭ�" + c);
	}
}
