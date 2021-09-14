public class Main {

    public static void main(String[] args) {

        Candy caramel = new Candy("Caramel", 150, 50);
        Candy truffle = new Candy("Truffle", 200, 100);
        IceCream corkscrew = new IceCream("Corkscrew", 100, 75);
        IceCream penny40 = new IceCream("40Penny", 250, 250);

        Box boxOfSweets = new BoxOfSweets();
        boxOfSweets.add(caramel, truffle, corkscrew, penny40);

        System.out.println("Box weight is "+boxOfSweets.getWeight());
        System.out.println("Box price is "+boxOfSweets.getVal()+"\n");
        boxOfSweets.getInfo();


        //boxOfSweets.delMinWeight(400);  //умная оптимизация по меньшему весу
        //boxOfSweets.delMinPrice(400);   //умная оптимизация по меньшей цене



    }
}
