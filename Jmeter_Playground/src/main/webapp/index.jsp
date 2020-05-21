<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/plugins/easyui/uimaker/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/static/plugins/easyui/uimaker/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/plugins/easyui/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/base.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/static/js/index.js"></script>
</head>

<body>
<h2>Index jsp</h2>

<form id="userForm" method="post" action="#">
    <input type="text" name="username" id="username_box"><br>
    <input type="text" name="age" id="age_box"><br>
    <input type="submit" id="submit_btn" value="submit"><br>
</form>


</body>

</html>

