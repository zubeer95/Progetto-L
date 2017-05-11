package test;

import gui.MoneyTankFrame;
import gui.SwingFrame;
import machines.TicketMachine;

/**
 *
 * @author Manuele
 */
public class TestGUI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TicketMachine tm = new TicketMachine(0, "ipAddress");
        
        SwingFrame frame = new SwingFrame(tm);
        frame.setVisible(true);
        
        tm.printCoins();
        MoneyTankFrame moneyFrame = new MoneyTankFrame(tm);
        moneyFrame.setVisible(true);
    }
}
