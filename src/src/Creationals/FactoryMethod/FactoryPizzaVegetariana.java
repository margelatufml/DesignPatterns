package Creationals.FactoryMethod;

public class FactoryPizzaVegetariana implements IFactory{

	@Override
	public IPizza crearePizza() {
		return new PizzaVegetariana();
	}

}
