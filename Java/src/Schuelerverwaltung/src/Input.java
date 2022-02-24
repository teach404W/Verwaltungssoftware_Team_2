import java.awt.event.KeyListener;

public class Input implements KeyListener{

public Input() throws Exception{
}

public void option1_1(){

    if (GUI.option_1.isVisible() == true){
        GUI.texarea.setText(null);
        GUI.texarea.setVisible(true);
        GUI.confirmButton.setVisible(true);
        GUI.randomButton.setVisible(true);
        GUI.eRandomButton.setActionCommand("RandomName");
        GUI.confirmButton.setActionCommand("ConfirmCardName");
        GUI.sec_Image.setVisible(false);
        GUI.option_1.setVisible(false);
        GUI.option_1_Image.setVisible(false);
        GUI.option_2.setVisible(false);
        GUI.option_2_Image.setVisible(false);
        GUI.option_3.setVisible(false);
        GUI.option_3_Image.setVisible(false);
        GUI.option_4.setVisible(false);
        GUI.option_4_Image.setVisible(false);
        GUI.option_5.setVisible(false);
        GUI.option_5_Image.setVisible(false);
        GUI.option_6.setVisible(false);
        GUI.option_6_Image.setVisible(false);
        GUI.infoText.setVisible(true);
        GUI.infoText.setText("Name eingeben (4-20 Charakter)");
        GUI.backB.setVisible(true);
        GUI.backB.setActionCommand("backB_0");    
    }
}
@Override

    public void keyPressed(java.awt.event.KeyEvent k){
        switch(k.getKeyChar()){
            case '1': System.out.println("1"); option1_1();break;
        }
    }
    public void keyReleased(java.awt.event.KeyEvent k){

    }

    public void keyTyped(java.awt.event.KeyEvent k){
        System.out.println(k.getKeyChar());
    }



}
