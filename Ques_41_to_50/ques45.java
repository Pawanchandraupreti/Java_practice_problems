package Ques_41_to_50;

//Builder Pattern (Simplified)

class Pizza {
    private String dough;
    private String sauce;
    private String topping;
    
    static class Builder {
        private String dough;
        private String sauce;
        private String topping;
        
        Builder dough(String dough) {
            this.dough = dough;
            return this;
        }
        
        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }
        
        Builder topping(String topping) {
            this.topping = topping;
            return this;
        }
        
        Pizza build() {
            Pizza pizza = new Pizza();
            pizza.dough = this.dough;
            pizza.sauce = this.sauce;
            pizza.topping = this.topping;
            return pizza;
        }
    }
    
    void describe() {
        System.out.println("Pizza with " + dough + " dough, " + sauce + " sauce, and " + topping + " topping");
    }
}

public class ques45 {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza.Builder()
            .dough("thin crust")
            .sauce("tomato")
            .topping("cheese")
            .build();
            
        myPizza.describe();
    }
}
