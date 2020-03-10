package reducaoEquacao;

public class Main {

	public static void main(String[] args) {
		System.out.println(Util.geraBin());
		Cromossomo c = new Cromossomo();
		c.setX(Util.geraBin());
		c.setY(Util.geraBin());
		
		System.out.println("X: "+c.getX()+"\n"+"Y: "+c.getY());
	}
}