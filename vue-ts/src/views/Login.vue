<template>
  <img :src="bg" class="wave" alt=""/>
  <div class="login-container">
    <div class="img">
      <component :is="currentWeek"></component>
    </div>
    <div class="login-box">
      <div class="login-form">
        <avatar class="avatar"/>
        <h2 v-motion :initial="{ opacity: 0, y: 100 }" :enter="{ opacity: 1, y: 0, transition: { delay: 100 } }">
          Blog Demo
        </h2>
        <div class="input-group focus" v-motion :initial="{opacity: 0,y: 100}"
             :enter="{opacity: 1,y: 0,transition: {delay: 200}}">
          <div class="icon">
            <i class="fa fa-user"></i>
          </div>
          <div>
            <h5>用户名</h5>
            <input type="text" class="input" v-model="userForm.username" placeholder="请输入用户名"/>
          </div>
        </div>
        <div class="input-group focus" v-motion :initial="{opacity: 0,y: 100}"
             :enter="{opacity: 1,y: 0,transition: {delay: 300}}">
          <div class="icon">
            <i class="fa fa-lock"></i>
          </div>
          <div>
            <h5>密码</h5>
            <input type="password" class="input" v-model="userForm.password" placeholder="请输入用户名"/>
          </div>
        </div>
        <button v-loading.fullscreen.lock="fullscreenLoading"
                class="btn" v-motion :initial="{opacity: 0,y: 10}"
                :enter="{opacity: 1,y: 0,transition: {delay: 400}}"
                @click="onLogin">
          登录
        </button>
        <button v-loading.fullscreen.lock="fullscreenLoading"
                class="btn" v-motion :initial="{opacity: 0,y: 10}"
                :enter="{opacity: 1,y: 0,transition: {delay: 400}}"
                @click="register">
          注册
        </button>
      </div>
    </div>
  </div>
</template>
<script setup lang="ts">
import {computed, reactive, ref} from "vue";
import request from "@/utils/request";
import bg from "@/assets/login/bg.png"
import {useRouter} from "vue-router";
import {ElNotification} from 'element-plus'
import illustration0 from "@/assets/login/illustration0.svg";
import illustration1 from "@/assets/login/illustration1.svg";
import illustration2 from "@/assets/login/illustration2.svg";
import illustration3 from "@/assets/login/illustration3.svg";
import illustration4 from "@/assets/login/illustration4.svg";
import illustration5 from "@/assets/login/illustration5.svg";
import illustration6 from "@/assets/login/illustration6.svg";
//根据星期更换svg组件样式
const currentWeek = computed(() => {
  switch (String(new Date().getDay())) {
    case "0":
      return illustration0;
    case "1":
      return illustration1;
    case "2":
      return illustration2;
    case "3":
      return illustration3;
    case "4":
      return illustration4;
    case "5":
      return illustration5;
    case "6":
      return illustration6;
    default:
      return illustration4;
  }
});
const fullscreenLoading = ref(false)
const router = useRouter();
const userForm = reactive({
  username: 'admin',
  password: '123',
})
const load = () => {
  fullscreenLoading.value = true
  setTimeout(() => {
    fullscreenLoading.value = false
  }, 2000)
}
const onLogin = (): void => {
  if (userForm.username && userForm.password) {
    load()
    request.getRequest("/login/login", userForm).then(function (res) {
      fullscreenLoading.value = false;
      if (res != null) {
        router.replace('/Home')
      }
    });
  } else {
    ElNotification({
      title: 'Error',
      message: '信息不完整!',
      type: 'error',
      duration: 2000,
      showClose: false,
      position: 'bottom-right',
    })
  }
};
const register = (): void => {
  router.push('/Register')
};
</script>
<style scoped>
@import url("../style/login.css");

.login-container {
  padding: 0;
}
</style>
