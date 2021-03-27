<template>
    <el-card class="box-card wrap">
    <div slot="header" class="clearfix">
        <span>ICCV</span>
    </div>
    <div v-for="o in 4" :key="o" class="text item">
        {{'列表内容 ' + o }}
    </div>
    </el-card>
</template>

<style scoped>
.card-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
  }
  .text {
    font-size: 14px;
  }

  .item {
    margin-bottom: 18px;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }
  .clearfix:after {
    clear: both;
  }

  .box-card {
    width: auto;
  }
</style>