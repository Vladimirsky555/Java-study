javac -d classes com/user/hello/Main.java - ������������ �� �������


1) � ������� ��������� ������ ������� � ����� �������
2) �������� ���� ����� � �����, � ������������ � ��������
 * Main.java � com/user/hello/
 * Print.java � com/user/prnt
3) �������� ���� ����� com � ����� src
3) ����������� ��������
javac -d classes -cp src src/com/user/hello/Main.java
� ���������� ���������� ����� classes � ��������� ����� �������, �� ������
4) ����� ����������, ��������� ������ ��������
java -cp classes com/user/hello/Main
