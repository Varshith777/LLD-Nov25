package advancedConcepts.designPatterns.decorator;

public interface IceCream {
    int getCost();
    String getDescription();
}

/*
    everything is an ice-cream
    Cone -> ice-cream
    Cone + scoop -> ice-cream
    Cone + scoop + toppings -> ice-cream

    Scoop + toppings -> NOT POSSIBLE
 */