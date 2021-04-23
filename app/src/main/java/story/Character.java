package story;

public class Character {
        String name;
        String characteristics;
        String specialMoves;
        String team;

        public Character(String name, String characteristics, String specialMoves, String team) {
                this.name = name;
                this.characteristics = characteristics;
                this.specialMoves = specialMoves;
                this.team = team;
        }

        public Character() {
                this("Iron Man","Money", "Suit", "Avenger");
        }

        public void printCharacter() {
                System.out.println(name + " is " + characteristics + " with " + specialMoves + " on " + team + " team.");
        }

}
