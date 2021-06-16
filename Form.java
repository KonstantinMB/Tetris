package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Form {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Color color;
    private String name;
    public int form = 1;

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Form(Rectangle a, Rectangle b, Rectangle c, Rectangle d, String name) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.name = name;

        //stone colors:
        switch (name) {
            case "j":
                color = Color.RED;
                break;
            case "l":
                color = Color.BLUE;
                break;
            case "o":
                color = Color.BLACK;
                break;
            case "s":
                color = Color.ORANGE;
                break;
            case "t":
                color = Color.LIME;
                break;
            case "z":
                color = Color.DEEPPINK;
                break;
            case "I":
                color = Color.TURQUOISE;
                break;
        }

        this.a.setFill(color);
        this.b.setFill(color);
        this.c.setFill(color);
        this.d.setFill(color);
    }

    public String getName() {
        return name;
    }

    //there will be 4 forms of the tetris blocks:
    public void changeForm(){
        if (form != 4){
            form++;
        } else{
            form = 1;
        }
    }
}
