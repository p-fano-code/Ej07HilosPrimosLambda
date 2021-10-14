package test;

import hilos.HiloRunnable;

public class Main {
	
	private static Thread  getThread(int numeroPrimo) {
		HiloRunnable hilo = new HiloRunnable(numeroPrimo);
		return new Thread(hilo.getHilo());
	}


	public static void main(String[] args) {

		
		Thread t1 = getThread(23);		
		t1.setName("Hilo 1");
		t1.start();
		
		Thread t2 = getThread(1);		
		t2.setName("Hilo 2");
		t2.start();
		
		Thread t3 = getThread(44);		
		t3.setName("Hilo 3");
		t3.start();

	}

}
