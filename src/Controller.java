import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private TextField age;

    @FXML
    private Button calculateButton;

    @FXML
    private Label targetMin;

    @FXML
    private Label targetMax;

    @FXML
    private Label max;

    float calculatePercent (float value, float percentage){
      return value * percentage / 100;
    }

    @FXML
    void onCalculateButtonClicked(MouseEvent event) {
      float ageFloat = Float.parseFloat(age.getText());
      float maxRate = 220 - ageFloat;
      max.setText(String.valueOf(maxRate));
      targetMin.setText(String.valueOf(calculatePercent(maxRate, 50)));
      targetMax.setText(String.valueOf(calculatePercent(maxRate, 85)));
    }

}
