import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/


class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position

        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.

            if (lightX > initialTx) {
                System.out.println("E");
            } else if (lightY < initialTy) {
                System.out.println("N");


                // A single line providing the move to be made: N NE E SE S SW W or NW
                System.err.println("Tour restant : " + remainingTurns);
            }
        }
    }

    class Thor {
        public int initialTx;
        public int initialTy;
        public ThorPosition thorPosition;

        public Thor() {
            this.thorPosition = new ThorPosition(0, 0);

        }

        public static class ThorPosition {
            public int initialTX; // Position de Thor en X
            public int initialTY; // Position de Thor en Y

            public ThorPosition(int initialTX, int initialTY) {
                this.initialTX = Math.max(0, Math.min(40, initialTX)); // entre [0 : 40] sur les X
                this.initialTY = Math.max(0, Math.min(18, initialTY)); // entre [0 : 18] sur les Y

                System.err.println("Thor Position : " + initialTX + " ;" + initialTY);
            }
        }

    }

    class Eclair {
        public int lightX;
        public int lightY;
        public EclairPosition eclairPosition;

        public Eclair() {
            this.eclairPosition = new EclairPosition(0, 0);
        }

        public static class EclairPosition {
            public int lightX; // Position Eclair en X
            public int lightY; // Position Eclair en Y

            public EclairPosition(int lightX, int lightY) {
                this.lightX = Math.max(0, Math.min(40, lightX));
                this.lightY = Math.max(0, Math.min(18, lightY));

                System.err.println("EclairPosition : " + lightX + " ;" + lightY);
            }
        }


    }
}

