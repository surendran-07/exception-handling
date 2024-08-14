package surendran01;

public class prg8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	int dividedbyzero=5/0;
	System.out.println("the resst of the try block");
}
catch(ArithmeticException e){
	System.out.println("arithematic exeption=" + e.getMessage());
}
	}

}
