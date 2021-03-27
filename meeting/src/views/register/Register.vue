<template>
  <div id="login-container">
    <div style="text-align: center;height: 50px;padding-left:40px">
      登录
    </div>
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="账号" prop="user">
        <el-input type="text" v-model="ruleForm.user" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="pass">
        <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="再次输入密码" prop="pass2">
        <el-input type="password" v-model="ruleForm.pass2" autocomplete="off"></el-input>
      </el-form-item>
<!--      <el-form-item label="年龄" prop="age">-->
<!--        <el-input v-model.number="ruleForm.age"></el-input>-->
<!--      </el-form-item>-->
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')" style="margin-left:40px">注册</el-button>
        <el-button @click="loginForm('ruleForm')">去登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  // import axios from 'axios'
  export default {
    name: "login",
  data() {
    var validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入账户'));
      } else {
        if (this.ruleForm.pass !== '') {
          this.$refs.ruleForm.validateField('pass');
        }
        callback();
      }
    };
    var validatePass2 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'));
      } else {
        callback();
      }
    };
    var validatePass3 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请再次输入密码'));
      } else {
        callback();
      }
    };
    return {
      ruleForm: {
        user: '',
        pass: '',
        pass2: '',
      },
      rules: {
        user: [
          { validator: validatePass, trigger: 'blur' }
        ],
        pass: [
          { validator: validatePass2, trigger: 'blur' }
        ],
        pass2: [
          { validator: validatePass3, trigger: 'blur' }
        ]
        // age: [
        //   { validator: checkAge, trigger: 'blur' }
        // ]
      },
      isLogin:false
    };
  },
  methods: {
    submitForm(formName) {

      this.$message.success("注册成功!!!");
      this.$router.push({path: "/"});
    },
    loginForm(formName) {
      this.$refs[formName].resetFields();
    }
  }
  }
</script>

<style scoped>
  body{
    margin: 0;
  }
  #login-container{
    width: 400px;
    height: 320px;
    background: #e5e9f2;
    position: absolute;
    left: 50%;
    top: 50%;
    margin-left: -220px;
    margin-top: -170px;
    border-radius: 5px;
    padding-top: 40px;
    padding-right: 40px;
  }
</style>
