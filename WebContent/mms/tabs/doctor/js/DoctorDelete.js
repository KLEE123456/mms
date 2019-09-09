// 删除医生信息begin
function DDMclick(){
    if(access.indexOf("信息删除功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }

    if(!$('#output').tabs('exists','删除医生信息')) {
        $('#output').tabs('add',{
            title:'删除医生信息',
            href:'./tabs/doctor/Delete.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '删除医生信息');
    }
}
//删除医生信息end