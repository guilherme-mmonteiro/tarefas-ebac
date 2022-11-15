/**
 * 
 */
package MOD7;

/**
 * @author guilherme-mmonteiro
 *
 */
public class ClasseMouse {
	
	public static void main (String args[]) {
		Mouse mouse = new Mouse();
		mouse.setCor("Preto");
		mouse.setMarca("logitech");
		mouse.setModelo("MK220");
		
		System.out.println(mouse.getCor());
		System.out.println(mouse.getMarca());
		System.out.println(mouse.getModelo());
		
	}

}
