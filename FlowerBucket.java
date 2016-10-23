import java.util.ArrayList;

/**
 * Created by Mariya on 18.10.2016.
 */
public class FlowerBucket{

    private int insertIndex = 0;
    private int defaultLength = 10;
    private FlowerSpec[] a = new FlowerSpec[defaultLength];
    public String toString() {
        String s = "";
        for (int i = 0; i < insertIndex; i ++) {
            s += a[i].toString() + "\n";
        }
        return s;
    }

    public void addFlower(FlowerSpec newFlower) {
        checkLength();
        a[insertIndex] = newFlower;
        insertIndex++;
    }
    private void checkLength(){
        if (insertIndex >= defaultLength - 1) {
            defaultLength *= 2;
            FlowerSpec[] newList = new FlowerSpec[defaultLength];
            for (int i = 0; i <= insertIndex; i++) {
                newList[i] = a[i];
            }
            a = newList;
        }
    }

    public ArrayList<FlowerSpec> searchFlowers(FlowerSpec flower){
        ArrayList<FlowerSpec> tmp = new ArrayList<>();
        for (int i = 0; i < insertIndex; i++) {
            if (a[i].getType() != flower.getType())
                continue;
            if (a[i].getColor() != flower.getColor())
                continue;
            if (a[i].getLength() != flower.getLength())
                continue;
            tmp.add(a[i]);
        }

        return tmp;

    }
}
