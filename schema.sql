create database monitoramento;
use monitoramento;
#drop database monitoramento;

create table tb_ferramenta(
	id int primary key auto_increment,
    nome varchar(30) not null,
    horas_uso int not null,
    vida_util_maxima int not null
);