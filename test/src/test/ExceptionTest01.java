package test;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
public class ExceptionTest01 {
    public static void main(String[] args) {
        byte[] bs = toGBK("����");
        System.out.println(Arrays.toString(bs));
    }

    static byte[] toGBK(String s) {
        try {
            // ��ָ������ת��StringΪbyte[]:
            return s.getBytes("GBK");
        } catch (UnsupportedEncodingException e) {
            // ���ϵͳ��֧��GBK���룬�Ჶ��UnsupportedEncodingException:
            System.out.println(e); // ��ӡ�쳣��Ϣ
            return s.getBytes(); // ����ʹ����Ĭ�ϱ���
        }
    }
}