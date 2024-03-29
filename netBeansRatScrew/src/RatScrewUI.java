

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jdoerhoff
 */
import java.util.*;
import javafoundations.*;
import javax.swing.*;
public class RatScrewUI extends javax.swing.JFrame {

    /**
     * Creates new form RatScrewUI
     */
    public RatScrewUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        playerDeck = new javax.swing.JPanel();
        pdLabel = new javax.swing.JLabel();
        computerDeck = new javax.swing.JPanel();
        compLabel = new javax.swing.JLabel();
        pileDeck = new javax.swing.JPanel();
        pileLabel = new javax.swing.JLabel();
        flipCard = new javax.swing.JButton();
        exit = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        computerCount = new javax.swing.JLabel();
        playerCount = new javax.swing.JLabel();
        startGame = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        background.setBackground(new java.awt.Color(0, 153, 0));

        playerDeck.setBackground(new java.awt.Color(255, 255, 255));
        playerDeck.setPreferredSize(new java.awt.Dimension(72, 96));

        org.jdesktop.layout.GroupLayout playerDeckLayout = new org.jdesktop.layout.GroupLayout(playerDeck);
        playerDeck.setLayout(playerDeckLayout);
        playerDeckLayout.setHorizontalGroup(
            playerDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pdLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        playerDeckLayout.setVerticalGroup(
            playerDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pdLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        computerDeck.setBackground(new java.awt.Color(255, 255, 255));
        computerDeck.setPreferredSize(new java.awt.Dimension(72, 96));

        org.jdesktop.layout.GroupLayout computerDeckLayout = new org.jdesktop.layout.GroupLayout(computerDeck);
        computerDeck.setLayout(computerDeckLayout);
        computerDeckLayout.setHorizontalGroup(
            computerDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(compLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        computerDeckLayout.setVerticalGroup(
            computerDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(compLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        pileDeck.setBackground(new java.awt.Color(204, 204, 204));
        pileDeck.setPreferredSize(new java.awt.Dimension(72, 96));

        org.jdesktop.layout.GroupLayout pileDeckLayout = new org.jdesktop.layout.GroupLayout(pileDeck);
        pileDeck.setLayout(pileDeckLayout);
        pileDeckLayout.setHorizontalGroup(
            pileDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pileLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
        );
        pileDeckLayout.setVerticalGroup(
            pileDeckLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(pileLabel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
        );

        flipCard.setText("Flip Card");
        flipCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                flipCardActionPerformed(evt);
            }
        });

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        title.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        title.setText("EGYPTIAN RAT SCREW");

        startGame.setText("Start");
        startGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startGameActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout backgroundLayout = new org.jdesktop.layout.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundLayout.createSequentialGroup()
                .add(19, 19, 19)
                .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, backgroundLayout.createSequentialGroup()
                        .add(startGame)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, backgroundLayout.createSequentialGroup()
                        .add(exit)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(title)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .add(backgroundLayout.createSequentialGroup()
                        .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(backgroundLayout.createSequentialGroup()
                                .add(playerDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(flipCard))
                            .add(backgroundLayout.createSequentialGroup()
                                .add(29, 29, 29)
                                .add(playerCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 33, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                        .add(pileDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(143, 143, 143)))
                .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(backgroundLayout.createSequentialGroup()
                        .add(computerDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(16, 16, 16))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, backgroundLayout.createSequentialGroup()
                        .add(computerCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(33, 33, 33))))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(backgroundLayout.createSequentialGroup()
                .add(18, 18, 18)
                .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(backgroundLayout.createSequentialGroup()
                        .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(computerDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(backgroundLayout.createSequentialGroup()
                                .add(41, 41, 41)
                                .add(startGame)))
                        .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 54, Short.MAX_VALUE)
                                .add(playerCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 21, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(playerDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(22, 22, 22))
                            .add(backgroundLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(computerCount, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .add(backgroundLayout.createSequentialGroup()
                        .add(backgroundLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(exit)
                            .add(title))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(pileDeck, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(45, 45, 45)
                        .add(flipCard)
                        .add(30, 30, 30))))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(background, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    @SuppressWarnings("empty-statement")
    private void startGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startGameActionPerformed
        gameOn = true;
        player = new LinkedQueue<String>(); // player's queue of cards
        opponent = new LinkedQueue<String>();   // opponent's queue of cards
        int numOfCards = 52;
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);
        int i = random.nextInt(numOfCards);
        String[] deck = {"AH", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H", "10H", "JH", "QH", "KH", "AD", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D", "10D", "JD", "QD", "KD", "AC", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C", "10C", "JC", "QC", "KC", "AS", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S", "10S", "JS", "QS", "KS"};
        // alternates cards to populate both player's starting decks
        while (numOfCards > 0) 
        {
                int rand = random.nextInt(numOfCards);
                String temp = deck[rand];
                player.enqueue(temp);
                deck[rand] = deck[numOfCards-1];
                numOfCards--;
                rand = random.nextInt(numOfCards);
                temp = deck[rand];
                opponent.enqueue(temp);
                deck[rand] = deck[numOfCards-1];
                numOfCards--;
        }
        ImageIcon grey = new ImageIcon("img/grey.png");
        pileLabel.setIcon(grey);
        ImageIcon back = new ImageIcon("img/backCard.png");
        pdLabel.setIcon(back);
        compLabel.setIcon(back);
        playerCount.setText("26");
        computerCount.setText("26");
    }//GEN-LAST:event_startGameActionPerformed

    private void flipCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_flipCardActionPerformed
        if(gameOn) {
            String playerCard = player.dequeue();
            if(player.isEmpty()) {
                gameOn = false;
                ImageIcon white = new ImageIcon("img/white.png");
                pdLabel.setIcon(white);
            }
            ImageIcon card = new ImageIcon("img/" + playerCard + ".png");
            pileLabel.setIcon(card);
            Integer count = new Integer(player.size());
            playerCount.setText(count.toString());
        }
    }//GEN-LAST:event_flipCardActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RatScrewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RatScrewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RatScrewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RatScrewUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RatScrewUI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JLabel compLabel;
    private javax.swing.JLabel computerCount;
    private javax.swing.JPanel computerDeck;
    private javax.swing.JButton exit;
    private javax.swing.JButton flipCard;
    private javax.swing.JLabel pdLabel;
    private javax.swing.JPanel pileDeck;
    private javax.swing.JLabel pileLabel;
    private javax.swing.JLabel playerCount;
    private javax.swing.JPanel playerDeck;
    private javax.swing.JButton startGame;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
    private LinkedQueue<String> player;
    private LinkedQueue<String> opponent; 
    private boolean gameOn;
    public JPanel getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(JPanel playerDeck) {
        this.playerDeck = playerDeck;
    }
}
