public class Constants {

    final static String MENU_OPTION_VIEW = "View Items";
    final static String MENU_OPTION_ADD = "Add Items";
    final static String MENU_OPTION_DELETE = "Delete Items";
    static final String MENU_EXIT = "Exit";

    static String[] getMainMenuOptions() {
        return new String[] {
                MENU_OPTION_VIEW,
                MENU_OPTION_ADD,
                MENU_OPTION_DELETE };
    }

}
