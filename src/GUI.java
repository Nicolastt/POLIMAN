import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame {
    public GUI() throws HeadlessException {
        setSize(500,500);
        setTitle("POLIMAN");
        setLocationRelativeTo(null); // Pone la ventana en el centro a la pantalla
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Cuando cerramos el programa termina la ejecución
    }
}
