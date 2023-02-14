package HomeWorkTWOLessonFIVE;

//---------ATTRIBUTES---------
public class Route {
    private String startingPoint;
    private String finalDestination;
    private double distance;

//---------GETTERS/SETTERS---------

    public String getStartingPoint() {
        return startingPoint;
    }

    public void setStartingPoint(String startingPoint) {
        this.startingPoint = startingPoint;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public void setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
