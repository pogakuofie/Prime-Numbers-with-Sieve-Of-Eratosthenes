/**
 * This program print all prime numbers within a selected range(1-100)
 */

//main class starts
public class SieveOfEratosthenes {

    //main method start
    public static void main(String[] args){

        boolean[] basket = new  boolean[100];//creates an boolean array of size 100

        //initialize elements of basket[] from index 2 to upper bounds of array to true
        for (int i = 2; i < 100; i++){

            basket[i] = true;
        }

        //loop through array starting form index 2 to the square root of the size of the array
        for (int j = 2; j < Math.sqrt(100); j++){

            //determines weather current array position is true
            if(basket[j] == true){

                //if current array position equals true then the loop goes through
                //the rest of the array setting the multiple of the current array
                //position to false
                for (int k = j * 2; k < 100; k += j){

                        basket[k] = false; //set array position to false
                }
            }
        }

        //loops through basket[] print array index which is now the prime number if the position is still true
        for (int m = 0; m < 100; m++){

            if(basket[m] == true) //determines if position equals true

                System.out.printf("%d ", m); //print of position
        }
    }//main methods ends
}//main class ends
