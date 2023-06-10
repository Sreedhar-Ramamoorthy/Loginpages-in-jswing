package Proj_Pack;

import javax.swing.*;
import java.awt.*;

public class Proj_label extends JLabel {
    Proj_label(String text) {
        this.setFont(new Font(Font.SANS_SERIF,Font.BOLD,18));
        this.setForeground(new Color(0xF2F2F3));
        this.setOpaque(false);
        this.setText(text);
        this.setPreferredSize(new Dimension(120, 30));


    }

}
