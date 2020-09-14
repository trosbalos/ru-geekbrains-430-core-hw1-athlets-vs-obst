public class Race {
    ///test
    public static void main(String[] args) {

        Cat boris = new Cat(4, 9, "boris");
        Cat gulfik = new Cat(3, 9, "gulfik");
        Cat pauk = new Cat(7, 3, "pauk");
        Robot term1 = new Robot(5, 2, "term1");
        Robot term2 = new Robot(4, 3, "term2");
        Robot term3 = new Robot(4, 0, "term3");
        Human kolya = new Human(4, 3, "kolya");
        Human bolt = new Human(100, 9, "bolt");
        Human vasya = new Human(4, 5, "vasya");
        Wall wall1 = new Wall(5, "wall1");
        Wall wall2 = new Wall(2, "wall2");
        Wall wall3 = new Wall(8, "wall3");
        Runningtrack track1 = new Runningtrack(9, "track1");
        Runningtrack track2 = new Runningtrack(2, "track2");
        Runningtrack track3 = new Runningtrack(8, "track3");



        //bonus
        Elephant dudu = new Elephant(40,20, "Дуду");
        dudu.run(track1);
        dudu.jump(wall1);
        Elephant dudu2 = new Elephant(40,20, "Дуду");
        dudu2.run(track1);
        dudu2.jump(wall1);

        Athlete[] athletes = {boris, gulfik, pauk, term1, term2, term3, kolya, vasya, bolt};
        Obstacle[] obstacles = {wall1, wall2, wall3, track1, track2, track3};




        for (Athlete athlete : athletes) {
            for (Obstacle obstacle : obstacles) {
                if (obstacle instanceof Wall) {
                    athlete.jump(obstacle);
                }
                if (obstacle instanceof Runningtrack) {
                    athlete.run(obstacle);
                }
            }
        }
    }
}