public class Runningtrack implements Obstacle {
    public int distance;
    String name;

    public int getDistance() {
        return distance;
    }

    @Override
    public String getName() {
        return name;
    }


    public Runningtrack(int distance, String name) {

        this.distance = distance;
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println(" по беговой дорожке " + this.name + " длиной " + this.distance);
        System.out.println();

    }

    @Override
    public int getHeight() {
        return 0;
    }
}