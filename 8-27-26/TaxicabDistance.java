/**
 * TaxicabDistance
 * @author(V. Goyal)
 * @version (8/25/26)
*/
public class TaxicabDistance {
    static int startX = 1;
    static int startY = 1;
    static int distance = 2;

    
    public static void main(String[] args){
        for (int i = startX - distance; i <= startX + distance; i++) 
            for (int j = startY - distance; j <= startY + distance; j++) {
                if(getDistance(i, j) <= distance)
                    System.out.println("(" + i + "," + j + ")");
            }
    }


    public static int getDistance(int x, int y){
        return Math.abs(x - startX) + Math.abs(y - startY);
    }
}
