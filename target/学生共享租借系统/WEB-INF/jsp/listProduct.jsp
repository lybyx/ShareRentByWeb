<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: lybxxx
  Date: 2020/9/24
  Time: 17:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="width:500px;margin:0px auto;text-align:center">
    <table align='center' border='1' cellspacing='0'>
        <tr>
            <td>id</td>
            <td>name</td>
            <td>price</td>
            <td>image</td>
        </tr>
        <c:forEach items="${products}" var="c" varStatus="st">
            <tr>
                <td width="25%">${c.id}</td>
                <td width="25%">${c.name}</td>
                <td width="25%">${c.price}</td>
                <td width="25%"><img src=${c.imageUrl} > </td>
            </tr>
        </c:forEach>
    </table>
</div>

</body>
</html>
