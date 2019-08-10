public class Hangman {
  public static void main(String[] args) {
    Game game = new Game("allen");
    Prompter prompter = new Prompter(game);
    prompter.displayProgress();
    boolean isHit = prompter.promptForGuess();
    if (isHit) {
      System.out.println("We got a hit!");
    } else {
      System.out.println("Oops missed");
    }
    prompter.displayProgress();
  }
}