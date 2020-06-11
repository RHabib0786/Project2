package math;

public class TestCalculator {

	public static void main(String[] args) {
       Calculator cal = new Calculator();
       
       int additionResult = cal.addition(100, 50);
       System.out.println(additionResult);
       
       int subtractionResult = cal.subtraction(100, 50);
       System.out.println(subtractionResult);
       
       int multiplicationResult = cal.multiplication(3, 2);
       System.out.println(multiplicationResult);
       
       int divisionResult = cal.division(8,4);
       System.out.println(divisionResult);
       
    		   
	}
	

}
