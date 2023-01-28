package Mortgage;

public class Users {


private String username;
private String whicCondition;
private String houseType;
private int roomcount;
private int downPayment;
private int longTerm;
private StatesTax statesTax;

    public Users() {    }

    public Users(String username, String whicCondition, String houseType, int roomcount, int downPayment, int longTerm, StatesTax statesTax) {
        this.username = username;
        this.whicCondition = whicCondition;
        this.houseType = houseType;
        this.roomcount = roomcount;
        this.downPayment = downPayment;
        this.longTerm = longTerm;
        this.statesTax = statesTax;
    }

    public String getUsername() {
        return username;
    }

    public String getWhicCondition() {
        return whicCondition;
    }

    public String getHouseType() {
        return houseType;
    }

    public int getRoomcount() {
        return roomcount;
    }

    public int getDownPayment() {
        return downPayment;
    }

    public int getLongTerm() {
        return longTerm;
    }

    public StatesTax getStatesTax() {
        return statesTax;
    }


}

