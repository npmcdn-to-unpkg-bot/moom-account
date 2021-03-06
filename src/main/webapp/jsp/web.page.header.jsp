<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ page language="java" pageEncoding="UTF-8"%><%@ page
	contentType="text/html;charset=UTF-8"%>
<nav class="navbar navbar-default nav-site">
	<div class="container-fluid">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" data-target="#navbar" aria-expanded="false"
				aria-controls="navbar">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="#" style="color: #FFFFFF">Quản lý
				tài khoản</a>
		</div>
		<div id="navbar" class="navbar-collapse collapse">
			<ul class="nav navbar-nav navbar-right">
				<security:authorize access="hasRole('ROLE_ADMIN')">
					<li class="${users}"><a href="/user" style="color: #FFFFFF">Quản
							lý người dùng</a></li>
				</security:authorize>
				<li class="${faccounts}"><a href="/faccount"
					style="color: #FFFFFF">Quản lý Facebook</a></li>
				<li class="${emails}"><a href="/email" style="color: #FFFFFF">Quản
						lý Email</a></li>
				<li class="${userView}"><a href="/user/information"
					style="color: #FFFFFF">Thông tin của tôi</a></li>
				<li><a href="<c:url value="j_spring_security_logout"/>"
					style="color: #FFFFFF">Đăng xuất</a></li>
			</ul>
		</div>
	</div>
</nav>