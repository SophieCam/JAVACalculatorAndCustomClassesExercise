package com.tts;

public class House {
    // created private
    private int yearBuilt;
    private String location ;
    private String type;

    public House () {
        yearBuilt = 1980;
        location = "Staten Island, New York";
        type = "Condo";
    }

    public House (int yearBuilt, String location, String type) {
        this.yearBuilt = yearBuilt;
        this.location = location;
        this.type = type;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getType(){
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString(){
        return "I am selling a " + type+  " built in " + yearBuilt + " located in " + location;

    }

    public boolean checkYear(int yearBuilt) {
        if (yearBuilt >= 1990) {
           isHouseNew(yearBuilt);
            return true;
        } else {
            return false;
        }

    }

    public String isHouseNew (int yearBuilt){
        if (yearBuilt >= 1990) {
            return "This is a newer homes!";
        }
        return "this is an older home";
    }
}
//if house is greater than 1990 return "wow this home was built recently)
// this home is older