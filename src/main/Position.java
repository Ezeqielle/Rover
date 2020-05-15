public class Position {
    private int x;
    private int y;
    public Position position;

    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Position(){
        this.x = 0;
        this.y = 0;
    }

    @Override
    public String toString() {
        return "Position{" +
                "x=" + x +
                ", y=" + y +
                ", position=" + position +
                '}';
    }

    public void Move(char direction){
        switch (direction){
            case 'N':
                y++;
                break;
            case 'W':
                x--;
                break;
            case 'S':
                y--;
                break;
            case 'E':
                x++;
                break;
            default:
        }
    }
}
