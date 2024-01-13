package Setting;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.geom.RoundRectangle2D;
import java.io.IOException;
import javax.swing.JButton;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class SettingUI {
    //Color
    public static Color btn_colorDefault=new Color(250,215,172);
    public static Color btn_colorChange=new Color(255, 138, 20); 
    public static Color UI_colorDefault=new Color(255, 138, 20); 
    
    //Postition
    public static Point mainScreen_Location_Center=new Point(237, 133);
    public static Point mainScreen_Location_Left=new Point(3, 133);
    public static Point mainScreen_Size=new Point(1063,621);
    public static Point dialog_Location=new Point(mainScreen_Location_Left.x + mainScreen_Size.x,mainScreen_Location_Left.y);
    public static Point cart_Location=new Point(mainScreen_Location_Left.x + mainScreen_Size.x,mainScreen_Location_Left.y+375);
    public static java.util.logging.Logger logger=initializeLogger("Lịch Sử");
    //UI
    public static JButton createRoundedButton(double x,double y,int cornerRadius) {
        JButton button = new JButton() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g.create();

                // Tạo hình chữ nhật có góc bo tròn
                RoundRectangle2D roundedRectangle = new RoundRectangle2D.Float((float) x, (float) y, getWidth()-1 , getHeight()-1 , cornerRadius,cornerRadius);

                // Vẽ hình chữ nhật lên JButton
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.setColor(getBackground());
                g2d.fill(roundedRectangle);
                g2d.setColor(getForeground());
                g2d.draw(roundedRectangle);

                g2d.dispose();
                super.paintComponent(g);
            }
        };
        button.setFocusPainted(false);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        return button;
    }
    // Function to check if a string is a valid phone number
    public static boolean isValidPhoneNumber(String phoneNumber) {
        // Define a regex pattern for a basic phone number format
        String phonePattern="^0\\d{9}";
        // Check if the input matches the pattern
        return phoneNumber.matches(phonePattern);
    }
    public static boolean isValidPassWord(String phoneNumber) {
        // Define a regex pattern for a basic phone number format
        String phonePattern=".{8,}";
        // Check if the input matches the pattern
        return phoneNumber.matches(phonePattern);
    }
    private static java.util.logging.Logger initializeLogger(String name) {
        java.util.logging.Logger logger = java.util.logging.Logger.getLogger(name);
        try {
            java.util.logging.FileHandler fileHandler = new java.util.logging.FileHandler("log.txt", true);
            fileHandler.setFormatter(new java.util.logging.SimpleFormatter());
            logger.addHandler(fileHandler);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return logger;
    }
}
