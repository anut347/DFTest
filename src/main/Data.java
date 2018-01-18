package main.java.DFTest;

public class Data {

    private String name;
    private int favNo;
    private String favColor;
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setFavNo(int favNo) {
        this.favNo = favNo;
    }
    
    public int getFavNo() {
        return this.favNo;
    }
    
    public void setFavColor(String favColor) {
        this.favColor = favColor;
    }
    
    public String setFavColor() {
        return this.favColor;
    }
    
    public String toString() { 
        return "Your silly name is: '" + this.favColor + this.favNo + "'";
    } 
}
