package Nov17;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Main extends JFrame{
    private JCheckBox cbC;
    private JComboBox cbxProf;
    private JTextArea taOutput;
    private JCheckBox cbCpp;
    private JCheckBox cbCSh;
    private JCheckBox cbJava;
    private JCheckBox cbPython;
    private JPanel jpanel;
    private JPanel pnlPython;

    public Main() {
        JCheckBox[] cbLangs = {cbC, cbCpp, cbJava, cbPython, cbCSh};
        ItemListener m = e -> {
            taOutput.setText("My favorite languages: ");
            for (JCheckBox cb : cbLangs) {
                if (cb.isSelected()) {
                    taOutput.append(cb.getText() + " ");
                }
            }
            taOutput.append("\n\nProficiency: " + cbxProf.getSelectedItem());
        };

        cbxProf.addItemListener(m);
        for (JCheckBox cb : cbLangs) {
            cb.addItemListener(m);
        }
        cbPython.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                pnlPython.setVisible(cbPython.isSelected());
            }
        });
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.setContentPane(m.jpanel);
        m.setSize(500, 700);
        m.setDefaultCloseOperation(EXIT_ON_CLOSE);
        m.setVisible(true);
    }


}
