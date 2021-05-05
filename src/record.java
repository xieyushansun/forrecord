/**
 * @author: Xie
 * @Description: TODO
 * @Contact: qq307954865
 * @Date: 2021/3/3 13:56
 */

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class record {
    public static final int[] xOfDate =
            {723, 836, 939, 1046, 1153, 1259, 1363};
    static int count = 0;
    public static void main(String[] args) {
        showTimer();
//        yuyue();
//        login();
    }
    public static void yuyue(){
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // 刷新
        robot.mouseMove(93, 61);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        // 等待刷新
        robot.delay(3000);

        // 六人团队
        robot.mouseMove(436, 835);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);
        // 日期选择
        Calendar calendar = Calendar.getInstance();
        int w = calendar.get(Calendar.DAY_OF_WEEK);
        int dayofweek = 0;
        switch (w){
            case 1:{
                dayofweek = 0;
                // 点下一页
                robot.mouseMove(1499, 532);
                robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                robot.delay(1000);
                break;
            }
            case 2:{
                dayofweek = 1;
                break;
            }
            case 3:{
                dayofweek = 2;
                break;
            }
            case 4:{
                dayofweek = 3;
                break;
            }
            case 5:{
                dayofweek = 4;
                break;
            }
            case 6:{
                dayofweek = 5;
                break;
            }
            case 7:{
                dayofweek = 6;
                break;
            }
        }
        int x = xOfDate[dayofweek];
        robot.mouseMove(x, 522); // 1258
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);
        // 时间选择
//        if (count == 0 || count == 2){ // 8:30
//            robot.mouseMove(852, 632); //231 否则尝试预约
//        }else if (count == 1){
//            robot.mouseMove(852, 576); //217, 优先预约
//        }else {
//            robot.mouseMove(852, 686); //232 否则尝试预约
//        }
        if(count == 0){
            robot.mouseMove(852, 792); //515 否则尝试预约
        }else if (count == 1){
            robot.mouseMove(852, 737); //505 否则尝试预约
        }else if(count == 2){
            robot.mouseMove(852, 632); //231 否则尝试预约
        }else if (count == 3){
            robot.mouseMove(852, 686); //232 否则尝试预约
        }else if (count == 4){
            robot.mouseMove(852, 847); //102 否则尝试预约
        }else if (count == 5){
            robot.mouseMove(852, 897); //103 否则尝试预约
        }else if (count == 6){
            robot.mouseMove(852, 952); //104 否则尝试预约
        }

        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
        // 主题类型
        robot.mouseMove(952, 521);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 自习
        robot.mouseMove(911, 567);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 点第二个时间
        robot.mouseMove(984, 666);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 选中滚动条
        robot.mouseMove(1016, 703);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 将滚动条移到最下面
        robot.mouseMove(1017, 973);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 选中时间
        robot.mouseMove(972 ,980);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        // 确认
        robot.mouseMove(927 ,716);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(300);
        if (count == 6){
            // 点击关闭按钮
            robot.mouseMove(1805 ,14);
            robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
            robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
            robot.delay(1000);
        }
    }
    public static void login(){
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        // 进入网上服务大厅登录
        robot.mouseMove(958, 608);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(3000);
        // 点击qq登录
        robot.mouseMove(1426, 537);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(7000);
        // 点击qq头像
        robot.mouseMove(880, 311);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(6000);
        // 点击图书馆
//        robot.mouseMove(1638, 485);
//        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
//        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
//        robot.delay(5000);
        // 点击我的收藏
        robot.mouseMove(30, 504);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        // 点击图书馆
        robot.mouseMove(189, 195);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(4000);
        // 点击学生专区
        robot.mouseMove(925, 534);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        // 点击预约研修生
        robot.mouseMove(1485, 677);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(1000);
        // 点击进入
        robot.mouseMove(459, 577);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_F5);
    }
    public static void showTimer() {
        final Timer timer = new Timer();
        //创建定时器任务
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                if(count == 7){
                    login();
                }else {
                    yuyue();
                }
                count++;
                if (count > 8){
                    timer.cancel();
                    System.out.println("预约任务结束");
                }else {
                    System.out.println("时间=" + new Date() + " 执行了" + count + "次"); // 1次
                }
//                if (count == 0 || count == 1 ||count == 3){
//                    yuyue();
//                }else if (count == 2){
//                    login();
//                    yuyue();
//                }else {
//                    timer.cancel();
//                    System.out.println("预约任务结束");
//                }
//                count += 1;
//                System.out.println("时间=" + new Date() + " 执行了" + count + "次"); // 1次
            }
        };

        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);//每天
        //定制每天的6:30:00执行，
        calendar.set(year, month, day + 1, 6, 30, 5);
        Date date = calendar.getTime();

        int period = 1000;
        //每天的date时刻执行task，每隔0.5秒重复执行
        timer.schedule(task, date, period);
        //每天的date时刻执行task, 仅执行一次
        //timer.schedule(task, date);
    }

}
