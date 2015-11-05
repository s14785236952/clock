package chapter13;

import java.awt.*;
import javax.swing.*;

public class DisplayClock extends JFrame {
  public DisplayClock() {
    // Create an analog clock for the current time
    StillClock clock = new StillClock();

    // Display hour, minute, and seconds in the message panel
    
    MessagePanel messagePanel = new MessagePanel();
    messagePanel.setCentered(true);
    messagePanel.setForeground(Color.blue);
    messagePanel.setFont(new Font("Courie", Font.BOLD, 16));

    // Add the clock and message panel to the frame
    add(clock);
    add(messagePanel, BorderLayout.SOUTH);
  }

  public static void main(String[] args) {
	  StillClock clock = new StillClock();
    DisplayClock frame = new DisplayClock();
    clock.showCurrentTime();  
    frame.setTitle("DisplayClock");
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300, 350);
    frame.add(clock.lab);
    frame.setVisible(true);
  }
}
