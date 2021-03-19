package calculator;


public class CalcMVC {

	public static void main(String[] args) {
		
		CalcView theView= new CalcView();
		
		CalcModel theModel = new CalcModel();
		
		theView.setVisible(true);
		new CalcController(theView,theModel);
		
		//tb9a nkamel CalcControllerOperation
		
	}
}
