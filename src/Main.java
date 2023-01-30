import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setTitulo("PACMAN");
        menu.setTamaño(1000, 6000);
        menu.setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.setVisible(true);
    }
}