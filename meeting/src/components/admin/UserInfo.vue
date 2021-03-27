  <template>
    <el-table
      :data="tableData">
      <el-table-column
        prop="username"
        label="用户名"
        width="400">
      </el-table-column>
      <el-table-column
        prop="status"
        label="身份">
      </el-table-column>
    </el-table>
  </template>
<script>
    export default {
       name:'UserInfo',
        data() {
            return {
                tableData: [{
                date: '2016-05-02',
                username: '王小虎',
                status: '上海市普陀区金沙江路 1518 弄'
                }, {
                date: '2016-05-04',
                username: '王小虎',
                status: '上海市普陀区金沙江路 1517 弄'
                }, {
                date: '2016-05-01',
                username: '王小虎',
                status: '上海市普陀区金沙江路 1519 弄'
                }, {
                date: '2016-05-03',
                username: '王小虎',
                status: '上海市普陀区金沙江路 1516 弄'
                }]
            }
        }
    };
</script>
<style scoped>

</style>
