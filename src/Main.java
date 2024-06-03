public class Main {
    public static void main(String[] args) {
        Bil car1 = new Bil(2000);
        System.out.println(car1.setTrailer(new Trailer(1501)));

        System.out.println(car1.totalWeight());
    }
}

