<%--
  Created by IntelliJ IDEA.
  User: 唐思文
  Date: 2019/2/14
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>帖子详情页</title>
</head>
<body>
<form action="/demol" method="post">
    分类:<select>
    <option value="0">wang</option>
    <option value="1">Saab</option>
    <option value="2">Opel</option>
    <option value="3">Audi</option>
</select>
    <input type="submit" value="查询">
</form>
<table border="1">
    <thead>
    <tr>
        <th>帖子Id</th>
        <th>标题</th>
        <th>详细</th>
        <th>作者</th>
        <th>发布时间</th>
        <th>回复次数</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${bbsSort}" var="bbsSort">
        <tr>
            <c:forEach items="${bbsSort.details}" var="details">
                <td>${details.id}</td>
                <td>${details.titile}</td>
                <td>${details.detail}</td>
                <td>${details.author}</td>
                <td><fmt:formatDate value="${details.createDate}" pattern="yyyy/MM/dd"></fmt:formatDate></td>
                <td>${details.replyCount}</td>
            </c:forEach>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
