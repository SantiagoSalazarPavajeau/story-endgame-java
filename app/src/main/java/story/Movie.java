package story;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movie {
    // movie or tv show or comic

    String title;
    List<String> characterList;
    int year;

    public Movie(String title, List<String> characterList, int year) {
        this.title = title;
        this.characterList = characterList;
        this.year = year;
    }

    public Movie(){
        this("Endgame", new ArrayList<String>(), 2019);
    }

    public void addCharacter(Character character){
        this.characterList.add(character.name);
    }

    public static String snapFingers(Movie movie){
        int startLength = movie.characterList.size();
        System.out.println("character list before " + movie.characterList);
        while(movie.characterList.size() > startLength/2){
            int random_int = (int)Math.floor(Math.random()*(movie.characterList.size()-0+1)+0);
            if(movie.characterList.get(random_int) == "Thanos"){
                continue;
            }
            System.out.println(movie.characterList.get(random_int));
            movie.characterList.remove(random_int);
        }
        System.out.println("character list after " + movie.characterList);
        return "Thanos has snapped his fingers ";
    }

    public void start(){
        Character ironMan = new Character("Iron Man", "Genius inventor and billionaire industrialist", "                     `. ___\n" +
                "                    __,' __`.                _..----....____\n" +
                "        __...--.'``;.   ,.   ;``--..__     .'    ,-._    _.-'\n" +
                "  _..-''-------'   `'   `'   `'     O ``-''._   (,;') _,'\n" +
                ",'________________                          \\`-._`-','\n" +
                " `._              ```````````------...___   '-.._'-:\n" +
                "    ```--.._      ,.                     ````--...__\\-.\n" +
                "            `.--. `-`                       ____    |  |`\n" +
                "              `. `.                       ,'`````.  ;  ;`\n" +
                "                `._`.        __________   `.      \\'__/`\n" +
                "                   `-:._____/______/___/____`.     \\  `\n" +
                "                               |       `._    `.    \\\n" +
                "                               `._________`-.   `.   `.___\n" +
                "                                               `------'`", "Avengers");
        Character thanos = new Character("Thanos", "Titan with augmented powers surpassing all other Titanian Eternals.", "  ___           ___      \n" +
                " /HHH\\     \n" +
                "|XXXXX| _   \n" +
                "|HHHHH|/H) \n" +
                "\\XXXXX/X/  \n" +
                " ||||||'  ", "Villain" );
        Character blackWidow = new Character("Black Widow", "Former russian KGB agent with artificially enhanced strength",
                "                     /\\              _\n" +
                        "                   /  \\            / \\\n" +
                        "                  |  _ \\          /   \\   _\n" +
                        "                  | / \\ \\        /     \\ / \\\n" +
                        "                  |/   \\ \\       |      /   \\\n" +
                        "                  /     \\ |      | /\\  / \\   \\\n" +
                        "                 /|      \\| ~  ~ |/  \\/   \\   \\\n" +
                        "         _______/_|_______\\(o)(o)/___/\\___|_   \\\n" +
                        "        /      /  |       (______)     \\  | \\   \\_\n" +
                        "       /      /   |      /              \\ |  \\\n" +
                        "      /      /    |     /                \\|   \\\n" +
                        "     /      /     |    /                  \\    \\\n" +
                        "    /     _/      |   /                   |\\    \\\n" +
                        "   /             _|  |                    |_\\    \\_\n" +
                        " _/                  |                       \\\n" +
                        "                     |                        \\\n" +
                        "                     |                         \\_\n" +
                        "                    _|                        " , "Avengers");
//        ironMan.printCharacter();
        Character captainAmerica = new Character("Captain America", "Patriotic Supersoldier", "Shield", "Avenger");
        Character thor = new Character("Thor", "God of Thunder",
                "\n ______ \n" + " |_,.,--\\\n" +
                        "    || \n" +
                        "    || \n" +
                        "    ##", "Avenger");

        Character greenGoblin = new Character("Green Goblin", "Archenemy of Spider-Man", "Hover Board", "Villain");
        Character spiderMan = new Character("Spider Man", "high school student from Queens", "              .  .\n" +
                "             .|  |.\n" +
                "             ||  ||\n" +
                "             \\\\()//\n" +
                "             .={}=.\n" +
                "            / /`'\\ \\\n" +
                "            ` \\  / '   \n" +
                "               `'", "Avenger");
        System.out.println(blackWidow.specialMoves);
        System.out.println(thor.specialMoves);
        System.out.println(spiderMan.specialMoves);
        System.out.println(thanos.specialMoves);
        System.out.println(ironMan.specialMoves);

        Movie endGame = new Movie();
//        endGame.addCharacter(ironMan);)
        endGame.addCharacter(ironMan);
        endGame.addCharacter(blackWidow);
        endGame.addCharacter(thanos);
        endGame.addCharacter(captainAmerica);
        endGame.addCharacter(thor);
        endGame.addCharacter(greenGoblin);
        endGame.addCharacter(spiderMan);

        Scanner input=new Scanner(System.in);

        Boolean holder = true;

        while (holder){
            System.out.println("Please type a character name: [Iron Man, Black Widow, Thanos, Captain America, Thor, Green Goblin, Spider Man, extra: Snap fingers]");
            String selection = input.nextLine();

            switch(selection){
                case "Spider Man":
                    spiderMan.printCharacter();//object of scanner class
                    break;
                case "Thanos":
                    thanos.printCharacter();
                    break;
                case "Green Goblin":
                    greenGoblin.printCharacter();
                    break;
                case "Thor":
                    thor.printCharacter();
                    break;
                case "Iron Man":
                    ironMan.printCharacter();
                    break;
                case "Captain America":
                    captainAmerica.printCharacter();
                    break;
                case "Black Widow":
                    blackWidow.printCharacter();
                    break;
                case "Snap fingers":
                    snapFingers(endGame);
                    break;
                case "exit":
                    input.close();
                    holder = false;
                    break;
            }

        }
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", characterList=" + characterList +
                ", year=" + year +
                '}';
    }
    // Character[]



}
