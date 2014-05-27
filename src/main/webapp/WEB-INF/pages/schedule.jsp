<%--
  Created by IntelliJ IDEA.
  User: huaiwang
  Date: 5/27/14
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<html>
<head>
    <title></title>
    <script type="text/javascript"
            src="<%= request.getContextPath() %>/js/jquery-1.11.1.js"></script>
    <style type="text/css">
        #ifrm {
            width: 100%;
            height: 90%;
        }
    </style>
    <script type="text/javascript">
        $(function () {
            $('#sel').change(function (e) {
                var el = $(e.target);
                var id = el.val();

                $('#ifrm').attr('src', '<%= request.getContextPath() %>/sche/' + id);
//                get_xml(id);
            });
        });

        function get_xml(id) {
            var xhr = $.ajax({
                url: "<%= request.getContextPath() %>/sche/" + id,
                dataType: "text"
            });

            xhr.done(function (rst) {
                $('#pre').html(rst);
            });

            xhr.fail(function (rst) {
                console.log("error");
            });
        }
    </script>
</head>
<body>

<c:choose>
    <c:when test="${hospitals == null or fn:length(hospitals) == 0}">
        no attributes
    </c:when>
    <c:otherwise>
        <select id="sel">
            <c:forEach items="${hospitals}" var="hospital">
                <option value='<c:out value="${hospital.key}"/>'>
                    <c:out value="${hospital.value}"/>
                </option>
            </c:forEach>
        </select>
    </c:otherwise>
</c:choose>

<hr/>

<iframe id="ifrm"/>

</body>
</html>
