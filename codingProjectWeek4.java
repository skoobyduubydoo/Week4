package src;

import java.util.*;

public class codingProjectWeek4 
{
//public class RandomArray {

public static void main(String[] args) 
{

//////////////////////////////TASK////////////////////////////////

System.out.println("\n1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93:");
    int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; //Creates array of integers called "ages". Assigns values to it.
        for (int number : ages) //For-loop iterates through array "ages" and attaches the values found to integer variable "number"...
{
            System.out.print(number + ", "); //...Then prints the values from for-loop with comma and a space after each.
                                             //Used print instead of println because println would print array as column not line. For readability.
}
//////////////////////////////TASK////////////////////////////////

System.out.println("\n\n2. Programmatically subtract the value of the first element in the array from the value in the last element of the array. Print the outcome to the console:"); 
        int agesVal2LessVal1 = ages[ages.length - 1] - ages[0]; //Creates variable "agesVal2LessVal1" of type "int". Subtracts value at position 0 of array... 
                                                            //..."ages" from last value of "ages". (length - 1 because indecies start at 0)
        
    System.out.println(agesVal2LessVal1); //Prints variable "agesVal2LessVal1".
    
//////////////////////////////TASK////////////////////////////////

System.out.println("\n3. Create a new array of int called ages2 with 9 elements:");
    int[] ages2 = new int [9]; //Creates array "ages2" of type int. Tells system "ages2" is a new array of type int with 9 values.
    System.out.println(Arrays.toString(ages2)); //Prints arary "ages2" as a string for readability.

//////////////////////////////TASK////////////////////////////////

System.out.println("\n4. Make sure that there are 9 elements of type int in this new array:");
    for(int i = 1; i <= ages2.length; i++) //Creates for-loop to iterate through array "ages2". Initializes loop index at "1". Loop will iterate number of times...
                                           //... equal to length of "ages2".
{
    System.out.print(i + ", "); //Prints each iterated loop index value followed by comma and space.
}
//////////////////////////////TASK////////////////////////////////

System.out.println("\n\n5. Programmatically subtract the value of the first element in the new array ages2 from the last element of ages2:"); 
    int ages2Val2LessVal1 = ages2[ages2.length - 1] - ages2[0]; //Creates variable "ages2Val2LessVal1". Sets equal to outcome of (value at position 0 minus...
                                                                //...last value of "ages2".

    System.out.println(ages2Val2LessVal1); //Prints variable "ages2Val2LessVal1".

//////////////////////////////TASK////////////////////////////////

System.out.println("\n6. Show that using the index values for the elements is dynamic (works for arrays of different lengths):");
    for(int i = 1; i <= ages2.length + 1; i++) //Creates for-loop to iterate through "ages2". Initialzes index iteration at 1. Loop will run number of times...
                                               //...equal to length of "ages2" plus 1 (to display variability). 
{
    System.out.print(i + ", "); //Prints each iteration with comma and space. Used print instead of println to print values as line instead of column.
}

//////////////////////////////TASK////////////////////////////////

System.out.println("\n\n7. Use a loop to iterate through the array and calculate the average age. Print the theWord to the console:");
    int sum = 0; //Creates variable "sum" of type "int". Set equal to 0.
    for (int age : ages) //Creates for-loop and variables "age", "ages". Loop takes value of "age" in "ages"...
{ 
    sum = sum + age; //...and adds it to "sum".
}
    double average = (double) sum / ages.length; //Creates variable "average" of type "double". Sets equal to variable "sum" divided by length of variable...
                                                 //..."ages".
    System.out.println("Answer: " + average); //Prints to console

//////////////////////////////TASK////////////////////////////////

System.out.println("\n8. Create an array of String called names that contains the following values: 'Sam', 'Tommy', 'Tim', 'Sally', 'Buck', 'Bob':");
    String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; //Creates array named "names" with values of type "string"
    System.out.println(Arrays.toString(names)); //Prints array

//////////////////////////////TASK////////////////////////////////

System.out.println("\n9. Use a loop to iterate through the array and calculate the average number of letters per name. Print the theWord to the console:");
    int letters = 0; //Creates variable "letters" of type "int". Sets equal to 0
    for(String name : names) //Creates for-loop and variables "name", "names" of type "string".
                             //Loop will take values of "name" in "names"...
{
    letters = letters + name.length(); //...and set each value equal to the value of the length of "name" plus "letters".
}
    double averageLetter = (double)letters / names.length;//Creates variable "averageLetter" of type "double". Sets equal to value of variable "letters" of...
                                                          //...type "double" divided by length of "names".
    System.out.println(averageLetter);

//////////////////////////////TASK////////////////////////////////

System.out.println("\n10. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the theWord to the console:");
    for (String name : names) //Creates for-loop which takes value of variable "name" of type "string" in "names"...
{
    System.out.print(name + " ");//...and prints it with blank space after each name.
}

//////////////////////////////TASK////////////////////////////////

System.out.println("\n\n11. How do you access the last element of any array?:");
    System.out.println(names[names.length -1]); //To exclusively access the last element of an array.  

//////////////////////////////TASK////////////////////////////////

System.out.println("\n12. How do you access the first element of any array?:");
    System.out.println(names[0]); //To exclusively access the first element of an array.

//////////////////////////////TASK////////////////////////////////

System.out.println("\n13. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array:");
    int[] nameLengths = new int [names.length]; //Creates array "nameLengths" of type "int". Sets size of array equal length of names array.

    for (int i = 0; i < names.length; i++) //Creates for-loop to iterate through "names" array using basic index value.
{
    nameLengths[i] = names[i].length(); //Uses index value to calculate length of "name" in "names" using ".length()" operator. Stores value of calculation...
                                        //...in variable "nameLengths" array.
}
    for (int length : nameLengths) //Creates for-loop that takes variable "length" of type "int" in "nameLengths" array...
{
    System.out.print(length + ", "); //...and prints it with comma and space after each iteration. Note the use of print instead of println. 
}
//////////////////////////////TASK////////////////////////////////

System.out.println("\n\n14. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the theWord to the console:");
    int arraySum = 0; //Creates variable "arraySum". Sets equal to 0.
    for (int lengthNum : nameLengths) //Creates for-loop and variable "lengthNum" of type "int". Takes "lengthNum" in "nameLengths"...
{   
    arraySum = arraySum + lengthNum; //...and adds it to "arraySum".
}
    System.out.println(arraySum); //Prints "arraySum"
//////////////////////////////TASK////////////////////////////////
/*
System.out.println("\n15. Write a method that takes a String, word, and an int, n, as arguments and returns the word myString to itself n number of times."); 

        String theWord = toPrint("Ho, ", 3); //Creates variable "theWord" and assigns results to be returned by method "toPrint".
        System.out.println(theWord); //after the program creates and assigns variables, the string "Ho, " will be printed "n" times.
}
                                                     //Within the "toPrint" method...   
    public static String toPrint(String word, int n) //Creates a string method "toPrint" and assigns "word" of type "string" and "n" of type "int".
{
        StringBuilder myString = new StringBuilder(); //Uses the operator "StringBuilder()" and variable "myString" to concatenate the string "Ho, ".

        for (int i = 0; i < n; i++) //Creates a for-loop which will iterate "n" times.
{
        myString.append(word); //Will add a value of "word" to "myString" with each iteration of the for loop. 
}

        return myString.toString(); //Converts "myString" to a "string" type and returns the values associated with "myString" as a string.
}
*/
//////////////////////////////TASK////////////////////////////////

/*
System.out.println("\n16. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space):");

    String firstName = "John" + " "; //Creates a string variable of "John" called "firstName" with a blank space.
    String lastName = "Doe"; //Creates a string variable of "Doe" called "lastName".

        String theNames = bothNames(firstName, lastName); //Creates a string variable named "bothNames". When called, it will return "theNames" which contains the arguements...
                                                          //...firstName and lastName
        System.out.println(theNames); 
}
   
    static String bothNames(String firstName, String lastName) //Creates a string method "bothNames" and assigns firstName and lastName, of typer string, to it.
{

        return firstName + lastName; //Returns the values of firstName and lastName
}
*/
//////////////////////////////TASK////////////////////////////////

/*
System.out.println("\n17. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100:");

    int[] array = {3, 9, 23, 64, 2, 8, 28, 93}; //Creates array type called "ages" and assigns values to it.

    System.out.println("The array is:"); //Output for program readability.
    for (int num : array) //For variable "number" of type int in array ages...
{
        System.out.print(num + ", "); //...prints comma and space with each iterated variable "number". 
                                      //Used print instead of println because println would print array as column not line. For readability.
}
    
    boolean output = whatTheSum(array); //Declares a boolean variable named "whatTheSum". When called, it will return "output" which contains the arguement of array.
        System.out.println("\n\nThe answer is:\n" + output); 
}                                      
                      
    static boolean whatTheSum(int[] array) //Creates a static boolean method called "whatTheSum" and assigns "array" of integers to it as a parameter.
{
    int sum = 0;                            // ----------------------------------------------------------------------
{                                           //This for-loop iterates through the array, adds the integers together...
        for (int num : array)               //... and checks if the sum total is more or less than 100.
            sum = sum + num;                // ----------------------------------------------------------------------
}
        return sum > 100; //After the for-loop completes, a boolean result is returned (true if greater than 100). 
}
*/

//////////////////////////////TASK////////////////////////////////
/*

System.out.println("\n18. Write a method that takes an array of double and returns the average of all the elements in the array:");

                           // I decided to experiment with this program and add randomization to it.

 int arrayLength = 4; //Creates an array of integers with a length of 4 values. 
        double[] randomArray = randomIsGood(arrayLength); //Creates an array named "randomArray" of type "double" and assigns to it "randomIsGood" with "arrayLength" as an arguement.
        System.out.println("Random array:"); //For program readability.

        for (double num : randomArray) //Creates a for-loop which iterates through "randomArray"...
{
            System.out.print(num + ", "); //...and prints each "num" with a comma and space after. Print instead of println for single line output.
}
        System.out.println("\n\nThe array average is:"); //For program readability.
        double aver = calcTheAver(randomArray); //Calls on the "calcTheAver" method and assigns "aver" to it.
        System.out.println(aver); //Prints the result of "calcTheAver" method.
}

    static double[] randomIsGood(int length) //Declares a method named "randomIsGood" of type "double" which takes the integer value of "length" and returns an array of "double" values.
{
        double[] randomArray = new double[length]; //Applies a specific length to the array "randomArray" of type "double".
        Random random = new Random(); //Creates a class which in turn creates the random values.

        for (int i = 0; i < length; i++)          //--------------------------
{                                                 //This for-loop iterates through "randomArray" and assigns a number of random "double" values to it equal to the length of the array (i.e 6).
            randomArray[i] = random.nextDouble(); //--------------------------
}

        return randomArray; //After the ranomized array is created, this line returns it.
}

    static double calcTheAver(double[] array) //Declares a method containing an array of "doubles" called "calcTheAver" which will return a "double" value.
{
        double sum = 0; //Creates a variable called "sum" of type "double"
        for (double num : array)              //---------------------
{                                             //This for-loop iterates through "array" and adds each value to the value of "sum".  
            sum = sum + num;                  //---------------------  
}
        return sum / array.length; //After the for-loop adds the array values together, this line divides that value by the length of the array thereby calculating the average value of the array.
*/

//////////////////////////////TASK////////////////////////////////
/*

System.out.println("\n19. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array:");

    int arrayLength = 3; //Creates an array of integers with a length of 3 values. 
        double[] firstArray = randomIsGood(arrayLength); //Creates an array named "randomArray" of type "double" and assigns to it "randomIsGood" with "arrayLength" as an arguement.
        System.out.println("First array:"); //For program readability.

        for (double num : firstArray) //Creates a for-loop which iterates through "randomArray"...
{
            System.out.print(num + ", "); //...and prints each "num" with a comma and space after. Print instead of println for single line output.
}
        System.out.println("\n\nThe first array average is:"); //For program readability.
        double aver = calcTheAver(firstArray); //Calls on the "calcTheAver" method and assigns "aver" to it.
        System.out.println(aver + "\n"); //Prints the result of "calcTheAver" method.

///////Second Array///////////

    int arrayTwoLength = 3; //Creates an array of integers with a length of 4 values. 
        double[] secondArray = randomIsStillGood(arrayTwoLength); //Creates an array named "randomArray" of type "double" and assigns to it "randomIsGood" with "arrayLength" as an arguement.
        System.out.println("Second array:"); //For program readability.

        for (double num : secondArray) //Creates a for-loop which iterates through "randomArray"...
{
            System.out.print(num + ", "); //...and prints each "num" with a comma and space after. Print instead of println for single line output.
}
        System.out.println("\n\nThe second array average is:"); //For program readability.
        double secAver = calcTheSecAver(secondArray); //Calls on the "calcTheAver" method and assigns "aver" to it.
        System.out.println(secAver + "\n"); //Prints the result of "calcTheAver" method.
        
        boolean whichAverGreater = aver > secAver; //Creates a boolean variable "whichAverGreater" and asks the question "is aver greater than secAver"?.
        System.out.println("\nThe average of the first array is greater than the average of the second array");
        System.out.println(whichAverGreater); //Outputs the result of the greater than/ less than boolean operation.
}


    static double[] randomIsGood(int length) //Declares a method named "randomIsGood" of type "double" which takes the integer value of "length" and returns an array of "double" values.
{
        double[] firstArray = new double[length]; //Applies a specific length to the array "randomArray" of type "double".
        Random random = new Random(); //Creates a class which in turn creates the random values.

        for (int i = 0; i < length; i++)          //--------------------------
{                                                 //This for-loop iterates through "randomArray" and assigns a number of random "double" values to it equal to the length of the array (i.e 6).
            firstArray[i] = random.nextDouble(); //--------------------------
}

        return firstArray; //After the ranomized array is created, this line returns it.
}

    static double calcTheAver(double[] array) //Declares a method containing an array of "doubles" called "calcTheAver" which will return a "double" value.
{
        double sum = 0; //Creates a variable called "sum" of type "double"
        for (double num : array)              //---------------------
{                                             //This for-loop iterates through "array" and adds each value to the value of "sum".  
            sum = sum + num;                  //---------------------  
}
        return sum / array.length; //After the for-loop adds the array values together, this line divides that value by the length of the array thereby calculating the average value of the array.
}
//---------------------------------------------------------------Array Two-------------------------------------------------------------

    static double[] randomIsStillGood(int length) //Declares a method named "randomIsGood" of type "double" which takes the integer value of "length" and returns an array of "double" values.
{
        double[] secondArray = new double[length]; //Applies a specific length to the array "randomArray" of type "double".
        Random random = new Random(); //Creates a class which in turn creates the random values.

        for (int i = 0; i < length; i++)          //--------------------------
{                                                 //This for-loop iterates through "randomArray" and assigns a number of random "double" values to it equal to the length of the array (i.e 6).
            secondArray[i] = random.nextDouble(); //--------------------------
}

        return secondArray; //After the ranomized array is created, this line returns it.
}

    static double calcTheSecAver(double[] array) //Declares a method containing an array of "doubles" called "calcTheAver" which will return a "double" value.
{
        double sum = 0; //Creates a variable called "sum" of type "double"
        for (double num : array)              //---------------------
{                                             //This for-loop iterates through "array" and adds each value to the value of "sum".  
            sum = sum + num;                  //---------------------  
}
        return sum / array.length; //After the for-loop adds the array values together, this line divides that value by the length of the array thereby calculating the average value of the array.
*/


//////////////////////////////TASK////////////////////////////////
/*
System.out.print("\n20. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket and returns true if it is hot outside and if moneyInPocket is greater than 10.50:");
        
    Scanner scanner = new Scanner(System.in);                         ///////////////////////////////////////////Block 1/////////////////////////////////////////////////////////////////

    System.out.println("What is the current outdoor temperature?:");
    boolean isHotOutside = getTemperature(scanner);                     

    System.out.println("How much money do you have?:");             ////////////////////////This block asks questions for user input of temperature and money-on-hand...///////////////////////////////
    double moneyInPocket = getMoneyInPocket(scanner);                                               //...and will output whether "willBuyDrink" is true or false.

    boolean willBuyDrink = willBuyDrink(isHotOutside, moneyInPocket); 
    System.out.println("Will buy a drink: " + willBuyDrink);

    scanner.close();                                                 ///////////////////////////////////////////Block 1/////////////////////////////////////////////////////////////////
}


    static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) ////////////////////////////////////Block 2 establishes parameters and checks for them to be true///////////////////
{                                                                                               
                                                                            
        return isHotOutside && moneyInPocket > 10.50; ////////This line establishes a boolean requirement for "moneyInPocket" and "temperature" to be true for "willBuyDrink" to be true/////////////                      
}                                                                           /////"moneyInPocket" must be at least 10.50.///////////////

    static boolean getTemperature(Scanner scanner)                          ////////////////////////////////////Block 2///////////////////////////////////////////////////////////////////

{
        while (true) 
{
            System.out.println("Enter the outdoor temperature:");       ////////////////If "temperature" input is 70 or greater, "isHotOutside" will return true///////////////////////////
            if (scanner.hasNextInt()) 
{
                int temperature = scanner.nextInt();
                return temperature >= 70;                                  
}           else 
{
                System.out.println("Invalid input. Please enter a whole integer.");/////////////////This method checks for valid "integer" input////////////////////////////////
                scanner.next();                                            
}
}                                                                           
}                                                                           ////////////////////////////////////Block 2///////////////////////////////////////////////////////////////////

    static double getMoneyInPocket(Scanner scanner)                         
{
        while (true) 
{
            System.out.println("Enter the amount of money in your pocket:");    ///////////////This method block checks parameters for money.///////////////////////////////////
            if (scanner.hasNextDouble()) 
{
                return scanner.nextDouble();
}           else                                                               /////////////////////////If "moneyInPocket" is 10.50 or greater, "moneyInPocket" will return true//////////////
{
                System.out.println("Invalid input. Please enter a valid decimal number.");
                scanner.next(); 
}                                                                               //////////////////////This method checks for valid "double" inputs.//////////////////////////////////////////
}
                                                                                /////////////////////////////Block 2/////////////////////////////////////////////////////////////////////////

*/

//////////////////////////////TASK////////////////////////////////
/*
System.out.println("\n21. Create a method of your own that solves a problem. In comments, write what the method does and why you created it:");

     Scanner scanner = new Scanner(System.in);

        
        List<String> deck = initializeDeck();
        Collections.shuffle(deck);

        
        List<String> userHand = dealCards(deck);
        List<String> dealerHand = dealCards(deck);

        
        System.out.println("Welcome!\n The Game is 21 Blackjack.\nGood Luck!\n");
        System.out.println("Your hand: " + userHand);
        System.out.println("Dealer's hand: " + dealerHand.get(0) + " and [Hidden]");

     
        userTurn(scanner, deck, userHand);

        
        dealerTurn(deck, dealerHand);

        
        whoWon(userHand, dealerHand);

        scanner.close();
}

    private static List<String> initializeDeck() 
{
        List<String> deck = new ArrayList<>();
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String rank : ranks) 
{
            deck.add(rank);
}

        
        for (int i = 0; i < 3; i++) 
{
            deck.addAll(List.copyOf(deck));
}

        return deck;
}

    private static List<String> dealCards(List<String> deck) 
{
        List<String> hand = new ArrayList<>();
        for (int i = 0; i < 2; i++) 
{
            hand.add(deck.remove(0));
}
        return hand;
}

    private static void userTurn(Scanner scanner, List<String> deck, List<String> userHand) 
{
        while (theHandValue(userHand) < 21) 
{
            System.out.println("Your hand: " + userHand);
            System.out.println("Your current total: " + theHandValue(userHand));
            System.out.print("Do you want to hit or stay? ");
            String choice = scanner.nextLine().toLowerCase();

            if ("hit".equals(choice)) 
{
                userHand.add(deck.remove(0));
} 
            else if ("stay".equals(choice)) 
{
                break;
} 
            else 
{
                System.out.println("Invalid choice. Please enter 'hit' or 'stay'.");
}
}
}

    private static void dealerTurn(List<String> deck, List<String> dealerHand) 
{
        while (theHandValue(dealerHand) < 17) 
{
            dealerHand.add(deck.remove(0));
}

        System.out.println("Dealer's hand: " + dealerHand);
        System.out.println("Dealer's total: " + theHandValue(dealerHand));
}

    private static int theHandValue(List<String> hand) 
{
        int value = 0;
        int numAces = 0;

        for (String card : hand) 
{
            if (card.equals("A")) 
{
                value += 11;
                numAces++;
} 
            else if (card.equals("K") || card.equals("Q") || card.equals("J")) 
{
                value += 10;
}           else 
{
                value += Integer.parseInt(card);
}
}

        while (value > 21 && numAces > 0) 
{
            value -= 10;
            numAces--;
}

        return value;
}

    private static void whoWon(List<String> userHand, List<String> dealerHand) 
{
        int userTotal = theHandValue(userHand);
        int dealerTotal = theHandValue(dealerHand);

        System.out.println("\nYour hand: " + userHand);
        System.out.println("Your total: " + userTotal);
        System.out.println("Dealer's hand: " + dealerHand);
        System.out.println("Dealer's total: " + dealerTotal);

        if (userTotal > 21 || (dealerTotal <= 21 && dealerTotal >= userTotal)) 
{
            System.out.println("\nSorry, you lose. Better luck next time!");
}  
        else
{
            System.out.println("\nCongratulations! You win!");

*/

}
}




