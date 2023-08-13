import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class CalculadoraController {

    @FXML
    private ToggleButton botao_0;

    @FXML
    private ToggleButton botao_1;

    @FXML
    private ToggleButton botao_2;

    @FXML
    private ToggleButton botao_3;

    @FXML
    private ToggleButton botao_4;

    @FXML
    private ToggleButton botao_5;

    @FXML
    private ToggleButton botao_6;

    @FXML
    private ToggleButton botao_7;

    @FXML
    private ToggleButton botao_8;

    @FXML
    private ToggleButton botao_9;

    @FXML
    private ToggleButton botao_apagar;

    @FXML
    private ToggleButton botao_divisao;

    @FXML
    private ToggleButton botao_igual;

    @FXML
    private ToggleButton botao_mais;

    @FXML
    private ToggleButton botao_menos;

    @FXML
    private ToggleButton botao_multiplicacao;

    @FXML
    private ToggleButton botao_parentese_direito;

    @FXML
    private ToggleButton botao_parentese_esquerdo;

    @FXML
    private ToggleButton botao_pi;

    @FXML
    private ToggleButton botao_ponto;

    @FXML
    private ToggleButton botao_zerar;

    @FXML
    private TextField campo_tela;

    @FXML
    void digitar_0(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("0", "digito_comum"));
    }

    @FXML
    void digitar_1(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("1", "digito_comum"));
    }

    @FXML
    void digitar_2(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("2", "digito_comum"));
    }

    @FXML
    void digitar_4(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("4", "digito_comum"));
    }

    @FXML
    void digitar_5(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("5", "digito_comum"));
    }   

    @FXML
    void digitar_6(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("6", "digito_comum"));
    }

    @FXML
    void digitar_7(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("7", "digito_comum"));
    }

    @FXML
    void digitar_8(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("8", "digito_comum"));
    }

    @FXML
    void digitar_9(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("9", "digito_comum"));
    }

    @FXML
    void digitar_apagar(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("apagar_digito", "apagar_digito")); 
    }

    @FXML
    void digitar_divisao(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("/", "digito_comum"));
    }

    @FXML
    void digitar_igual(ActionEvent event) {
        try {
            double resultado = Calculos.calcularExpressao(Calculos.concatenaString("", "digito_comum"));
            String resultado_string = String.valueOf(resultado);
            campo_tela.setText(Calculos.concatenaString(resultado_string, "digitar_igual"));
        } catch (Exception e) {
            System.out.println("Erro ao calcular a expressão: " + e.getMessage());
        }
    }
   
    @FXML
    void digitar_mais(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("+", "digito_comum"));
    }

    @FXML
    void digitar_menos(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("-", "digito_comum"));
    }

    @FXML
    void digitar_multiplicacao(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("*", "digito_comum"));
    }

    @FXML
    void digitar_parentese_direito(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString(")", "digito_comum"));
    }

    @FXML
    void digitar_parentese_esquerdo(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("(", "digito_comum"));
    }

    @FXML
    void digitar_pi(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("3.14", "digito_comum"));
    }

    @FXML
    void digitar_ponto(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString(".", "digito_comum"));
    }

    @FXML
    void digitar_zerar(ActionEvent event) {
        campo_tela.setText(Calculos.concatenaString("apagar_tudo", "apagar_tudo"));
    }

    @FXML
    void digitou_3(ActionEvent event) {
       campo_tela.setText(Calculos.concatenaString("3", "digito_comum")); 
    }
}
