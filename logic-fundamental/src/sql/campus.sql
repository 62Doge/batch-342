create table type_dosen(
	id serial not null primary key,
	kode_typedosen char(4),
	deskripsi varchar(10)
);

create table dosen(
	id serial primary key,
	kode_dosen char(4),
	nama_dosen varchar(50),
	id_jurusan int,
	id_type_dosen int,
	constraint fk_type_dosen
		foreign key (id_type_dosen)
			references type_dosen(id)
);

alter table dosen
	rename column kode_jurusan to id_jurusan;

alter table dosen
	alter column id_jurusan type int
	using id_jurusan::integer;

alter table dosen
	add constraint fk_jurusan
	foreign key (id_jurusan)
	references jurusan(id);

--ENUM:
create type status as enum('Aktif', 'Non Aktif');


create table jurusan(
	id serial primary key,
	kode_jurusan char(4),
	nama_jurusan varchar(50),
	status_jurusan STATUS
);

create table agama(
	id serial primary key,
	kode_agama char(4),
	deskripsi varchar(50)
);

create table ujian(
	id serial primary key,
	kode_ujian char(5),
	nama_ujian varchar(50),
	status_ujian STATUS
);

alter table ujian
	alter column nama_ujian type varchar(50);

create table mahasiswa (
    id serial primary key,
    kode_mahasiswa char(4),
    nama_mahasiswa varchar(50),
    alamat varchar(50),
    id_agama int,
    id_jurusan int,
    constraint fk_agama
        foreign key (id_agama)
        references agama(id),
    constraint fk_jurusan
        foreign key (id_jurusan)
        references jurusan(id)
);

create table nilai(
	id serial primary key,
	id_mahasiswa int,
	id_ujian int,
	nilai int,
	constraint fk_mahasiswa
		foreign key (id_mahasiswa)
		references mahasiswa(id),
	constraint fk_ujian
		foreign key (id_ujian)
		references ujian(id)
);

insert into type_dosen (kode_typedosen, deskripsi)
values
	('T001', 'Tetap'),
	('T002', 'Honorer'),
	('T003', 'Expertise')
;

insert into jurusan (kode_jurusan, nama_jurusan, status_jurusan)
values
	('J001', 'Teknik Informatika', 'Aktif'),
	('J002', 'Management Informatika', 'Aktif'),
	('J003', 'Sistem Informasi', 'Non Aktif'),
	('J004', 'Sistem Komputer', 'Aktif'),
	('J005', 'Komputer Akuntansi', 'Non Aktif')
;

insert into dosen (kode_dosen, nama_dosen, id_jurusan, id_type_dosen)
values
	('D001', 'Prof. Dr. Retno Wahyuningsih', 1, 2),
	('D002', 'Prof. Roy M. Sutikno', 2, 1),
	('D003', 'Prof. Hendri A. Verburgh', 3, 2),
	('D004', 'Prof. Risma Suparwata', 4, 2),
	('D005', 'Prof. Amir Sjarifuddin Madjid, MM, MA', 5, 1)
;

insert into agama (kode_agama, deskripsi)
values
	('A001', 'Islam'),
	('A002', 'Kristen'),
	('A003', 'Katolik'),
	('A004', 'Hindu'),
	('A005', 'Budha')
;

insert into ujian (kode_ujian, nama_ujian, status_ujian)
values
	('U0001', 'Algoritma', 'Aktif'),
	('U0002', 'Aljabar', 'Aktif'),
	('U0003', 'Statistika', 'Non Aktif'),
	('U0004', 'Etika Profesi', 'Non Aktif'),
	('U0005', 'Bahasa Inggris', 'Aktif')
;

insert into mahasiswa (kode_mahasiswa, nama_mahasiswa, alamat, id_agama, id_jurusan)
values
	('M001', 'Budi Gunawan', 'Jl. Mawar No 3 RT 05 Cicalengka, Bandung', 1, 1),
	('M002', 'Rinto Raharjo', 'Jl. Kebagusan No. 33 RT04 RW06 Bandung', 2, 2),
	('M003', 'Asep Saepuddin', 'Jl. Sumatera No. 12 RT02 RW01, Ciamis', 1, 3),
	('M004', 'M. Hafif Isbullah', 'Jl. Jawa No. 01 RT01 RW01, Jakarta Pusat', 1, 1),
	('M005', 'Cahyono', 'Jl. Niagara No. 54 RT01 RW09, Surabaya', 3, 2)
;

insert into nilai (id_mahasiswa, id_ujian, nilai)
values
	(4, 1, 90),
	(1, 1, 80),
	(2, 3, 85),
	(4, 2, 95),
	(5, 5, 70)
;