package com.dxc.ex;

public class Quiz3 {
	public static void main(String[] args) {
		 try {
	            int x=5/0;
	        } catch(ArithmeticException e) {
	            System.out.println("Arithmetic Div Zero Error");
	        } catch(Exception e) {
	            System.out.println("Global Exception");
	        }
	}
}