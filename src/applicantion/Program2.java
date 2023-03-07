package applicantion;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao dao = DaoFactory.createDepartmentDao();
		
		System.out.println("===== TEST 1: department find by id =====");
		Department derp = dao.findById(2);
		System.out.println(derp);
		
		System.out.println("\n===== TEST 2: department find all =====");
		List<Department> list = dao.findAll();
		for (Department dep : list) {
			System.out.println(dep);
		}
		
		System.out.println("\n===== TEST 3: department insert =====");
		Department obj = new Department(null, "Music");
		dao.insert(obj);
		System.out.println("Department insert, new id = " + obj.getId());
		
		System.out.println("\n===== TEST 4: department update =====");
		derp.setName("Games");
		dao.update(derp);
		System.out.println("Department updated");
		
		System.out.println("\n===== TEST 5: department delete =====");
		System.out.println("Digite um id para deletar um department: ");
		int id = sc.nextInt();
		dao.deleteById(id);
		System.out.println("Deleted!");
	}

}
