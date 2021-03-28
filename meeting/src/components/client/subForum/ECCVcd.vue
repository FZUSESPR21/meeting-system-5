
<template>
<el-card class="box-card">
  <template #header>
    <div class="card-header">
      <span @click="jumpECCV()">ECCV</span>
    </div>
  </template>
  <div id="infEC"></div>
</el-card>
</template>

<script>
  
</script>

<style scoped>
.card-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
      cursor: pointer;
  }
    
  .text {
    font-size: 14px;
  }

  .card-header:hover{
      color: rgb(35, 117, 194);
  }

  .item {
    margin-bottom: 18px;
  }

  .box-card {
    width: 1000px;
  }
</style>

<script scoped>
  export default {
    methods: {
      handleSelect(key, keyPath) {
        console.log(key, keyPath);
      },
      jumpCVPR:function(){
        this.$router.push('/subForumCVPR');
      },
      jumpICCV:function(){
        this.$router.push('/subForumICCV');
      },
      jumpECCV:function(){
        this.$router.push('/subForumECCV');
      }
    }
  }
</script>

<script>
    import $ from 'jquery'
    //页头
    import pageheader from '@/components/common/pageHeader';
    //时间线
    import timeline from '@/components/client/index/timeline';
    import timeline2 from '@/components/client/index/timeline2';
    import cvprcard from '@/components/client/subForum/CVPRCard';

    export default {
    components:{
        'v-pageheader':pageheader,
        'v-timeline':timeline,
        'v-timeline2':timeline2,
        'v-cvprcard':cvprcard
    },
    data(){
        return{
          info:''
        }
    },
    mounted:function(){
        this.init();
    },
    methods:{
        init:function(){
            $.ajax({
                url:'http://47.100.89.20:8080/homepage/forum',
                type: 'get',
                async: false,
                data:{
                    info:{}
                },
                datatype:'json',
                success:function(info){
                    this.info=info;
                    var json = this.info.data;
                    //通知条数
                    var num = 0;
                    for(var i = 0; i < json.length; i++){
                        num ++;
                        console.log(json[i].title);
                    }

                    for(var i = 0;i < 3; i++){
                      var idn = "infEC" + i;
                      var opt = "<div id='"+idn+"'><p class='conf'>[会议信息]</p></div>";
                      $("#infEC").append(opt);
                      $("#infEC"+i).append(" "+this.info.data[i].title+" 会议主席："+this.info.data[i].accountName+" 会议时间:"+this.info.data[i].startTime);
                    }
                    
                }
            })
        }
    }
  }
</script>