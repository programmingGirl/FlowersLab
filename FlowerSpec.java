/**
 * Ready to GIT
 */
public class FlowerSpec {
    protected FlowerColor color = FlowerColor.GREEN;   // green color is default color
    protected double length = 0;
    protected boolean fresh = true;
    protected double price = 0;
    protected String type = "Just a flower";

    public String getType(){return type;}
    public void setType(String type) {this.type = type;}
    public FlowerColor getColor(){
        return color;
    }
    public void setColor(FlowerColor color) {
        this.color = color;
    }

    public double getPrice(){return price;}

    public void setPrice(double price) {this.price = price;}

    public boolean isFresh(){return this.fresh;}

    public void setFresh(boolean fresh) {this.fresh = fresh;}

    public void setLength(double length) {this.length = length;}

    public double getLength() {return length;}

    public String toString() {
        return "Type of flower is " + getType()  + " and it is " +
                getColor() + ", freshness is equal to " + String.valueOf(isFresh()) +
                ", length is " + String.valueOf(getLength()) + " and it costs "
                + String.valueOf(getPrice()) + " dollars.";
    }
}
