import com.je.fan.modelA.api.FakeModelAApi;
import com.je.fan.modelA.api.ModelAApi;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FakeModelAApi api = (FakeModelAApi) ModelAApi.instance();
/**
        // 모델 객체들 조립
        ModelAUI ui = new ModelAUI(api,...); // DI로 의존 객체 전달

        // 생성한 모델 객체를 Pollable 목록에 보관
        List<Pollable> pollables = new ArrayList<>();
        pollables.add(ui); // ModelAUI가 Pollable을 implement 했다면,

        // 가짜 api로 HW 상태 변경
        api.setSpeedButtonStatus(ModelAApi.WindSpeed.LEVEL3);
        for (Pollable p : pollables) p.poll(); // Pollable의 poll을 호출해서 변경된 HW 상태 모델에 반영
        // 반영 여부 확인 위해 모델 구현 클래스에서 System.out으로 출력된 메시지 확인
        // 동일한 방식으로 HW 상태 변경하고, 모델에 반영되는지 확인
 **/
    }

}
