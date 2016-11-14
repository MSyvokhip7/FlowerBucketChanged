package OOP4.enums;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public enum ShapeCactus {

    SQUARE, RECTANGLE, CIRCLE;

    public String toString(){
        switch (this){
            case SQUARE:
                return "Square";
            case RECTANGLE:
                return "Rectangle";
            case CIRCLE:
                return "Circle";
            default:
                return "No shape";
        }
    }
}
