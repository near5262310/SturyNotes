<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="/CASCS/page/js/welcome.js"></script>
<title>Insert title here</title>
</head>
<body>
<div class="teacher-center">
    <div class="teacher-bread">
        <strong>Welcome</strong>&gt;&gt;<strong>Teacher List</strong>
    </div>
    <div><strong id='teacher-add-teacher'>Add teacher</strong></div>
    <div id="list-teacher">
        <form>
	        <table>
	            <tr>
	               <td>Number:</td>
	               <td>UserName:</td>
	               <td>Gender:</td>
	               <td>Major:</td>
	               <td>Department:</td>
	               <td>Title:</td>
	               <td>IsAdmin:</td>
	            </tr>
	            
	            <c:forEach items="${requestScope.teacherList }" var="teacher">
	               <tr>
	                   <td>${teacher.number }</td>
	                   <td>${teacher.username }</td>
	                   <td>${teacher.sex }</td>
	                   <td>${teacher.major }</td>
	                   <td>${teacher.department }</td>
	                   <td>${teacher.title }</td>
	                   <td>${teacher.isAdmin }</td>
	               </tr>
	            </c:forEach>
	        </table>
        </form>
    </div>
    
    <div id='teacher-add-teacher-page'>
        <form id="teacher-form-teacher">
            <table>
                <tr>
                    <td>Number:</td><td><input type="text" name="number"> </td>
                </tr>
                <tr>
                    <td>UserName:</td><td><input type="text" name="username"> </td>
                </tr>
                <tr>
                    <td>Gender:</td><td><input type="text" name="sex" ></td>
                </tr>
                <tr>
                    <td>Major:</td><td><input type="text" name='major' ></td>
                </tr>
                <tr>
                    <td>Department:</td><td><input type="text" name='department' ></td>
                </tr>
                <tr>
                    <td>Title:</td><td><input type="text" name='title' ></td>
                </tr>
                <tr>
                    <td>IsAdmin:</td><td><input type="text" name='isAdmin' ></td>
                </tr>
                <tr>
                    <td><input type="button" value="ok" id='teacher-create-add'> </td>
                    <td><input type="button" value="cancel" id='teacher-create-cancel'> </td>
                </tr>
            </table>
        </form>
    </div>
</div>
</body>
</html>