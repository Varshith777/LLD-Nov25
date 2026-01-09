package advancedConcepts.designPatterns.decorator;

public class Main {
    public static void main(String[] args) {
        //ice-cream order - vanilla cone
        IceCream i1 = new VanillaCone();
        System.out.println(i1.getCost());
        System.out.println(i1.getDescription());

        //i2 - vanilla cone choco scoop
        IceCream i2 = new ChocolateScoop(
                                new VanillaCone());
        System.out.println(i2.getCost());
        System.out.println(i2.getDescription());

        // i3 - vanilla cone, chocoscoop, choco cone, vanilla scoop, choco chip
        /*
        IceCream vanillaCone = new VanillaCone();
        IceCream vanillaConeWithChocoScoop = new ChocolateScoop(vanillaCone);
        // IceCream i = new ChocolateScoop(new VanillaCone());
        IceCream vanillaConeWithChocoScoopWithChocoCone = new ChocoCone(vanillaConeWithChocoScoop);
        // IceCream i = new ChocoCone(
        //                        new ChocolateScoop(
        //                                new VanillaCone()));
        //
        */


        IceCream i3 = new ChocoChip(
                            new VanillaScoop(
                                new ChocoCone(
                                    new ChocolateScoop(
                                        new VanillaCone()))));
        System.out.println(i3.getCost());
        System.out.println(i3.getDescription());
    }
}
