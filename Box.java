import java.util.ArrayList;

public class Box<T extends Fruit> {

    ArrayList<T> fruitList = new ArrayList<>();
    private float weight;
    private int amountOfFruit;

    public Box() {
        ArrayList<T> fruitList = new ArrayList<>();
    }
    
    public float getWeight () {
        weight = 0f;
        for (T fruit : fruitList){
            weight += fruit.getWeight();
        }
        return weight;
    }

    public int getAmount() {
        this.amountOfFruit = fruitList.size();
        return amountOfFruit;
    }

    public boolean compare(Box boxToCompareWith) {
        if (this.getWeight() != boxToCompareWith.getWeight()){
            return false;
        } else return true;
    }

    public void addFruit(T fruitToAdd) {
        fruitList.add(fruitToAdd);
        weight += fruitToAdd.getWeight();
    }

    public void addFruit(T fruitToAdd, int numberOfFruitToAdd) {
        for (int i = 0; i < numberOfFruitToAdd; i++) {
            fruitList.add(fruitToAdd);
            weight += fruitToAdd.getWeight();
        }
    }

    // @Override
    // public boolean equals(Box<T> boxToCompareWith){
    //     if (this instanceof Box<T> && boxToCompareWith instanceof Box<T> && this.getWeight() == boxToCompareWith.getWeight() && this.getAmount() == boxToCompareWith.getAmount()){
    //         return true;
    //     } else return false;
    // }
    
    public void clearBox(){
        fruitList.clear();
    }

    public boolean checkEqualTypes(Box<T> boxToCheck){
        if (this instanceof Box<T> && boxToCheck instanceof Box<T>){
            return true;
        } else return false;
    }

    public void putFromBox(Box<T> boxToPutFruitFrom) {
        if (this.equals(boxToPutFruitFrom) == true){
            System.out.println("Нельзя пересыпать фрукты из коробки в нее же, в этом нет смысла!");
        } else {
            if (checkEqualTypes(boxToPutFruitFrom) == true){
                this.addFruit(fruitList.get(0), boxToPutFruitFrom.getAmount());
                boxToPutFruitFrom.clearBox();
                System.out.println("Вы успешно переложили фрукты.");
            } else System.out.println("Фрукты разного типа, поэтому их нельзя хранить вместе.");
        }
    }  

}

