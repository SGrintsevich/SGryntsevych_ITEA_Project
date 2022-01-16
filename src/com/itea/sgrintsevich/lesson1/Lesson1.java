package com.itea.sgrintsevich.lesson1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Arrays;

public class Lesson1 {
    private static String IsEven(Integer mVarInt) {
        String mRez=mVarInt%2>0  ? "Число "+mVarInt+" нечетное" : "Число "+mVarInt+" четное";
        return mRez;
    }

    /**
     * ArrOrder - метод выполняет сортировку элементов масива и возвращает результат сортировки в виде иекстовой строки
     * @param myIntArr - масив для сортировки
     * @return
     */
    private static String ArrOrder(Integer[] myIntArr) {
        String mRez="";
        Arrays.sort(myIntArr);
        for (int i = 0; i < myIntArr.length; i++) {
            mRez=mRez+myIntArr[i]+" ";
        }
        return mRez;
    }

    //WriteLog - метод для записи текста в файл
    public static void WriteLog(String StrPar) {
        FileWriter fStream;
        String mFileName="c:/temp/MyFierstLogFile.log";
        //Определяю имя файла в заданом пути
        String mFile = new File(mFileName).getName();
        //Определяю путь к заданому каталогу
        Path path = Paths.get(mFileName);
        String directoryName=path.getParent().toString();

        //Проверяю наличие каталога, если не найден. то сознаю
        File directory = new File(directoryName);
        if (! directory.exists()){
            //directory.mkdir();   //Создает один каталог
            directory.mkdirs();    //Создает структуру каталогов
            MyMassage(false,"Create DIR " +directoryName);
        }

        //Пытаюсь сохранить текст сообщения в файл
        try {
            //Определяю сепаратор строк для текущей ОС
            String newline = System.getProperty("line.separator");

            //создаю стрим для записи и вывожу сообщения в файл
            fStream = new FileWriter(mFileName, true);
            fStream.append(StrPar+newline);
            fStream.flush();
            fStream.close();
        } catch (IOException ex) {
            //если ошибка записи, то вывожу сообщение об ошибке
            MyMassage(false,"Error writing to file " +mFileName);
        }
    }

    /**MyMassage - метод для унификации вывода сообщений
     *
     * @param WLog - параметр определяет необходимость сохранения String значений в файл на диске
     *               принимает значение true или false
     * @param StrPar -  параметр значения которого необходимо вывести в консоль
     *               параметр String
     */
    public static void MyMassage(boolean WLog, String StrPar) {
        LocalTime CurTime = LocalTime.now();
        String Msg=CurTime+": "+StrPar;
        System.out.println(Msg);
        if (WLog == true) {
            WriteLog(Msg);
        }
    }

    public static void main(String[] args) {

        LocalTime StartTime = LocalTime.now();
        boolean WLog=true;

        MyMassage(WLog,"Start");
        MyMassage(WLog,"Hello World!");

        int a=10; int b=2;
        String Str, StrNum;
        Str="Test String Variable";
        StrNum="80";

        MyMassage(WLog,Str+" "+(a-9)+" with text and int");
        MyMassage(WLog,"    Sum a+b ="+(a+b) );
        MyMassage(WLog,"    Minus a-b ="+(a-b) );
        MyMassage(WLog,"    Div a/b ="+(a/b) );
        MyMassage(WLog,"    Mult a*b ="+(a*b) );
        MyMassage(WLog,"    "+IsEven(22));
        MyMassage(WLog,"    "+IsEven(17));

        Integer[] myIntArr = {12,4,37,2};
        MyMassage(WLog,"    Отсортированный масив: "+ ArrOrder(myIntArr));


//        MyMassage(WLog,"Каталог пользователя: "+System.getProperty("user.home"));
//        MyMassage(WLog,"Каталог для временных файлов: "+System.getProperty("java.io.tmpdir"));
//        MyMassage(WLog,"Пользователь: "+System.getProperty("user.name"));

        LocalTime FinishTime = LocalTime.now();

        Duration d = Duration.between( StartTime , FinishTime ) ;

        MyMassage(WLog,"Finish, time to exec "+d.toString());

    }
}
