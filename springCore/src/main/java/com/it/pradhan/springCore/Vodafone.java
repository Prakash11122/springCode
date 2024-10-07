package com.it.pradhan.springCore;

public class Vodafone implements Sim{

	@Override
	public void calling() {
		System.out.println("calling using Vodafone sim");
		
	}

	@Override
	public void data() {
		System.out.println("Browsing internate using Vodafone sim");
		
	}

}
