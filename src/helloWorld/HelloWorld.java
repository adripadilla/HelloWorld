package helloWorld;

/**
 * HelloWorld
 * @author adrianapadilla
 *
 */
public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!");
		int [] x = {0, 5, 10, 15, 20};
		System.out.print("x[] = ");
		for(int i = 0; i < x.length; i++)
		{
			System.out.print(x[i] + " ");
		}
		int [] a = {1,2,3,4,5};
		System.out.println("\n\na = " + java.util.Arrays.toString(a));
		method1(a);
		System.out.println("a = " + java.util.Arrays.toString(a));
		int [][] b = {{1, 2, 3, 4, 5}};
		System.out.println("\nb = " + java.util.Arrays.toString(b[0]));
		method2(b);
		System.out.println("b = " + java.util.Arrays.toString(b[0])); 
		
	}
	public static void method1(int [] c) {
		 c = new int[10]; //detaches itself from a to create new array!
		 for(int i = 0; i < c.length; i++)
		 c[i] = i * 10;
		 System.out.println("c = " + java.util.Arrays.toString(c));
	}
	public static void method2(int [][] d) {
		 int [] c = new int[10];
		 for(int i = 0; i < c.length; i++)
		 c[i] = i * 10;
		 System.out.println("c = " + java.util.Arrays.toString(c));
		 d[0] = c;
	}

}
