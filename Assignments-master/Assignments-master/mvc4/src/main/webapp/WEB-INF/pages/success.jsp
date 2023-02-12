<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1" %>
  <%@page isELIgnored="false" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
    "http://www.w3.org/TR/html4/loose.dtd">
   
    <html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Hello</title>
    </head>

    <body>
    <h1>Welcome, ${name}</h1>
    <h1>Your email address is ${email}</h1>
        <table>
            <tr>
                <td>
                <a href="<%=request.getContextPath() %>/index">Home</a>
                </td>
            </tr>
        </table>
    </body>

    </html>