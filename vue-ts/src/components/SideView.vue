<template>
  <el-space
      class="box-space"
      :size="15"
      :fill="true"
      direction="vertical">
    <el-card class="box-card">
      <template #header>
        <el-skeleton style="--el-skeleton-circle-size: 100px;" animated>
          <template #template>
            <el-skeleton-item variant="circle"/>
            <br/>
            <el-skeleton-item variant="h1" style="width: 40%"/>
            <el-skeleton-item variant="text"/>
          </template>
        </el-skeleton>
      </template>
      <br/>
      <el-skeleton :rows="4" animated/>
      <br/>
      <el-skeleton :rows="5" animated/>
      <br/>
      <el-skeleton :rows="5" animated/>
      <br/>

    </el-card>
  </el-space>
</template>

<script lang="ts">
export default {
  name: "SideView",
}
</script>
<script setup lang="ts">
</script>
<style scoped>

.row {
  margin-top: 20px;
  padding-top: 20px;
}

.text {
  margin: 0 20px 0 20px;
}

.box-space {
  width: 100%;
  margin-top: 15px;
}

.box-card {
  border-radius: 15px;
  background-clip: padding-box;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
  height: 100%;
}

.card-header {
  height: 20%;
  text-align: left;
  margin-left: 40px;
}
</style>