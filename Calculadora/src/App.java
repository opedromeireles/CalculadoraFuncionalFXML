import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application{

    private static Scene telaCalculadora; 
    static Stage stage; 
    public static void main(String[] args) throws Exception {
        launch(args);
    }

     @Override
    public void start(Stage primaryStage) throws Exception{
        stage = primaryStage;

        final FXMLLoader telacalculadoraXML = new FXMLLoader(getClass().getResource("fxmls/calculadora.fxml"));

        telaCalculadora = new Scene(telacalculadoraXML.load());
        stage.setScene(telaCalculadora);
        stage.show(); 
    }
}
