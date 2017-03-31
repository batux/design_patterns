package decoratorpatterndesigninpractice.main;

import java.util.List;

import decoratorpatterndesigninpractice.accessories.Shoes;
import decoratorpatterndesigninpractice.accessories.Skirt;
import decoratorpatterndesigninpractice.accessories.TShirt;
import decoratorpatterndesigninpractice.girls.Girl;
import decoratorpatterndesigninpractice.girls.TurkishGirl;

/**
 * 
 * @author Batuhan Duzgun (batux) - Computer Engineer / Industrial Engineer
 * 
 *
 */

public class Main {

	public static void main(String[] args) {
		
		Girl girl = new TurkishGirl("Cansu", "Pelin", 25);
		
		Shoes shoes = new Shoes("Nike", "Kırmızı", 41, girl);
		
		Skirt skirt = new Skirt("Mango", "Beyaz", 41, shoes);
		
		TShirt tshirt = new TShirt("Colins", "Mavi", skirt);
		tshirt.createAccessory(girl.getAccessories());
		
		List<Girl> list = girl.getAccessories();
		System.out.println(list);
	}

}
