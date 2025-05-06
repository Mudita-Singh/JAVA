// Abstract class
abstract class Player {
    String name;
    int age;
    String position;

    // Constructor // player attributes
    public Player(String name, int age, String position) {
        this.name = name;
        this.age = age;
        this.position = position;
    }

    // Abstract methods
    abstract void play();
    abstract void train();
}

//  subclass
class Cricket_Player extends Player {
    public Cricket_Player(String name, int age, String position) {
        super(name, age, position); // Call parent constructor
    }

    // Implemented play method for cricket
    @Override
    void play() {
        System.out.println(name + " is playing cricket as  " + position );
    }

    // Implement train method for cricket
    @Override
    void train() {
        System.out.println(name + " is training for batting and bowling.");
    }
}

// Football Player subclass
class Football_Player extends Player {
    public Football_Player(String name, int age, String position) {
        super(name, age, position); // Call parent constructor
    }

    // Implement play method for football
    @Override
    void play() {
        System.out.println(name + " is playing football as a " + position);
    }

    // Implement train method for football
    @Override
    void train() {
        System.out.println(name + " is training passing.");
    }
}

// Hockey Player subclass
class Hockey_Player extends Player {
    public Hockey_Player(String name, int age, String position) {
        super(name, age, position); // Call parent constructor
    }

    // Implement play method for hockey
    @Override
    void play() {
        System.out.println(name + " is playing hockey as a " + position );
    }

    // Implement train method for hockey
    @Override
    void train() {
        System.out.println(name + " is training in stick handling and shooting");
    }
}

// Main class
public class PlayerDemo {
    public static void main(String[] args) {

        Cricket_Player cricketPlayer = new Cricket_Player("Rahul", 25, "Batsman");
        cricketPlayer.play();
        cricketPlayer.train();

        Football_Player footballPlayer = new Football_Player("Amit", 23, "Goalkeeper");
        footballPlayer.play();
        footballPlayer.train();

        Hockey_Player hockeyPlayer = new Hockey_Player(" aman", 27, "Defender");
        hockeyPlayer.play();
        hockeyPlayer.train();
    }
}
