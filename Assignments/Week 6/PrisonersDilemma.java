/**
 * Assignment 6 -- Prisoner's Dilemma -- 2IP90
 * main class
 * 
 * @author Dominika Chabior 1700219
 * @author Chloe Antonozzi 1670980
 * 
 * assignement copyright Kees Huizing
 */
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

class PrisonersDilemma{

    private int timerDelay = 100;

    private void buildGUI(){
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Prisoner's Dilemma");
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,900);
            frame.setResizable(false);
            frame.setLayout(new BorderLayout());

            PlayingField playingField = new PlayingField();
            playingField.fillPatch();
            playingField.setLayout(new GridLayout(playingField.getGridLength(), playingField.getGridHeight()));
            playingField.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
            playingField.generatePatch();
            playingField.Neighbours();

            for (int x = 0; x < playingField.getGridLength(); x++){
                for(int y =0; y < playingField.getGridHeight(); y++){
                    Patch patch;
                    patch = playingField.getPatch(x, y);
                    patch.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e){
                            patch.toggleStrategy();
                        }
                    });
                    playingField.add(playingField.getPatch(x, y));
                }
            }
            frame.add(playingField, BorderLayout.CENTER);

            ActionListener taskPerformer = new ActionListener(){
                public void actionPerformed(ActionEvent evt){
                    playingField.step();
                }
            };
            Timer timer = new Timer(timerDelay, taskPerformer);

            JPanel panel = new JPanel();
            frame.add(panel, BorderLayout.SOUTH);
            panel.setLayout(new GridLayout(2,2));
            panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);

            JPanel topPanel = new JPanel();
            JLabel rewardLabel = new JLabel("    defection α = " + playingField.getAlpha());
            topPanel.add(rewardLabel);

            JSlider rewardSlider = new JSlider(0,3,0);
            rewardSlider.setMajorTickSpacing(1);
            rewardSlider.setPaintTicks(true);
            rewardSlider.setPaintLabels(true);
            Hashtable<Integer, JLabel> labels = new Hashtable<>();
            labels.put(0, new JLabel("0.0"));
            labels.put(1, new JLabel("1.0"));
            labels.put(2, new JLabel("2.0"));
            labels.put(3, new JLabel("3.0"));
            rewardSlider.setLabelTable(labels);

            rewardSlider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e){
                    JSlider source = (JSlider)e.getSource();
                    playingField.setAlpha(source.getValue());
                    rewardLabel.setText("    defection α = " + playingField.getAlpha());
                }
            });
            JLabel frequecyLabel = new JLabel("    frequency = " + timerDelay);
            topPanel.add(rewardSlider);
            topPanel.add(frequecyLabel);

            JSlider frequencySlider = new JSlider(0, 60, 0);
            frequencySlider.setMajorTickSpacing(10);
            frequencySlider.setPaintTicks(true);
            frequencySlider.setPaintLabels(true);
            frequencySlider.addChangeListener(new ChangeListener() {
                @Override
                public void stateChanged(ChangeEvent e){
                    JSlider source = (JSlider)e.getSource();
                    timerDelay = source.getValue();
                    timer.setDelay(timerDelay);
                    frequecyLabel.setText("     frequency = " + timerDelay);
                }
            });
            topPanel.add(frequencySlider);
            panel.add(topPanel, BorderLayout.NORTH);

            JPanel bottomPanel = new JPanel();

            JButton buttonGO = new JButton("GO");
            buttonGO.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(timer.isRunning()){
                        timer.stop();
                    }else{
                        timer.start();
                    }

                    if (buttonGO.getText().equals("GO")){
                        buttonGO.setText("Pause");
                    }else{
                        buttonGO.setText("GO");
                    }
                }
            });
            bottomPanel.add(buttonGO);

            JButton buttonReset = new JButton("Reset");
            buttonReset.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    playingField.generatePatch();
                }
            });
            bottomPanel.add(buttonReset);

            JButton buttonRule = new JButton("Rule: Off");
            bottomPanel.add(buttonRule);
            buttonRule.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(playingField.getExtraRule()){
                        buttonRule.setText("Rule: Off");
                    }else{
                        buttonRule.setText("Rule: On");
                    }
                }
            });
            panel.add(bottomPanel, BorderLayout.SOUTH);
        });
    }
    public static void main(String[] args){
        (new PrisonersDilemma()).buildGUI();
    }
}
