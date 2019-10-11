<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <style>
    html, body{width:100%; height:100%; margin:0}
    #action_form{
        position:absolute;
        width:200px;
        height:215px;
        left:10%;
        top:20%;
        margin-left:-100px;
        margin-top:-100px;
        border:1px solid

    }
    form{padding:14px}
    </style>
</head>
<body>

<div id="action_form">
    <form method="post" action="/edit">
        <h4>Добавить задачу</h4>
        <label for="summary">Тема</label>
        <input id="summary" name="title" type="text" value="">
        <br />
        <label for="summary">Описание</label>
        <textarea id="description" name="description"></textarea>

        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <p><button type="submit">Добавить</button></p>
    </form>
</div>

</body>
</html>