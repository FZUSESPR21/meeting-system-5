<template>
  <div id="login-container">
    <div style="text-align: center;height: 50px" id="login">
     <h2> 登录
     </h2>
    </div>
    <el-form :model="ruleForm" status-icon :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
      <el-form-item label="账号" prop="name" class="item">
        <el-input type="text" v-model="ruleForm.name" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item label="密码" prop="password" class="item">
        <el-input type="password" v-model="ruleForm.password" autocomplete="off"></el-input>
      </el-form-item>
      <el-form-item style="padding-left:40px">
        <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
        <el-button @click="toregister()">注册</el-button>
      </el-form-item>
    </el-form>
  </div>
</template>
<script>
export default {
  data () {
    var validatePass = (rule, value, callback) => {
      if (value === '') {
        return callback(new Error('请输入账户'))
      } else {
      }
      callback()
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
        name: '',
        password: ''
      },
      rules: {
        name: [
          { validator: validatePass, trigger: 'blur' }
        ],
        password: [
          { validator: validatePass2, trigger: 'blur' }
        ]
      }
    }
  },
  methods: {
    submitForm (formName) {
      const relu = this.ruleForm
      this.$axios.post('http://47.100.89.20:8080/account/login', {
        name: relu.name,
        password: relu.password
      }).then(resp => {
        if (resp.data.code === 200) {
          this.$message('登陆成功')
          this.$router.push('/home')
        } else {
          this.$message.error('账号密码不正确')
        }
      }).catch(failResponse => {
        console.log(failResponse)
        this.$message.error('登陆失败')
        return false
      })
    },
    toregister () {
      this.$router.push('/register')
    }
  }
}
</script>

<style>
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
  .item .el-form-item__label{
    text-align: center;
    padding-right: 30px;
}
</style>
