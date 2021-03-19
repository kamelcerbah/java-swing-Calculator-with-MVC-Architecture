package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class CalcControllerOperation {
	private String operationCharecter;
	private CalcViewOperation theView;
	private CalcModel theModel;
	
	public CalcControllerOperation(CalcViewOperation theView, CalcModel theModel) {
		operationCharecter = theView.getOperationCharecter();
		this.theView = theView;
		this.theModel = theModel;
		this.theView.setVisible(true);
		
		//make switch case with operationCharecter and make additionListener mulListener ...
		switch(operationCharecter) {
			case "+":
				this.theView.addCalculateListener(new AdditionListener()); 
				;
			case "-":
				this.theView.addCalculateListener(new SubstractionListener());
				;
			case "*":
				this.theView.addCalculateListener(new MultiplicationListener());
				;
			case "/":
				this.theView.addCalculateListener(new DivisionListener());
				;
			
		}
		
		
		
		
		//this.theView.addCalculateListener(new CalculateListener());
	}
	
	class AdditionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			double firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.addTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
	class SubstractionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			double firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.subTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	class MultiplicationListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			double firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				
				theModel.mulTwoNumbers(firstNumber, secondNumber);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	
	class DivisionListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			
			double firstNumber, secondNumber = 0;
			
			// Surround interactions with the view with
			// a try block in case numbers weren't
			// properly entered
			
			try{
				
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				if(secondNumber==0){
					
					theView.displayErrorMessage("division by 0 !!");
				}else{
					
				theModel.divTwoNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalculationValue());}
				}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				theView.displayErrorMessage("You Need to Enter 2 Integers");
				
			}
			
		}
		
	}
	

	

}
