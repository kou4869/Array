
public class ArraySample1 {

	public static void main(String[] args) {
		
		//配列を使わずに計算する
		//各自の点数をint型の変数で宣言・代入
		int score1 = 90;
		int score2 = 80;
		int score3 = 70;
		int score4 = 85;
		int score5 = 95;
		int score6 = 75;
		
		int total;	//合計点
		double avg;	//平均点
		
		total = score1 + score2 + score3 + score4 + score5 + score6;
		avg = total / 6;
		
		System.out.println("合計点：" + total);
		System.out.println("平均点：" + avg);
		
		
		
		System.out.println("----------");
		
		
		
		
		//配列を使って計算する
		
		int[] scores;
		scores = new int[6];
		
		//各要素に点数を代入
		scores[0] = 90;
		scores[1] = 80;
		scores[2] = 70;
		scores[3] = 85;
		scores[4] = 95;
		scores[5] = 75;
		
		int[] scores2 = new int[] {90,80,70,85,95,75};
		int[] scores3 = {90,80,70,85,95,75};
		
		//配列を使うメリットがない書き方のためコメントアウト
		//total = scores[0] + scores[1] + scores[2] + scores[3] + scores[4];
		//avg = total/5;
		
		//配列を使うメリットが活かせる書き方
		System.out.println("要素数：" + scores.length);
		
		//初期化
		total = 0;
		avg = 0;
		
		for(int i = 0; i < scores.length; i++) {
			total = total + scores[i];
		}
		
		avg = total/scores.length;
		
		System.out.println("合計点：" + total);
		System.out.println("平均点：" + avg);
		
		

	}

}
