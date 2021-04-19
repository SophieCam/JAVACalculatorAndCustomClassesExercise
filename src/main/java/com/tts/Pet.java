package com.tts;

public class Pet {
    //set variables
    private String name;
    private int age;
    private String location ;
    private String type;

    //empty construct
public Pet () {
      name = "Jeff";
      age = 2;
      location = "New York";
      type = "Lab";
}

    //Construct with all attributes
public Pet (String name, int age, String location, String type){
        this.name = name;
        this.age = age;
        this.location = location;
        this.type = type;

}
     //get method (will take user input)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    //set method (void is used bc we r not returning anything bc user is changing values)
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void myPet(){
        System.out.println(" My pet is named " + this.name + " we live in " + this.location );
    }
}
