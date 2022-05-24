public class App {
    public static void main(String[] args) throws Exception {
        Organism e = new Organism(3,5);
        e.move(4, 20);
        System.out.println(e);

        Herd herd = new Herd();
        // herd.addToHerd(new Organism(5, 10));
        herd.move(1, 0);
        System.out.println(herd.toString());
    }
}
