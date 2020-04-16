package OOPMasterChallenge;
//Create a Hamburger class to deal with all the above.
// The constructor should only include the roll type, meat and price, can also include name of burger or you
// can use a setter.
// Also create two extra varieties of Hamburgers (subclasses) to cater for


//  All 3 classes should have a method that can be called anytime to show the base price of the hamburger
// plus all additionals, each showing the addition name, and addition price, and a grand/final total for the
// burger (base price + all additions)
// For the two additional classes this may require you to be looking at the base class for pricing and then
// adding totals to final price.

public class Hambuger extends BaseHamburger{

    private String typeRoll;
    private String typeMeat;

    public Hambuger(String meat, String typeRoll, String typeMeat, double priceOfBreadRoll, boolean lettuce, boolean tomato, boolean carrot) {
        super(meat, priceOfBreadRoll, lettuce, tomato, carrot);
        this.typeRoll = typeRoll;
        if(this.typeRoll.equals("white bread")){
            System.out.println("Selected white bread.");
            this.typeRoll = "white bread";
        }
        else if(this.typeRoll.equals("wheat bread")){
            System.out.println("Selected wheat bread.");
            this.typeMeat = "veggie";
        }
        else if(this.typeRoll.equals("brown rye bread")){
            System.out.println("Selected brown rye bread");
            this.typeMeat = "brown rye bread";
        }
        else {
            System.out.println("selected none");
        }
        this.typeMeat = typeMeat;
        if(this.typeMeat.equals("chicken")){
            System.out.println("Selected meat chicken.");
            this.typeMeat = "chicken";
        }
        else if(this.typeMeat.equals("veggie")){
            System.out.println("Selected vegetarian.");
            this.typeMeat = "veggie";
        }
        else if(this.typeMeat.equals("special meat")){
            System.out.println("Selected special");
            this.typeMeat = "special meat";
        }
        else {
            System.out.println("selected none");
        }
    }

    public String getTypeRoll() {
        return typeRoll;
    }
    public String getTypeMeat() {
        return typeMeat;
    }
    private double getMakingChargers(){
        return 1;
    }
    public double getChickenBurger() {
        return getMakingChargers()+getAdditionalsPrice();
    }
    public double getVeggieBurger() {
        return getAdditionalsPrice();
    }
    public double getSpecialBurger() {
        return getAdditionalsPrice()+getMakingChargers()*2;
    }
    private double getBurgerPrice(String burgerType){
        if(burgerType.equals("chicken")){
            return getChickenBurger();
        }
        else if(burgerType.equals("veggie")){
            return getVeggieBurger();
        }
        else if(burgerType.equals("special meat")){
            return getSpecialBurger();
        }
        else {
            return 0;
        }
    }
    @Override
    public double getBasePrice(String burgerType) {
        return super.getBasePrice(burgerType) + getBurgerPrice(burgerType);
    }

    //    public int getPriceOfHambuger(){
//        baseHamburger.getBasePrice();
//        baseHamburger.getAdditionalsPrice();
//        return baseHamburger.getBasePrice()+baseHamburger.getAdditionalsPrice();
//    }
}
// a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added.
// The healthy burger can have 6 items (Additions) in total.
// hint:  you probably want to process the two additional items in this new class (subclass of Hamburger),
// not the base class (Hamburger), since the two additions are only appropriate for this new class
// (in other words new burger type).
class HealthyBurger extends Hambuger{

    private boolean spinach;
    private double priceOfSpinach;
    private boolean onion;
    private double priceOfOnion;

    public HealthyBurger(String meat, String typeRoll, String typeMeat, double priceOfBreadRoll) {
        super(meat, typeRoll, typeMeat, priceOfBreadRoll, true, true, true);
        this.priceOfSpinach = 1.4;
        this.priceOfOnion = 1.5;
        this.spinach = true;
        this.onion = true;
    }

    public double getPriceOfSpinach() {
        return priceOfSpinach;
    }
    public double getPriceOfOnion() {
        return priceOfOnion;
    }
    public double getAdditionalPrice(){
        return getPriceOfOnion() + getPriceOfSpinach();
    }
    public double getPriceOfAllAdditions(){
        System.out.println("Price of Lettuce = "+getPriceOfLettuce());
        System.out.println("Price of Tomato = " + getPriceOfTomato());
        System.out.println("Price of Carrots = "+getPriceOfCarrot());
        System.out.println("Price of Onion = "+getPriceOfOnion());
        System.out.println("Price of Spinach = "+getPriceOfSpinach());
        return getAdditionalPrice()+getAdditionalsPrice();
    }

    @Override
    public double getBasePrice(String burgerType) {
        return super.getBasePrice(burgerType) + getAdditionalPrice();
    }
}

// b) Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed.
// hint:  You have to find a way to automatically add these new additions at the time the deluxe burger
// object is created, and then prevent other additions being made.
class DeluxeHamburger extends Hambuger{
    private double chips;
    private double drinks;

    public DeluxeHamburger(String meat, String typeRoll, String typeMeat, double priceOfBreadRoll, double chips, double drinks) {
        super(meat, typeRoll, typeMeat, priceOfBreadRoll, false, false, false);
        this.drinks = drinks;
        this.chips = chips;
    }

    public double getChips() {
        return chips;
    }
    public double getDrinks() {
        return drinks;
    }
    private double getAdditions(){
        return getChips()+getDrinks();
    }

    @Override
    public double getBasePrice(String burgerType) {
        return super.getBasePrice(burgerType) + getAdditions();
    }
}

//Test burger
class billsBurger {
    private static String CHICKEN = "chicken";
    private static String VEGGIE = "veggie";
    private static String SPECIAL = "special meat";
    private static String WHITE_BREAD = "white bread";
    private static String WHEAT_BREAD = "wheat bread";
    private static String RYE_BREAD = "brown rye bread";
    public static void main(String[] args) {
        Hambuger hambuger = new Hambuger(CHICKEN, WHEAT_BREAD, CHICKEN, 2, true, true, true);
        System.out.println("burger total price = "+ hambuger.getBasePrice(SPECIAL));
        HealthyBurger healthyBurger = new HealthyBurger(SPECIAL, RYE_BREAD, SPECIAL, 2);
        System.out.println("Healthy burger total price = "+ healthyBurger.getBasePrice(SPECIAL));
        System.out.println("Price of Additionals = "+ healthyBurger.getPriceOfAllAdditions());
        DeluxeHamburger deluxeHamburger = new DeluxeHamburger(VEGGIE, WHITE_BREAD, VEGGIE, 2, 1,1);
        System.out.println("Price of Delux veggie burger = "+deluxeHamburger.getBasePrice(VEGGIE));
    }
}