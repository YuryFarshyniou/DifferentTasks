package java_rush_tasks.collections.lesson_3.task_2515.by.yurachel.space;

public class Bomb extends BaseObject{

    public void move() {
        y++;
    }

    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'B');
    }

    public Bomb(double x, double y) {
        super(x, y, 1);
    }
}
