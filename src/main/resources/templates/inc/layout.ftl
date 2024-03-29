<#-- Layout -->
<#macro layout title> <!-- 定义一个宏  layout 是宏名称  title为参数-->
    <!DOCTYPE html>
    <html lang="zh-CN">
        <head>
            <meta charset="utf-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <!--[if IE]>
            <meta http-equiv='X-UA-Compatible' content='IE=edge,chrome=1'/>
            <![endif]-->

            <title>${title?default('myblog')}</title>

            <#--引入样式-->
            <link rel="stylesheet" href="${base}/res/layui/css/layui.css">
            <link rel="stylesheet" href="${base}/res/css/global.css">

            <script src="${base}/res/layui/layui.js"></script>
        </head>

        <body>
            <#include "/inc/header.ftl" />
            <#nested> <!-- 这里是要替换代码的位置 -->
           <#include "/inc/footer.ftl" />
        </body>
    </html>
</#macro>