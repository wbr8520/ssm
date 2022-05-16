<template>
  <el-row justify="center">
    <el-col :span="8">
      <el-card class="box-card">
        <el-form
            label-position="left"
            label-width="100px"
            :model="formLabelAlign"
            style="max-width: 460px"
        >
          <el-form-item label="用户名">
            <el-input v-model="formLabelAlign.username"></el-input>
          </el-form-item>
          <el-form-item label="密码">
            <el-input type="password" v-model="formLabelAlign.password"></el-input>
          </el-form-item>
          <!--<el-form-item label="确认密码">-->
          <!--  <el-input v-model="formLabelAlign.ispassword"></el-input>-->
          <!--</el-form-item>-->
          <el-form-item label="昵称">
            <el-input v-model="formLabelAlign.nickname"></el-input>
          </el-form-item>
          <el-form-item label="性别">
            <el-radio-group v-model="formLabelAlign.sex">
              <el-radio border label="男"></el-radio>
              <el-radio border label="女"></el-radio>
            </el-radio-group>
          </el-form-item>
          <el-form-item label="年龄">
            <el-input v-model="formLabelAlign.age"></el-input>
          </el-form-item>
          <el-form-item>
            <el-button type="primary" @click="onSubmit">Create</el-button>
            <el-button @click="back">Cancel</el-button>
          </el-form-item>
        </el-form>
      </el-card>
    </el-col>
  </el-row>
</template>

<script lang="ts" setup>
import {reactive, ref} from 'vue'
import {useRouter} from "vue-router";
import request from "@/utils/request";

const router = useRouter()
const formLabelAlign = reactive({
  username: '',
  password: '',
  nickname: '',
  sex: '',
  age: ''
})
const fullscreenLoading = ref(false)
const load = () => {
  fullscreenLoading.value = true
  setTimeout(() => {
    fullscreenLoading.value = false
  }, 2000)
}

const onSubmit = (): void => {
  load()
  request.getRequest("/login/register", formLabelAlign).then(function (res) {
    fullscreenLoading.value = false;
    if (res != null) {
      back()
    }
  });
};
const back = (): void => {
  router.back();
};

</script>
<style scoped>
.box-card {
  margin-top: 100px;
  border-radius: 15px;
  background-clip: padding-box;
  border: 1px solid #eaeaea;
  box-shadow: 0 0 25px #cac6c6;
  height: 100%;
  width: 480px;
}
</style>