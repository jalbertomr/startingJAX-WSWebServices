
package org.me.calculator;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "CalculatorWS", targetNamespace = "http://calculator.me.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorWS {


    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.AddResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/addRequest", output = "http://calculator.me.org/CalculatorWS/addResponse")
    public int add(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

    /**
     * 
     * @param i
     * @param j
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "substract", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Substract")
    @ResponseWrapper(localName = "substractResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.SubstractResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/substractRequest", output = "http://calculator.me.org/CalculatorWS/substractResponse")
    public int substract(
        @WebParam(name = "i", targetNamespace = "")
        int i,
        @WebParam(name = "j", targetNamespace = "")
        int j);

    /**
     * 
     * @param txt
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://calculator.me.org/", className = "org.me.calculator.HelloResponse")
    @Action(input = "http://calculator.me.org/CalculatorWS/helloRequest", output = "http://calculator.me.org/CalculatorWS/helloResponse")
    public String hello(
        @WebParam(name = "txt", targetNamespace = "")
        String txt);

}
