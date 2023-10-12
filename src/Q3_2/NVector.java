package Q3_2;


public class NVector {
	private double[] vector;
	//	private Vector<Double> other; 
	
//	constructor, takes dimension n and sets all elements to 0: NVector(int n)
	public NVector(int n) {
		this.vector = new double[n];			
	}
	
//	constructor, takes another NVector and copies all data from "other": NVector(NVector other)
	NVector(NVector other) {
		vector = new double[other.vector.length];
//		System.out.println(vector);
		for (int i = 0; i < other.length(); i++){
			this.vector[i] = other.vector[i];
		}
		
	}
	
//	 VARARG constructor declared
	public NVector(double...v) {
		this.vector = new double[v.length];
		for(int i = 0; i < v.length; i++) {
			this.vector[i] = v[i];
//			System.out.println(this.vector[i]);
		}		
	}
	
//	a method that returns the vector's size: int length()
	public int length() {
		return this.vector.length;
	}
	
//	accessor, returns element with index i: double get(int i)
	public double get(int i) {
		return this.vector[i];
	}
	
//	the equals method that compares two NVector objects
	public boolean equals(NVector other) {
		if(other.length() == this.length()) {
			for(int i = 0; i < other.length(); i++) {
				if(this.vector[i] != other.get(i)) {
					return false;
				}
			}
			return true;
		}
		return false;		
	}
	
	/*a method that returns a new copy of an NVector with just one element changed:
      NVector set(int i, double x)
      Example if w=NVector(3,2,0), w.set(1,-5) returns a new NVector with elements [3,-5,0]. 
	 */
	public NVector set(int i, double x) {
		if(i > length()-1 || i < 0) {
			System.out.println("no changes made, the change being asked was out of scope with the current vector");
			return this;
		}
//		System.out.println(get(i));
//		this.vector[i] = x;
//		System.out.println(get(i));
		NVector clone = new NVector(this.vector);
		clone.vector[i] = x;
//		System.out.println(clone.get(i));
		return clone;
	}
	
	/*
	 * add, returns a new NVector with the sum of this vector and the other :
	 * NVector add(NVector other). e.g. NVector(1,2,3).add(NVector(4,5,6)) 
	 * returns new NVector(5,7,9).
	 */
	public NVector add(NVector other) {
		for(int i = 0; i < length(); i++) {
			this.vector[i] += other.get(i);
		}
		return this;
	}
	
	/*sprod, returns a double with the scalar product of this vector and another NVector,
      double sprod(NVector other). 
      e.g. NVector(1,2,3).sprod(NVector(4,5,6)) returns 1*4+2*5+3*6 = 32
     */
	public double sprod(NVector other) {
		double temp = 0;
		for(int i = 0; i < length(); i++) {
			temp  += this.vector[i] * other.get(i);
		}
		return temp;
	}
	
	/*string representation: String toString()
      This could return a string such as "[2.63 3.14 1.41]"
     */
	public String toString() {
		String holding = "Vector elements : [";
		for(int i = 0; i < length(); i++) {
			if(vector != null) {
				holding += vector[i];
				if(i != length()-1) {
					holding += " ";
				}
			}
		}
		return holding += "]";
	}	
	
	public StringBuilder toString1() {
		StringBuilder elements_in_vector = new StringBuilder("Vector elements : [");
		for(int i = 0; i < length(); i++) {
			if(this.vector != null) {
				elements_in_vector.append(vector[i] );
				if(i != length()-1) {
					elements_in_vector.append(" ");
				}
			}			
		}
		return elements_in_vector.append("]");
	}
	
}
