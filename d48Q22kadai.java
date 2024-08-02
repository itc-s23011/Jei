//s23011
//connectionにアクセスする場合"."をつけるから付け足した。

enum Connection {OFFLINE, ONLINE}

class d48Q22kadai {
	public static void main(String[] args) {
		Connection s = Connection.OFFLINE;
		if( s == Connection.OFFLINE) {
			s =  Connection.ONLINE;
		}
		System.out.println(s);
	}
}

