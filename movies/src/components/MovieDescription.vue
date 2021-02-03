<template>
  <div class="movie-description">
    <h2 class="title" @click="switchDescription">{{ movie.Title }}</h2>
    <div v-if="isDescriptionShown" class="description">
      <div class="released"> Released: {{ movie.Released }}</div>
      <div class="runtime"> Runtime: {{ movie.Runtime }}</div>
      <div class="genre"> Genre: {{ movie.Genre }}</div>
      <div class="rated"> Rated: {{ movie.Rated }}</div>
      <div class="country"> Country: {{ movie.Country }}</div>
      <div class="language"> Language: {{ movie.Language }}</div>
      <div class="metascore"> Metascore: {{ movie.Metascore }}</div>
      <div class="imdbRating"> Imdb Rating: {{ movie.imdbRating }}</div>
      <div class="awards"> Awards: {{ movie.Awards }}</div>
      <div class="director"> Director: {{ movie.Director }}</div>
      <div class="writer"> Writers: {{ movie.Writer }}</div>
      <div class="actors"> Actors {{ movie.Actors}}</div>
      <div class="plot">
        <p>Plot</p>
        <p>{{ movie.Plot }}</p>
      </div>
    </div>
  </div>
</template>

<script lang="ts">
import { defineComponent, ref } from 'vue'
import { Movie } from '@/movies'

interface Props {
  movie: Movie;
}

export default defineComponent({
  name: 'MovieDescription',
  props: {
    movie: {
      type: Object as () => Movie,
      required: true
    }
  },
  setup (props: Props) {
    const isDescriptionShown = ref(false)

    function switchDescription (): void {
      isDescriptionShown.value = !isDescriptionShown.value
    }

    return {
      isDescriptionShown,
      switchDescription
    }
  }
})
</script>

<style lang="scss" scoped>
.description {
  display: grid;
  border: 1px solid aquamarine;
  grid-template-columns: repeat(4, 1fr);
  grid-column-gap: 1px;
  grid-row-gap: 1px;
  background-color: aquamarine;
  grid-template-rows: repeat(6, auto);
  grid-template-areas:
    "released runtime genre rated"
    "country language metascore imdbRating"
    "awards awards awards awards"
    "director director writer writer"
    "actors actors actors actors"
    "plot plot plot plot";

  div {
    background-color: white;
  }

  .released {
    grid-area: released;
  }

  .runtime {
    grid-area: runtime;
  }

  .genre {
    grid-area: genre;
  }

  .rated {
    grid-area: rated;
  }

  .country {
    grid-area: country;
  }
  .language {
    grid-area: language;
  }
  .metascore {
    grid-area: metascore;
  }
  .imdbRating {
    grid-area: imdbRating;
  }
  .awards {
    grid-area: awards;
  }
  .director {
    grid-area: director;
  }
  .writer {
    grid-area: writer;
  }
  .actors {
    grid-area: actors;
  }
  .plot {
    grid-area: plot;
  }
}

.title {
  box-sizing: border-box;
  border: 3px solid darkcyan;
  color: darkcyan;
  border-radius: 24px 24px 24px 24px;
  -moz-border-radius: 24px 24px 24px 24px;
  -webkit-border-radius: 24px 24px 24px 24px;
}

.movie-description {
  border: 1px solid lightcyan;
  -webkit-box-shadow: 0px 0px 23px 3px rgba(201,185,201,0.52);
  -moz-box-shadow: 0px 0px 23px 3px rgba(201,185,201,0.52);
  box-shadow: 0px 0px 23px 3px rgba(201,185,201,0.52);
  margin: 1px;
}
</style>
