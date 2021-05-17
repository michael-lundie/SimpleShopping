public class TestShopping {

    public static void main(String[] args) {
        ShoppingList shoppingList = new ShoppingList();
        addTestItems(shoppingList);
        TerminalMenu terminalMenu = new TerminalMenu(shoppingList);
        terminalMenu.startMenu();
    }

    private static void addTestItems(ShoppingList shoppingList) {
        shoppingList.addItem("Cheese");
        shoppingList.addItem("Pineapple");
        shoppingList.addItem("Pizza Base");
        shoppingList.addItem("Tomato");
        shoppingList.addItem("Peperoni");
    }
}
