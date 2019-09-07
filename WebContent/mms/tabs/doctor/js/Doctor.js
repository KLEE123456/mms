//查询医生信息begin
function SDMclick() {
    if(access.indexOf("信息查询功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if (!$('#output').tabs('exists', '查询医生信息')) {
        $('#output').tabs('add', {
            title: '查询医生信息',
            href: './tabs/doctor/Search.html',
            closable: true
        });
    }
    else
    {
        $('#output').tabs('select', '查询医生信息');
    }
}
//查询医生信息end
