`Simple GUI application`

<p>
  <img width="319" height="280" alt="Screenshot 2025-09-05 at 4 04 56 AM" src="https://github.com/user-attachments/assets/2d6ddaae-5833-459c-ac9d-cd635cfd9a8c" />
</p>

`Swing class with all the code`
```
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
```

