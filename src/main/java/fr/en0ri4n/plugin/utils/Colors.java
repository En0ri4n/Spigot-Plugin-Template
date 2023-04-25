package fr.en0ri4n.spigotutilitiesplugin.utils;

import org.bukkit.ChatColor;

/**
 * Utility class for Spigot Colors<br>
 * Used to simplify the use of colored strings
 */
@SuppressWarnings("unused")
public class Colors
{
    private static final Colors BOLD = new Colors(ChatColor.BOLD);
    private static final Colors ITALIC = new Colors(ChatColor.ITALIC);
    private static final Colors UNDERLINE = new Colors(ChatColor.UNDERLINE);
    private static final Colors STRIKE = new Colors(ChatColor.STRIKETHROUGH);
    private static final Colors OBFUSCATED = new Colors(ChatColor.MAGIC);
    private static final Colors RESET = new Colors(ChatColor.RESET);

    private final ChatColor colorEffect;

    private Colors(ChatColor colorEffect)
    {
        this.colorEffect = colorEffect;
    }

    public String yellowColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.YELLOW) + str;
    }

    public String redColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.RED) + str;
    }

    public String greenColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.GREEN) + str;
    }

    public String blueColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.BLUE) + str;
    }

    public String grayColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.GRAY) + str;
    }

    public String whiteColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.WHITE) + str;
    }

    public String blackColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.BLACK) + str;
    }

    public String darkRedColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_RED) + str;
    }

    public String darkGreenColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_GREEN) + str;
    }

    public String darkBlueColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_BLUE) + str;
    }

    public String darkGrayColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_GRAY) + str;
    }

    public String aquaColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.AQUA) + str;
    }

    public String goldColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.GOLD) + str;
    }

    public String lightPurpleColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.LIGHT_PURPLE) + str;
    }

    public String darkAquaColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_AQUA) + str;
    }

    public String darkPurpleColor(String str)
    {
        return colorEffect + String.valueOf(ChatColor.DARK_PURPLE) + str;
    }



    public static String yellow(String str)
    {
        return ChatColor.YELLOW + str;
    }

    public static String red(String str)
    {
        return ChatColor.RED + str;
    }

    public static String green(String str)
    {
        return ChatColor.GREEN + str;
    }

    public static String blue(String str)
    {
        return ChatColor.BLUE + str;
    }

    public static String gray(String str)
    {
        return ChatColor.GRAY + str;
    }

    public static String white(String str)
    {
        return ChatColor.WHITE + str;
    }

    public static String black(String str)
    {
        return ChatColor.BLACK + str;
    }

    public static String darkRed(String str)
    {
        return ChatColor.DARK_RED + str;
    }

    public static String darkGreen(String str)
    {
        return ChatColor.DARK_GREEN + str;
    }

    public static String darkBlue(String str)
    {
        return ChatColor.DARK_BLUE + str;
    }

    public static String darkGray(String str)
    {
        return ChatColor.DARK_GRAY + str;
    }

    public static String aqua(String str)
    {
        return ChatColor.AQUA + str;
    }

    public static String darkAqua(String str)
    {
        return ChatColor.DARK_AQUA + str;
    }

    public static String darkPurple(String str)
    {
        return ChatColor.DARK_PURPLE + str;
    }

    public static String lightPurple(String str)
    {
        return ChatColor.LIGHT_PURPLE + str;
    }

    public static String gold(String str)
    {
        return ChatColor.GOLD + str;
    }



    public static Colors bold()
    {
        return BOLD;
    }

    public static Colors italic()
    {
        return ITALIC;
    }

    public static Colors underline()
    {
        return UNDERLINE;
    }

    public static Colors strike()
    {
        return STRIKE;
    }

    public static Colors obfuscated()
    {
        return OBFUSCATED;
    }

    public static Colors reset()
    {
        return RESET;
    }
}
