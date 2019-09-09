// 修改药品类别信息begin
function MMTMclick(){
    if(access.indexOf("信息修改功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','修改药品类别信息')) {
        $('#output').tabs('add',{
            title:'修改药品类别信息',
            href:'./tabs/medtype/Modify.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '修改药品类别信息');
    }
}

// 删除药品类别信息end