import java.util.Scanner;

public class TerminalMenu extends BaseMenu {

    private final Scanner scanner;
    private String mainMenu;

    public TerminalMenu(ShoppingList shoppingList) {
        super(shoppingList);
        this.scanner = new Scanner(System.in);
        int menuChoice = 0;

        // Loop main menu until
        while(menuChoice != EXIT) {
            buildMainMenu();
            menuChoice = promptMainMenuChoice();
            chooseMenuOption(menuChoice);
        }
    }

    @Override
    protected void chooseMenuOption(int promptMainMenuInput) {
        switch(promptMainMenuInput) {
            case 1:
                shoppingList.listItems();
                break;
            case 2:
                shoppingList.addItem(promptAddItem());
                break;
            case 3:
                boolean deleteSuccessful;
                do {
                    deleteSuccessful = shoppingList.deleteItem((promptDeleteItem()-1));
                    if(!deleteSuccessful) {
                        System.out.println("Please enter a valid item number.");
                    }
                } while (!deleteSuccessful);
                break;
            case EXIT:
                System.out.print("Exiting...");
                break;
            default:
                System.out.println("Menu Option not implemented.");
                break;
        }
    }

    @Override
    protected int promptDeleteItem() {
        System.out.println("Type the number of item you wish to delete.");
        return Utils.getValidIntInput(this.scanner, "You must enter a number.");
    }

    @Override
    protected String promptAddItem() {
        return Utils.getValidLineInput(this.scanner, "You must enter some item.");
    }

    @Override
    protected void buildMainMenu() {

        if(mainMenu == null || mainMenu.equals("")) {
            StringBuilder menuBuilder = new StringBuilder();

            for(int i = 0; i < Constants.getMainMenuOptions().length; i++) {
                menuBuilder.append("[").append((i+1)).append("] ")
                        .append(Constants.getMainMenuOptions()[i]);
                if(i != Constants.getMainMenuOptions().length-1) {
                    menuBuilder.append("\t");
                }
            }

            mainMenu = menuBuilder.toString();
        }
        System.out.println(mainMenu);
    }

    @Override
    protected int promptMainMenuChoice() {
        int menuChoice;
        do {
            System.out.println("Please choose a number from the menu.");
            menuChoice = Utils.getValidIntInput(this.scanner, "Invalid input.");
        } while (menuChoice < 1 || menuChoice > 3 && menuChoice != EXIT);
        return menuChoice;
    }
}