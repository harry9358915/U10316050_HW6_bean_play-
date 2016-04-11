
import java.security.SecureRandom;
import javafx.scene.*;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.paint.*;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.PathTransition.OrientationType;
import javafx.animation.Timeline;
import javafx.application.*;
public class BeanMotion extends Application{
	BeanGame beanGame = new BeanGame();
	SecureRandom random = new SecureRandom();
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		beanGame.setOnMouseClicked(e -> {
			CreateBall();
        });
		
		Scene scene = new Scene(beanGame,1000,1000);
		primaryStage.setTitle("BeanGame");//set the stage title
		primaryStage.setScene(scene);//Place the scene in the stage
		primaryStage.show();//Display the stage
	}
	
	public void CreateBall(){
		int x = 500,y=30;
		Circle circle = new Circle();
		circle.setCenterX(x);
		circle.setCenterY(y);
		circle.setRadius(5);
		circle.setFill(Color.GREEN);
	    Path path = new Path();
	    path.getElements().add(new MoveTo(x,y));
	    y+=55;
	    path.getElements().add(new LineTo(x,y));
	    for(int i=1;i<=7;i++){
	    	y+=95;
	    	if(random.nextInt(2)==1){
	    		x-=43.75;
	    		
	    	}else{
	    		x+=43.75;
	    	}
	    	path.getElements().add(new LineTo(x,y));
	    	System.out.println(x);
		    System.out.println(y);
	    }
	    
	    path.getElements().add(new LineTo(x,y+140));
		beanGame.getChildren().add(circle);
	    PathTransition anim = new PathTransition();
	    anim.setNode(circle);
	    anim.setPath(path);
	    anim.setOrientation(OrientationType.NONE);
	    anim.setDuration(new Duration(10000));
	    anim.setCycleCount(1);
	    anim.setAutoReverse(false);
	    anim.play();
		
	}
	
    public static void main(String[] args) {
        Application.launch(args);
    }
}
