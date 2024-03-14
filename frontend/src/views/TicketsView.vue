<template>
  <h1>Buy tickets</h1>
  <!-- If the movie is available (fetched) then display ticket buying info -->
  <Ticket v-if="movie" :movie="movie"/>
</template>

<script>
import Ticket from "@/components/TicketItem.vue";
import axios from 'axios';

export default {
  name: "TicketsView",
  components: {
    Ticket
  },

  data() {
    return {
      movie: null
    };
  },

  methods: {
    fetchMovie() {
      const id = this.$route.params.id;
      axios.get(`http://localhost:8080/api/movies/${id}`)
          .then(response => {
            this.movie = response.data;
          })
          .catch(error => {
            console.error(error);
          });
    }
  },

  mounted() {
    this.fetchMovie();
  },
}
</script>

<style scoped>


</style>
