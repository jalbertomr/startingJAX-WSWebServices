/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorws_client_application;

/**
 *
 * @author Bext
 */
public class CalculatorWS_Client_Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 3;
        int j = 4;
        System.out.println( hello("Perrito"));
        
        try {
            int result = add(i, j);
            System.out.println( "add(" + i + "," + j + ") Result = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
        
        try {
            int result = substract(i, j);
            System.out.println("substract(" + i + "," + j + ") Result = " + result);
        } catch (Exception ex) {
            System.out.println("Exception: " + ex);
        }
    }

    private static int add(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }

    private static String hello(java.lang.String txt) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.hello(txt);
    }

    private static int substract(int i, int j) {
        org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
        org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.substract(i, j);
    }
    
}
