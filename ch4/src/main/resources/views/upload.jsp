<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/4/11
  Time: 17:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<html>
<head>
    <meta http-equiv="content-type" content="text/html"; charset="UTF-8">
    <title>upload page</title>
</head>
<body>
    <div class="upload">
        <form action="upload" enctype="multipart/form-data" method="post">
            <input type="file" name="file"><br/>
            <input type="submit" value="上传">
        </form>
    </div>
</body>
</html>
