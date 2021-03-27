
<template>
<el-card class="box-card">
  <template #header>
    <div class="card-header">
      <span @click="jumpICCV()">ICCV</span>
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
      cursor: pointer;
  }
    
  .text {
    font-size: 14px;
  }

  .card-header:hover{
      color: rgb(35, 117, 194);
  }
  .item {
    margin-bottom: 18px;
  }

  .box-card {
    width: 1000px;
  }
</style>

<script scoped>
  export default {
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      },
      jumpCVPR:function(){
        this.$router.push('/subForumCVPR');
      },
      jumpICCV:function(){
        this.$router.push('/subForumICCV');
      },
      jumpECCV:function(){
        this.$router.push('/subForumECCV');
      }
    }
  }
</script>