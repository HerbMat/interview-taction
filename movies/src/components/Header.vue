<template>
  <div id="nav">
    <router-link :to="{ name: 'Home'}">Home</router-link>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Header'
})
</script>

<style lang="scss" scoped>
#nav {
  background-image: linear-gradient(to bottom, cornflowerblue , blue);;
  padding-left: 3rem;
  padding-top: 1rem;
  grid-area: header;
  display: grid;
  grid-template-columns: repeat(7, 3rem);
  grid-template-rows: auto;

  a {
    color: white;
    font-weight: 600;
    text-decoration: none;
  }
}
</style>
