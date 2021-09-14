public interface Box {

    public void add(Sweet... args); //метод добавления сладостей
    public void remove(int index); // удаление сладости по индексу
    public void remove(); // удаление последней сладости в массиве

    public int getWeight(); // получение веса коробки
    public int getVal(); // получение стоимости коробки

    public void getInfo(); // получение информации о всех сладостях в коробке

    public void delMinWeight(int weight); //умная оптимизация по меньшему весу
    public void delMinPrice(int weight); //умная оптимизация по меньшей цене

}
