package ex2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener {
    TempurateData tempurateData  = new TempurateData();
    View view;

    public Controller(View view) {
        this.view = view;
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand();
        double c = Double.parseDouble(view.getjTextFieldC());
        double f = Double.parseDouble(view.getjTextFieldF());
        String flagC = null;
        String flagF = null;
        System.out.println("truoc:");
        System.out.println("c:"+c);
        System.out.println("f:"+f);

        if(action.equals("riseC")) {
            c++;
            flagC = "yes";
        }else if(action.equals("lowC")) {
            c--;flagC = "yes";
        }else if(action.equals("riseF")) {
            f++;flagF = "yes";
        }else if(action.equals("lowF")) {
            f--;flagF = "yes";
        }
        System.out.println("sau:");
        System.out.println("c:"+c);
        System.out.println("f:"+f);
        tempurateData.setData(c, f, flagC, flagF);
    }

    public TempurateData getTempurateData() {
        return tempurateData;
    }
}
