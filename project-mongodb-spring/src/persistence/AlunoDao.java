package persistence;



import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;

import adapter.AlunoAdapter;
import entity.Aluno;

public class AlunoDao extends  Dao {
	
	public static final String ALUNO="aluno";
	
	
	
	public void save(Aluno a) throws Exception{
		try {
			MongoCollection<Document>coll= getDB().getCollection(ALUNO);
			coll.insertOne((AlunoAdapter.toDBObject(a)));
		}finally {
			close();
		}
	}
	
	
	public List<Aluno>  listaAluno() throws Exception{
		MongoCursor <Document> c =null;
		try {
	MongoCollection<Document> collection = getDB().getCollection(ALUNO);
	    c = collection.find().iterator();	
	    List<Aluno> alunos = new ArrayList<>();
	    
	    while(c.hasNext()) {
	    	alunos.add(AlunoAdapter.getAlunofromDbObject(c.next()));
	    }
		return alunos;
	    }finally {
		c.close();
		close();
		}
	}
	
	

}
