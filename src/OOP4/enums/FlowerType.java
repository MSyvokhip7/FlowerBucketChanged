package OOP4.enums;

/**
 * Created by TheOriginMS7 on 17.10.2016.
 */
public enum FlowerType {

    ROMASHKA, MAK, ROSE, TULPAN;

    public String toString(){
        switch (this) {
            case ROMASHKA:
                return "Romashka";
            case MAK:
                return "Mak";
            case ROSE:
                return "Rose";
            case TULPAN:
                return "Tulpan";
            default:
                return "No type";
        }
    }
}
