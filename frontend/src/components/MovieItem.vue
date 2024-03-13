<template>
  <div class="container">
    <li>
      <h2>{{ movie.name }}</h2>
      <p>{{ movie.genre }}</p>
      <p>{{ movie.language }}</p>
      <p>Age restriction: {{ movie.ageRestriction }}</p>
      <p>Start time: {{ movie.startTime }}</p>
    </li>
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
li {
  align-content: center;
  justify-content: center;
}

.container {
  align-content: center;
  justify-content: center;
}
</style>
