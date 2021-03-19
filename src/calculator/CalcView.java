package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public  class CalcView extends JFrame {
	/**
	 * 
	 */
	//private static final long serialVersionUID = -6379799897662224081L;
	private JLabel  lbl_choice = new JLabel("Choose type of operation :");
	private JButton btn_addition = new JButton("  +  ");
	private JButton btn_substraction = new JButton("  -  ");
	private JButton btn_multiplication = new JButton("  *  ");
	private JButton btn_division = new JButton("  /  ");
	Dimension btn_dimension = new Dimension(100,100);
	
	public CalcView() {
		JPanel btnContainer = new JPanel();
		JPanel lblContainer = new JPanel();
		JPanel Container = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 130);
		this.setResizable(false);
		
		//Layout
		Container.setLayout(new BoxLayout(Container, BoxLayout.Y_AXIS));
		//btnContainer.setLayout(new BoxLayout(btnContainer, BoxLayout.X_AXIS));
		btnContainer.setAlignmentY(CENTER_ALIGNMENT);
		//lblContainer.setLayout(new BoxLayout(lblContainer, BoxLayout.Y_AXIS));
		
		// Background Color
		btnContainer.setBackground(new Color(176,196,222));
		lblContainer.setBackground(new Color(176,196,222));
		
		lblContainer.add(lbl_choice);
		btnContainer.add(btn_addition);
		btnContainer.add(btn_substraction);
		btnContainer.add(btn_multiplication);
		btnContainer.add(btn_division);
		
		Container.add(lblContainer);
		Container.add(btnContainer);
		
		this.add(Container);
		
	}
	//exiting the CalcView frame
	
	
	
	public void addAdditionBtnListener(ActionListener listenForAdditionButton){
		
		btn_addition.addActionListener(listenForAdditionButton);
		
	}
	public void addSubstractionBtnListener(ActionListener listenForSubstractionButton){
		
		btn_substraction.addActionListener(listenForSubstractionButton);
		
	}
	public void addMultiplicationBtnListener(ActionListener listenForMultiplicationButton){
		
		btn_multiplication.addActionListener(listenForMultiplicationButton);
		
	}
	public void addDivisionBtnListener(ActionListener listenForDivisionButton){
	
		btn_division.addActionListener(listenForDivisionButton);
	
}
	// Open a popup that contains the error message passed
	
	public void displayErrorMessage(String errorMessage){
		
		JOptionPane.showMessageDialog(this, errorMessage);
		
	}

}
