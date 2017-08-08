<%-- 
    Document   : index
    Created on : 6/08/2017, 11:42:05 PM
    Author     : Bext
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>    
        <%-- start web service invocation --%><hr/>
        <%
            try {
                org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
                org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
                // TODO initialize WS operation arguments here
                java.lang.String txt = "Perrito";
                // TODO process result here
                java.lang.String result = port.hello(txt);
                out.println("Result = " + result);
            } catch (Exception ex) {
                out.println("Exception:" + ex);
            }
        %>
        <%-- end web service invocation --%><hr/>

        <%-- start web service invocation --%><hr/>
        <%
            try {
                org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
                org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
                // TODO initialize WS operation arguments here
                int i = 3;
                int j = 4;
                // TODO process result here
                int result = port.add(i, j);
                out.println("add(" + i + "," + j + ") Result = " + result);
            } catch (Exception ex) {
                out.println("Exception:" + ex);
            }
        %>
        <%-- end web service invocation --%><hr/>
        <%-- start web service invocation --%><hr/>
        <%
            try {
                org.me.calculator.CalculatorWS_Service service = new org.me.calculator.CalculatorWS_Service();
                org.me.calculator.CalculatorWS port = service.getCalculatorWSPort();
                // TODO initialize WS operation arguments here
                int i = 3;
                int j = 4;
                // TODO process result here
                int result = port.substract(i, j);
                out.println("substract(" + i + "," + j + ") Result = " + result);
            } catch (Exception ex) {
                out.println("Exception: " + ex);
            }
        %>
        <%-- end web service invocation --%><hr/>

    </body>
</html>
