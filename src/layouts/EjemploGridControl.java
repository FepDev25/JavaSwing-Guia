package layouts;

import javax.swing.*;

public class EjemploGridControl {
    JTextArea area;
    double ANS = 0;
    boolean suma = false;
    boolean resta = false;
    boolean multi = false;
    boolean div = false;

    public EjemploGridControl(JTextArea area) {
        this.area = area;
    }

    public void action1(){
        String previo = this.area.getText();
        this.area.setText(previo+"1");
    }

    public void action2(){
        String previo = this.area.getText();
        this.area.setText(previo+"2");
    }

    public void action3(){
        String previo = this.area.getText();
        this.area.setText(previo+"3");
    }

    public void action4(){
        String previo = this.area.getText();
        this.area.setText(previo+"4");
    }

    public void action5(){
        String previo = this.area.getText();
        this.area.setText(previo+"5");
    }

    public void action6(){
        String previo = this.area.getText();
        this.area.setText(previo+"6");
    }

    public void action7(){
        String previo = this.area.getText();
        this.area.setText(previo+"7");
    }

    public void action8(){
        String previo = this.area.getText();
        this.area.setText(previo+"8");
    }

    public void action9(){
        String previo = this.area.getText();
        this.area.setText(previo+"9");
    }

    public void action0(){
        String previo = this.area.getText();
        this.area.setText(previo+"0");
    }

    public void action10(){
        String previo = this.area.getText();
        this.area.setText(previo+"x10");
    }

    public void actionPoint(){
        String previo = this.area.getText();
        this.area.setText(previo+".");
    }

    public void actionDEL(){
        String actual = this.area.getText();
        if (!actual.isEmpty()){
            String nuevo = actual.substring(0,actual.length()-1);
            area.setText(nuevo);
        }

    }

    public void actionAC(){
        this.area.setText("");
    }

    public void actionX(){
        String previo = this.area.getText();
        ANS = Double.parseDouble(previo);
        area.setText("");
        multi = true;
    }

    public void actionPlus(){
        String previo = this.area.getText();
        ANS = Double.parseDouble(previo);
        area.setText("");
        suma = true;
    }

    public void actionMinus(){
        String previo = this.area.getText();
        ANS = Double.parseDouble(previo);
        area.setText("");
        resta = true;
    }

    public void actionDiv(){
        String previo = this.area.getText();
        ANS = Double.parseDouble(previo);
        area.setText("");
        div = true;
    }

    public void actionANS(){
        String previo = this.area.getText();
        this.area.setText(previo+ANS);
    }

    public void actionIgual(){
        String previo = this.area.getText();
        if (suma){
            ANS += Double.parseDouble(previo);
            suma = false;
            area.setText(String.valueOf(ANS));
        } else
        if (resta){
            ANS -= Double.parseDouble(previo);
            resta = false;
            area.setText(String.valueOf(ANS));
        } else
        if (multi){
            ANS *= Double.parseDouble(previo);
            multi = false;
            area.setText(String.valueOf(ANS));
        } else
        if (div){
            ANS /= Double.parseDouble(previo);
            div = false;
            area.setText(String.valueOf(ANS));
        }
    }
}
