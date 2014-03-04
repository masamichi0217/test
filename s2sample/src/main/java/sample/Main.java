package sample;

import org.seasar.example.s2container.helloworld.DateFormatter;
import org.seasar.example.s2container.helloworld.FileLoader;
import org.seasar.example.s2container.helloworld.IMessageProvider;
import org.seasar.framework.container.SingletonS2Container;
import org.seasar.framework.container.factory.SingletonS2ContainerFactory;

public class Main {

	public static void main(String[] args){
		//S2Containerを初期化(app.diconを読み込み)
		SingletonS2ContainerFactory.init();
		
		//diconファイルを指定して、コンテナを初期化
		//SingletonS2ContainerFactory.setConfigPath("my.dicon");
		//SingletonS2ContainerFactory.init();
		
		//IMessageProvideインターフェースを実装したコンポーネントを取得。まさに言葉通りで自動的にバインドしているらしい。app.diconに書かれてることを勝手に探してる。implementsしてるやつを探してるんだろうな・・・。
		//複数実装クラスが存在してるとmanyなんとかって出るらしい。
		IMessageProvider messageProvider = SingletonS2Container.getComponent(IMessageProvider.class);
		
		//実装クラスのコンポーネント名も指定できる
		//IMessageProvider messageProvider = SingletonS2Container.getComponent("messageProvider");
		
		//コンストラクタインジェクションの例。nameがtestのやつに入れてる。
		FileLoader file = SingletonS2Container.getComponent("test");
		
		DateFormatter format = SingletonS2Container.getComponent("date");
		
		
		//メッセージを表示
		System.out.println(messageProvider.getMessage());

		
		//S2Containerを破棄
		SingletonS2ContainerFactory.destroy();
	}
	
	
}
