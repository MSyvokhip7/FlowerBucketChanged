package OOP4.enums;

/**
 * Created by TheOriginMS7 on 17.10.2016.
 */
public enum FlowerColor {

    GREEN, RED, BLUE, BLACK;

    public String toString(){
        switch(this) {
            case GREEN:
                return "Green";
            case RED:
                return "Red";
            case BLUE:
                return "Blue";
            case BLACK:
                return "Black";
            default:
                return "No color";
        }
    }
}
