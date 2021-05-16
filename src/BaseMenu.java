public abstract class BaseMenu {
    protected final static int EXIT = 9;
    protected final ShoppingList shoppingList;

    public BaseMenu(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    protected abstract void chooseMenuOption(int promptMainMenuInput);

    protected abstract int promptDeleteItem();

    protected abstract String promptAddItem();

    protected abstract void showMainMenu();

    protected abstract int promptMainMenuChoice();
}
