import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class HelloWorld  extends Application{


	public static void main(String[] args) {
				
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		Button btn = new Button("Click Me");
		Button exit = new Button("Exit");
		exit.setOnAction(e -> System.exit(0));
		btn.setOnAction(new EventHandler<ActionEvent>()
		{
				@Override
				public void handle(ActionEvent event)
				{
					System.out.println("Hello World");
				}
		});
		//StackPane  root = new StackPane();
		VBox root = new VBox();
		//root.getChildren().add(btn);		
		root.getChildren().addAll(btn,exit);
		Scene  scene = new Scene(root,500,300);
		primaryStage.setScene(scene);
		primaryStage.setTitle("My First Fx");
		primaryStage.show();
	}
}
