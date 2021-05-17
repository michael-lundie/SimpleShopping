public class TestShopping {

    private static boolean runInTerminal = false;
    private static boolean runInTestMode = false;

    public static void main(String[] args) {

        initArgs(args);

        ShoppingList shoppingList = new ShoppingList();

        if (runInTestMode) {
            addTestItems(shoppingList);
        }

        if (runInTerminal) {
            TerminalMenu terminalMenu = new TerminalMenu(shoppingList);
            terminalMenu.startMenu();
        } else {
            GuiMenu guiMenu = new GuiMenu(shoppingList);
            guiMenu.startMainMenu();
        }
    }

    private static void initArgs(String[] args) {
        if (args.length > 0) {
            for (String arg : args) {
                switch (AppArgs.get(arg)) {
                    case ARG_TERMINAL:
                        runInTerminal = true;
                        break;
                    case ARG_GUI:
                        runInTerminal = false;
                        break;
                    case ARG_TEST:
                        runInTestMode = true;
                        break;
                    default:
                        System.err.println("Unknown application argument.");
                }
            }
        }
    }

    private static void addTestItems(ShoppingList shoppingList) {
        shoppingList.addItem("Cheese");
        shoppingList.addItem("Pineapple");
        shoppingList.addItem("Pizza Base");
        shoppingList.addItem("Tomato");
        shoppingList.addItem("Peperoni");
    }
}
