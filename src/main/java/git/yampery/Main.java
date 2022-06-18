package git.yampery;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * <p>项目入口</p>
 *
 * @author Yampery
 * @date 2022/6/18 16:32
 */
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent main = FXMLLoader.load(getClass().getResource("/main.fxml"));
        primaryStage.setTitle("工具类");
        primaryStage.setScene(new Scene(main));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
