オリジナルのpythonプログラム、学習方法などはここを参考にしています。 https://frqux.hatenablog.com/entry/2023/03/12/165640<br>
pythonだとメモリ不足に陥ったのでjavaで書きました。
# ビルド
Windows
```cmd
git clone https://github.com/soramame0256/WikiTrimer.git
cd WikiTrimer
javac src/Main.java
```
linux
# 実行方法
対象となるファイルが存在するディレクトリにMain.classを移動させ<br>
<b>対象となるファイルの名前をwiki.txtに変更したのち</b>
```
java Main
```
を実行してください。<br>
実行が完了するとwikiTrimmed.txtが生成されます。
