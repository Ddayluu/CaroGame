import Board.Board;
import GameDriver.Driver;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private Driver driver = new Driver();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("CaroGame");

        Board board = new Board(driver);

        primaryStage.setScene(new Scene(driver.getRoot(), 1200, 800));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}