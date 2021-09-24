package springbook.user.proxyStudy;

public class CarServiceImpl implements CarPaintService {
	@Override
	public void paintBlue(String car) {
		System.out.println("Paint blue :" + car);	
	}
	@Override
	public void paintGreen(String car) {
		System.out.println("Paint green :" + car);
	}
	@Override
	public void paintRed(String car) {
		System.out.println("Paint red :" + car);
	}
	@Override
	public void printCar(String car) {
		System.out.println(car);	
	}
}
