
package ENSE470_Lab1;

import java.util.Scanner;

public class L01zainuddm {

        public static void main(String[] args) {

                TankFactory TankFactory = new TankFactory();

                System.out.println("\nWelcome to the World of Tanks! \n");

                Tank firstTank = TankFactory.makeBuildTank("EinsTank");

                if(firstTank.currentHealth > 0) {
                        firstTank.receiveHit(500, 200);
                }

                Tank secondTank = TankFactory.makeBuildTank("ZweiTank");
                
                if(secondTank.currentHealth > 0) {
                    secondTank.receiveHit(50, 70);
            }

            Tank thirdTank = TankFactory.makeBuildTank("DreiTank");

            if(thirdTank.currentHealth > 0) {
                    thirdTank.receiveHit(100, 20);
            }

            Tank fourthTank = TankFactory.makeBuildTank("VierTank");

            if(fourthTank.currentHealth > 0) {
                    fourthTank.receiveHit(550, 70);
            }

            Tank fifthTank = TankFactory.makeBuildTank("FunfTank");
            
            if(fifthTank.currentHealth > 0) {
                fifthTank.receiveHit(500, 500);
            }
        }
}





		



