CREATE DATABASE IF NOT EXISTS `gestao_academica`;
USE `gestao_academica`;

DROP TABLE IF EXISTS `tb_usuario`;
CREATE TABLE `tb_usuario`(
	`id`int(11) unsigned NOT NULL AUTO_INCREMENT,
    `email` varchar(255) DEFAULT NULL,
    `senha` varchar(255) DEFAULT NULL,
    `usuario` varchar(255) DEFAULT NULL,
    PRIMARY KEY(`id`));
    

DROP TABLE IF EXISTS `tb_aluno`;
CREATE TABLE `tb_aluno`(
   `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
   `nome`varchar(55) DEFAULT NULL,
   `telefone`varchar(55) DEFAULT NULL,
   `id_usuario` int(11) unsigned DEFAULT NULL,
   PRIMARY KEY(`id`),
   KEY `fk_id_usuario`(`id_usuario`),
   CONSTRAINT `fk_id_usuario` FOREIGN KEY (`id_usuario`) REFERENCES `tb_usuario` (`id`) ON DELETE CASCADE ON UPDATE CASCADE);
  
  DROP TABLE IF EXISTS `tb_professor`;
  CREATE TABLE `tb_professor`(
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY(`id`));
  
  DROP TABLE IF EXISTS `tb_horario`;
  CREATE TABLE `tb_horario`(
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `data` Date unique ,
  `horario` timestamp unique,
  `id_disciplina` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY(`id`),
  key `fk_id_disciplina`(`id_disciplina`),
  CONSTRAINT `fk_id_disciplina` FOREIGN KEY (`id_disciplina`) REFERENCES `tb_disciplina` (`id`) ON DELETE CASCADE ON UPDATE CASCADE);
  
  DROP TABLE IF EXISTS `tb_nota`;
  CREATE TABLE `tb_nota`(
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nota` varchar(40) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL,
  `descricao` varchar(255) DEFAULT NULL,
  `id_disciplina` int(11) unsigned DEFAULT NULL,
  PRIMARY KEY(`id`));
  

  DROP TABLE IF EXISTS `tb_eventos`;
  CREATE TABLE `tb_eventos`(
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `data` Date,
  `hora` timestamp,
  `descricao` varchar(255) DEFAULT NULL,
  `tipo` varchar(55),
  `id_disciplina` int(11) unsigned,
  PRIMARY KEY(`id`),
  CONSTRAINT `fk_id_eventos` FOREIGN KEY (`id_disciplina`) REFERENCES `tb_disciplina` (`id`) ON DELETE CASCADE ON UPDATE CASCADE);
  

  DROP TABLE IF EXISTS `tb_disciplina`;
  CREATE TABLE `tb_disciplina`(
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `nome` varchar(255) DEFAULT NULL,
  `abreviacao` varchar(10) DEFAULT NULL,
  `cor` varchar(55) DEFAULT NULL,
  `id_professor` int(11) unsigned DEFAULT NULL ,
  PRIMARY KEY(`id`),
  KEY `fk_id_professor`(`id_professor`),
  CONSTRAINT `fk_id_professor` FOREIGN KEY (`id_professor`) REFERENCES `tb_professor` (`id`) ON DELETE CASCADE ON UPDATE CASCADE);
  
  