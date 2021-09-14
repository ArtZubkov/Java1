public class IceCream extends Sweet {
    int id;
    public IceCream(String title, int weight, int price) {
        this.id = Sweet.id;
        this.title = title;
        this.weight = weight;
        this.price = price;

        Sweet.id++;
    }
}
