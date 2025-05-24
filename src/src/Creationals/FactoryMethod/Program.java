package Creationals.FactoryMethod;

import Creationals.FactoryMethod.FactoryPizzaRoma;
import Creationals.FactoryMethod.IFactory;
import Creationals.FactoryMethod.IPizza;

public class Program {

	public static void main(String[] args) {
		IFactory factory = null;
		factory = new FactoryPizzaRoma();
		
		IPizza pizza=null;
		pizza = factory.crearePizza();
		pizza.afisareDescriere();
	}

}
