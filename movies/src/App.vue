<template>
    <app-header></app-header>
    <main>
      <router-view/>
    </main>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import Header from '@/components/Header.vue'

export default defineComponent({
  name: 'App',
  components: { 'app-header': Header }
})
</script>

<style lang="scss">
#app {
  display: grid;
  grid-template:
      [row1-start] "header" 3rem [row1-end]
      [row2-start] "content" 1fr [row2-end]
    / 1fr;
  height: 100vh;
  width: 100vw;
}

.row {
  width: 100%;
}

#app > main {
  grid-area:  content / content;
  text-align: center;
  padding: 1rem
}

body {
  margin: 0;
  * {
    overflow: auto;
  }
}
</style>
