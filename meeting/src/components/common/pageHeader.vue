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
        <el-menu-item index="1">CVPR</el-menu-item>
        <el-submenu index="2">
            <template slot="title">ICCV</template>
            <el-menu-item index="2-1">选项1</el-menu-item>
            <el-menu-item index="2-2">选项2</el-menu-item>
            <el-menu-item index="2-3">选项3</el-menu-item>
            <el-submenu index="2-4">
            <template slot="title">选项4</template>
            <el-menu-item index="2-4-1">选项1</el-menu-item>
            <el-menu-item index="2-4-2">选项2</el-menu-item>
            <el-menu-item index="2-4-3">选项3</el-menu-item>
            </el-submenu>
        </el-submenu>
        <el-menu-item index="3" disabled>ECCV</el-menu-item>
        
        <el-badge is-dot class="item right">
          <el-button class="share-button" icon="el-icon-bell" type="primary"></el-button>
        </el-badge>

        <el-button class="back right" type="primary" icon="el-icon-right">退出</el-button>

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
      }
    }
  }
</script>