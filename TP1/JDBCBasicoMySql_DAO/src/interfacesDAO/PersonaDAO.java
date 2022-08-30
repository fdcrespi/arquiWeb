package interfacesDAO;

import java.util.List;

import mySqlDAO.MySQLPersonaDAO;

public interface PersonaDAO {
	public List<MySQLPersonaDAO> selectPersonas();
	public PersonaDAO get(int id);
	public PersonaDAO get(String name);
}