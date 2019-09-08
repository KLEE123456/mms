//录入药品类别信息begin
function EMTMclick(){
    if(access.indexOf("信息录入功能") < 0 ){
        $.messager.alert('警告','该用户没有此功能');
        event.stopPropagation();
    }
    if(!$('#output').tabs('exists','录入药品类别信息')) {
        $('#output').tabs('add',{
            title:'录入药品类别信息',
            href:'./tabs/medtype/Entry.html',
            closable:true
        });
    }
    else
    {
        $('#output').tabs('select', '录入药品类别信息');
    }
}
//录入医生信息end
