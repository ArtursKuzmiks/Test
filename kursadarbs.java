import javax.swing.*;
import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")

public class kursadarbs extends JComponent {

    private double t;
    static Timer timer;
    private static int xC;
    private static int yC;
    private static int r;
    private static double speed;

    private kursadarbs() {
        t = 0;
        timer = new Timer(100, e -> {
            t += speed;
            repaint();
        });
    }

    protected void paintComponent(Graphics g) {
        g.setColor(Color.blue);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.draw(circle(xC, yC, r));
        g2d.fill(circle(xC, yC, 3));
        g2d.setColor(Color.red);
        double x = xC;
        double y = yC;
        x += r * Math.cos(t);
        y += r * Math.sin(t);
        g2d.fill(circle(x, y, 7));
    }

    private static Shape circle(double x, double y, double r) {
        return new Ellipse2D.Double(x - r, y - r, 2 * r, 2 * r);
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Kursa darbs");

            frame.add(new kursadarbs());
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(600, 600);
            frame.setVisible(true);

            JPanel panel = new JPanel();
            frame.add(panel);

            JButton buttonSTART = new JButton("Start");
            JButton buttonSTOP = new JButton("Stop");
            JSlider slider = new JSlider(JSlider.HORIZONTAL,0,10,0);

            panel.add(buttonSTART);
            panel.add(slider);
            panel.add(buttonSTOP);

            buttonSTART.addActionListener(new ActionStart());
            buttonSTOP.addActionListener(new ActionStop());
            slider.addChangeListener(new ChangeListener());



            panel.addMouseListener(new MouseAdapter() {

                boolean Draw;

                public void mouseClicked(MouseEvent e) {
                    Graphics g = panel.getGraphics();
                    g.setColor(Color.blue);
                    Graphics2D g2d = (Graphics2D) g;

                    /*g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                            RenderingHints.VALUE_ANTIALIAS_ON);*/

                    if(Draw) {
                        r = (int)Math.sqrt(Math.pow(xC-e.getX(),2)
                                +Math.pow(yC-e.getY(),2));
                        g2d.draw(circle(xC, yC, r));
                        Draw = false;
                    } else {
                        xC = e.getX();
                        yC = e.getY();
                        g2d.fill(circle(xC, yC, 3));
                        Draw = true;
                    }
                }

            });

        });
    }

    static class ActionStart implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            timer.start();
        }
    }

    static class ActionStop implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            timer.stop();
        }
    }

    static class ChangeListener implements javax.swing.event.ChangeListener {

        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider) e.getSource();
            speed = source.getValue()/10.;
        }
    }
}
