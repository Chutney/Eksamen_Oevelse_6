public class Bil {

    private int weight;
    private Trailer trailer;


    public Bil(int weight) {
        this.weight = weight;
    }

    public String setTrailer(Trailer trailer) {
        int totalWeight = trailer.getWeight() + weight;
        if(totalWeight > 3500) {
            return "Weight exceeds 3500kg. Could not add trailer!";
        } else {
            this.trailer = trailer;
            return "Trailer was successfully added!";
        }

    }



    public int totalWeight() {

        if(trailer == null) {
            return weight;
        }
        return weight + trailer.getWeight();


    }

}
