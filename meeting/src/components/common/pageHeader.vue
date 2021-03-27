<template>
    <div class="wrap">
        <el-menu
        :default-active="activeIndex2"
        class="el-menu-demo"
        mode="horizontal"
        @select="handleSelect"
        background-color="#545c64"
        text-color="#fff"
        active-text-color="#ffd04b">
        <el-menu-item index="1" @click="jumpHOME()">HOME</el-menu-item>
        <el-menu-item index="2" @click="jumpCVPR()">CVPR</el-menu-item>
        <el-menu-item index="3" @click="jumpICCV()">ICCV</el-menu-item>
        <el-menu-item index="4" @click="jumpECCV()">ECCV</el-menu-item>
        
        <el-badge is-dot class="item right">
          <el-button class="share-button" icon="el-icon-bell" type="primary"></el-button>
        </el-badge>

        <el-button class="back right" type="primary" icon="el-icon-right" @click="jumpLOGIN()">退出</el-button>

        </el-menu>
    </div>
</template>

<style scoped>
.item {
  margin: 10px;
  margin-right: 40px;
}
.back{
  margin: 10px;
}
.right{
  float:right;
}
.wrap{
    margin: 0;
    padding: 0;
}
</style>

<script scoped>
  export default {
    data() {
      return {
        activeIndex: '1',
        activeIndex2: '1',
      };
    },
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      },
      jumpHOME:function(){
        this.$router.push('/');
      },
      jumpLOGIN:function(){
        this.$router.push('/login');
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