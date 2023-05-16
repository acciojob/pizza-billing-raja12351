package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    final int vegPrice = 300;
    final int nonVegPrice = 400;
    final int extraCheesePrice;
    final int toppingPrice;
    final int bagPrice = 20;
    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean bagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price = vegPrice;
            this.toppingPrice = 70;
        }
        else{
            this.price = nonVegPrice;
            this.toppingPrice = 120;
        }
        this.extraCheesePrice = 80;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            this.price += extraCheesePrice;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
           this.price += toppingPrice;
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += bagPrice;
            bagAdded = true;
        }
    }

    public String getBill(){
        if(isVeg){
            this.bill ="Base Price Of The Pizza: " + vegPrice + "\n";
        }
        else {
            this.bill ="Base Price Of The Pizza: " + nonVegPrice + "\n";
        }
        if(cheeseAdded){
            this.bill += "Extra Cheese Added: " + extraCheesePrice + "\n";
        }
        if(toppingsAdded) {
            this.bill += "Extra Toppings Added: " + toppingPrice + "\n";
        }
        if(bagAdded){
            this.bill += "Paperbag Added: " + bagPrice + "\n";
        }
        this.bill += "Total Price: " + this.price + "\n";

        return this.bill;
    }
}
