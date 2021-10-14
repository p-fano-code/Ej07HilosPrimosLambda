package hilos;

public class HiloRunnable {

	private int numeroPrimo;

	public HiloRunnable(int numeroPrimo) {
		this.numeroPrimo = numeroPrimo;
	}

	private Runnable hilo = () -> {
		// TODO Auto-generated method stub
		double time_start, time_end;
		time_start = System.currentTimeMillis();
		System.out.println("Arrancando hilo: " + Thread.currentThread().getName());

		boolean prime = true;
		for (int i = 2; i < numeroPrimo; i++) {
			if (numeroPrimo % i == 0) {
				prime = false;
				break;
			}
		}
		if (prime) {
			time_end = System.currentTimeMillis();
			System.out.println("El numero " + numeroPrimo + " es primo");
		} else {
			time_end = System.currentTimeMillis();
			System.out.println("El numero " + numeroPrimo + " NO es primo");
		}
		
		System.out.println("*****La ejecución ha tardado " + ((time_end - time_start)) + " segs*****");
	};
	
	public Runnable getHilo() {
		return hilo;
	}


	public void setHilo(Runnable hilo) {
		this.hilo = hilo;
	}



}
