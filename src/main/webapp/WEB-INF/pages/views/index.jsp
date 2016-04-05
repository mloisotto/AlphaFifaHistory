<%--
  Created by IntelliJ IDEA.
  User: Mariano
  Date: 4/5/2016
  Time: 7:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en" ng-app="fifaHistoryApp">
<head>
  <meta charset="UTF-8">
  <title></title>
  <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.5/angular.min.js"></script>
  <script src="/fifahistory-alpha/static/js/app.js"></script>
  <script src="/fifahistory-alpha/static/js/controllers/userController.js"></script>

</head>
<body ng-controller="userController">
<div ng-repeat="user in users">

  <span><label>Name:</label> {{user.name}}</span>
  <span><label>Nickname:</label>{{user.nickname}}</span>
</div>

<!--<h1>Hola {{nombre}}</h1>-->
<!--<div>-->
<!--<form action="">-->
<!--¿Cómo te llamas? <input type="text" ng-model="nombre">-->
<!--</form>-->
<!--</div>-->

</body>
</html>