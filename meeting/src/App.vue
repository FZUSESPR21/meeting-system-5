<template>
  <div id="app">
    <!-- <img src="./assets/logo.png"> -->
    <div id="nav">
      <vue-particles
        color="#555"
        :particleOpacity="0.7"
        :particlesNumber="150"
        shapeType="circle"
        :particleSize="4"
        linesColor="#555"
        :linesWidth="1"
        :lineLinked="true"
        :lineOpacity="0.4"
        :linesDistance="150"
        :moveSpeed="2"
        :hoverEffect="true"
        hoverMode="grab"
        :clickEffect="false"
        clickMode="push"
        class="lizi"
      />
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
