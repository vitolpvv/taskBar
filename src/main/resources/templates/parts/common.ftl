<#macro page>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>TaskBar</title>
    <link rel='stylesheet' href='css/auth.css'>
    <link rel='stylesheet' href='css/common.css'>
    <script src="js/auth.js"/>
</head>
<body>
    <header class="header">
        <img src="image/logo.png" alt="Логотип" class="header__logo-image">
        <h3 class="header__title">TaskBar</h3>
        <img src="image/anonymous-user.png" alt="Аватар пользователя" class="header__user-image">
    </header>

    <#nested>

</body>
</html>
</#macro>