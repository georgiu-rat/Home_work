package semester1.practice08;

public class Gamer {
    private String nickname;
    private int hoursPlayed;
    Gamer(String nickname,int hoursPlayed){
        this.hoursPlayed=hoursPlayed >= 0 ? hoursPlayed : 0;;
        this.nickname=nickname;
    }
    public String getNickname() {
        return nickname;
    }
    @Override
    public String toString() {
        return String.format("Гравець: %s | Зіграно годин: %d", nickname, hoursPlayed);
    }
}
class ProEsportsPlayer extends Gamer{
    private String teamName;
    private double prizeMoneyUSD;
    private int tournamentsWon;

    ProEsportsPlayer(String nickname,int hoursPlayed,String teamName,double prizeMoneyUSD,int tournamentsWon){
        super(nickname,hoursPlayed);
        this.prizeMoneyUSD = prizeMoneyUSD >= 0.0 ? prizeMoneyUSD : 0.0;
        this.tournamentsWon = tournamentsWon >= 0 ? tournamentsWon : 0;
        this.teamName=teamName;
    }
    public double getAveragePrizePerWin() {
        if (tournamentsWon == 0) {
            return 0.0;
        }
        return prizeMoneyUSD / tournamentsWon;
    }
    @Override
    public String toString() {
        return super.toString() + String.format(" | Команда: %s | Виграно турнірів: %d | Призові: $%.2f | Сер. виграш: $%.2f",
                teamName, tournamentsWon, prizeMoneyUSD, getAveragePrizePerWin());
    }
}
