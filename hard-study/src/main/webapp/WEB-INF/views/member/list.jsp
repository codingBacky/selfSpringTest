<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <h2>Team The Shard</h2>
  <a href="memberWrite.do" class="btn float-right">팀원 추가</a>
  <table class="table table-hover">
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>전화번호</th>
        <th>나이</th>
      </tr>
    </thead>
    <tbody>
     <c:forEach var="list" items="${list }">
      <tr>
        <td>${list.uno}</td>
        <td>${list.uname}</td>
        <td>${list.phone }</td>
        <td>${list.age}</td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
</div>
</body>
</html>