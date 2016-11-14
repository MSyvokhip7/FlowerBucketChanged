package OOP4.parent;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public abstract class Flower {
    protected Spec spec;

    public void setType(FlowerType type) {
        spec.setType(type);
    }
    public FlowerType getType() { return spec.getType();}

    public void CalculatePrice(){}

    public void setPrice(double price) {
        spec.setPrice(price);
    }
    public double getPrice() { return spec.getPrice();}

    public void setLength(double length) {
        spec.setLength(length);
    }
    public double getLength() { return spec.getLength();}

    public void setColor(FlowerColor color) {
        spec.setColor(color);
    }
    public FlowerColor getColor() { return spec.getColor();}

    public void setFresh(boolean freshness) {
        spec.setFresh(freshness);
    }
    public boolean isFresh() {return spec.isFresh();}


    public String toString() {
        return spec.toString();
    }

}
