package cn.crowdos.kernel.constraint;

public class Coordinate implements Condition{
    final double longitude;
    final double latitude;
    public Coordinate(double longitude, double latitude){
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public Coordinate(){
        this(0,0);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj instanceof Coordinate){
            Coordinate anCoord = (Coordinate) obj;
            return (Double.valueOf(this.longitude).compareTo(Double.valueOf(anCoord.longitude)) == 0)
                    && (Double.valueOf(this.latitude).compareTo(Double.valueOf(anCoord.latitude)) == 0);
        }
        return false;
    }

    public boolean inLine(Coordinate other){
        return this.longitude == other.longitude || this.latitude == other.latitude;
    }

    @Override
    public String toString() {
        return String.format("Coo<%.3f, %.3f>", longitude, latitude);
    }
}
