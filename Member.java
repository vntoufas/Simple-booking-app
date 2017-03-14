public class Member {

    private String name;
    private String surname;
    private int CardID;
    private String Category;
    
    public Member(){//default constructor
    name=null;
    surname=null;
    CardID=0;
    Category=null;}
    
    public Member(String name,String surname,int CardID,String Category)//overloaded constructor
    {this.name=name;
    this.surname=surname;
    this.CardID=CardID;
    this.Category=Category;}
    
    /////////////////////////////////////////////
    /////////////////////GETTERS/////////////////
    /////////////////////////////////////////////
    public String getName() {return name;}
    public String getSurname() {return surname;}
    public int getCardID() {return CardID;}
    public String getCategory() {return Category;}
    /////////////////////////////////////////////////
    /////////////////////SETTERS/////////////////////
    /////////////////////////////////////////////////
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setCardID(int CardID) {this.CardID = CardID;}
    public void setCategory(String Category) {this.Category = Category;}
    
    
    
}
