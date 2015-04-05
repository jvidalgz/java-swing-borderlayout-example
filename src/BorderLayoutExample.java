import javax.swing.*;
import java.awt.*;

/**
 * Created by jaime on 05-04-2015.
 */
public class BorderLayoutExample extends JFrame {

    BorderLayoutExample() {

        setTitle("Ventana BorderLayoutExample");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();

        // agrega un boton a cada una de las 5 areas del BorderLayoutExample
        contentPane.add(new JButton("Norte"), BorderLayout.NORTH);
        contentPane.add(new JButton("Sur"), BorderLayout.SOUTH);
        contentPane.add(new JButton("Oeste"), BorderLayout.WEST);
        contentPane.add(new JButton("Este"), BorderLayout.EAST);
        contentPane.add(new JButton("Centro"), BorderLayout.CENTER);

        pack();

    }
}
