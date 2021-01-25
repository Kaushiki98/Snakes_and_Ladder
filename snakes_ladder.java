public class snakes_ladder{

   private void play(){
      System.out.println("Snack and Ladder game played with single player at starts with position 0");

		int up = 0;
		while(up<100)
		{
	   int rolls=(int) (Math.floor(Math.random()*10 % 6 + 1));
      System.out.println("rolls"+ rolls);

		int step=(int) (Math.random()*rolls % 3);

		if (step == 0){
         System.out.println("no play player stays in the same place");
      }
      else if(step == 1){
         System.out.println("Ladder: player moves ahead");
         up++;
			System.out.println(" Player is in: " + up + " position ");
      }
      else if(step == 2){
         System.out.println("Snake: player should move back");
         up--;
			System.out.println(" player is in: " + up + " position ");
      }
      else{
         System.out.println("Snake: player should move back");
      }
	}
}
   public static void main(String[] args){
      snakes_ladder game = new snakes_ladder();
      game.play();
   }
}
