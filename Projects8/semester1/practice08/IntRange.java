package semester1.practice08;

public class IntRange {
    private int min;
    private int max;
    public IntRange(int min, int max) {
        setRange(min, max);
    }
    public void setRange(int min, int max) {
        if (min <= max) {
            this.min = min;
            this.max = max;
        } else {
            this.min = max;
            this.max = min;
        }
    }
    public boolean contains(int value) {
        return value >= min && value <= max;
    }
    public int getLength() {
        return max - min;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        setRange(min, this.max);
    }
    public int getMax() {
        return max;
    }
    public void setMax(int max) {
        setRange(this.min, max);
    }
    @Override
    public String toString() {
        return String.format("[%d .. %d] (довжина: %d)", min, max, getLength());
    }
}