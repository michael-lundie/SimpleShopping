import javax.swing.*;

public class GuiMenu extends BaseMenu{
    private String[] mainMenu;

    public GuiMenu(ShoppingList shoppingList) {
        super(shoppingList);
    }

    public void startMainMenu() {
        int menuChoice = 0;

        while(menuChoice != EXIT-1) {
            menuChoice = promptMainMenuChoice();
            System.err.println("menu choice was : " + menuChoice);
            chooseMenuOption(menuChoice);
        }
    }

    @Override
    protected void chooseMenuOption(int promptMainMenuInput) {
        switch(promptMainMenuInput) {
            case 0:
                showItemsList();
                break;
            case 1:
                break;
            case 2:
                break;
            case EXIT-1:
                System.out.println("Exiting...");
                break;
            default:
                break;
        }
    }

    private void showItemsList() {
        JTextArea outputArea = new JTextArea();
        outputArea.setText( String.join("\n", shoppingList.getShoppingList()) );
        JOptionPane.showMessageDialog( null, outputArea,
                Constants.DIALOG_LIST_TITLE, JOptionPane.INFORMATION_MESSAGE );
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
