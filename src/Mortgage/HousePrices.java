package Mortgage;

// HousePrices class inin Users dan miras aldığını unutmalayım.

public class HousePrices extends Users {


    private int price = 0;



    public HousePrices(String username, String whicCondition, String houseType, int roomcount, int downPayment, int longTerm, StatesTax statesTax) {
        super(username, whicCondition, houseType, roomcount, downPayment, longTerm, statesTax);
        roomCountToPrice();
        ConditionToPrice();
        HouseTypeToPrice();
        CalculateTax();
    }

    public void roomCountToPrice() {
       switch (getRoomcount()) {
           case 0:
               price += 10000;
               break;
           case 1:
               price += 20000;
               break;
           case 2:
               price += 30000;
               break;
           case 3:
               price += 40000;
               break;
           case 4:
               price += 50000;
               break;
           case 5:
               price += 60000;
               break;
       }
    }




    public void ConditionToPrice() {
       /*   String conditiontoprice = getWhicCondition();
        if (conditiontoprice.equalsIgnoreCase("New")) {
            price += 50000;
        } else if (conditiontoprice.equalsIgnoreCase("Like New")) {
            price += 40000;
        } else if (conditiontoprice.equalsIgnoreCase("Old")) {
            price += 30000;
        } else if (conditiontoprice.equalsIgnoreCase("Renew Required")) {
            price += 15000;
        }*/
        switch (getWhicCondition()){
            case "New":price+=50000;break;
            case "Like New":price+=40000;break;
            case "Old":price+=30000;break;
            case "Renew Required":price+=15000;break;
        }
    }


    public void HouseTypeToPrice() {
       /* String houstype = getHouseType();
        if (houstype.equalsIgnoreCase("Apartment")) {
            price += 20000;
        } else if (houstype.equalsIgnoreCase("Condo")) {
            price += 30000;
        } else if (houstype.equalsIgnoreCase("House")) {
            price += 40000;
        }*/
        switch (getHouseType()){
            case "Apartment":price+=20000;break;
            case "Condo":price+=30000;break;
            case "House":price+=40000;break;
        }
    }


    public void CalculateTax() {
        int tax=price*getStatesTax().getTax()/100;
        price+=tax;
    }


    public int getPriceTotal() {
        return price;
    }


    public int getPriceEachMonth() {
        return (price-getDownPayment())/getLongTerm();
    }
}





