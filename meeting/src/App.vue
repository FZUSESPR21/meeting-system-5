<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <div id="nav">
      </div>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
#app ,*{
  margin: 0;
  padding: 0;
}
body{
    width: 100%;
    background-color: rgb(239, 239, 239);
  }
  .lizi{
    position:fixed;
    top:0;
    width:100%;
  }
</style>
