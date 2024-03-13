<template>
  <div id="app">
    <HelloWorld :movies="movies" />
  </div>
</template>

<script>
import axios from 'axios';
import HelloWorld from './components/HelloWorld.vue';

export default {
  name: 'App',
  components: {
    HelloWorld
  },
  data() {
    return {
      movies: []
    }
  },
  mounted() {
    axios.get('http://localhost:8080/api/movies')
        .then(response => {
          this.movies = response.data;
        });
  }
}
</script>