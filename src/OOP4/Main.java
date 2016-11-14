package OOP4;

import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Flower;
import OOP4.parent.Spec;
import OOP4.spec.FlowerSpec;

public class Main {

    public static void main(String args[]) {

        Romashka romashka = new Romashka();
        Cactus cactus = new Cactus();

        romashka.getTotalPrice();
        cactus.getTotalPrice();

        FlowerBucket bucket = new FlowerBucket();
        Spec mak = new Spec();
        mak.setFresh(false);
        mak.setPrice(80000);
        mak.setType(FlowerType.MAK);
        mak.setColor(FlowerColor.RED);
        mak.setLength(80);
        bucket.addFlower(mak);

        Spec tul = new Spec();
        tul.setFresh(true);
        tul.setPrice(280000);
        tul.setType(FlowerType.TULPAN);
        tul.setColor(FlowerColor.GREEN);
        tul.setLength(380);
        bucket.addFlower(tul);

        System.out.println(bucket);

        System.out.println(bucket.searchFlower(tul));
    }
}
