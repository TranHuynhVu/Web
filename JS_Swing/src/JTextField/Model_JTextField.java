package JTextField;

public class Model_JTextField {
	private double firstValue;
	private double secondValue;
	private double answer;
	
	public Model_JTextField() {
		
	}

	public double getFirstValue() {
		return firstValue;
	}

	public void setFirstValue(double firstValue) {
		this.firstValue = firstValue;
	}

	public double getSecondValue() {
		return secondValue;
	}

	public void setSecondValue(double secondValue) {
		this.secondValue = secondValue;
	}

	public double getAnswer() {
		return answer;
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}
	
	public void plus() {
		answer = firstValue + secondValue;
	}
	
	public void minus() {
		answer = firstValue - secondValue;
	}
	public void multiply() {
		answer = firstValue * secondValue;
	}
	
	public void division() {
		answer = firstValue / secondValue;
	}
	
	
	
	
	
	
	
}
