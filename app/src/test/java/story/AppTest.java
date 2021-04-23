/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package story;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class AppTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test public void testThatCharacterExists() {
        Character spiderMan = new Character("Spider Man", "high school student from Queens", "              .  .\n" +
                "             .|  |.\n" +
                "             ||  ||\n" +
                "             \\\\()//\n" +
                "             .={}=.\n" +
                "            / /`'\\ \\\n" +
                "            ` \\  / '   \n" +
                "               `'", "Avenger");
        assertNotNull("app should have a character", spiderMan.name);
    }


    @Test public void testThatendgameMovieExists() {
        Movie movie = new Movie("Endgame", new ArrayList<String>(), 2019);
        assertNotNull("app should have a movie", movie.title);
    }
}