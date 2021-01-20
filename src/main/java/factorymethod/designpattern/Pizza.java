package factorymethod.designpattern;

public abstract class Pizza {

    public abstract void addIngredient();

    public void bakePizza(){
        System.out.println("factorymethod.designpattern.Pizza baked at 4pm");
    }

}
