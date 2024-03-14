<template>
  <div class="wholeApp">
    <router-view/>
  </div>
</template>

<script>

export default {
  name: "App",
};
</script>

<style>
/* For the backround of the whole website to be dark*/
html{
  background: #293241;
}

/* For all the text to be the same font (except when defined otherwise) */
*{
  font-family: "Century Gothic",serif;
}
</style>
