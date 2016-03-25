<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${title}</title>
<link rel="shortcut icon"
	href="<c:url value='/resources/images/favicon.ico'/>"
	type="image/x-icon">
<link rel="icon" href="<c:url value='/resources/images/favicon.ico'/>"
	type="image/x-icon">
<!-- <link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<link
	href="http://vitalets.github.io/angular-xeditable/starter/angular-xeditable/css/xeditable.css"
	rel="stylesheet">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>

<script
	src="http://vitalets.github.io/angular-xeditable/starter/angular-xeditable/js/xeditable.js"></script>
 -->
<link
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css"
	rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
<link href="resources/css/xeditable.css" rel="stylesheet">
<script src="resources/js/jquery.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/angular.min.js"></script>
<script	src="resources/js/xeditable.js"></script>
<script type="text/javascript" src="resources/js/app.js"></script>
<style>
.cell {
	border: 1px solid #ddd;
	padding: 8px;
	height: 48px;
}

.header {
	font-weight: bold;
	border: 1px solid #ddd;
	padding: 8px;
}

.select-box {
	height: 30px;
	width: 100%;
	padding-left: 12%;
	border-radius: 3px;
}

.alert-wrapper {
	position: fixed;
	bottom: 0;
	left: 50%;
	z-index: 9999;
	transform: translateX(-50%);
	 -webkit-animation: mymove 5s; 
    animation: mymove 5s;
}

@-webkit-keyframes mymove {
    from {bottom: 0px;}
    to {bottom: 80px;}
}

@keyframes mymove {
    from {bottom: 0px;}
    to {bottom: 80px;}
}

.alert-box {
	color: #555;
	border-top-left-radius: 10px;
	border-top-right-radius: 10px;
	font-family: Tahoma, Geneva, Arial, sans-serif;
	font-size: 11px;
	padding: 10px 36px;
	display: inline-block;
}

.alert-box span {
	font-weight: bold;
	text-transform: uppercase;
}

.message {
	background: #90DED7 url('/resources/images/success.png') no-repeat 10px 50%;
	border: 1px solid #53DED8;
	border-bottom: none;
}

.error {
	background: #ffecec url('/resources/images/error.png') no-repeat 10px 50%;
	border: 1px solid #f5aca6;
	border-bottom: none;
}
</style>
</head>
<body ng-app="myApp">
	<tiles:insertAttribute name="header" />
	<tiles:insertAttribute name="body" />
	<tiles:insertAttribute name="footer" />
</body>
</html>