//U10316050 ²ø´¼µ¾


import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.scene.paint.*;


public class BeanGame extends Pane {
	public BeanGame(){
		Polyline Polyline = new Polyline();//set the side
		Polyline.getPoints().addAll(new Double[]{
			450.0, 30.0,
		    450.0, 100.0,
		    150.0, 700.0,
		    150.0, 900.0,
		    850.0, 900.0,
		    850.0, 700.0,
		    550.0, 100.0,
		    550.0, 30.0});
		Polyline.setStrokeWidth(6);
		Polyline.setStroke(Color.GRAY);
		Polyline.setFill(null);
		Line line1 = new Line(237.5,900,237.5,700);//set the line
		Line line2 = new Line(325,900,325,700);
		Line line3 = new Line(412.5,900,412.5,700);
		Line line4 = new Line(500,900,500,700);
		Line line5 = new Line(587.5,900,587.5,700);
		Line line6 = new Line(675,900,675,700);
		Line line7 = new Line(762.5,900,762.5,700);

		Circle circle2 = new Circle(237.5,700,10,Color.RED);//set the circle
		Circle circle3 = new Circle(325,700,10,Color.RED);
		Circle circle4 = new Circle(412.5,700,10,Color.RED);
		Circle circle5 = new Circle(500,700,10,Color.RED);
		Circle circle6 = new Circle(587.5,700,10,Color.RED);
		Circle circle7 = new Circle(675,700,10,Color.RED);
		Circle circle8 = new Circle(762,700,10,Color.RED);
		Circle circle9 = new Circle(281.25,600,10,Color.RED);
		Circle circle10 = new Circle(368.75,600,10,Color.RED);
		Circle circle11 = new Circle(456.25,600,10,Color.RED);
		Circle circle12 = new Circle(543.75,600,10,Color.RED);
		Circle circle13 = new Circle(631.25,600,10,Color.RED);
		Circle circle14 = new Circle(718.75,600,10,Color.RED);
		Circle circle15 = new Circle(325,500,10,Color.RED);
		Circle circle16 = new Circle(412.5,500,10,Color.RED);
		Circle circle17 = new Circle(500,500,10,Color.RED);
		Circle circle18 = new Circle(587.5,500,10,Color.RED);
		Circle circle19 = new Circle(675,500,10,Color.RED);
		Circle circle20 = new Circle(368.75,400,10,Color.RED);
		Circle circle21 = new Circle(456.25,400,10,Color.RED);
		Circle circle22 = new Circle(543.75,400,10,Color.RED);
		Circle circle23 = new Circle(631.25,400,10,Color.RED);
		Circle circle25 = new Circle(412.5,300,10,Color.RED);
		Circle circle26 = new Circle(500,300,10,Color.RED);
		Circle circle27 = new Circle(587.5,300,10,Color.RED);
		Circle circle28 = new Circle(543.75,200,10,Color.RED);
		Circle circle29 = new Circle(456.25,200,10,Color.RED);
		Circle circle30 = new Circle(500,100,10,Color.RED);


		
		line1.setStrokeWidth(5);//set the line width
		line2.setStrokeWidth(5);
		line3.setStrokeWidth(5);
		line4.setStrokeWidth(5);
		line5.setStrokeWidth(5);
		line6.setStrokeWidth(5);
		line7.setStrokeWidth(5);
		
		line1.setStroke(Color.BLACK);
		getChildren().addAll(Polyline,line1,line2,line3,line4,line5,line6,line7,circle2,circle3,circle4,circle5,circle6,circle7,circle8,circle9,circle10,circle11,circle12,circle13,circle14,circle15,circle16,circle17,circle18,circle19,circle20,circle21,circle22,circle23,circle25,circle26,circle27,circle28,circle29,circle30);
		
	}
}