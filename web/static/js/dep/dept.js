function loadTable() {

    $('#deptTable').bootstrapTable({
        url: 'dep_list',         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        dataType: "json",
        contentType: "application/x-www-form-urlencoded",
        striped: true,// 隔行变色
        cache: false, // 是否使用缓存
        showColumns: false,// 列
        toobar: '#toolbar',
        pagination: true, // 分页
        paginationLoop: false,
        paginationPreText: '上一页',
        paginationNextText: '下一页',
        showFooter: true,// 显示列脚
        showRefresh: true,// 显示刷新
        showPaginationSwitch: false,// 是否显示数据条数选择框
        sortable: false, // 是否启用排序
        singleSelect: false,
        search: false, // 显示搜索框
        buttonsAlign: "right", // 按钮对齐方式
        showRefresh: false,// 是否显示刷新按钮
        sidePagination: "server", // 服务端处理分页
        pageNumber: 1,
        pageSize: 3,
        pageList: [5, 10, 25, 50, 100],
        undefinedText: '--',
        uniqueId: "uuid", // 每一行的唯一标识，一般为主键列
        queryParamsType: '',
        queryParams: queryParams,// 传递参数（*）
        columns: [
            {
                field: 'uuid',
                title: '部门编号'
            },
            {
                field: 'name',
                title: '部门名称'
            }, {
                field: 'tele',
                title: '联系电话'
            },
            {
                title: '操作',
                field: 'id',
                align: 'center',
                formatter: function (value, row, index) {
                    var e = '<button  id="editbtn" class="btn btn-primary"  onclick="edit(\''
                        + row.uuid + '\')">编辑</button> ';

                    var d = '<button class="btn btn-danger"  onclick="del(\''
                        + row.uuid + '\')">删除</button> ';
                    return e + d;
                }
            }


        ]
    });
}

//得到查询的参数
queryParams = function (params) {
    // 获取表单数据
    var dataArray = $("#deptform").serializeArray();
    var data = {};
    $.each(dataArray, function (i, e) {
        data[e.name] = e.value;
    });
    console.log(data);
    console.log(params)

    data["pageSize"]=params.pageSize;
    data["pageNumber"]=params.pageNumber;
     return data;

}

// 编辑部门信息
function edit(uuid){
     $.get("dep_edit",{"uuid":uuid},function(data){
         $("#savedeptform [name='name']").val(data.name);
         $("#savedeptform [name='tele']").val(data.tele);
         $("#savedeptform [name='uuid']").val(data.uuid);

         // 打开一个modal
         $("#deptModal").modal();

     },"json")
}

function del(uuid){
    $.ajax({
        url: 'dep_del',
        // 是否是异步 false 同步
        async: false,
        type: "post",
        data: {"uuid":uuid},
        success: function (mesg) {
            Ewin.alert(mesg.message);
            if (mesg.state==200 ) {

                $("#deptModal").modal('hide');
                // 清除数据
                $("#savedeptform")[0].reset();
            }

        },
        dataType:"json"
    });

    // 刷新表格
    $("#deptTable").bootstrapTable('refresh');
}

$(function () {
    loadTable();
    // 绑定查询按钮的单击事件
    $("#deptquery").click(function () {
        // 刷新表格
        $("#deptTable").bootstrapTable('refresh');
    })

    $("#saveDept").click(function(){
        // 打开一个modal
        $("#deptModal").modal();
    })

    $("#savabtn").click(function(){
        var dataArray = $("#savedeptform").serializeArray();
        var data = {};
        $.each(dataArray, function (i, e) {
            data[e.name] = e.value;
        })

          if (data.uuid == ""){

              $.ajax({
                  url: 'dep_save',
                  // 是否是异步 false 同步
                  async: false,
                  type: "post",
                  data: data,
                  success: function (mesg) {
                      Ewin.alert(mesg.message);
                      if (mesg.state==200 ) {

                          $("#deptModal").modal('hide');
                          // 清除数据
                          $("#savedeptform")[0].reset();
                      }

                  },
                  dataType:"json"
              });
          }else{
              $.ajax({
                  url: 'dep_update',
                  // 是否是异步 false 同步
                  async: false,
                  type: "post",
                  data: data,
                  success: function (mesg) {
                      Ewin.alert(mesg.message);
                      if (mesg.state==200 ) {
                          $("#deptModal").modal('hide');
                          // 清除数据
                          $("#savedeptform")[0].reset();
                      }

                  },
                  dataType:"json"
              });
          }
          // 刷新表格
        $("#deptTable").bootstrapTable('refresh');

    })

})
