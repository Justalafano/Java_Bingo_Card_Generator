import java.util.ArrayList;
import java.util.Random;

public class BingoCardGenerator {

   public static void main(String[] args) {

      Random rand = new Random();
      int randNum = 0;
      int numSelect = 0;

      //Table used to display bingo numbers
      int[][] bingCard = new int[5][5];

      //List used to limit value range for each column of Bingo card.
      ArrayList<Integer> column = new ArrayList<Integer>();

      //Outer loop to move through each column of Bingo card.
      for (int a = 0; a < bingCard.length; a++) {
         
         // add values to column list.
         for (int i = 1 + 15 * a; i < 16 + 15 * a; i++) {
            
            column.add(i);
         
         }

         //Generate random number to select value from column list. Add that value to bingCard.
         for (int r = 0; r < bingCard[0].length; r++) {
            
            randNum = rand.nextInt(column.size());
            numSelect = column.get(randNum);
            bingCard[r][a] = numSelect;
            column.remove(randNum);
         
         }

         column.clear();

      }

      //Finishing steps for bingo card, and print card out.
      bingCard[2][2] = 0;

      System.out.println("B  I  N  G  O");

      for(int a = 0; a < bingCard.length; a++) {
         
         for (int i = 0; i < bingCard.length; i++) {
            
            if(bingCard[a][i] < 10){
            
            System.out.print(bingCard[a][i] + "  ");
            
            }
            
            else{
            
            System.out.print(bingCard[a][i] + " ");
            
            }
         
         }

      System.out.println();
      
      }
   
   }

}