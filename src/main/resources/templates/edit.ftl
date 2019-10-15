<#import "parts/cssform.ftl" as c>
<#import "parts/auth.ftl" as l>


<@c.page>
<@l.logout/>

    <div id="action_form">
        <form method="post" action="/edit">
            <h4>Редактировать задачу</h4>
            <label for="summary">Тема</label>
            <input id="summary" name="title" type="text" value="${task.title}">
            <br/>
            <label for="summary">Описание</label>
            <textarea id="description" name="description">${task.description}</textarea>
            <input type="hidden" name="id" value="${task.id}" />
            <input type="hidden" name="_csrf" value="${_csrf.token}" />
            <button type="submit">Сохранить</button>
        </form>
    </div>

</@c.page>