package org.cap.dao;
import java.util.*;

import org.cap.entities.Employee;


public class EmployeeDaoImpl implements IEmployeeDao(){
  private Map<int,employee> store= new HashMap<>();
  
  public EmployeeDaoImpl() {
	  Employee emp1 = new Employee(1, "nida");
      store.put(1, emp1);
      Employee emp2 = new Employee(2,"Nandini");
      store.put(2, emp2);
  }
  
  @Override
  public boolean credentialsCorrect(int id, String name) {
      Employee emp = store.get(id);
      if (emp == null) {
          return false;
      }
      return emp.getId().equals(id);
  }
  
  @Override
  public Employee getEmployeeById(int id) {
      Employee emp = store.get(id);
      return emp;
  }

}

}
