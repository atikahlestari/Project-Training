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
  `id_fakultas` int(30) NOT NULL AUTO_INCREMENT,
  `nama_fakultas` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id_fakultas`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_fakultas` */

insert  into `tbl_fakultas`(`id_fakultas`,`nama_fakultas`) values 
(1,'FTMIPA'),
(2,'FIPPS'),
(3,'FBS'),
(4,'FIKOM');

/*Table structure for table `tbl_jurusan` */

DROP TABLE IF EXISTS `tbl_jurusan`;

CREATE TABLE `tbl_jurusan` (
  `id_jurusan` int(30) NOT NULL AUTO_INCREMENT,
  `id_fakultas` int(30) DEFAULT NULL,
  `nama_jurusan` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`id_jurusan`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_jurusan` */

insert  into `tbl_jurusan`(`id_jurusan`,`id_fakultas`,`nama_jurusan`) values 
(1,0,'Informatika'),
(2,3,'TI');

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
  `npm_mhs` int(15) NOT NULL AUTO_INCREMENT,
  `nama_mhs` varchar(55) DEFAULT NULL,
  `tempatlahir_mhs` varchar(55) DEFAULT NULL,
  `tgllahir_mhs` date DEFAULT NULL,
  `alamat_mhs` varchar(100) DEFAULT NULL,
  `ayah_mhs` varchar(55) DEFAULT NULL,
  `ibu_mhs` varchar(55) DEFAULT NULL,
  `id_jurusan` int(30) DEFAULT NULL,
  PRIMARY KEY (`npm_mhs`)
) ENGINE=InnoDB AUTO_INCREMENT=2014005 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_mahasiswa` */

insert  into `tbl_mahasiswa`(`npm_mhs`,`nama_mhs`,`tempatlahir_mhs`,`tgllahir_mhs`,`alamat_mhs`,`ayah_mhs`,`ibu_mhs`,`id_jurusan`) values 
(2014001,'tegar','jakarta','2018-09-11','jauh beut','tukino','sumiati',0),
(2014002,'novia','jakarta','2018-09-11','dekat dihati','mursid','mulyani',0),
(2014003,'rio',NULL,NULL,'Bekasi','ayah','ibu',0),
(2014004,'dina','bogor','2016-09-12','Cileungsi','Nano','nini',1010);

/*Table structure for table `tbl_matakuliah` */

DROP TABLE IF EXISTS `tbl_matakuliah`;

CREATE TABLE `tbl_matakuliah` (
  `id_matkul` int(30) NOT NULL AUTO_INCREMENT,
  `nama_matkul` varchar(55) DEFAULT NULL,
  `sks_matkul` int(30) DEFAULT NULL,
  PRIMARY KEY (`id_matkul`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

/*Data for the table `tbl_matakuliah` */

insert  into `tbl_matakuliah`(`id_matkul`,`nama_matkul`,`sks_matkul`) values 
(1,'Pemrograman Web',9),
(2,'RPL',2);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
