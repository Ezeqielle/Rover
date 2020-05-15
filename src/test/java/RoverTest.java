import org.junit.Assert;
import org.junit.Test;

public class RoverTest {
    @Test
    public void TestConstruct(){
        Rover dorus = new Rover('S',2,-3);
        System.out.println(dorus);
        Assert.assertEquals(dorus.toString(),"Rover{direction=Direction{orientation=S}, position=Position{x=2, y=-3}}");
    }

    @Test
    public void ShouldBePointedToEast(){
        Rover sylvus = new Rover('S',2,-3);
        sylvus.RotateLeft();
        System.out.println(sylvus);
        Assert.assertEquals(sylvus.toString(), "Rover{direction=Direction{orientation=E}, position=Position{x=2, y=-3}}");
    }

     @Test
    public void ShouldBePointedToWest(){
        Rover clemus = new Rover('S',2,-3);
        clemus.RotateRight();
        System.out.println(clemus);
        Assert.assertEquals(clemus.toString(), "Rover{direction=Direction{orientation=W}, position=Position{x=2, y=-3}}");
    }

    @Test
    public void ShouldTopRight(){
        Rover mathus = new Rover('N',0,0);
        mathus.Move();
        mathus.Move();
        mathus.Move();
        mathus.RotateRight();
        mathus.Move();
        mathus.Move();
        mathus.Move();
        System.out.println(mathus);
        Assert.assertEquals(mathus.toString(), "Rover{direction=Direction{orientation=E}, position=Position{x=3, y=3}}");
    }

    @Test
    public void ShouldASquare(){
        Rover manvus = new Rover('N',0,0);
        manvus.Move();
        manvus.RotateRight();
        manvus.Move();
        manvus.RotateRight();
        manvus.Move();
        manvus.RotateRight();
        manvus.Move();
        System.out.println(manvus);
        Assert.assertEquals(manvus.toString(), "Rover{direction=Direction{orientation=W}, position=Position{x=0, y=0}}");
    }
}
