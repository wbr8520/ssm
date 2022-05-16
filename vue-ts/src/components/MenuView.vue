<template>
  <el-row class="row-bg" justify="space-between">
    <el-col :span="21">
      <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
          :ellipsis="false"
      >
        <el-menu-item index="1">首页</el-menu-item>
        <el-menu-item index="2">发现</el-menu-item>
        <el-menu-item index="3">社区</el-menu-item>
        <el-menu-item index="4">更多</el-menu-item>
      </el-menu>
    </el-col>
    <el-col :span="3">
      <el-menu
          :default-active="activeIndex"
          class="el-menu-demo"
          mode="horizontal"
          @select="handleSelect"
          :ellipsis="false"
      >
        <el-menu-item index="5">
          <el-icon>
            <user-filled/>
          </el-icon>
        </el-menu-item>
        <el-menu-item index="6">
          <template #default>
            <el-icon color="#409EFC" :size="20">
              <setting/>
            </el-icon>
          </template>
        </el-menu-item>
      </el-menu>
    </el-col>
  </el-row>
</template>
<script lang="ts">
export default {
  name: "MenuView"
}
</script>
<script setup lang="ts">
import {ref} from 'vue'
import {Setting, UserFilled} from '@element-plus/icons-vue'

const activeIndex = ref('1')
const handleSelect = (key: string, keyPath: string[]) => {
  console.log(key, keyPath)
}
</script>

<style scoped>
.el-menu--horizontal {
  height: 100%;
}
</style>