public class Constants {

    final static String MENU_OPTION_VIEW = "View Items";
    final static String MENU_OPTION_ADD = "Add Items";
    final static String MENU_OPTION_DELETE = "Delete Items";
    static final String MENU_EXIT = "Exit";

    /**
     * Method in which menu options are made available as an array.
     * The exit option should not be added to this method, as it should always
     * be the last entry. It is applied when menu options are accessed via it's
     * accessor/getter method..
     * @return A String array of menu options
     */
    private static String[] menuOptions() {
        return new String[] {
                MENU_OPTION_VIEW,
                MENU_OPTION_ADD,
                MENU_OPTION_DELETE };
    }

    static String[] getMainMenuOptions() {
        String[] menu = new String[menuOptions().length+1];
        System.arraycopy(menuOptions(), 0, menu, 0, menuOptions().length);
        menu[menuOptions().length] = MENU_EXIT;
        return menu;
    }
}
