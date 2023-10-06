import java.util.ArrayList;

public class Program {

    /*
    a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
    b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
    поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
    c. Для хранения фруктов внутри коробки можно использовать ArrayList;
    d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
    вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
    e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
    подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
    Можно сравнивать коробки с яблоками и апельсинами;
    f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
    Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
    Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
    g. Не забываем про метод добавления фрукта в коробку.

    Формат сдачи: ссылка на гитхаб проект
        * */
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Orange orange1 = new Orange();
        Box<Apple> appleBox = new Box<>();
        appleBox.addFruit(new Apple(), 9);
        System.out.println("Вес коробки яблок составляет " + appleBox.getWeight() + ". В коробке лежит " + appleBox.getAmount() + " яблок.");
        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange1, 6);
        System.out.println("Вес коробки апельсинов составляет " + orangeBox.getWeight() + ". В коробке лежит " + orangeBox.getAmount() + " апельсинов.");
        System.out.println("Результат проверки на равенство по весу: " + appleBox.compare(orangeBox));
        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(orange1, 10);
        System.out.println("У вас есть вторая коробка, вес которой составляет " + orangeBox2.getWeight() + ". В коробке лежит " + orangeBox2.getAmount() + " апельсинов.");
        System.out.println("Вы пересыпаете апельсины из первой коробки в коробку к другим апельсинам.");
        orangeBox.putFromBox(orangeBox2);
        System.out.println("Теперь вес первой коробки апельсинов составляет " + orangeBox.getWeight() + ". В коробке лежит " + orangeBox.getAmount() + " апельсинов.");
        System.out.println("Теперь вес другой коробки, где были апельсины, составляет " + orangeBox2.getWeight() + ". В коробке лежит " + orangeBox2.getAmount() + " апельсинов.");
        System.out.println("Результат проверки на равенство по весу: " + orangeBox.compare(orangeBox2));
        
        // System.out.println("Не пытайтесь положить апельсины к яблокам, это вызовет критическую ошибку в ткани реальности!");
        // Box<Orange> orangeBox3 = new Box<>();
        // orangeBox.addFruit(orange1, 33);
        // appleBox.putFromBox(orangeBox3);

    }

}
