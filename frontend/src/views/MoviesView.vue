<template>
  <h1>Movies this week</h1>
  <div class="movies">
    <Movie v-for="movie in movies" :key="movie.id" :movie="movie"/>
  </div>
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
h1{
  display: flex;
  justify-content: center;
  padding: 20px;
  margin: auto auto 20px;
  width: 50%;
  font-family: Broadway,serif;
  color: #E0FBFC;
  background-color: #3D5A80;
  border-radius: 10px;
}

.movies{
  display: flex;
  flex-direction: row;
  flex-flow: wrap;
  justify-content: center;
  margin: auto;
  gap: 15px;

  width: 90%;
}

</style>
