# InputPanel

Egy Swing komponens, ami tartalmaz egy feliratot és egy beviteli mezőt.

## Dokumentáció

* [https://oktat.github.io/inputpanel/](https://oktat.github.io/inputpanel/)

## Letöltés

* [https://github.com/oktat/inputpanel/releases](https://github.com/oktat/inputpanel/releases)

## Példa

```java
public class App {
    public static void main(String[] args) {
        new MainFrame();
    }  
}
```

```java
import javax.swing.JFrame;

import lan.nagy.InputPanel;

public class MainFrame extends JFrame {
    public InputPanel inputPanel;
    public MainFrame() {
        this.inputPanel = new InputPanel();
        this.inputPanel.setText("Teszt");
        
        this.add(this.inputPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);
        this.setVisible(true);
    }
}
```
