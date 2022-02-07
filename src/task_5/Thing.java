package task_5;

public class Thing implements Comparable<Thing> {
    private boolean status;
    private String name;
    private int value;
    private int volume;
    private double efficiency;

    public Thing() {
    }

    public Thing(String name, int value, int volume) {
        this.name = name;
        this.value = value;
        this.volume = volume;
        efficiency = value / volume;
        status = true;
    }

    void countEff(int val, int vol) {
        this.value = val;
        this.volume = vol;
        efficiency = val / vol;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEfficiency() {
        return efficiency;
    }

    @Override
    public int compareTo(Thing o) {
        if(efficiency > o.getEfficiency())
            return -1;
        if(efficiency < o.getEfficiency())
            return 1;
        return 0;

    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
