package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean bagAdded = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg){
            this.price += 300;
        }
        else{
            this.price += 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            this.price += 80;
            cheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!toppingsAdded){
            if(isVeg){
                this.price += 70;
            }else{
                this.price += 120;
            }
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!bagAdded){
            this.price += 20;
            bagAdded = true;
        }
    }

    public String getBill(){
        if(isVeg){
            this.bill ="Base Price Of The Pizza: 300" + "\n";
        }
        else if(!isVeg){
            this.bill ="Base Price Of The Pizza: 400" + "\n";
        }
        if(cheeseAdded){
            this.bill += "Extra Cheese Added: 80" + "\n";
        }
        if(toppingsAdded && isVeg){
            this.bill += "Extra Toppings Added: 70" + "\n";
        }else if(toppingsAdded && !isVeg){
            this.bill += "Extra Toppings Added: 120" + "\n";
        }
        if(bagAdded){
            this.bill += "Paperbag Added: 20" + "\n";
        }
        this.bill += "Total Price: " + this.price;

        return this.bill;
    }
}
