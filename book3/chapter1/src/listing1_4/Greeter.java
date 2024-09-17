package listing1_4;

import javax.swing.*;
    //Listing 1.4
// This class creates a listing1_3.Greeter object
// that displays a hello message
// in a dialog box.

import javax.swing.JOptionPane;

    public class Greeter {
        public void sayHello() {
            JOptionPane.showMessageDialog(null,
                    "Hello, World!", "listing1_3.Greeter",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }

