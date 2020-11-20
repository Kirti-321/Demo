
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<args.length;i++)
		System.out.println("Program Argument "+i+" : "+ args[i]);
		System.out.println("VM Properties: ");
		System.out.println("Property1 value "+System.getProperty("p1"));
		System.out.println("Property2 value "+System.getProperty("p2"));
		System.out.println("Property3 value "+System.getProperty("p3"));

	}

}
