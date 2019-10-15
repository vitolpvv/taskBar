<#import "parts/common.ftl" as c>

<@c.page>

<div>
    <div>Редактировать контакт</div>
    <form method="post">
        <input type="text" name="title" value="${task.title}"/>
        <input type="text" name="description" value="${task.description}"/>
        <input type="hidden" name="id" value="${task.id}" />
        <input type="hidden" name="_csrf" value="${_csrf.token}" />
        <button type="submit">Сохранить</button>
    </form>
</div>

</@c.page>