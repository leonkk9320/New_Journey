package JavaSE.Oct26.Demo03SendRedPacket;

import java.util.ArrayList;

public class RedPacketMain {
    public static void main(String[] args) {
        Host host = new Host("Leonkk", 1000);
        Receiver aguero = new Receiver("Aguero", 0);
        Receiver deBruyne = new Receiver("DeBruyne", 0);
        Receiver torres = new Receiver("Torres", 0);

        host.show();
        aguero.show();
        deBruyne.show();
        torres.show();

        System.out.println("============");

        ArrayList<Integer> redList = host.send(500,17);
        aguero.receive(redList);
        deBruyne.receive(redList);
        torres.receive(redList);

        host.show();
        aguero.show();
        deBruyne.show();
        torres.show();
    }
}
