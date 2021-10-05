# 可読性について

実際の業務ではプログラムの開発からメンテナンスまでを全部一人で行う事は滅多な事がない限りはありません。

数人で分担して行う事が多いです。

自分だけプログラムを読めても、他の人が読めなければ、意味がありません。

他の人が読めるようにするために、可読性が高いコードを書く必要があります。

可読性を高くするために使われるのが、クラスやメソッドです。
# メソッドについて

処理をコンパクトにし、可読性を上げるための物。

```java
void prm(String args){
    return "a";
}

戻りの型 メソッド名(引数の型 引数名){
    return 戻り値;
}
```

void -- 戻り値の型

prm -- メソッド名

String args -- 引数の型と引数名

return "a" -- 戻り値

以下で解説します。

# メソッド名
これは任意で付ける物です。特に決まっていません。
例えばはさみを例に使います。はさみで出来る事は、紙を切る事です。この紙を切る道具に別の名前、例えば「あいうえお」が付けられたとしたら、はさみとは言わずに、あいうえおとその道具を呼んでいたでしょう。

これはメソッド名や変数名、引数名、クラス名にも言えます。名前はなんでもいいのです。

# 引数について


```java

int nedan = 100;

prm(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int nedan){
    int price = nedan;
    System.out.println(price);
}

```

このようなコードがあったとします。

まず、変数「nedan」に100という数値を代入します。

100が入った変数をメソッドに引数に渡しています。

この時,

```java
int nedan = 100; //変数 nedanに100という値を入れる。

prm(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int nedan){
    int price = nedan;
    System.out.println(price);
}

```

```java
int nedan = 100;

prm(100); //prmメソッドの引数にnedanを指定していたため、内部ではnedanが100に置き換わっている。

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int nedan){
    int price = nedan;
    System.out.println(price);
}

```

```java
int nedan = 100;

prm(100);

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int 100){ //呼び出し側の引数に100を指定したので、設計側の引数「nedan」が100に置き換わっている。
    int price = nedan;
    System.out.println(price);
}

```

```java
int nedan = 100;

prm(100);

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int 100){ 
    int price = 100; //元々、変数priceに引数nedanの値を代入していたので、nedanが100に置き換わったため、priceに100が置き換わる。
    System.out.println(price);
}

```


```java
int nedan = 100;

prm(100);

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int 100){
    int price = 100;
    System.out.println(100); //priceを出力する処理でpriceが100に置き換わっているので、100が出力される。
}

```

```java
int nedan = 100;

prm(100); //このメソッドが100を出力する処理のため、ここで100が出力される。

// ↑まで呼び出し側の処理
//↓から設計側の処理

void prm(int 100){
    int price = 100;
    System.out.println(100); 
}

```

# 戻り値について

```java
int nedan; //変数nedanの初期化

nedan = prm(100); 

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int nedan){
    int price = 100;
    return price;
}

```

```java
int nedan; 

nedan = prm(100); //prmメソッドの引数に100を指定する

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int nedan){
    int price = nedan;
    return price;
}

```

```java
int nedan; 

nedan = prm(100); 

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int 100){ //呼び出し時に100がしていされたので、引数nedanが100に置き換わる。
    int price = nedan;
    return price;
}

```

```java
int nedan; 

nedan = prm(100); 

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int 100){
    int price = 100; //priceにnedanの値を代入していたので、priceに100が入る。
    return price;
}

```

```java
int nedan; 

nedan = prm(100); 

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int 100){
    int price = 100; 
    return 100; //priceを戻り値としていて、priceに100が入ってるので、100が戻り値となる。
}

```

```java
int nedan; 

nedan = 100; // 実行すると、メソッドの部分が戻り値に置き換わり、変数「nedan」に100が代入される。

System.out.println(nedan);

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int 100){
    int price = 100; /
    return 100;
}

```

```java
int nedan; 

nedan = 100

System.out.println(100); //変数nedanに100が代入されてるので、100が出力される。

// ↑まで呼び出し側の処理
//↓から設計側の処理

int prm(int 100){
    int price = 100; 
    return 100;
}

```

# 戻り値の型について

戻り値がなんの型になるか指定する。

javaでは変数なり、戻り値なり、なんの型になるか教えてあげる必要がある。

例えば、

int prm = 100;

これは左のintでprmに「整数」である100が入ると教えている。

String arg = "あいうえお";

これは左のStringでargに「文字列」であるあいうえおが入ると教えている。

これと同様の考えで、以下のコードを見てみると、分かりやすいと思う。

```java

int prm(){
    return 100;
}

String arg(){
    return "あいうえお";
}

```

## voidについて

```java

void not_return(){
    int price = 100;
}

```

一番左に「void」と書くことがある。これは戻り値が無い事を示している。

例えば
```java
void dispPrice(){
    System.out.println(price);
}
```
このようなコードがあるとして、これはreturnを使っていない。つまり戻り値が無いと言う事。

return無し = 戻り値が無い = void と覚えて良いと思うんだ。分かんないけど。

# ドットについて

クラス.メソッドと書くときに、クラスとメソッドの間にある「ドット」は、大きい纏まりの中にある小さなものを取り出すときに使う。

身近なものでたとえた使い方は、

岩手県.盛岡市
岩手県.北上市.コンピュータアカデミー

みたいな感じ。

例えばふでばこの中にある、シャーペンや消しゴムを取り出すプログラムを作りたいときに

ふでばこ.シャーペン();
ふでばこ.消しゴム();

となる。


# クラスについて

クラスは沢山あるメソッド等を一つに纏めたいときに使います。

これも筆箱や住所にたとえると

岩手県がクラスにになり、盛岡がメソッドになります。


![before_class](pics/before_class.png) 

これを

![after_class](pics/after_class.png) 

このように纏めるイメージです。

しかし、クラスはあくまで設計図でしかありません。

設計図を形にするためには、インスタンス化をして実体にする必要があります。

# インスタンス化について
設計図を形にする事です。

普段
```java

class Room{
    int price;
}

```

これはあくまでRoomクラスにpriceという変数が入ってるんだよと言ってるだけです。

このpriceを使うには、インスタンス化して実体にする必要があります。

勿論、クラス名は任意です。

```java

Room room = new Room();
```

一番左のRoomも「型」の一種です。

「int」や「String」と同じものです。

Roomと書いてる所はクラス名を書く必要があります。

そうじゃないと、何をインスタンス化するの？となります。

「何を」を明確にするための名前です。

# コンストラクタについて
インスタンス化をするときに、引数をしていする事により、色々省略できます。


```java

class Room{
    int room_number; //ルーム番号
    void setRoom(int number){
        room_number=number; 
    }

    vodi dispRoom(){
        System.out.println(room_number);
    }
}

Room room = new Room();

room.setRoom(1);
room.dispRoom();
```

このようなコードがあったとします。

これは「setRoom」メソッドでルーム番号をしていしています。

しかし、このために「setRoom」メソッドを作るのって結構無駄だと思いませんか？

それを解決してくれるのがコンストラクタです。

```java

class Room{
    int room_number; //ルーム番号
    
    Room(int number){
        room_number=number;
    }

    vodi dispRoom(){
        System.out.println(room_number);
    }
}

Room room = new Room(1);
room.dispRoom();
```

このようにルーム番号を決めるためのメソッド「setRoom」が消えました。

そして、インスタンス化をするときにルーム番号を指定出来るようになりました。

コンストラクタはクラス名と同じ名前で作る必要があり、「戻り値」という概念は存在しませんので型を教える必要がありません。そのため、void や int、Stringは必要無いです。


--- 

# 変数関連のエラー

```java

int charge = 200;
int price;

change = charge - price;

System.out.println(change);
```

お釣りを求めるコードがあります。

しかしこれはエラーになります。

変数「price」に値が入ってないからです。

「数字」と「無」を計算しようとしている、わけの分からない状態になっています。

```java

int charge = 200;
int price=50;

change = charge - price;

System.out.println(change);
```

このようにちゃんと「無」では無い状態。値を入れてあげることによりエラーが無くなります。

# if文について

「なんのためにIF文を使っているのか」
「どうしてIFが必要なのか」

を考えると更に書きやすくなると思います。


```java

int price = 100;

if(price==100){
    System.out.println("コーラ1本100円です。");
}

else if(price==200){
    System.out.println("コーラ1本200円です。");
}


else if(price==300){
    System.out.println("コーラ1本300円です。");
}

```

正直結構無理矢理なIF文にしました。

これはpriceに入っている数値によってコーラ1本の値段を変えるプログラムです。

priceに入っている値を調べるためにiF文を使っています。

しかし、これをよーく見てみましょう。

コーラ1本

円です。

この二つの文字は全てのIF文に共通していますよね？

変わってるのって１本の値段だけですよね？

これは
```java

int price = 100;

if(price==100){
    tanka=100;
}

else if(price==200){
    tanka=200;
}


else if(price==300){
    tanka=300;
}

System.out.println("コーラ1本" + tanka + "円です。");

```

このようにすることが出来ます。

わざわざ長いのを複数書く必要はありません。時間と労力の無駄です。