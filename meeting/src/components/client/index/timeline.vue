<template>
    <div class="block wrap">
        <el-timeline>
            <el-timeline-item
            v-for="(activity, index) in activities"
            :key="index"
            :icon="activity.icon"
            :type="activity.type"
            :color="activity.color"
            :size="activity.size"
            :timestamp="activity.timestamp">
            {{activity.content}}
            </el-timeline-item>
        </el-timeline>
    </div>
</template>

<style scoped>
.wrap{
    margin: 100px 0 0 50px;
}
</style>

<script scoped>
  export default {
    data() {
      return {
        activities: [{
          content: '国际计算机视觉与模式识别会议（CVPR）',
          timestamp: '2021-04-12 20:46',
          size: 'large',
          type: 'primary',
          icon: 'el-icon-more'
        }, {
          content: '国际计算机视觉大会（ICCV）',
          timestamp: '2021-04-03 20:46',
          color: '#0bbd87'
        }, {
          content: '欧洲计算机视觉国际会议（ECCV）',
          timestamp: '2021-04-03 20:46',
          size: 'large'
        }, {
          content: '国际计算机视觉大会（ICCV）',
          timestamp: '2021-04-03 20:46'
        },
        {
          content: '国际计算机视觉与模式识别会议（CVPR）',
          timestamp: '2021-04-12 20:46',
          size: 'large',
          type: 'primary',
          icon: 'el-icon-more'
        }, {
          content: '国际计算机视觉大会（ICCV）',
          timestamp: '2021-04-03 20:46',
          color: '#0bbd87'
        }, {
          content: '欧洲计算机视觉国际会议（ECCV）',
          timestamp: '2021-04-03 20:46',
          size: 'large'
        }, {
          content: '国际计算机视觉大会（ICCV）',
          timestamp: '2021-04-03 20:46'
        },
        {
          content: '国际计算机视觉与模式识别会议（CVPR）',
          timestamp: '2021-04-12 20:46',
          size: 'large',
          type: 'primary',
          icon: 'el-icon-more'
        }, {
          content: '国际计算机视觉大会（ICCV）',
          timestamp: '2021-04-03 20:46',
          color: '#0bbd87'
        }]
      };
    }
  };
</script>