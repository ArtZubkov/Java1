import java.util.List;
import java.util.ArrayList;

public class BoxOfSweets implements Box {

    private List<Sweet> arrayListSweet = new ArrayList<>();

    public void add(Sweet... args) {
        for (Sweet x : args) {
            arrayListSweet.add(x);
        }
    }

    public void remove(int index) {
        arrayListSweet.remove(index);
    }

    public void remove() {
        arrayListSweet.remove( arrayListSweet.size()-1);
    }

    public int getWeight() {
        int sumWeight = 0;
        for (Sweet x : arrayListSweet) {
            sumWeight = sumWeight + x.weight;
        }
        return sumWeight;
    }

    public int getVal() {
        int val = 0;
        for (Sweet x : arrayListSweet) {
            val = val + x.price;
        }
        return val;
    }

    public void getInfo() {
        System.out.println("In the box is: ");
        for (Sweet x : arrayListSweet) {
            System.out.println(x.title+" "+x.weight+" "+x.price);
        }
    }

    public void delMinWeight(int weight) {
        int weightBox = this.getWeight();
        while (weightBox > weight) {
            int minWeight = arrayListSweet.get(0).weight;
            int index = 0;
            for (Sweet x : arrayListSweet) {
                if (x.weight < minWeight) {
                    minWeight = x.weight;
                    index = arrayListSweet.indexOf(x);
                }
            }
            arrayListSweet.remove(index);
            weightBox = this.getWeight();
        }
    }

    public void delMinPrice(int weight) {
        int weightBox = this.getWeight();
        while (weightBox > weight) {
            int minPrice = arrayListSweet.get(0).price;
            int index = 0;
            for (Sweet x : arrayListSweet) {
                if (x.price < minPrice) {
                    minPrice = x.price;
                    index = arrayListSweet.indexOf(x);
                }
            }
            arrayListSweet.remove(index);
            weightBox = this.getWeight();
        }
    }

}
