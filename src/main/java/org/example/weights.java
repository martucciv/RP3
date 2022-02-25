package org.example;
/* Veronica Martucci
 * COP3503 Spring 22
 * RP3 Kattis: Ternarian Weights
 */
import java.util.Arrays;
import java.util.Scanner;

public class weights {

    public static void main(String[] args) {

        Scanner stdin = new Scanner(System.in);

        int numTestCases;
        int remainingWeight;
        int chosenNum = 0;
        int[] rightWeights = new int[50];
        int[] leftWeights = new int[50];

        numTestCases = stdin.nextInt();

        int objWeight = 0;

        for(int i = 0; i < numTestCases; i++){

            objWeight = stdin.nextInt();
        }

        int i = 0;
        //find the closet number to objWeight that is less than or equal to objWeight and set it to choseNum
        while(chosenNum <= objWeight){

            chosenNum = (int)Math.pow(3, i);
            i++;
        }
        //Compare the closest number of base 3 that is lower and higher than objWeight
        //and keep the number that has the smaller difference
        if(objWeight - chosenNum >= chosenNum - (int)Math.pow(3, i)){
            chosenNum = (int)Math.pow(3, i);
            //place number in right weight
            rightWeights[0] = chosenNum;
        }
        else{
            //place number in left weight
            leftWeights[0] = chosenNum;
        }

        //If the chosen number is equal to the object weight, print out the result
        if(chosenNum == objWeight){

            print(leftWeights, rightWeights);
        }
        //if the chosen number is greater than the object weight, subtract to find the weight remaining
        else if(chosenNum > objWeight){

            remainingWeight = chosenNum - objWeight;

            //remaining weights will go in the left weight array
        }
        else{
            remainingWeight = objWeight - chosenNum;

            //remaining weight will go into the right weight array
        }

    }

    //print result
    private static void print(int[] leftWeights, int[] rightWeights) {

        //sort arrray
        Arrays.sort(leftWeights);

        System.out.print("left pan: ");
        for(int i = leftWeights.length - 1; i >=0; i--){

            System.out.print(leftWeights[i]);
        }

        //sort array
        Arrays.sort(rightWeights);

        System.out.print("right pan: ");
        for(int i = rightWeights.length - 1; i >=0; i--){

            System.out.print(rightWeights[i]);
        }
    }
}
