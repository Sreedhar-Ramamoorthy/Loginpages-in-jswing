package Proj_Pack;

import java.awt.*;
import javax.swing.*;

public class Proj_Frame extends JFrame {

    Proj_Frame(LayoutManager layout,Color color) {
        this.setLayout(layout);
        this.setVisible(true);
        this.setBounds(150, 100, 500, 300);
    }
}
