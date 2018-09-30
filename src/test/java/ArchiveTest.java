import org.junit.Test;

import java.io.ByteArrayInputStream;

/**
 * Created by BONC on 2018/9/27.
 */
public class ArchiveTest {
    //将整数转换为字节数组
    //8位二进制表示一个字节
    @Test
    public void test1(){
        Byte[] bytes=int2Bytes(-128);
        System.out.println(bytes2Int(bytes));
    }

   public Byte[] int2Bytes(int i){

        Byte[] bytes=new Byte[4];
        bytes[0] =(byte)i;
       bytes[1]=(byte)(i>>8);
       bytes[2]=(byte)(i>>16);
       bytes[3]=(byte)(i>>24);
       return bytes;
   }
//字节数组转化为数字
    public int bytes2Int(Byte bytes[]){
        int i0=bytes[0];
        int i1=(bytes[1]& 0xFF)<<8;//将其变为正数以后再左移8位
        int i2=(bytes[2]& 0xFF)<<16;
        int i3=(bytes[3]& 0xFF)<<24;
        return i0|i1|i2|i3;
    }
}
