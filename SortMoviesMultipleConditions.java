class Movie implements Comparable<Movie> {
    private String name;
    private String duration;
    private int year;
    
    public Movie(String name, String duration, int year) {
        this.name = name;
        this.duration = duration;
        this.year = year;
    }
    
    public int getDurationInMin() {
        String[] t = duration.split(":");
        int hr = Integer.parseInt(t[0]);
        int min = Integer.parseInt(t[1]);
        return (hr*60) + min;
    }
    public int compareTo(Movie o) {
        if(this.year != o.year) {
            return o.year - this.year;
        }
        else if(this.getDurationInMin() != o.getDurationInMin()) {
            return o.getDurationInMin() - this.getDurationInMin();
        }
        else {
            return this.name.compareTo(o.name);
        }
    }
    public String toString() {
        return name + " " + duration + " " + year;
    }
}
