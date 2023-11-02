package client;

/**
 * This class contains constants and functions relating to ANSI Escape Sequences that are useful in the Client display
 */
public class EscapeSequences {

    private static final String UNICODE_ESCAPE = "\u001b";

    private static final String SET_TEXT_COLOR = UNICODE_ESCAPE + "[38;5;";

    public static final String SET_TEXT_COLOR_GREEN = SET_TEXT_COLOR + "46m";
    public static final String SET_TEXT_COLOR_YELLOW = SET_TEXT_COLOR + "36m";
    public static final String RESET_TEXT_COLOR = SET_TEXT_COLOR + "0m";
}