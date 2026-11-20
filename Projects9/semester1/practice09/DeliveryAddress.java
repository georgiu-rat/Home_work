package semester1.practice09;

public class DeliveryAddress {
    private String city;
    private String street;
    private int postOfficeNumber;
    public DeliveryAddress(String city, String street, int postOfficeNumber) {
        this.city = (city == null || city.isBlank()) ? "Київ" : city;
        this.street = (street == null || street.isBlank()) ? "Центральна" : street;
        this.postOfficeNumber = Math.max(1, postOfficeNumber);}
    public void updateAddress(String city, String street, int postOfficeNumber) {
        if (city != null && !city.isBlank()) {
            this.city = city;}
        if (street != null && !street.isBlank()) {
            this.street = street;}
        if (postOfficeNumber > 0) {
            this.postOfficeNumber = postOfficeNumber;}
    }
    @Override
    public String toString() {
        return String.format("м. %s, вул. %s, відд. №%d", city, street, postOfficeNumber);}
}