// 修改医生信息begin
function MDTclick(){
    if(access.indexOf("信息修改功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','修改医生信息')) {
        $('#output').tabs('add',{
            title:'修改医生信息',
            href:'./tabs/doctor/Modify.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '修改医生信息');
    }
}

// 修改医生信息end