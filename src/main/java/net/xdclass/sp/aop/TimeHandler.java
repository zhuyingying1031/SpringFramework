package net.xdclass.sp.aop;

import java.time.LocalDateTime;

public class TimeHandler {
	public void printBefore(){
		System.out.println("printBefore 日志  time = "+ LocalDateTime.now().toString());
	}
	public void printAfter(){
		System.out.println("printAfter 日志  time = "+ LocalDateTime.now().toString());
	}
}
