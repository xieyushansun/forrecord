import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author: Xie
 *
 * @Description: TODO
 * @Contact: qq307954865
 * @Date: 2021/3/4 0:09
 */
public class refresh {
    public static void main(String[] args) {
        showTimer();

    }
    public static void showTimer() {
        final Timer timer = new Timer();

        //创建定时器任务
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                int hour = calendar.get(Calendar.HOUR);
                int min = calendar.get(Calendar.MINUTE);
                if (hour == 6 && min > 29){
                    timer.cancel();
                    System.out.println("预约任务结束");
                }else {
                    Robot robot = null;
                    try {
                        robot = new Robot();
                    } catch (AWTException e) {
                        e.printStackTrace();
                    }
                    robot.mouseMove(93, 61);
                    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
                    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
                    System.out.println("执行任务：" + hour + "：" + min);
                }
            }
        };

        //设置执行时间
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);//每天

        //定制每天的00:38:00执行，
        calendar.set(year, month, day, 0, 1, 0);
        Date date = calendar.getTime();

        // 十分钟刷新一次
        int period = 400 * 1000;
        //每天的date时刻执行task，每隔10分钟重复执行
        timer.schedule(task, date, period);

    }
}
