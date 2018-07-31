import java.util.Comparator;

class Player {
    String name;
    int score;

    Player(String name, int score) {
        this.name = name;
        this.score = score;
    }
}


public class Checker implements Comparator<Player> {
    public int compare(Player a, Player b) {
        System.out.println(a.score + " " + b.score);
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        }
        return b.score - a.score;
    }


}
