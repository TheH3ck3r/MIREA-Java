public class Model {
  private Team Milan;
  private Team Madrid;

  private Team LastScorer;

  public Model() {
    Milan = new Team("Milan");
    Madrid = new Team("Madrid");
  }

  public void onMadridWin() {
    Madrid.IncreaseScore();
    LastScorer = Madrid;
  }

  public void onMilanWin() {
    Milan.IncreaseScore();
    LastScorer = Milan;
  }

  public String GetScore() {
    return "Result:  " + Milan.GetScore() + " X " + Madrid.GetScore() + "          " + GetLastScorer();
  }

  public String GetWinner() {
    if (Madrid.GetScore() == Milan.GetScore()) {
      return "Winner: DRAW";
    } else {
      return " Winner: " + (Madrid.GetScore() > Milan.GetScore() ? Madrid.GetName() : Milan.GetName());
    }
  }

  public String GetLastScorer() {
    return " Last Scorer: " + LastScorer.GetName();
  }
}
