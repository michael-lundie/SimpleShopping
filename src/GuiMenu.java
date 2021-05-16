public class GuiMenu extends BaseMenu{

    public GuiMenu(ShoppingList shoppingList) {
        super(shoppingList);
    }

    @Override
    protected void chooseMenuOption(int promptMainMenuInput) {

    }

    @Override
    protected int promptDeleteItem() {
        return 0;
    }

    @Override
    protected String promptAddItem() {
        return null;
    }

    @Override
    protected void showMainMenu() {

    }

    @Override
    protected int promptMainMenuChoice() {
        return 0;
    }
}
