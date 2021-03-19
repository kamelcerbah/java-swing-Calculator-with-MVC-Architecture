package calculator;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

@SuppressWarnings("serial")
public class CalcViewOperation extends JFrame{

	private String operationCharecter;
	
	private JTextField firstNumber  = new JTextField(10);
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton("Calculate");
	private JTextField calcSolution = new JTextField(10);
	
	public CalcViewOperation(String operationCharecter){
		this.operationCharecter =operationCharecter;
		JLabel Label = new JLabel(operationCharecter);
		// Sets up the view and adds the components
		
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600, 150);
		this.setResizable(false);
		
		// Background Color
		calcPanel.setBackground(new Color(119,136,153));
		
		calcPanel.add(firstNumber);
		calcPanel.add(Label);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
		
		// End of setting up the components --------
		
	}
	
	public double getFirstNumber(){
		
		return Double.parseDouble(firstNumber.getText());
		
	}
	
	public double getSecondNumber(){
		
		return Double.parseDouble(secondNumber.getText());
		
	}
	
	public double getCalcSolution(){
		
		return Double.parseDouble(calcSolution.getText());
		
	}
	
	public void setCalcSolution(double solution){
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		
		calcSolution.setText(numberFormat.format(solution));
		
	}
	
	// If the calculateButton is clicked execute a method
	// in the Controller named actionPerformed
	
	public void addCalculateListener(ActionListener listenForCalcButton){
		
		calculateButton.addActionListener(listenForCalcButton);
		
	}
	
	// Open a popup that contains the error message passed
	
	public void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}
	public String getOperationCharecter() {
		return this.operationCharecter;
	}
	
	
}

