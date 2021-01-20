package factorymethod.designpattern;

public class PizzaFactory implements BasePizzaFactory {


    public Pizza createPizza(String typeOfPizza) {
        Pizza pizza;

        if ("cheese".equals(typeOfPizza.toLowerCase())) {
            pizza = new CheesePizza();
        } else if ("pepperoni".equals(typeOfPizza.toLowerCase())) {
            pizza = new PepperoniPizza();
        } else if ("veggie".equals(typeOfPizza.toLowerCase())) {
            pizza = new VaggiePizza();
        } else {
            throw new IllegalArgumentException("No such pizza.");
        }

        pizza.addIngredient();
        pizza.bakePizza();

        return pizza;
    }
}
