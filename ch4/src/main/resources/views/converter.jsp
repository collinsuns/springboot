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
    <title>HttpMessageConverter page</title>
</head>
<body>
    <div id="resp">
        <div>
            <input type="button" onclick="req();" value="请求"/>
            <script src="assets/jquery.js" type="text/javascript"></script>
            <%--<script src="http://libs.baidu.com/jquery/2.0.0/jquery.js"></script>--%>
            <script>
                function req() {
                    $.ajax({
                        url:"convert",
                        data:"1-test",
                        type:"POST",
                        contentType:"application/x-suns",
                        success:function(data) {
                            $("#resp").html(data);
                        }
                    });
                }
            </script>
        </div>
    </div>
</body>
</html>
