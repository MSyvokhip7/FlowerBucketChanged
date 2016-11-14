package OOP4.spec;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Spec;

/**
 * Created by TheOriginMS7 on 24.10.2016.
 */
public class CactusSpec extends Spec {
    public CactusSpec(FlowerColor color, double length, boolean freshness, double price, FlowerType type) {
        super(color, length, freshness, price, type);
    }
}
