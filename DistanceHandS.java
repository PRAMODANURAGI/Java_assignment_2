   //  Question 12  //

class Distance {
    protected double distanceMiles;

    public Distance(double d) {
        this.distanceMiles = d;
    }

    public void travelTime() {
        double timeHours = distanceMiles / 60.0;
        System.out.println("Time taken in hours (miles/hour): " + timeHours);
    }
}

class DistanceMKS extends Distance {
    public DistanceMKS(double d) {
        super(d);
    }

    @Override
    public void travelTime() {
        double distanceKm = distanceMiles * 1.60934;
        double timeSeconds = distanceKm / 100.0;
        System.out.println("Time taken in seconds (km/second): " + timeSeconds);
    }
}

public class DistanceHandS {
    public static void main(String[] args) {
        Distance d1 = new Distance(100);
        DistanceMKS d2 = new DistanceMKS(100);

        d1.travelTime();
        d2.travelTime();
    }
}
