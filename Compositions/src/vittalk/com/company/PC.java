package vittalk.com.company;

import com.sun.java.swing.plaf.motif.MotifBorders;

public class PC {
    //entire PC is called composition
    private Case theCase;
    private Monitor monitor;
    private MotherBoard motherBoard;

    public PC(Case theCase, Monitor monitor, MotherBoard motherBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }
    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }
    private void drawLogo(){
        //fancy graphics
        this.monitor.drawPixelAt(1250,1200,"yellow");
    }
}

