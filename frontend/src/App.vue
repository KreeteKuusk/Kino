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

/* For all the text to be the same font and color (except when defined otherwise) */
*{
  font-family: "Century Gothic",serif;
  color: #E0FBFC;
  cursor: default; /* I didn't want the cursor to be "I" over text (i-beam pointer)*/
}
</style>
