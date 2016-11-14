package OOP4;

import java.util.LinkedList;
import java.util.List;
import OOP4.enums.FlowerColor;
import OOP4.enums.FlowerType;
import OOP4.parent.Flower;
import OOP4.parent.Spec;

/**
 * Created by TheOriginMS7 on 17.10.2016.
 */
public class FlowerBucket {
    private int defaultSize = 10;

    private int insertIndex = 0;
    private Spec[] a = new Spec[defaultSize];

    public void addFlower(Spec nw) {
        checkSize();
        a[insertIndex] = nw;
        insertIndex ++;
    }

    private void checkSize(){
        if (insertIndex == defaultSize - 1) {
            defaultSize *= 2;
            Spec[] b = new Spec[defaultSize];
            for (int i = 0; i <= insertIndex; i ++) {
                b[i] = a[i];
            }
            a = b;
        }
    }
    public void sortByPrice() {
        for (int i = 1; i < insertIndex; i ++) {
            Spec tmp = a[i];
            int j = i - 1;
            while (j >= 0 && (a[i].getPrice() < a[j].getPrice())) {
                a[i] = a[j];
                j --;
            }
            a[j + 1] = tmp;
        }
    }
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public int getTotalPrice(){
        int sum = 0;
        for (int i = 0; i < insertIndex; i++){
            sum += a[i].getPrice();
        }
        return sum;
    }

    public Spec[] selectFlowersByItsLength(double start, double end) {
        int tmpSize = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpSize ++;
            }
        }
        Spec[] tmpPart = new Spec[tmpSize];
        int tmpIndex = 0;
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getLength() <= end && a[i].getLength() >= start ) {
                tmpPart[tmpIndex] = a[i];
                tmpIndex ++;
            }
        }
        return tmpPart;
    }


    public List<Spec> searchFlower(Spec flower){

        List<Spec> tmp = new LinkedList<Spec>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].equals(flower))
                tmp.add(a[i]);
        }
        return tmp;
    }
}
