import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UI implements ActionListener {
    private int numberOfClicks = 0;
    private JFrame window;
    private JPanel panel;
    private JLabel label;

    public UI() {
        window = new JFrame();
        panel = new JPanel();

        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        label = new JLabel("Number of clicks: " + numberOfClicks);


        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100,100));
        panel.setLayout(new GridLayout(0,1));
        panel.add(button);
        panel.add(label);

        window.add(panel, BorderLayout.CENTER);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setTitle("Test");
        window.pack();
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        numberOfClicks++;
        label.setText("Number of clicks: " + numberOfClicks);
    }
}
