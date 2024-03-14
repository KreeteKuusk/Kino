<template>
  <h1>Movies this week</h1>
  <div class="filter">
    <p>Filters: </p> <!-- Dropdowns for filtering -->
    <select name="genres" id="genres" v-model="selectedFilters.genre">
      <option value=null>Genre</option>
      <option value="comedy">Comedy</option>
      <option value="adventure">Adventure</option>
      <option value="sci-fi">sci-fi</option>
      <option value="horror">horror</option>
    </select>
    <select name="language" id="language" v-model="selectedFilters.language">
      <option value=null>Language</option>
      <option value="estonian">estonian</option>
      <option value="english">english</option>
    </select>
    <select name="ageRestriction" id="ageRestriction" v-model="selectedFilters.ageRestriction">
      <option value=null>Age restriction</option>
      <option value=6>6</option>
      <option value=12>12</option>
      <option value=14>14</option>
    </select>

    <button id="search" @click="applyFilters">Apply</button>
  </div>
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
      selectedFilters: {
        genre: null,
        language: null,
        ageRestriction: null
      }
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
    },

    applyFilters() {
      
    }


  },

  mounted() {
    this.fetchMovies();
  },
}
</script>

<style scoped>
h1 {
  display: flex;
  justify-content: center;
  padding: 20px;
  margin: auto auto 20px;
  width: 50%;
  font-family: Broadway, serif;
  color: #E0FBFC;
  background-color: #3D5A80;
  border-radius: 10px;
}

.filter {
  display: flex;
  justify-content: center;
  align-content: baseline;
  flex-direction: row;
  width: 200px;
  margin: auto auto 10px;
  gap: 10px;
}

.filter select {
  align-self: center;
  border-radius: 5px;
  height: 30px;
  background-color: #3D5A80;
}

.movies {
  display: flex;
  flex-direction: row;
  flex-flow: wrap;
  justify-content: center;
  margin: auto;
  gap: 15px;

  width: 90%;
}

#search {
  margin: auto;
  border: none;
  border-radius: 20px;
  padding: 10px;
  background: #98C1D9;
}

#search:hover {
  color: #293241;
  background: #E0FBFC;
  cursor: pointer;
}

</style>
