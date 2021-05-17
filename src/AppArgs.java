import java.util.HashMap;
import java.util.Map;

public enum AppArgs {
    ARG_TERMINAL("term"),
    ARG_GUI("gui"),
    ARG_TEST("test");

    String commandLineArg;

    AppArgs(String commandLineArg) {
        this.commandLineArg = commandLineArg;
    }

    public String getCommandLineArg() {
        return commandLineArg;
    }

    public static AppArgs get(String argument) {
        return appArgsLookup.get(argument);
    }
    private static final Map<String, AppArgs> appArgsLookup = new HashMap<>();

    static {
        for (AppArgs appArgs : AppArgs.values()) {
            appArgsLookup.put(appArgs.getCommandLineArg(), appArgs);
        }
    }
}
