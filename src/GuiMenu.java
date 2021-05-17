import javax.swing.*;

public class GuiMenu extends BaseMenu{
    private String[] mainMenu;

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
    protected void buildMainMenu() {
        if(mainMenu == null || mainMenu.length == 0) {
            mainMenu = Constants.getMainMenuOptions();
        }
    }

    @Override
    protected int promptMainMenuChoice() {
        buildMainMenu();
        return JOptionPane.showOptionDialog(null,
                Constants.MAIN_MENU_MESSAGE,Constants.MAIN_MENU_TITLE,
                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, mainMenu, mainMenu[0]);
    }
}
