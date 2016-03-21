package comp110;

/**
 * "Programs must be written for people to read, and only incidentally for
 * machines to execute." - Harold Abelson
 * 
 * We're cleaning up our code from PS04 by writing helper methods that generate
 * each of our Scorelines. We're also writing helper methods to avoid duplicate
 * loop logic and converting our while loops to for loops.
 * 
 * @author <ONYEN>
 * @collaborators <ONYEN> // delete if none
 */
public class SpringCleanAlgo extends BasketballAlgo {

  /** Constructor */
  public SpringCleanAlgo() {
  }

  /** Methods */

  /**
   * This score method should have exactly the same Scorecard output as a
   * (correct) PS04 scorecard. We're just cleaning up our code.
   */
  public Scorecard score(Team away, Team home) {
    Scorecard scorecard = new Scorecard(away, home);

    scorecard.add(this.kButterFactor(away, home));

    return scorecard;
  }

  /** Helper Methods */

  private Scoreline kButterFactor(Team away, Team home) {
    double awayValue = away.getAssistTurnoverRatio() * 10.0;
    double homeValue = home.getAssistTurnoverRatio() * 10.0;
    return new Scoreline("KButter Factor", awayValue, homeValue);
  }

}