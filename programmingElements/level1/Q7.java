public class Q7 {
    public static void main(String[] args) {
        double radiusKm = 6378.0;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        double radiusMiles = radiusKm * 0.621371;
        double volumeMiles = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        System.out.println("The volume of earth in cubic kilometers is " +
                String.format("%.2f", volumeKm) + " and cubic miles is " + String.format("%.2f", volumeMiles));
    }
}