<template>
  <div id="app">
    <div id="nav">
      <!-- <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> -->
      <Menu/>
    </div>
    <hr>
    <router-view/>
  </div>
</template>
<script>
import Menu from './components/Menu.vue'
export default {
  components:{
    Menu
  }
}
</script>

<style lang="scss">
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;
  a {
    font-weight: bold;
    color: #2c3e50;
    text-decoration: none;
    font-size: 16px;
    font-family: "Lucida Console", Courier, monospace;

    &.router-link-exact-active {
      color: red;
    }
  }
}
</style>
