package Proj_Pack;

import javax.swing.*;
import java.awt.*;

public class Variables {

    //login
    public static Proj_Frame log_frame = new Proj_Frame(new BorderLayout(), null);
    public static Proj_Panel frame_panel = new Proj_Panel(new GridBagLayout(), new Color(0x4D7FD5), 500, 500);
    public static ImageIcon log_icon = new ImageIcon("C:\\Users\\NHRPC\\Downloads\\XQ7gaYP-hd-snow-wallpaper.jpg");
    public static JLabel imagelabel = new JLabel();
    public static Font log_font = new Font(Font.SANS_SERIF, Font.BOLD, 20);
    public static Proj_TextFields namefield = new Proj_TextFields();
    public static Proj_label usernamelabel=new Proj_label("Username");
    public static Proj_label passwordlabel=new Proj_label("Password");
    public static GridBagConstraints gbc=new GridBagConstraints();

    public static Proj_Panel log_panel = new Proj_Panel(new GridBagLayout(), new Color(0x0E8ECE9, true), 700, 500) {
        public void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            int width = getWidth();
            int height = getHeight();
            graphics.setColor(new Color(0x9B070707, true));
            graphics.fillRoundRect(0, 0, width - 1, height - 1, 50, 40);
        }
    };
    public static JPasswordField password = new JPasswordField() {
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBorder(null);
            setOpaque(false);
            setPreferredSize(new Dimension(300, 30));
            int w = getWidth();
            int h = getHeight();
            g.setColor(new Color(0x4D4DF8CB, true));
            g.fillRoundRect(0, 0, w - 1, h - 1, 30, 30);
System.out.println("");
        }

    };

}
