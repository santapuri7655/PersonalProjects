package OOPMasterChallenge;
// We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store.
// The basic hamburger should have the following items.
// Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that
// the customer can select to be added to the burger.
// Each one of these items gets charged an additional price so you need some way to track how many items got added
// and to calculate the final price (base burger with all the additions).
// This burger has a base price and the additions are all separately priced (up to 4 additions, see above).

public class BaseHamburger {
    private String breadRoll;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean carrot;
    private int priceOfLettuce;
    private int priceOfTomato;
    private int priceOfCarrot;
    private int priceOfMeat;
    private int priceOfBreadRoll;
    private int priceOfCheese;

    public BaseHamburger(String meat, int priceOfBreadRoll, boolean lettuce, boolean tomato, boolean carrot){
        this.breadRoll = "breadRoll";
        this.priceOfBreadRoll = priceOfBreadRoll;
        this.meat = meat;
        this.lettuce = lettuce;
        this.tomato = tomato;
        this.carrot = carrot;
        this.priceOfLettuce = 1;
        this.priceOfCarrot = 2;
        this.priceOfTomato = 3;
        this.priceOfMeat = 2;
        this.priceOfCheese = 2;
    }

    public String getBreadRoll() {
        return breadRoll;
    }
    public String getMeat() {
        return meat;
    }
    public int getPriceOfLettuce() {
        if(lettuce){
            return priceOfLettuce;
        }
        else {
            return 0;
        }
    }
    public int getPriceOfCheese(){
        return priceOfCheese;
    }

    public int getPriceOfTomato() {
        if(tomato){
            return priceOfTomato;
        }
        else {
            return 0;
        }
    }

    public int getPriceOfCarrot() {
        if(carrot){
            return priceOfCarrot;
        }
        else{
            return 0;
        }
    }
    public int getPriceOfMeat() {
        return priceOfMeat;
    }
    public int getPriceOfBreadRoll() {
        return priceOfBreadRoll;
    }
    public int getBasePrice(String meat){
        if(meat.equals("chicken")){
            return getPriceOfBreadRoll()+getPriceOfMeat();
        }
        else if(meat.equals("veggie")){
            return getPriceOfBreadRoll();
        }
        else if(meat.equals("special meat")){
            return getPriceOfBreadRoll()+getPriceOfMeat()+getPriceOfCheese();
        }
        else {
            return 0;
        }
    }
    public int getAdditionalsPrice(){
        return getPriceOfCarrot()+getPriceOfLettuce()+getPriceOfTomato();
    }
}
