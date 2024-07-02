//<applet code="akApplet_Event.class" height=500 width=500></applet>

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
public class akApplet_Event extends Applet implements ActionListener
{
Button b1;
TextField t1;

public void init()
{
setBackground(Color.yellow);
t1=new TextField(30);
t1.setBounds(30,40,150,20);
b1=new Button("Click");
b1.setBounds(80,150,60,50);
add(b1);
add(t1);
b1.addActionListener(this);
setLayout(null);
}

public void actionPerformed(ActionEvent Ae)
{
t1.setText("Hi Guys...This is Applet...");
}
}
