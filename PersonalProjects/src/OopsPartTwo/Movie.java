package OopsPartTwo;

public class Movie {
    private String movieName;

    public Movie(String movieName){
        this.movieName = movieName;
    }
    public String getMovieName(){
        return movieName;
    }
    public String plot(){
        return "No plot here";
    }
}

class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats people";
    }
}

class JawsTwo extends Movie{
    public JawsTwo() {
        super("Jaws Two");
    }
    @Override
    public String plot() {
        return "More shark eats more people";
    }
}

class JurassicPark extends Movie{
    public JurassicPark() {
        super("Jurassic Park");
    }
    @Override
    public String plot() {
        return "A dinosaur eats people";
    }
}

class LostWorld extends Movie{
    public LostWorld() {
        super("Lost World");
    }
    @Override
    public String plot() {
        return "More dinosaurs eat more people";
    }
}

class NoName extends Movie{
    public NoName() {
        super("No name");
    }
}

class MovieTest {
    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie selected is " + movie.getMovieName() + "\n" +
                                    "Plot: "+ movie.plot());
        }
    }

    public static Movie randomMovie(){
        int randomMovie = (int) (Math.random() * 5) + 1;
        System.out.println("Movie #" + randomMovie);
        switch (randomMovie){
            case 1:
                return new Jaws();
            case 2:
                return new JawsTwo();
            case 3:
                return new JurassicPark();
            case 4:
                return new LostWorld();
            case 5:
                return new NoName();
        }
        return null;
    }
}
