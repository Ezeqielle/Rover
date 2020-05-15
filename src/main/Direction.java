public class Direction {
    private char orientation;

    public Direction(char orientation) {
        String valideDirection = "NESW";
        this.orientation = orientation;
        if (valideDirection.indexOf(orientation) == -1) {
            this.orientation = 'N';
        }
    }

    @Override
    public String toString() {
        return "Direction{" +
                "orientation=" + orientation +
                '}';
    }

    public void RotateLeft(){
        switch (orientation){
            case 'N':
                orientation = 'W';
                break;
            case 'W':
                orientation = 'S';
                break;
            case 'S':
                orientation = 'E';
                break;
            case 'E':
                orientation = 'N';
                break;
            default:
        }
    }

    public void RotateRight(){
        switch (orientation){
            case 'N':
                orientation = 'E';
                break;
            case 'W':
                orientation = 'N';
                break;
            case 'S':
                orientation = 'W';
                break;
            case 'E':
                orientation = 'S';
                break;
            default:
        }
    }

    public char GetDirection(){
        return orientation;
    }
}
