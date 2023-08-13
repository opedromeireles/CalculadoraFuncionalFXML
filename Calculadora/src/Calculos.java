import java.util.Stack;

public class Calculos {
    protected static String expressao_completa = ""; 

    protected static String concatenaString(String num, String codigo){
        if(codigo.equals("apagar_tudo")){
            expressao_completa = "";
            return " "; 
        }
        if(codigo.equals("apagar_digito")){
            String ultimo_digito = expressao_completa.substring(expressao_completa.length()-1);
            return expressao_completa = expressao_completa.replace(ultimo_digito, ""); 
        }
        if(codigo.equals("digitar_igual")){
            return expressao_completa = num; 
        }
    
        return expressao_completa = expressao_completa.concat(num); 
    }

    public static double calcularExpressao(String expressao_completa){
        Stack<Double> numeros = new Stack<>();
        Stack<Character> operadores = new Stack<>();

        for (int i = 0; i < expressao_completa.length(); i++) {
            char caractere = expressao_completa.charAt(i);

            if (caractere == ' ') {
                continue;
            } else if (caractere == '(') {
                operadores.push(caractere);
            } else if (Character.isDigit(caractere)) {
                StringBuilder numeroStr = new StringBuilder();
                while (i < expressao_completa.length() && (Character.isDigit(expressao_completa.charAt(i)) || expressao_completa.charAt(i) == '.')) {
                    numeroStr.append(expressao_completa.charAt(i));
                    i++;
                }
                i--;

                double numero = Double.parseDouble(numeroStr.toString());
                numeros.push(numero);
            } else if (caractere == '+' || caractere == '-' || caractere == '*' || caractere == '/') {
                while (!operadores.isEmpty() && precedencia(operadores.peek()) >= precedencia(caractere)) {
                    calcularOperacao(numeros, operadores);
                }
                operadores.push(caractere);
            } else if (caractere == ')') {
                while (operadores.peek() != '(') {
                    calcularOperacao(numeros, operadores);
                }
                operadores.pop();
            }
        }

        while (!operadores.isEmpty()) {
            calcularOperacao(numeros, operadores);
        }

        return numeros.pop();
    }
    
    public static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '(':
                return 0;
        }
        return -1;
    }

    public static void calcularOperacao(Stack<Double> numeros, Stack<Character> operadores) {
        double num2 = numeros.pop();
        double num1 = numeros.pop();
        char operador = operadores.pop();

        double resultado = 0.0;
        switch (operador) {
            case '+':
                resultado = num1 + num2;
                break;
            case '-':
                resultado = num1 - num2;
                break;
            case '*':
                resultado = num1 * num2;
                break;
            case '/':
                resultado = num1 / num2;
                break;
        }
        numeros.push(resultado);
    }
}
