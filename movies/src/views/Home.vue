<template>
  <div class="home">
    <h1>Search Movie</h1>
    <div id="content">
      <form class="filter-form">
        <label for="filter">Type Country, Writer or Genre which you are looking for</label>
        <input name="filter" id="filter" v-model="filterString"/>
      </form>
      <template v-for="movie in filteredMovies" :key="movie.imdbID">
        <app-movie-description :movie="movie"></app-movie-description>
      </template>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent, reactive, ref, computed } from 'vue'
import movies, { Movie } from '@/movies'
import MovieDescription from '@/components/MovieDescription.vue'

export default defineComponent({
  name: 'Home',
  setup (props) {
    const moviesList: Array<Movie> = reactive(movies.Movies)
    const filterString = ref('')
    const filteredMovies = computed(() => {
      return moviesList.filter(
        movie => movie.Country.toLowerCase().includes(filterString.value.toLowerCase()) ||
        movie.Genre.toLowerCase().includes(filterString.value.toLowerCase()) ||
        movie.Writer.toLowerCase().includes(filterString.value.toLowerCase()))
    })

    return {
      moviesList,
      filteredMovies,
      filterString
    }
  },
  components: {
    'app-movie-description': MovieDescription
  }
})
</script>

<style lang="scss" scoped>
 #content {
   margin: auto;
   width: 80%;
 }

 .filter-form {
   input {
     margin-left: auto;
     margin-right: auto;
     width: 40rem;
     border-color: darkcyan;
     border-radius: 10px;

     :focus {
       border-color: darkcyan;
     }
   }

   label {
     display: block;
     text-align: center;
     line-height: 120%;
     font-size: 1.5rem;
   }
 }
</style>
