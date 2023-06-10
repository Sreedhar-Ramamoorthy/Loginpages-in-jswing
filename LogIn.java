package Proj_Pack;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;


public class LogIn {
    LogIn() {
        get();
    }

    void get() {

//Adding Image to Panel
        Image scale = Variables.log_icon.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
        Variables.log_icon = new ImageIcon(scale);
        Variables.imagelabel.setIcon(Variables.log_icon);
        Variables.imagelabel.setLayout(new GridBagLayout());

//
        Variables.frame_panel.add(Variables.imagelabel);
        Variables.log_panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEmptyBorder(), "LOG-IN", TitledBorder.CENTER, TitledBorder.CENTER, Variables.log_font, Color.WHITE));
        Variables.namefield.setPreferredSize(new Dimension(300, 30));
        Variables.password.setPreferredSize(new Dimension(300, 30));
        Variables.gbc.insets = new Insets(7,7,7,7);
        Variables.gbc.gridx = 0;
        Variables.gbc.gridy = 2;
        Variables.log_panel.add(Variables.namefield, Variables.gbc);
        Variables.gbc.gridx = 0;
        Variables.gbc.gridy = 1;
        Variables.gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        Variables.log_panel.add(Variables.usernamelabel, Variables.gbc);

        Variables.gbc.gridx = 0;
        Variables.gbc.gridy = 4;
        Variables.log_panel.add(Variables.password, Variables.gbc);
        Variables.gbc.gridx = 0;
        Variables.gbc.gridy = 3;
        Variables.gbc.anchor=GridBagConstraints.FIRST_LINE_START;
        Variables.log_panel.add(Variables.passwordlabel, Variables.gbc);

        Variables.log_frame.add(Variables.frame_panel);
        Variables.imagelabel.add(Variables.log_panel);
    }

    public static void main(String[] args) {

        new LogIn();
    }
}


