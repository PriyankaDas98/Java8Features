package lambdaExpression;

public class Lambdas {

	public static void main(String[] args) {
		int value = 100;
		PrintValueIntr job = (x)->System.out.println(x);
		job.doPrint(value);
	}

}
