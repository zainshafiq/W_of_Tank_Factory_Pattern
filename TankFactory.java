
package ENSE470_Lab1;

public class TankFactory {

    public static Tank makeBuildTank(String newTankType) {

            Tank newTank = null;

            if(newTankType.equals("EinsTank")) {
                    return new einsTank("Punisher", "Germany", 10, 100, 20,$
            }

            else if(newTankType.equals("ZweiTank")) {
                    return new zweiTank("Great Gatsby", "United Kingdom", 2$
            }

            else if(newTankType.equals("DreiTank")) {
                    return new dreiTank("Fluffy", "Japan", 20, 90, 15, 100);
            }
            
            else if(newTankType.equals("FunfTank")) {
                return new funfTank("Palach", "Mother Russia", 10, 100,$
        }

        else if(newTankType.equals("VierTank")) {
                return new vierTank("Average Mike", "America", 10, 100,$
        }

        else
                return null;

    }
}

