package Q3_2;

public class TestNVector {
	public static void main(String [] args) {
		NVector vec = new NVector(1,2,3,4);
		NVector look = new NVector(2,3,4);
		NVector fail = new NVector();
		NVector pass = new NVector(vec);		
		
		System.out.println("did vector get built.");
		System.out.println(vec.toString());
		System.out.println(look.toString1());
		System.out.println(fail);
		System.out.println(pass);
		
		System.out.println("Are vectors equal?");
		System.out.println(vec.equals(look));
		System.out.println(vec.equals(fail));
		System.out.println(vec.equals(pass));
		
		System.out.println("Vector set.");
		System.out.println(vec.set(1, 5));
		NVector v3 = vec.set(1, 11);
		NVector v4 = vec.set(-1, 11);
		System.out.println("v3 = " + v3);
		System.out.println("v4 = " + v4);
		
		System.out.println("2 Vectors adding to each other.");
		System.out.println(vec.add(new NVector(5,9,8,2)));
		
		look.sprod(new NVector(2,3,4));
		System.out.println("Sprod test: " + look.sprod(new NVector(2,3,4)));
		
		System.out.println(look.toString());
		System.out.println(vec.toString1());
	}
}
