package semester1.practice09;

public class Display {
    private final double diagonalInches;
    private int brightnessPercent;
    public Display(double diagonalInches, int brightnessPercent) {
        this.diagonalInches = Math.max(3.0, diagonalInches);
        this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));}
    public void setBrightnessPercent(int brightnessPercent) {
        this.brightnessPercent = Math.max(10, Math.min(100, brightnessPercent));}
    public int getBrightnessPercent() {
        return brightnessPercent;}
    @Override
    public String toString() {
        return String.format("Display{діагональ=%.1f\", яскравість=%d%%}", diagonalInches, brightnessPercent);}
}
