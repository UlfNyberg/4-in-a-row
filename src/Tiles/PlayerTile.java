package Tiles;

import java.awt.*;

/**
 * Created by Elliot Åberg Fält
 * Date: 2020-11-30
 * Time: 15:13
 * Project: 4-in-a-row
 * Copyright: MIT
 */
public class PlayerTile extends Tile{
    private Color color;
    private int player;

    public PlayerTile(Point point, Color color, int player) {
        super(point);
        this.color = color;
        this.player = player;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPlayer() {
        return player;
    }
}
