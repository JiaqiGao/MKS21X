import java.lang.*;
import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField j;
    private JTextField t;
    private JLabel before, after;
    

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
    
       
	JButton b1 = new JButton("Change to Celsius");
	b1.addActionListener(this);
	b1.setActionCommand("Change to Celsius");

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
	JButton b2 = new JButton("Change to Farenheit");
        buttonPanel.add(b2);
	b2.addActionListener(this);
	b2.setActionCommand("Change to Farenheit");
        


	JCheckBox c = new JCheckBox("Check this box or else Earth will explode");
        
	t = new JTextField(1);
        j = new JTextField(1);
        
	before = new JLabel("Temperature before conversion");
        after = new JLabel("Temperature after conversion");
        pane.add(c);
	pane.add(before);
	pane.add(t);
	pane.add(b1);
	pane.add(b2);
        pane.add(after);
        
	pane.add(j);
    }

    public static double CtoF(double t){
        return ((t*9.0)/5.0)+32.0;
    }
    public static double FtoC(double t){
        return (t-32.0)*(5.0/9.0);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
        String s = t.getText();
        try {
            Double t = Double.parseDouble(s);
            Double u = 0.0;
            if(event.equals("Change to Celsius")){
                u = FtoC(t);
            }
            if(event.equals("Change to Farenheit")){
                u = CtoF(t);
            }
            String v = Double.toString(u);
            j.setText(v);
        }
        catch (NumberFormatException f){
            j.setText("Please provide a valid input");
        }
       
    }
}
