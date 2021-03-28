<template>
    <div class="block wrap">
        <el-timeline>
            <el-timeline-item timestamp="会议时间安排" placement="top">
            <el-card>
                <h4 id="conft0"></h4>
                <p id="sta0"></p>
                <p id="end0"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
        <el-timeline>
            <el-timeline-item timestamp="" placement="top">
            <el-card>
                <h4 id="conft1"></h4>
                <p id="sta1"></p>
                <p id="end1"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
        <el-timeline>
            <el-timeline-item timestamp="" placement="top">
            <el-card>
                <h4 id="conft2"></h4>
                <p id="sta2"></p>
                <p id="end2"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
        <el-timeline>
            <el-timeline-item timestamp="" placement="top">
            <el-card>
                <h4 id="conft3"></h4>
                <p id="sta3"></p>
                <p id="end3"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
        <el-timeline>
            <el-timeline-item timestamp="" placement="top">
            <el-card>
                <h4 id="conft4"></h4>
                <p id="sta4"></p>
                <p id="end4"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
        <el-timeline>
            <el-timeline-item timestamp="" placement="top">
            <el-card>
                <h4 id="conft5"></h4>
                <p id="sta5"></p>
                <p id="end5"></p>
            </el-card>
            </el-timeline-item>
        </el-timeline>
    </div>
</template>

<style scoped>
.wrap{
    margin: 0;
    padding: 0;
    /* width: 20%; */
}
h4{
    margin-bottom: 5px;
}
</style>

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
                url:'http://47.100.89.20:8080/homepage/agenda',
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
                        console.log(json[i].startTime);
                    }

                    for(var i = 0;i < num; i++){
                        var startTime = json[i].startTime;
                        var endTime = json[i].endTime;
                        var content = json[i].content;

                        $("#sta"+i).append(startTime);
                        $("#end"+i).append(endTime);
                        $("#conft"+i).append(content);
                    }
                    
                }
            })
        }
    }
  }
</script>