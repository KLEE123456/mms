
// 浏览医生信息begin
function BDMclick(){
    if(access.indexOf("信息浏览功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','浏览医生信息')) {
        $('#output').tabs('add',{
            title:'浏览医生信息',
            href:'./tabs/doctor/Browse.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '浏览医生信息');
    }
}
// 浏览医生信息end