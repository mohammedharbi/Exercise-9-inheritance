public class Shape {

    private String color;
    private boolean filled;

    Shape(){
        this.color= "green";
        this.filled= true;
    }

    Shape(String color, boolean filled){
        this.color= color;
        this.filled= filled;
    }

    public void setColor(String color){
        this.color= color;
    }

    public void setFilled(boolean filled){
        this.filled= filled;
    }

    public String getColor(){return color;}
    public boolean isFilled(){return filled;}

    public void setFilled(){}

    public String toString(){
        String filledinString;
        if (isFilled()){filledinString = "filled";}else {filledinString= "not filled";}
        return "A Shape the color is "+color+" and it's "+filledinString;
    }


}
