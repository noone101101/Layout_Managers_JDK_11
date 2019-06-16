import javax.swing.*;
import java.awt.*;

public class DriveThrough extends JFrame {

  public DriveThrough() {

    setTitle("Listener");

    setSize(290, 150);

    JPanel entreePanel = new JPanel();
    final ButtonGroup entreeGroup = new ButtonGroup();
    final ButtonGroup jcGroup = new ButtonGroup();

    JRadioButton radioButton;
    JCheckBox chBox;

    entreePanel.add(radioButton = new JRadioButton("UDP"));
    radioButton.setActionCommand("udp");
    entreeGroup.add(radioButton);

    entreePanel.add(radioButton = new JRadioButton("TCP"));
    radioButton.setActionCommand("tcp");
    entreeGroup.add(radioButton);

    final JPanel condimentsPanel = new JPanel();

    condimentsPanel.add(chBox = new JCheckBox("Runnable"));
    chBox.setActionCommand("Runnable");
    jcGroup.add(chBox);

    condimentsPanel.add(chBox = new JCheckBox("Callable"));
    chBox.setActionCommand("Callable");
    jcGroup.add(chBox);

    condimentsPanel.add(chBox = new JCheckBox("Thread Pool"));
    chBox.setActionCommand("ThreadPool");
    jcGroup.add(chBox);

    JPanel orderPanel = new JPanel();
    JButton orderButton = new JButton("Connect");
    orderPanel.add(orderButton);

    // 3 Rows and 1 column layout
    setLayout(new GridLayout(3, 1));

    add(entreePanel);
    add(condimentsPanel);
    add(orderPanel);

    orderButton.addActionListener( e -> {
      System.out.println("Connecting to " +
              "Server");
    });

    // frame.pack();

  }



  public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {

    UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");

    EventQueue.invokeLater(() -> {

      JFrame frame =  new DriveThrough();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);

      System.out.println("hello World");

    });
  }
}
