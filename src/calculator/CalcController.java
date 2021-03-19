package calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import calculator.CalcModel;
import calculator.CalcView;

public class CalcController {
	private CalcView theView;
	private CalcModel theModel;
	
	
	public CalcController(CalcView theView, CalcModel theModel) {
		
		
		
		
		this.theView = theView;
		this.theModel = theModel;
			// Tell the View that when ever a button
			// is clicked to execute the actionPerformed method
		
		this.theView.addAdditionBtnListener(new additionBtnListener());
		this.theView.addSubstractionBtnListener(new substractionBtnListener());
		this.theView.addMultiplicationBtnListener(new multiplicationBtnListener());
		this.theView.addDivisionBtnListener(new divisionBtnListener());
		
	}
	
	
	
	class additionBtnListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// Surround interactions with the view with
			// a try block in case of errors
			try{
				
				CalcViewOperation theViewOperation= new CalcViewOperation("+");
				
			theView.dispose();
			
			new CalcControllerOperation(theViewOperation ,theModel);
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
								
			}
			
		}
		
	}
	
	class substractionBtnListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// Surround interactions with the view with
			// a try block in case of errors
			try{
				CalcViewOperation theViewOperation= new CalcViewOperation("-");
				
				theView.dispose();
				
				new CalcControllerOperation(theViewOperation ,theModel);
			
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				
			}
			
		}
		
	}
	
	class multiplicationBtnListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// Surround interactions with the view with
			// a try block in case of errors
			try{
				CalcViewOperation theViewOperation= new CalcViewOperation("*");
				
				theView.dispose();
				
				new CalcControllerOperation(theViewOperation ,theModel);		
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
				
			}
			
		}
		
	}
	
	class divisionBtnListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			// Surround interactions with the view with
			// a try block in case of errors
			try{
				CalcViewOperation theViewOperation= new CalcViewOperation("/");
				
				theView.dispose();
				
				new CalcControllerOperation(theViewOperation ,theModel);	
			}

			catch(NumberFormatException ex){
				
				System.out.println(ex);
				
			}
			
		}
		
	}
	

}
