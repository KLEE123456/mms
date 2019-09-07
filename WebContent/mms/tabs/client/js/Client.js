// 查询顾客信息begin
function SCMclick() {
    if(access.indexOf("信息查询功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if (!$('#output').tabs('exists', '查询顾客信息')) {
        $('#output').tabs('add', {
            // id:'SCM',
            title: '查询顾客信息',
            href: './tabs/client/Search.html',

            closable: true
        });
    }
    else
    {
        $('#output').tabs('select', '查询顾客信息');
    }
}

// 查询顾客信息end