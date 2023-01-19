
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Car Rental App</title>
    </head>
    <body>
        <h1>Car Rental App</h1>
        <c:if test="${empty carList}">
    <p>Nie ma żadnych dostępnych samochodów</p>
</c:if>
<c:if test="${not empty carList}">
    <table>
        <tr>
            <th>Nazwa</th>
            <th>Model</th>
            <th>Cena</th>
        </tr>
        <c:forEach var="car" items="${cars}">
            <tr>
                <td>${car.carName}</td>
                <td>${car.carModel}</td>
                <td>${car.carPrice}</td>
            </tr>
        </c:forEach>
    </table>
</c:if>
    </body>
</html>