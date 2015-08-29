<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
        <strong>Welcome</strong>&gt;&gt;<strong>Teacher Message</strong>
    </div>
    <div><strong id="teacher-change-password-btn">Change Password</strong></div>
    <div id='teacher-update'>
        <form id='teacher-form-update'>
            <table>
                <tr>
                    <td>Number:</td><td><input type="text" value="${sessionScope.currentUser.number }" disabled="disabled"></td>
                </tr>
                <tr>
                    <td>UserName:</td><td><input type="text" value="${sessionScope.currentUser.username }" disabled="disabled"></td>
                </tr>
                <tr>
                    <td>Gender:</td><td><input type="text" value="${sessionScope.currentUser.sex }" name="sex"></td>
                </tr>
                <tr>
                    <td>Major:</td><td><input type="text" value="${sessionScope.currentUser.major }" name="major"></td>
                </tr>
                <tr>
                    <td>Department:</td><td><input type="text" value="${sessionScope.currentUser.department }" name="department"></td>
                    </tr>
                <tr>
                    <td>Title:</td><td><input type="text" value="${sessionScope.currentUser.title }" name="title"></td>
                    </tr>
                <tr>
                    <td>IsAdmin:</td><td><input type="text" value="${sessionScope.currentUser.isAdmin }" disabled="disabled"> </td>
                </tr>
                <tr>
                <td>
                    <input type="button" value="ok" id="teacher-update-ok"></td><td><input type="button" value="cancel" id="teacher-profile-cancel"></td>
                </tr>
            </table>
        </form>
    </div>
    
    <div id='teacher-change-password-page'>
        <form id="teacher-form-password">
	        <table>
	            <tr><td>Password:</td><td><input type="text" name="password"> </td></tr>
	            <tr><td>RePassword:</td><td><input type="text" name="repassword"> </td></tr>
	            <tr><td><input type="button" value="ok" id='teacher-change-password-ok'> </td><td><input type="button" value="cancel" id="teacher-change-password-cancel"> </td></tr>
	        </table>
        </form>
    </div>
</div>
</body>
</html>