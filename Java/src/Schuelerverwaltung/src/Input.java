import java.awt.event.KeyListener;

public class Input implements KeyListener{
    GUI internGUI;

public Input() throws Exception{
}

public Input(GUI pInternGUI) throws Exception{
    internGUI = pInternGUI;
}

public void option1_1(GUI pGui){

    if (pGui.option[0].isVisible() == true){
        pGui.texarea.setText(null);
        pGui.texarea.setVisible(true);
        pGui.confirmButton.setVisible(true);
        pGui.randomButton.setVisible(true);
        pGui.eRandomButton.setActionCommand("RandomName");
        pGui.confirmButton.setActionCommand("ConfirmCardName");
        pGui.sec_Image.setVisible(false);
        pGui.option[0].setVisible(false);
        pGui.optionI[0].setVisible(false);
        pGui.option[1].setVisible(false);
        pGui.optionI[1].setVisible(false);
        pGui.option[2].setVisible(false);
        pGui.optionI[2].setVisible(false);
        pGui.option[3].setVisible(false);
        pGui.optionI[3].setVisible(false);
        pGui.option[4].setVisible(false);
        pGui.optionI[4].setVisible(false);
        pGui.option[5].setVisible(false);
        pGui.optionI[5].setVisible(false);
        pGui.infoText.setVisible(true);
        pGui.infoText.setText("Name eingeben (4-20 Charakter)");
        pGui.backB.setVisible(true);
        pGui.backB.setActionCommand("backB_0");    
    }
}
@Override

    public void keyPressed(java.awt.event.KeyEvent k){
        switch(k.getKeyChar()){
            case '1': System.out.println("1"); option1_1(internGUI);break;
        }
    }
    public void keyReleased(java.awt.event.KeyEvent k){

    }

    public void keyTyped(java.awt.event.KeyEvent k){
        System.out.println(k.getKeyChar());
    }



}
