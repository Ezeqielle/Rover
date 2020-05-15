public class Rover {
    private Direction direction;
    private Position position;

    public Rover(char direction, int position_x, int position_y){
        this.direction = new Direction(direction);
        this.position = new Position(position_x, position_y);
    }

    public void RotateLeft(){
        direction.RotateLeft();
    }

    public void RotateRight(){
        direction.RotateRight();
    }

    public void Move(){
        position.Move(direction.GetDirection());
    }
}
