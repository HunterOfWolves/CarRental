package plpolsl.Controller;

import plpolsl.Model.CarRentalModel;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import plpolsl.Model.CarModel;

@WebServlet("/cars")
public class CarRentalController extends HttpServlet {

    @Override
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    CarRentalModel carModelo = new CarRentalModel();
    carModelo.addCar(new CarModel("Car1","Model1",10000));
    carModelo.addCar(new CarModel("Car2","Model2",15000));
    carModelo.addCar(new CarModel("Car3","Model3",20000));
    ArrayList<CarModel> carList = carModelo.getCars();
    
    request.setAttribute("cars", carList);
    request.getRequestDispatcher("index.jsp").forward(request, response);
}
}
