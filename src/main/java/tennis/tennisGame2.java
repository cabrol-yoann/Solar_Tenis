package tennis;

public class tennisGame2 implements TennisGame
{
    public int P1point = 0;
    public int P2point = 0;
    
    public String P1res = "";
    public String P2res = "";
    private String player1Name;
    private String player2Name;

    public tennisGame2(String player1Name, String player2Name) {
        this.player1Name = player1Name;
        this.player2Name = player2Name;
    }

    public String getScore(){
        String score = "";
        setScore();



        if (P1point == P2point && P1point < 4)
        {
            if (P1point==0)
                P1res = "Love";
            score = P1res +"-All";
        }

        if (P1point > 0 && P2point==0)
        {
            P2res = "Love";
            score = P1res + "-" + P2res;
        }
        if (P2point > 0 && P1point==0)
        {
            P1res = "Love";
            score = P1res + "-" + P2res;
        }

        if (P1point>P2point && P1point < 4)
        {
            score = P1res + "-" + P2res;
        }
        if (P2point>P1point && P2point < 4)
        {
            score = P1res + "-" + P2res;
        }

        if (P1point==P2point && P1point>=3)
            score = "Deuce";

        if (P1point > P2point && P2point >= 3)
        {
            score = "Advantage player1";
        }
        
        if (P2point > P1point && P1point >= 3)
        {
            score = "Advantage player2";
        }
        
        if (P1point>=4 && P2point>=0 && (P1point-P2point)>=2)
        {
            score = "Win for "+player1Name;
        }
        if (P2point>=4 && P1point>=0 && (P2point-P1point)>=2)
        {
            score = "Win for "+player2Name;
        }
        return score;
    }
    
    public void P1Score(){
        P1point++;
    }
    
    public void P2Score(){
        P2point++;
    }

    public void wonPoint(String player) {
        if (player.equals("player1"))
            P1Score();
        else
            P2Score();
    }

    public void setScore() {
        switch (P1point) {
            case 1:
                P1res="Fifteen";
                break;
            case 2:
                P1res="Thirty";
                break;
            case 3:
                P1res="Forty";
                break;
            default:
                P1res="";
                break;
        }
        switch (P2point) {
            case 1:
                P2res="Fifteen";
                break;
            case 2:
                P2res="Thirty";
                break;
            case 3:
                P2res="Forty";
                break;
            default:
                P2res="";
                break;
        }
    }
}