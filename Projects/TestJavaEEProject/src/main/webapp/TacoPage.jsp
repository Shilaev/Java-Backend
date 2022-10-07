<%--
  Created by IntelliJ IDEA.
  User: shilaevvalentin
  Date: 07.10.2022
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Taco page</title>
</head>
<body>
<h1>Taco page</h1>
<p>
    <%
        String tacoText = "This is taco page";
        for (int i = 0; i < 10; i++) {
            out.println(tacoText);
        }
    %>
</p>
</body>
</html>
