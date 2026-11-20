package semester1.practice08;

public class CinemaHall {
    protected String hallName;
    protected boolean[][] seats;
    protected double baseTicketPrice;
    public CinemaHall(String hallName, int rows, int cols, double baseTicketPrice) {
        this.hallName = hallName;
        this.seats = new boolean[rows][cols];
        this.baseTicketPrice = baseTicketPrice;}
    public boolean bookSeat(int row, int col) {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length) {
            if (!seats[row][col]) {
                seats[row][col] = true;
                return true;}
        }
        return false;}
    public int getOccupiedCount() {
        int count = 0;
        for (boolean[] row : seats) {
            for (boolean isOccupied : row) {
                if (isOccupied) count++;
            }
        }
        return count;
    }
    public double calculateRevenue() {
        return getOccupiedCount() * baseTicketPrice;}
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("CinemaHall{name='%s', rows=%d, cols=%d, revenue=%.2f}\nСхема залу ([O] - вільно, [X] - зайнято):\n",
                hallName, seats.length, seats[0].length, calculateRevenue()));
        for (boolean[] row : seats) {
            for (boolean seat : row) {
                sb.append(seat ? "[X] " : "[O] ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}
class VipCinemaHall extends CinemaHall {
    private double complimentaryBarCost; // вартість напоїв для останнього ряду
    public VipCinemaHall(String hallName, int rows, int cols, double baseTicketPrice, double complimentaryBarCost) {
        super(hallName, rows, cols, baseTicketPrice);
        this.complimentaryBarCost = complimentaryBarCost;}
    @Override
    public double calculateRevenue() {
        if (seats.length == 0) return 0.0;
        double totalRevenue = 0.0;
        int lastRowIndex = seats.length - 1;
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c]) {
                    if (r == lastRowIndex) {
                        totalRevenue += (baseTicketPrice + complimentaryBarCost);
                    } else {
                        totalRevenue += baseTicketPrice;
                    }
                }
            }
        }
        return totalRevenue;
    }
    @Override
    public String toString() {
        return super.toString() + String.format("VipInfo{barCostPerVipTicket=%.2f, totalRevenueWithVip=%.2f}",
                complimentaryBarCost, calculateRevenue());
    }
}
