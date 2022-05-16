<template>
  <el-affix :offset="0">
    <menu-view></menu-view>
  </el-affix>
  <el-row justify="center" gutter="10" style="margin: 0">
    <el-col :span="4">
      <side-view></side-view>
    </el-col>
    <el-col :span="12">
      <main-view></main-view>
    </el-col>
  </el-row>
</template>
<script setup lang="ts">
import MenuView from "@/components/MenuView.vue";
import SideView from "@/components/SideView.vue";
import MainView from "@/components/MainView.vue";</script>
<style scoped>
</style>
