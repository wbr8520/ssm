<template>
  <el-space
      v-model="arr"
      class="box-space"
      :size="15"
      :fill="true"
      direction="vertical">
    <el-card v-for="i in arr" :key="i" class="box-card">
      <template #header>
        <div class="card-header">
          <h2>{{ i.title }}</h2>
        </div>
      </template>
      {{ i.text }}
      <el-row class="row" justify="end">
        <el-button :icon="Edit" circle></el-button>
        <el-button :icon="Star" circle></el-button>
        <el-button :icon="Share" circle></el-button>
        <el-button :icon="Delete" circle></el-button>
      </el-row>
    </el-card>
  </el-space>
</template>

<script lang="ts">
export default {
  name: "MainView",
}
</script>
<script setup lang="ts">
import {Share, Edit, Star, Delete,} from '@element-plus/icons-vue'
import request from "@/utils/request";
import {onMounted, reactive} from "vue";

const userForm = reactive({
  username: 'admin',
  password: '123',
})

interface article {
  aid: number,
  title: string,
  text: string
}

const arr: Array<article> = reactive([])
onMounted(() => {
  request.postRequest("/home/onloadArticle", userForm).then(function (res) {
    for (const ls of res.data) {
      arr.push(ls);
    }
  }).catch(function (error) {
  }).then(function () {
    // load();
  });
})
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
  white-space: pre-line;
}

.card-header {
  height: 20%;
  text-align: left;
  margin-left: 40px;
}
</style>