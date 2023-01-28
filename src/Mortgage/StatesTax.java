package Mortgage;

public enum StatesTax {


    NEWYORK(20),
    NEWJERSEY(15),
    FLORIDA(5),
    OHIO(12);
    private int tax;





    public int getTax() {

        return tax;
    }

    StatesTax(int tax) {
        this.tax=tax;

    }

}



