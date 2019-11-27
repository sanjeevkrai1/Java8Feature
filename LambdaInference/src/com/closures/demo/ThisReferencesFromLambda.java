package com.closures.demo;

public class ThisReferencesFromLambda {
//	public void thisInsideLamdaInInstanceMethod() {
//		int x = 10;
//		ThisReferencesFromLambda.doProcess(x, (i) -> {
//			System.out.println(i);
//			System.out.println(this);
//		});
//	}
//
//	public static void main(String args[]) {
//
//		int x = 10;
//
//		doProcess(x, new Process() {
//			public void process(int i) {
//				System.out.println("I : " + i);
//				System.out.println(this);
//			}
//		});
//
//		doProcess(x, (i) -> {
//			System.out.println("I : " + i);
//			System.out.println(this); // here the main issue with referring this from lambda  
//		});
//	}
//	public static void doProcess(int x, Process p) {
//		p.process(x);
//	}
//
}
