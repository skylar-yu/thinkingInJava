package swt;//: swt/DisplayEnvironment.java

import org.eclipse.swt.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import swt.util.SWTApplication;
import swt.util.SWTConsole;

import java.util.Map;

public class DisplayEnvironment implements SWTApplication {
    public static void main(String[] args) {
        SWTConsole.run(new DisplayEnvironment(), 800, 600);
    }

    public void createContents(Composite parent) {
        parent.setLayout(new FillLayout());
        Text text = new Text(parent, SWT.WRAP | SWT.V_SCROLL);
        for (Map.Entry entry : System.getenv().entrySet()) {
            text.append(entry.getKey() + ": " +
                    entry.getValue() + "\n");
        }
    }
} ///:~
