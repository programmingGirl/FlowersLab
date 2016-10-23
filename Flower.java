/**
 * Represents flower by showing her color, length, freshness, etc.
 */
abstract public class Flower {
    protected  FlowerSpec spec;

    public void setType(String type) {spec.setType(type);}

    protected String getType() {return spec.getType();}

    public FlowerColor getColor() {return spec.getColor();}

    public void setColor(FlowerColor color) {spec.setColor(color);}

    public boolean isFresh() {return spec.isFresh();}

    public void setFresh(boolean fresh) {spec.setFresh(fresh);}

    public double getPrice() {return spec.getPrice();} // it is possible to write this.price, result is the same

    public void setPrice(double price) {spec.setPrice(price);}

    public double getLength() {return spec.getLength();}

    public void setLength(double length) {spec.setLength(length);}

    public String toString() {return spec.toString();}

}
