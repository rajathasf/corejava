package packageone;

import packagetwo.TankViewer;

public class TankMain {
    public static void main(String[] args) {
        Tank tank = new Tank();

        TankOperator operator = new TankOperator();
        operator.prepareTank(tank); // uses setters and getters

        TankViewer viewer = new TankViewer();
        viewer.viewTankDetails(tank); // uses only getters
    }
}
