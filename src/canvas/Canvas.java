package canvas;

public class Canvas {

    public static void drawHouse(int residentsAtHome) {
        switch (residentsAtHome) {
            case 0:
                break;
            case 1:
                System.out.println("""               
                                   x
                        .-. _______|
                        |=|/     /  \\   o
                        | |_____|_""_| /|\\
                        |_|_[X]_|____| / \\
                        """);
                break;
            case 2:
                System.out.println("""          
                                   x
                        .-. _______|
                        |=|/     /  \\   o  \\ o /
                        | |_____|_""_| /|\\   |
                        |_|_[X]_|____| / \\  / \\
                        """);
                break;
            case 3:
                System.out.println("""        
                                   x
                        .-. _______|
                        |=|/     /  \\   o  \\ o / \\ /
                        | |_____|_""_| /|\\   |    |
                        |_|_[X]_|____| / \\  / \\  /o\\
                        """);
                break;
            case 4:
                System.out.println("""   
                                   x
                        .-. _______|
                        |=|/     /  \\   o  \\ o / \\ /  o
                        | |_____|_""_| /|\\   |    |  /|\\
                        |_|_[X]_|____| / \\  / \\  /o\\ / \\
                        """);
        }
    }

    public static void drawPolice() {
        System.out.println("""
                          ,
                 __  _.-"` `'-.
                /||\\'._ __{}_(
                ||||  |'--.__\\
                |  L.(   ^_\\^
                \\ .-' |   _ |
                | |   )\\___/
                |  \\-'`:._]
                \\__/;      '-.""");
    }

    public static void drawBurglar() {
        System.out.println("""
                ⠀⠀⠀⠀⢀⡀⠀⠀⠀⠀
                ⠀⣠⣶⣿⣿⣿⣿⣷⣄⠀
                ⢰⣿⣿⣿⣿⣿⣿⣿⣿⣆
                ⣾⣿⣿⣿⣿⣿⣿⣿⣿⣿
                ⣠⣴⣶⣦⣤⣤⣴⣶⣦⣄
                ⢿⣧⣤⣼⣿⣿⣧⣤⣼⡿
                 ⠀⠀⠉⠁⠀⠀⠈⠉⠀⠀""");
    }
}