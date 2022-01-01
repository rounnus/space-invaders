package com.game.space_invaders.entities.bullet;

import com.game.space_invaders.costants.DimensionConstants;
import javafx.geometry.Point2D;
import javafx.scene.shape.Rectangle;

public class Bullet {
    private final Rectangle bulletShape;
    private Point2D bulletPoint;
    private Boolean fired;

    public Bullet() {
        this.bulletShape = new Rectangle(
                DimensionConstants.BULLET_DIMENSION.getEntityDimension().getWidth(),
                DimensionConstants.BULLET_DIMENSION.getEntityDimension().getHeight()
        );
        this.fired = false;
    }

    public Rectangle getBulletShape() {
        return this.bulletShape;
    }

    public Boolean isFired() {
        return this.fired;
    }

    public void setFired() {
        this.fired = true;
    }

}
