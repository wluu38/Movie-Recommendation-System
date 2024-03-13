import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{
    JButton hbutton;
    JButton abutton;
    JButton tbutton;
    JButton dbutton;
    JButton scibutton;
    JButton cbutton;
    JButton rbutton;
    JButton randombutton;
    
    JLabel hlabel;
    JLabel alabel;
    JLabel tlabel;
    JLabel dlabel;
    JLabel scilabel;
    JLabel clabel;
    JLabel rlabel;
    JLabel randomlabel;
    
    MyFrame(){
        
        hlabel = new JLabel();
        hlabel.setBounds(150, 150, 150, 150);
        hlabel.setVisible(false);
        
        hbutton = new JButton();
        hbutton.setBounds(100, 0, 350, 100);
        hbutton.addActionListener(this);
        hbutton.setText("Horror Reccomendation");
        
        hbutton.setFocusable(false);
        hbutton.setHorizontalTextPosition(JButton.CENTER);
        hbutton.setVerticalTextPosition(JButton.BOTTOM);
        hbutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        hbutton.setIconTextGap(-15);
        hbutton.setForeground(Color.black);
        hbutton.setBackground(Color.gray);
        hbutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,2000);
        this.setVisible(true);
        this.add(hbutton);
        this.add(hlabel);
        //---------------------------------------------------------------------------------------------
        
        alabel = new JLabel();
        alabel.setBounds(150, 250, 150, 150);
        alabel.setVisible(false);
        
        abutton = new JButton();
        abutton.setBounds(100, 100, 350, 100);
        abutton.addActionListener(this);
        abutton.setText("Action Reccomendation");
        
        abutton.setFocusable(false);
        abutton.setHorizontalTextPosition(JButton.CENTER);
        abutton.setVerticalTextPosition(JButton.BOTTOM);
        abutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        abutton.setIconTextGap(-15);
        abutton.setForeground(Color.black);
        abutton.setBackground(Color.gray);
        abutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(abutton);
        this.add(alabel);
         //---------------------------------------------------------------------------------------------
        
         tlabel = new JLabel();
         tlabel.setBounds(150, 350, 150, 150);
         tlabel.setVisible(false);
         
         tbutton = new JButton();
         tbutton.setBounds(100, 200, 350, 100);
         tbutton.addActionListener(this);
         tbutton.setText("Thriller Reccomendation");
         
         tbutton.setFocusable(false);
         tbutton.setHorizontalTextPosition(JButton.CENTER);
         tbutton.setVerticalTextPosition(JButton.BOTTOM);
         tbutton.setFont(new Font("Comic Sans",Font.BOLD,25));
         tbutton.setIconTextGap(-15);
         tbutton.setForeground(Color.black);
         tbutton.setBackground(Color.gray);
         tbutton.setBorder(BorderFactory.createEtchedBorder());
         
         this.add(tbutton);
         this.add(tlabel);
        //---------------------------------------------------------------------------------------------
        
        dlabel = new JLabel();
        dlabel.setBounds(150, 450, 150, 150);
        dlabel.setVisible(false);
        
        dbutton = new JButton();
        dbutton.setBounds(100, 300, 350, 100);
        dbutton.addActionListener(this);
        dbutton.setText("Drama Reccomendation");
        
        dbutton.setFocusable(false);
        dbutton.setHorizontalTextPosition(JButton.CENTER);
        dbutton.setVerticalTextPosition(JButton.BOTTOM);
        dbutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        dbutton.setIconTextGap(-15);
        dbutton.setForeground(Color.black);
        dbutton.setBackground(Color.gray);
        dbutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(dbutton);
        this.add(dlabel);
         //---------------------------------------------------------------------------------------------
        
        scilabel = new JLabel();
        scilabel.setBounds(150, 550, 150, 150);
        scilabel.setVisible(false);
        
        scibutton = new JButton();
        scibutton.setBounds(100, 400, 350, 100);
        scibutton.addActionListener(this);
        scibutton.setText("Sci-Fi Reccomendation");
        
        scibutton.setFocusable(false);
        scibutton.setHorizontalTextPosition(JButton.CENTER);
        scibutton.setVerticalTextPosition(JButton.BOTTOM);
        scibutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        scibutton.setIconTextGap(-15);
        scibutton.setForeground(Color.black);
        scibutton.setBackground(Color.gray);
        scibutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(scibutton);
        this.add(scilabel);
        //---------------------------------------------------------------------------------------------
        
        clabel = new JLabel();
        clabel.setBounds(150, 650, 150, 150);
        clabel.setVisible(false);
        
        cbutton = new JButton();
        cbutton.setBounds(100, 500, 350, 100);
        cbutton.addActionListener(this);
        cbutton.setText("Comedy Reccomendation");
        
        cbutton.setFocusable(false);
        cbutton.setHorizontalTextPosition(JButton.CENTER);
        cbutton.setVerticalTextPosition(JButton.BOTTOM);
        cbutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        cbutton.setIconTextGap(-15);
        cbutton.setForeground(Color.black);
        cbutton.setBackground(Color.gray);
        cbutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(cbutton);
        this.add(clabel);
        //---------------------------------------------------------------------------------------------
        
        rlabel = new JLabel();
        rlabel.setBounds(150, 750, 150, 150);
        rlabel.setVisible(false);
        
        rbutton = new JButton();
        rbutton.setBounds(100, 600, 350, 100);
        rbutton.addActionListener(this);
        rbutton.setText("Romance Reccomendation");
        
        rbutton.setFocusable(false);
        rbutton.setHorizontalTextPosition(JButton.CENTER);
        rbutton.setVerticalTextPosition(JButton.BOTTOM);
        rbutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        rbutton.setIconTextGap(-15);
        rbutton.setForeground(Color.black);
        rbutton.setBackground(Color.gray);
        rbutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(rbutton);
        this.add(rlabel);
        //---------------------------------------------------------------------------------------------
        
        randomlabel = new JLabel();
        randomlabel.setBounds(150, 850, 150, 150);
        randomlabel.setVisible(false);
        
        randombutton = new JButton();
        randombutton.setBounds(100, 700, 350, 100);
        randombutton.addActionListener(this);
        randombutton.setText("Random Reccomendation");
        
        randombutton.setFocusable(false);
        randombutton.setHorizontalTextPosition(JButton.CENTER);
        randombutton.setVerticalTextPosition(JButton.BOTTOM);
        randombutton.setFont(new Font("Comic Sans",Font.BOLD,25));
        randombutton.setIconTextGap(-15);
        randombutton.setForeground(Color.black);
        randombutton.setBackground(Color.gray);
        randombutton.setBorder(BorderFactory.createEtchedBorder());
        
        this.add(randombutton);
        this.add(randomlabel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==hbutton) {
            Main.returnmovie(Main.get_horrormovie());
            hbutton.setEnabled(false);  
            hlabel.setVisible(true);
        }   
        else if(e.getSource()==abutton) {
            Main.returnmovie(Main.get_actionmovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==tbutton) {
            Main.returnmovie(Main.get_thrillermovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==dbutton) {
            Main.returnmovie(Main.get_dramamovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==scibutton) {
            Main.returnmovie(Main.get_scifimovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==cbutton) {
            Main.returnmovie(Main.get_comedymovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==rbutton) {
            Main.returnmovie(Main.get_romancemovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }
        else if(e.getSource()==randombutton) {
            Main.returnmovie(Main.get_randommovie());
            abutton.setEnabled(false);
            alabel.setVisible(true);
        }   
    }
}

