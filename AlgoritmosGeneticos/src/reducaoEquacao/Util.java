package reducaoEquacao;

import java.util.Random;

public class Util {
	public static String geraBin() {
	    Random gerador = new Random();
	    int nroAleatorio = gerador.nextInt(15);
	    String nroBin = String.format("%4s", Integer.toBinaryString(nroAleatorio)).replaceAll(" ", "0");

	    return nroBin;
	}
}
