package java_rush_tasks.collections.lesson_3.task_2515.by.yurachel.space;

public class Bomb extends BaseObject{
    public Bomb(double x, double y) {
        super(x, y, 1);
    }

    /**
     * Отрисовываем себя на холсте.
     */
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'B');
    }

    /**
     * Двигаем себя вниз на один ход.
     */
    @Override
    public void move() {
        y++;
    }
}
