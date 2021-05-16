import java.sql.Array;
import java.util.ArrayList;

public class ShoppingList {

    private ArrayList<String> shoppingList;

    public ShoppingList() {
            shoppingList = new ArrayList<>();

            String[] string = new String[5];

            Double[] d = new Double[4];
    }

    public void addItem(String listItem) {
        shoppingList.add(listItem);
    }

    public int numberOfItems() {
        return shoppingList.size();
    }

    public void showItem(int index) {
        if(index < 0) {
            System.out.println("Index request must be 0 or greater.");
        } else if (index > shoppingList.size()) {
            System.out.println("Index request must be less than " + shoppingList.size());
        } else {
            System.out.println(shoppingList.get(index));
        }
    }

    public void listItems() {
        System.out.println("Item No\tItem");
        for(int i = 0; i < shoppingList.size(); i++) {
            System.out.println((i+1) + "\t\t" + shoppingList.get(i));
        }
    }

    public boolean deleteItem(int index) {
        if(index < 0 || index > shoppingList.size()) {
            return false;
        } else {
            shoppingList.remove(index);
            return true;
        }
    }
}
