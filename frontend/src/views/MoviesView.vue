<template>
  <h1>Movies this week</h1>
  <div class="filter">
    <p>Filters: </p> <!-- Dropdowns for filtering -->
    <select name="genres" id="genres" v-model="selectedFilters.genre">
      <option value="all">Genre (all)</option>
      <option value="comedy">comedy</option>
      <option value="adventure">adventure</option>
      <option value="sci-fi">sci-fi</option>
      <option value="horror">horror</option>
      <option value="animation">animation</option>
      <option value="drama">drama</option>
      <option value="musical">musical</option>
    </select>
    <select name="language" id="language" v-model="selectedFilters.language">
      <option value="all">Language (all)</option>
      <option value="estonian">estonian</option>
      <option value="english">english</option>
    </select>
    <select name="ageRestriction" id="ageRestriction" v-model="selectedFilters.ageRestriction">
      <option value="all">Age restriction (all)</option>
      <option value="6">6</option>
      <option value="12">12</option>
      <option value="14">14</option>
    </select>

    <button id="reset" @click="resetFilters">X</button>
    <button id="apply" @click="applyFilters">Apply</button>
  </div>
  <div class="movies">
    <Movie v-for="movie in movies" :key="movie.id" :movie="movie" @updateMovie="updateMovie"/>
  </div>
</template>

<script>
import Movie from "@/components/MovieItem.vue";
import axios from 'axios';

/* This function is created by AI and unimplemented right now
function generateSeats() {
  let seats = Array(30).fill('0');
  let takenSeats = 0;

  while (takenSeats < 4) {
    let seatIndex = Math.floor(Math.random() * 30);
    if (seats[seatIndex] === '0') {
      seats[seatIndex] = '1';
      takenSeats++;
    }
  }

  return seats.join('');
}*/

export default {
  name: "MoviesView",
  components: {
    Movie
  },
  data() {
    return {
      allMovies: [], // An array for storing all movies
      movies: [], // This will be used for storing current/filtered movies
      selectedFilters: {
        genre: "all",
        language: "all",
        ageRestriction: "all"
      }
    };
  },

  methods: {
    fetchMovies() {
      axios.get('http://localhost:8080/api/movies')
          .then(response => {
            this.allMovies = response.data; // Store all movies here
            this.movies = response.data; // And also initially in the filtered/current movies array
          })
          .catch(error => {
            console.error(error);
          });
    },

    applyFilters() { // This function was generated by AI
      let filteredMovies = this.allMovies.filter(movie => {
        return (this.selectedFilters.genre === 'all' || movie.genre === this.selectedFilters.genre) &&
            (this.selectedFilters.language === 'all' || movie.language === this.selectedFilters.language) &&
            (this.selectedFilters.ageRestriction === 'all' || movie.ageRestriction === parseInt(this.selectedFilters.ageRestriction));
      });
      this.movies = filteredMovies;
    },

    resetFilters() { // Pressing the button will reset all filter dropdowns and show all the movies again
      this.movies = this.allMovies;
      this.selectedFilters.genre = 'all';
      this.selectedFilters.language = 'all';
      this.selectedFilters.ageRestriction = 'all';
    },

    updateMovie(updatedMovie) { // This function is generated by AO
      let movieIndex = this.movies.findIndex(movie => movie.id === updatedMovie.id);
      if (movieIndex !== -1) {
        this.movies.splice(movieIndex, 1, updatedMovie);
      }
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

#apply {
  margin: auto;
  border: none;
  border-radius: 20px;
  padding: 10px;
  background: #98C1D9;
}

#apply:hover {
  color: #293241;
  background: #E0FBFC;
  cursor: pointer;
}

#reset {
  margin: auto;
  border: none;
  border-radius: 50%;
  min-height: 30px;
  min-width: 30px;
  background: #EE6C4D;
}

#reset:hover {
  color: #293241;
  background: #E0FBFC;
  cursor: pointer;
}

</style>
