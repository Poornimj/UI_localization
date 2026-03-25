import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class FuelController {

    @FXML
    private Label lblDistance;

    @FXML
    private Label lblConsumption;

    @FXML
    private Label lblPrice;

    @FXML
    private Label lblResult;

    @FXML
    private TextField txtDistance;

    @FXML
    private TextField txtConsumption;

    @FXML
    private TextField txtPrice;

    @FXML
    private Button btnCalculate;

    private ResourceBundle bundle;

    @FXML
    public void initialize() {
        setLanguage(Locale.US);
    }

    private void setLanguage(Locale locale) {
        bundle = ResourceBundle.getBundle("messages", locale);

        lblDistance.setText(bundle.getString("distance.label"));
        lblConsumption.setText(bundle.getString("consumption.label"));
        lblPrice.setText(bundle.getString("price.label"));
        btnCalculate.setText(bundle.getString("calculate.button"));
        lblResult.setText(bundle.getString("result.default"));
    }

    @FXML
    private void calculate() {
        try {
            double distance = Double.parseDouble(txtDistance.getText());
            double consumption = Double.parseDouble(txtConsumption.getText());
            double price = Double.parseDouble(txtPrice.getText());

            double totalFuel = (consumption / 100.0) * distance;
            double totalCost = totalFuel * price;

            String result = MessageFormat.format(
                    bundle.getString("result.label"),
                    String.format("%.2f", totalFuel),
                    String.format("%.2f", totalCost)
            );

            lblResult.setText(result);

        } catch (Exception e) {
            lblResult.setText(bundle.getString("invalid.input"));
        }
    }

    @FXML
    private void switchToEnglish() {
        setLanguage(Locale.US);
    }

    @FXML
    private void switchToFrench() {
        setLanguage(Locale.FRANCE);
    }

    @FXML
    private void switchToJapanese() {
        setLanguage(Locale.JAPAN);
    }

    @FXML
    private void switchToPersian() {
        setLanguage(new Locale("fa", "IR"));
    }
}