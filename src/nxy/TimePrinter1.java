package nxy;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

public class TimePrinter1 implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		Date now = new Date();
		System.out.println("Time:" + now);
		Toolkit.getDefaultToolkit().beep();
	}

}
