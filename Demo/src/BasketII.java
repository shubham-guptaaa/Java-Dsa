import java.util.Arrays;
public class BasketII {

    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        Arrays.sort(fruits);   // Sort fruits in increasing order
        Arrays.sort(baskets);  // Sort baskets in increasing order

        int i = 0, j = 0;  // Pointers for fruits and baskets
        int n = fruits.length, m = baskets.length;

        while (i < n && j < m) {
            if (fruits[i] <= baskets[j]) {
                i++;  // Place fruit in this basket
            }
            else{
            j++; 
            } // Move to the next basket (even if fruit is not placed)
        }

        return n-i;  // Number of unplaced fruits
    }
    
        public static void main(String[] args) {
            BasketII sol = new BasketII();
            
            int[] fruits1 = {4, 2, 5};
            int[] baskets1 = {3, 5, 4};
            System.out.println(sol.numOfUnplacedFruits(fruits1, baskets1)); // Output: 1
            
            int[] fruits2 = {3, 6, 1};
            int[] baskets2 = {2, 4, 7};
            System.out.println(sol.numOfUnplacedFruits(fruits2, baskets2)); // Output: 0
        }      
}
