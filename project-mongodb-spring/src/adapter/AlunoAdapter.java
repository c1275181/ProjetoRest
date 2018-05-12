package adapter;

import org.bson.Document;

import entity.Aluno;

public class AlunoAdapter {
	
	public static Document toDBObject (Aluno a) {
		Document bo = new Document();
		bo.append("nome",a.getNome());
		bo.append("email", a.getEmail());
		bo.append("sexo", a.getSexo());
		return bo;
		
	}
	
	public static Aluno getAlunofromDbObject(Document db) {
		Aluno a = new Aluno (db.get("id"),
				    db.get("nome").toString(),
				    db.get("email").toString(),
				    db.get("sexo").toString()
			  );
		return a;
		
	}
	
	

}
