# PythonとJavaの違い
## 出力処理
```java
//java

class Main{
    public static void main(String[] args){
        System.out.println("こんにちは！")
    }
}
```

```python
#python

print("こんにちは！)
```

## 条件分岐

```java
//java

class Main{
    public static void main(String[] args){
        String kisetu = "春";

        if (kisetu == "春"){
            System.out.println("桜");
        }

        else if (kisetu == "夏"){
            System.out.println("花火");
        }

        else if (kisetu == "秋"){
            System.out.println("紅葉");
        }

        else if (kisetu == "冬"){
            System.out.println("雪");
        }

    }
}
```

```python

#python

kisetu = "春"

if kisetu == "春":
    print("桜")

elif kisetu == "夏":
    print("花火")

elif kisetu == "秋":
    print("紅葉")

elif kisetu == "冬":
    print("雪")

```


## forループ


```java
//java

class Main{
    public static void main(String[] args){
        for (int i= 0; i <= 10; i++){
            System.out.println(i); // 0,1,2,3,4,5,6,7,8,9と順番に表示される
        }

    }
}
```

```python
#python

for i in range(10):
    print(i)  # 0,1,2,3,4,5,6,7,8,9と順番に表示される

```

## 配列

```java
//java

class Main{
    public static void main(String[] args){

        int[] numbers = {0,1,2,3,4,5,6,7,8,9}

        for (int i= 0; i <= 10; i++){
            System.out.println(numbers[i]);
        }

    }
}
```

```python
#python

numbers = [0, 1, 2, 3, 4, 5, 6, 7, 8,9]

for i in numbers:
    print(i)
```

## クラス

### メソッドからメンバー変数を扱う方法も

javaでは `static` をつける事により、インスタンス化をしなくても変数を扱う事が出来ます。

```Java
//java

class Main{
    public static void main(String[] args){

        like = new Sub(); // インスタンス化

        like.setKisetu("春"); // Subクラスのメンバー変数に「春」を代入 
        like.dispKisetu(); //春を出力
        
        }

    }
}

class Sub{
    String kisetu; // メンバー変数

    void setKisetu(String input_kisetu){ //メソッド
        kisetu = input_kisetu;
    }

    void dispKisetu(){
        System.out.println(kisetu);
    }
}```


```python
#python

class Sub: // クラス
    kisetu = "" #とりあえず空の文字列

    def setKisetu(input_kisetu): // メソッド
        kisetu = input_kisetu

    def dispKisetu():
        print(kisetu)



like = Sub() // インスタンス化

like.setKisetu("春")
like.dispKisetu()
```

## コンストラクタ

```Java
//java

class Main{
    public static void main(String[] args){

        like = new Sub("春"); // インスタンス化。コンストラクタを設定してるので、引数(パラメーター)に値を渡せる。今回は引数に春をしていしているので、春がkisetuに代入される。
 
        like.dispKisetu(); //春を出力
        
        }

    }
}

class Sub{
    String kisetu; // メンバー変数


    Sub(String inout_kisetu){ // コンストラクタ
        kisetu = inout_kisetu;
    }

    void dispKisetu(){ // メソッド
        System.out.println(kisetu);
    }
}```

```python
#python

class Sub: // クラス
    def __init__(self, input_kisetu): // コンストラクタ
        self.kisetu = input_kisetu;


    def dispKisetu(): // メソッド
        print(kisetu)



like = Sub("春") // インスタンス化

like.dispKisetu()
```

## オーバーロード

pythonはオーバーロードをするために、javaで言うパッケージをインポートする必要があるため、省略

## カプセル化

pythonは他のクラスからアクセスできないようにする`public` や　`private` 等の修飾子が無い。アクセスを制限するためには専用のファイルが必要。


# 一言

java書くのだるい