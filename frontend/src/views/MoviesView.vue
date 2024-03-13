<template>
  <Movie v-for="movie in movies" :key="movie.id" :movie="movie"/>
</template>

<script>
import Movie from "@/components/MovieItem.vue";
import axios from 'axios';

export default {
  name: "MoviesView",
  components: {
    Movie
  },
  data() {
    return {
      movies: [],
    };
  },

  methods: {
    fetchMovies() {
      axios.get('http://localhost:8080/api/movies')
          .then(response => {
            this.movies = response.data;
          })
          .catch(error => {
            console.error(error);
          });
    }
  },

  mounted() {
    this.fetchMovies();
  },
}
</script>

<style scoped>
</style>
