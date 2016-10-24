import ug.joshh.animal.*;

public class ExternalDogLauncher {
	// 出现『导入包』中的类和『当前包』中的类出现类名冲突时，默认使用当前包中的类，import的包，必须使用全名
	public static void main(String[] args) {
		ug.joshh.animal.Dog ujad = new ug.joshh.animal.Dog("gouzi", "chinese cultural dog", 22);
		System.out.println(ujad.toString());
	}
	
}
