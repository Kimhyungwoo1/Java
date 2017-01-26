
public class Doctor {
	
	String computer = "전산시스템";
	String medicalAppliance = "청진기";
	
	//환자 병적조회
	void inquery(){
		System.out.println(computer+"로 환자의 병적을 조회합니다.□■");
	}
	//환자 진료
	void tretment(){
		System.out.println("의사가" + medicalAppliance+"로 환자를 진료합니다.");
	}
	//처방전 작성
	void prescription(){
		System.out.println("의사가 환자의 처방전을 작성합니다.");
	}

}
