import java.awt.*;
import java.awt.event.InputEvent;
import java.util.Calendar;

/**
 * @author: Xie
 * @Description: TODO
 * @Contact: qq307954865
 * @Date: 2021/4/28 14:10
 */
public class checkRecord {
    public static final int[] xOfDate =
            {723, 836, 939, 1046, 1153, 1259, 1363};
    public static void main(String[] args) {
        Robot robot = null;
        try {
            robot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
        while (true){
            robot.delay(1000);
            yuyue();
        }
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
        int w = calendar.get(Calendar.DAY_OF_WEEK) - 1;
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

        // 217从两点多预约
        robot.mouseMove(1153, 576); //217, 优先预约

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
    }
}
