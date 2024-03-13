<template>
  <div class="hello">
    <div v-for="movie in movies" :key="movie.id">
      <h2>{{ movie.name }}</h2>
      <p>{{ movie.genre }}</p>
      <!-- Add more fields as needed -->
    </div>
  </div>
</template>

<script>
export default {
  name: 'HelloWorld',
  props: {
    movies: Array
  }
}
</script>


<!-- Added "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
