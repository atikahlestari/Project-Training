/*
SQLyog Ultimate v12.4.3 (64 bit)
MySQL - 10.1.22-MariaDB : Database - universitas
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`universitas` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `universitas`;

/*Table structure for table `tbl_fakultas` */

DROP TABLE IF EXISTS `tbl_fakultas`;

CREATE TABLE `tbl_fakultas` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `nama` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_fakultas` */

insert  into `tbl_fakultas`(`id`,`nama`) values 
(1,'FIPPS'),
(2,'FTMIPA'),
(3,'FIKOM'),
(4,'FKEB'),
(5,'FPS');

/*Table structure for table `tbl_jurusan` */

DROP TABLE IF EXISTS `tbl_jurusan`;

CREATE TABLE `tbl_jurusan` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `nama` varchar(55) DEFAULT NULL,
  `idFakultas` int(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_jurusan` */

insert  into `tbl_jurusan`(`id`,`nama`,`idFakultas`) values 
(1,'Bimbingan Konseling',1),
(2,'Fisika',2),
(3,'Informatika',3),
(5,'Ekonomi',8);

/*Table structure for table `tbl_krs` */

DROP TABLE IF EXISTS `tbl_krs`;

CREATE TABLE `tbl_krs` (
  `no` int(30) NOT NULL AUTO_INCREMENT,
  `id_krs` int(30) DEFAULT NULL,
  `npm_mhs` int(15) DEFAULT NULL,
  `id_jurusan` int(30) DEFAULT NULL,
  `id_matkul` int(30) DEFAULT NULL,
  `dospem` varchar(55) DEFAULT NULL,
  `semester` int(10) DEFAULT NULL,
  `tahun_ajaran` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`no`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_krs` */

insert  into `tbl_krs`(`no`,`id_krs`,`npm_mhs`,`id_jurusan`,`id_matkul`,`dospem`,`semester`,`tahun_ajaran`) values 
(1,0,2014001,0,0,'Ali Mantap',9,'2018/2019'),
(2,0,2014002,0,0,'Ali Silau',5,'2018/2019'),
(3,0,2014001,0,0,'Ali Mantap',9,'2018/2019');

/*Table structure for table `tbl_mahasiswa` */

DROP TABLE IF EXISTS `tbl_mahasiswa`;

CREATE TABLE `tbl_mahasiswa` (
  `id` int(15) NOT NULL AUTO_INCREMENT,
  `nama` varchar(100) DEFAULT NULL,
  `tempat` varchar(55) DEFAULT NULL,
  `tanggal` date DEFAULT NULL,
  `alamat` varchar(100) DEFAULT NULL,
  `ayah` varchar(55) DEFAULT NULL,
  `ibu` varchar(55) DEFAULT NULL,
  `idJurusan` int(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2014010 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_mahasiswa` */

insert  into `tbl_mahasiswa`(`id`,`nama`,`tempat`,`tanggal`,`alamat`,`ayah`,`ibu`,`idJurusan`) values 
(2014001,'lestari','jakarta','2018-09-11','jauh beut','tukino','sumiati',1),
(2014002,'novia','jakarta','2018-09-11','dekat dihati','mursid','mulyani',2),
(2014003,'rio',NULL,NULL,'Bekasi','ayah','ibu',3),
(2014004,'dina','bogor','2016-09-12','Cileungsi','Nano','nini',1),
(2014005,'FKEB',NULL,NULL,NULL,NULL,NULL,2),
(2014006,'FKEB',NULL,NULL,NULL,NULL,NULL,8),
(2014007,'rere','jakarta','2018-09-11','jauh beut','lala','lulu',1),
(2014008,'rere','jakarta','2018-09-11','jauh beut','lala','lulu',1),
(2014009,'Kevin','jakarta','2018-09-11','jauh beut','tukino','sumiati',1);

/*Table structure for table `tbl_matakuliah` */

DROP TABLE IF EXISTS `tbl_matakuliah`;

CREATE TABLE `tbl_matakuliah` (
  `id` int(30) NOT NULL AUTO_INCREMENT,
  `nama` varchar(55) DEFAULT NULL,
  `sks` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_matakuliah` */

insert  into `tbl_matakuliah`(`id`,`nama`,`sks`) values 
(1,'KK','3'),
(3,'KOMGRAF','3'),
(4,'KK','3');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
