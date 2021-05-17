import javax.swing.*;

public class GuiMenu extends BaseMenu{
    private String[] mainMenu = new String[9];

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

    }

    @Override
    protected int promptMainMenuChoice() {
//        return JOptionPane.showOptionDialog(null, "Select from ..","Notebook Menu",
//                JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, alternatives, alternatives[0]);
    return 0;
    }
}
