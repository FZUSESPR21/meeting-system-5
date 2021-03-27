<template>
  <div id="login-container">
    <div style="text-align: center;height: 50px" id="login">
      登录
    </div>
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="账号" prop="user">
        <el-input type="text" v-model="ruleForm.user" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="pass">
        <el-input type="password" v-model="ruleForm.pass" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item id="anniu" style="padding-left:40px">
        <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
        <el-button @click="resetForm('ruleForm')">注册</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  name: 'login',
  data () {
    var validatePass = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入账户'))
      } else {
        if (this.ruleForm.pass !== '') {
          this.$refs.ruleForm.validateField('pass')
        }
        callback()
      }
    }
    var validatePass2 = (rule, value, callback) => {
      if (value === '') {
        callback(new Error('请输入密码'))
      } else {
        callback()
      }
    }
    return {
      ruleForm: {
        user: '123',
        pass: '123'
      },
      rules: {
        user: [
          { validator: validatePass, trigger: 'blur' }
        ],
        pass: [
          { validator: validatePass2, trigger: 'blur' }
        ]
      },
      isLogin: false
    }
  },
  methods: {
    submitForm (formName) {
      this.$message.success('登录成功!!!')
      this.$router.push({ path: '/' })
    },
    resetForm (formName) {
      this.$refs[formName].resetFields()
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
    height: 290px;
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
  #login{
    padding-left: 40px;
  }
</style>
