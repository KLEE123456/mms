// 查询经办人信息begin
function SAMclick() {
    if(access.indexOf("信息查询功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if (!$('#output').tabs('exists', '查询经办人信息')) {
        $('#output').tabs('add', {
            // id:'SUM',
            title: '查询经办人信息',
            href: './tabs/agency/Search.html',
            closable: true
        });
    }
    else
    {
        $('#output').tabs('select', '查询经办人信息');
    }
}


// 查询经办人信息end