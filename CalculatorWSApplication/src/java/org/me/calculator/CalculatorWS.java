/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Bext
 */
@WebService(serviceName = "CalculatorWS")
@Stateless()
public class CalculatorWS {


    /**
     * Web service operation
     */
    @WebMethod(operationName = "add")
    public int add(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i + j;
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "substract")
    public int substract(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        int k = i - j;
        return k;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "txt") String txt) {
        return ("Hello " + txt + "!");
    }

}
