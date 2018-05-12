#terminal
#mongod
#mongo  
#nosql sincronia




show dbs
show database
use bdnoite
 
db.getName()
#mostra o nome do banco

show collections


db.aluno.insert([
{"nome":"michel","email":"michel@gmail.com","sexo":"m"},
{"nome":"renato","email":"renato@gmail.com","sexo":"m"},
{"nome":"marcel","email":"marcel@gmail.com","sexo":"m"},
{"nome":"lu","email":"lu@gmail.com","sexo":"m"},
{"nome":"ju","email":"ju@gmail.com","sexo":"m"}
]);

db.aluno.find({nome:"ju"}).pretty();