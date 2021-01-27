public class snakes_ladder{
   private void play(){
      System.out.println("Snack and Ladder game played with single player at starts with position 0");
      int rolls=(int) (Math.floor(Math.random()*10 % 6 + 1));
      System.out.println("rolls"+ rolls);
	}
   public static void main(String[] args){
      snakes_ladder game = new snakes_ladder();
      game.play();
   }
}
