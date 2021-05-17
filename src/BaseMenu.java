public abstract class BaseMenu {
    protected final static int EXIT = 4;
    protected final ShoppingList shoppingList;

    public BaseMenu(ShoppingList shoppingList) {
        this.shoppingList = shoppingList;
    }

    protected abstract void chooseMenuOption(int promptMainMenuInput);

    protected abstract int promptDeleteItem();

    protected abstract String promptAddItem();

    protected abstract void buildMainMenu();

    protected abstract int promptMainMenuChoice();
}
