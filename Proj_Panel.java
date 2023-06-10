package Proj_Pack;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class Proj_Panel extends JPanel {
    Proj_Panel(LayoutManager layout, Color color, int width, int height) {
        this.setLayout(layout);
        this.setBackground(color);
        this.setPreferredSize(new Dimension(width, height));

    }

}
