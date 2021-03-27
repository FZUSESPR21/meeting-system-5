<template>
    <div>
        <h2>通知内容：</h2>
        <el-input
            type="textarea"
            :rows="10"
            placeholder="请在这里输入"
            class="input"
            v-model="textarea">
        </el-input>
        <el-button type="primary" class="btn">发布</el-button>
    </div>
</template>
<script>
    export default {
       name:'SendMessage',
    };
</script>
<style scoped>
    .input {
        margin-top: 20px;
    }
    .btn {
        margin-top: 20px;
    }
</style>
