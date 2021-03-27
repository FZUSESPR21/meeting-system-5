
<template>
<el-card class="box-card">
  <template #header>
    <div class="card-header">
      <span>ICCV</span>
    </div>
  </template>
  <div v-for="o in 3" :key="o" class="text item">
    {{'[会议信息] ' + o }}
  </div>
</el-card>
</template>

<script>
  
</script>

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

  .box-card {
    width: 1000px;
  }
</style>
