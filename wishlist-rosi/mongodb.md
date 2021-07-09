## instalando o mongodb

sudo apt update;
sudo apt upgrade;
sudo apt install -y mongodb;
sudo systemctl status mongodb;
mongo --eval 'db.runCommand({ connectionStatus: 1 })';


## Para instalar no Ubuntu 20.10
o nome do mongodb = 3.6 mongod = 4.4
find / -name mongodb.conf

curl -fsSL https://www.mongodb.org/static/pgp/server-4.4.asc | sudo apt-key add -;
apt-key list;

echo "deb [ arch=amd64,arm64 ] https://repo.mongodb.org/apt/ubuntu focal/mongodb-org/4.4 multiverse" | sudo tee /etc/apt/sources.list.d/mongodb-org-4.4.list;

sudo apt update;
sudo apt install mongodb-org;
sudo apt install mongodb-org mongodb-org-shell mongodb-org-server mongodb-org-mongos;
sudo systemctl start mongod.service;
sudo systemctl status mongod;
sudo systemctl enable mongod;
mongo --eval 'db.runCommand({ connectionStatus: 1 })';


# users e passwords
mongo mongodb://191.252.202.133:28903/
use fragurb-db
db.auth("root","12345")

Senha do Servidor: 12345
//create new user with the root role (also, named root):
sudo nano /etc/mongod.conf
sudo mongod --config /etc/mongod.conf
mongo -port 27017;
mongod --config etc/mongod.conf --auth
security:
    authorization: enabled

db.auth("root", "12345" )
db.auth("admin", "12345" )

@network interfaces
net:
  port: 27017
  bindIp: 0.0.0.0

use admin
db.createUser({
  user: "root",
  pwd: "12345",
  roles : [ "root" ]
})

mongod --dbpath /mongoauth/data -port 27017;
db.createUser(
  {
    user: "admin",
    pwd: "12345",
    roles: [ { role: "userAdminAnyDatabase", db: "admin" }]
  }
);

mongod --dbpath /mongoauth/data -port 28903 --auth;
mongo -port 28903 -u admin -p 12345;
mongo -port 28903 -u root -p 12345 --authenticationDatabase admin;
mongo -port 27017 -u admin -p 12345;


use wishlist;
db.createUser(
  {
    user: "admin",
    pwd: "12345",
    roles:[{role: "dbOwner" , db:"wishlist"}]
  }
)

# Outros comandos

use db
db.user.insert({"name":"Suzy"})
db.auth('meUsuario','senha')
db.getUsers()
db.dropUser('meUsuario')
db.createCollection('nomeCollection')
db.dropCollection('nomeCollection')
db.getCollection("user").drop()
show collections
show dbs
db.nomeCollection.find()
db.nomeCollection.find({"nome":'Fulano'})
db.dropDatabase()

use admin;
db.grantRolesToUser('admin', [{ role: 'root', db: 'admin' }])

sudo systemctl restart mongod
sudo systemctl disable mongod

port = 28903


## Avançado no Mongodb

https://pt.stackoverflow.com/questions/374086/como-atualizar-um-documento-dentro-de-outro-documento-sem-deletar-os-dados-anter


