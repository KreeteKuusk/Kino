<template>
  <div class="movieInfo">
    <h3 id="time">{{ movie.startTime }}</h3>
    <h3 id="name">{{ movie.name }}</h3>
      <p id="genre">{{ movie.genre }}</p>
      <p>{{ movie.language }}</p>
      <!-- if age restriction is anything other than NULL, display age restriction -->
      <p v-if="movie.ageRestriction">Age restriction: {{ movie.ageRestriction }}</p>
      <button id="buy">Buy</button>
  </div>
</template>


<script>
export default {
  props: {
    movie: Object
  },

  data() {
    return {};
  },

  methods: {}
}
</script>

<style scoped>

/* For displaying information about the movies */
#time, #name {
  align-self: center;
  margin: 0
}

#name {
  margin-bottom: 15frpx;
}

.movieInfo {
  display: flex;
  flex-direction: column;
  justify-content: flex-start;
  width: 200px;
  padding: 15px;
  background: #3D5A80;
  border-radius: 10px;
}

#genre{
  color: #99a1a6;
}

.movieInfo p {
  margin:0 0 5px 0;
}

/* For button */
#buy {
  margin-top: auto;
  border: none;
  border-radius: 5px;
  padding: 3px;
  background: #EE6C4D;
  color: #E0FBFC;
}

</style>
