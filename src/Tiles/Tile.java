package Tiles;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-11-30
 * Time: 15:04
 * Project: 4-in-a-row
 * Copyright: MIT
 */
public class Tile extends JPanel {
    private Point position;

    public Tile(Point point) {
        this.position = point;
    }

    public Point getPosition() {
        return position;
    }
}
