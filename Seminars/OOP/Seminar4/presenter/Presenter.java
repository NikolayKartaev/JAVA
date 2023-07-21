package JAVA.Seminars.OOP.Seminar4.presenter;
import java.security.Provider.Service;
import JAVA.Seminars.OOP.Seminar4.model.Weather_model;
import JAVA.Seminars.OOP.Seminar4.ui.View;






public class Presenter { // класс связывающий View и Model

    private View view;       // связь через интерфейс - чтобы можно было менять View (консоль, графический интерфейс)
    private Service service; // связь через интерфейс

    
    public Presenter(View view) {
        this.view = view;
        service = new Weather_model(); // Presenter создает Model.
    }


    public void getInfo (String city) {
        String answer = service.get(city);
        view.print(answer);
    }
}
