������ � �������:
1) � ����� Classes ������� ����� prnl
2) ��������� �������
jar cf myJar.jar com - �������� ������ � ����� classes
3) �������� ����� � ����� �������
4) ��������� ������
java -cp classes; myJar.jar com/user/hello/Main (��� windows - ;, ��� Linux - :)(� ���� �� ���������)
5) ���� ��������� � ����� ��������� java ��� �����, �� ��� ������� �������
java -cp classes com/user/hello/Main

������ � ����� ����������:
�������� ���:
import com.user.prnt.Print;
public class Main {
    public static void main(String[] args){
        Print print = new Print();
        print.print();
    }
}
1) �������� ����� � ������ � ����� ����������:
File -> Project Structure -> Libraries -> + -> Java -> �������� ���� �� �������� �������
2) ��������� �������������

��� ������ ��� ����������� java:
File -> Project Structure -> SDKs

jar -tf MyJar.jar - ������� ��� ��������� jar
