import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Gui implements ActionListener {
     public Gui(){
  JFrame frame = new JFrame(null, null);
  JPanel panel = new JPanel();
  JButton button = new JButton("on me" );
  JLabel label = new JLabel("click me");
   button.addActionListener(this);

   panel.setBorder(BorderFactory.createEmptyBorder(5000, 8000, 800, 800));
   panel.setLayout(new GroupLayout(panel));
   panel.add(button);
   panel.add(button, label, 0);

   frame.add(panel, BorderLayout.CENTER);
   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setTitle("   SAFARICOM CYBER SEC ");
   frame.pack();
   frame.setVisible(true);
      }
    public static void main(String[] args) {
      new Gui();  
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
}
