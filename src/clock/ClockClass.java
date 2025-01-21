package clock;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClockClass extends JFrame {

	//  Calendar calender;
	 // JFrame frame;
	  
	  SimpleDateFormat timeFormat;
	  SimpleDateFormat dayFormat;
	  SimpleDateFormat dateFormat;
	 
	  JLabel timeLabel;
	  JLabel dayLabel;
	  JLabel dateLabel;
	  
	  String time;
	  String day;
	  String date;
	  
	  ClockClass(){
		  
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(350,250);
		this.setLayout(new FlowLayout());
		this.setTitle("Biniam's Clock");
		this.setBackground(Color.LIGHT_GRAY);
		
		timeFormat = new SimpleDateFormat("hh:mm:ss a");
		dayFormat = new SimpleDateFormat("EEEE");
		dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
		
		timeLabel = new JLabel();
		timeLabel.setFont(new Font("verdana",Font.PLAIN,50));
		timeLabel.setForeground(new Color(25,255,0));
		timeLabel.setBackground(Color.black);
		timeLabel.setOpaque(true);
		
		dayLabel = new JLabel();
		dayLabel.setFont(new Font("MV Boli",Font.PLAIN,35));
		dayLabel.setForeground(Color.black);
	
		
		
		dateLabel = new JLabel();
		dateLabel.setFont(new Font("Ink Free",Font.PLAIN,25));
		dateLabel.setForeground(Color.black);
		
		
		
		this.add(timeLabel);
		this.add(dayLabel);
		this.add(dateLabel);
		this.setVisible(true); 
		
		setTime();
		
   }

	public void setTime() {
		
		while(true) {
			
			time = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(time);
			
			day = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(day);
			
			date = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(date);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		
	}
	
}
