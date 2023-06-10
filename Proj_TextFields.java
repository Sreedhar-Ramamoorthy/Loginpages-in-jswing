package Proj_Pack;

import javax.swing.*;
import java.awt.*;

public class Proj_TextFields extends JTextField {
    Proj_TextFields() {

        this.setBorder(null);
        this.setOpaque(false);
        this.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        int w = getWidth();
        int h = getHeight();
        g.setColor(new Color(0x804DF8CB, true));
        g.fillRoundRect(0, 0, w - 1, h - 1, 30, 30);

    }


}
