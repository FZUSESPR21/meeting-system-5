<template>
    <div>
        <el-menu
        :default-active="this.$router.path"
        router
        class="el-menu-demo"
        mode="horizontal"
        @select="handleSelect"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b">
            <el-menu-item index="/user_num">查看人数</el-menu-item>
            <el-menu-item index="/user_info">查看用户信息</el-menu-item>
            <el-menu-item index="/send_message">发布通知</el-menu-item>
            <el-menu-item index="/login" class="right">退出</el-menu-item>
        </el-menu>
    </div>
</template>
<script>
    export default {
       name:'AdminHeader',
    };
</script>
<style scoped>
    .el-menu-demo {
        width: 100%; 
    }
    .right {
        float: right;
    }
</style>
