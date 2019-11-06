<html>
    <head>
        <title>SpringBoot页面与数据库</title>
    </head>
    <body>
        <table border="" cellpadding="10px" cellspacing="">
            <tr>
                <th>用户id</th>
                <th>用户名</th>
                <th>密码</th>
                <th>姓名</th>
            </tr>
            <#--<#list userList as user>
                <tr>
                    <th>${user.id}</th>
                    <th>${user.username}</th>
                    <th>${user.password}</th>
                    <th>${user.name}</th>
                </tr>
            </#list>-->
            <#list muserList as muser>
                <tr>
                    <th>${muser.id}</th>
                    <th>${muser.username}</th>
                    <th>${muser.password}</th>
                    <th>${muser.name}</th>
                </tr>
            </#list>
        </table>
    </body>
</html>