package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


    }

    public static void drakeEquation(){
/*Drake equation
N = number of intelligent species that can communicate with us
R∗ = 1 yr−1 (1 star formed per year, on the average over the life of the galaxy; this was regarded as conservative)
fp = 0.2 to 0.5 (one fifth to one half of all stars formed will have planets)
ne = 1 to 5 (stars with planets will have between 1 and 5 planets capable of developing life)
fl = 1 (100% of these planets will develop life)
fi = 1 (100% of which will develop intelligent life)
fc = 0.1 to 0.2 (10–20% of which will be able to communicate)
L = 1000 to 100,000,000 years (which will last somewhere between 1000 and 100,000,000 years)
 */





int N;
int rStar;
double fp;
int numberOfExoPlanets;
double fl;
double fi;
double fc;
int L;


Scanner keyboard;
keyboard = new Scanner (System.in);


System.out.println("How many stars have been formed (1 per year)");
rStar = keyboard.nextInt();

System.out.println("Give a fraction between 1/5 and 1/2, 1/5 to 1/2 of all stars will have planets");
fp = keyboard.nextInt();

System.out.println("give a number 1-5 (per star there will be 1-5 planets capable of developing life)");
numberOfExoPlanets = keyboard.nextInt();

System.out.println("give a fraction where those planets will develop life");
fl = keyboard.nextInt();

System.out.println("Give a fraction of those living species will develop intelligence");
fi = keyboard.nextInt();



N = rStar * fp * numberOfExoPlanets * fl *fi * fc * L;


System.out.println("The number of intelligent species that are out there that can communicate with us is: " + N);







    }

}
