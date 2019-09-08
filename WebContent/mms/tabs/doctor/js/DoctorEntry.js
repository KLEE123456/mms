
//录入医生信息begin
function EDMclick(){
    if(access.indexOf("信息录入功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','录入医生信息')) {
        $('#output').tabs('add',{
            title:'录入医生信息',
            href:'./tabs/doctor/Entry.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '录入医生信息');
    }
}
//录入医生信息end
