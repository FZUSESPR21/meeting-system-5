<template>
  <div id="register-container">
    <div style="text-align: center;height: 50px;padding-left:40px">
      <h2>注册</h2>
    </div>
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="账号" class="label" prop="user" :header-cell-style="{'text-align':'center'}">
        <el-input type="text" v-model="ruleForm.user" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="密码" class="label" prop="pass" :header-cell-style="{'text-align':'center'}">
        <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="再次输入密码" class="label" prop="pass2">
        <el-input type="password" v-model="ruleForm.pass2" autocomplete="off"></el-input>
      </el-form-item>
<!--      <el-form-item label="年龄" prop="age">-->
<!--        <el-input v-model.number="ruleForm.age"></el-input>-->
<!--      </el-form-item>-->
      <el-form-item>
        <el-button type="primary" @click="submitForm('ruleForm')" style="margin-left:40px">注册</el-button>
        <el-button @click="loginForm()">去登录</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>

<script>
  // import axios from 'axios'
  export default {
    name: "register",
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
      }
      else if(value !== this.ruleForm.pass){
        callback(new Error('两次输入密码不一致'))
      }
       else {
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
      this.$router.push({path: "/login"});
    },
    loginForm() {
      this.$router.push({path: "/login"});
    }
  }
  }
</script>

<style>
  body{
    margin: 0;
  }
  #register-container{
    width: 400px;
    height: 320px;
    background: #e2e2e2;
    position: absolute;
    left: 50%;
    top: 50%;
    margin-left: -220px;
    margin-top: -170px;
    border-radius: 5px;
    padding-top: 40px;
    padding-right: 40px;
    box-shadow:rgba(36, 36, 36, 0.61) 5px 5px 10px ;
  }
.label .el-form-item__label {
  text-align: center;
  padding-right: 0;
}
</style>
