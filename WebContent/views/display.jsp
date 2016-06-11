<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>显示页面</title>
</head>
<body>
<table border="1">
<tr><th>学生编号</th><th>学生姓名</th><th>学生邮箱</th><th>出生日期</th><th>操作</th></tr>
<c:forEach var="stu" items="${list}" varStatus="Status">
<tr>
<th>${stu.id}</th>
<th>${stu.name}</th>
<th>${stu.email}</th>
<th>${stu.birthday}</th>
<th><a href="update?id=${stu.id}">编辑</a>&nbsp;&nbsp;<a href="view">查看</a>&nbsp;&nbsp;<a href="delete">删除</a></th>
</tr>
</c:forEach>
</table>
<a href="add">添加</a>
</body>
</html>