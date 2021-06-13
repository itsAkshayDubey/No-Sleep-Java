package com.nosleep.main;

import java.awt.event.*;
import java.nio.file.*;
import java.awt.*;


public class NoSleep {
	
	public static void main(String[] args) throws Exception {
		Robot robot = new Robot();
		new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		String path = Paths.get("").toAbsolutePath().toString();
		System.out.print(path+">");
		while(true) {
			robot.delay(1000*60);
			PointerInfo pointerInfo = MouseInfo.getPointerInfo();
			Point point = pointerInfo.getLocation();
			int x_co_ordinate = (int) point.getX();
			int y_co_ordinate = (int) point.getY();
			robot.mouseMove(x_co_ordinate, y_co_ordinate+1);
			robot.mouseMove(x_co_ordinate, y_co_ordinate);
		}
		
	}

}
