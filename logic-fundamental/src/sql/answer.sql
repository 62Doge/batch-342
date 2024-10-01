--1
alter table dosen
	alter column nama_dosen type varchar(200);

--2
select kode_mahasiswa as "Kode Mahasiswa", nama_mahasiswa "Nama Mahasiswa", nama_jurusan as "Nama Jurusan", deskripsi as "Agama"
from mahasiswa
join jurusan on jurusan.id = mahasiswa.id_jurusan
join agama on agama.id = mahasiswa.id_agama;

--3
select nama_mahasiswa as "Nama Mahasiswa", nama_jurusan as "Nama Jurusan", status_jurusan as "Status Jurusan"
from mahasiswa
join jurusan on jurusan.id = mahasiswa.id_jurusan
where status_jurusan = 'Non Aktif';

--4
select nama_mahasiswa as "Nama Mahasiswa", nama_ujian as "Nama Ujian", nilai as "Nilai", status_ujian as "Status Ujian"
from mahasiswa
join nilai on nilai.id_mahasiswa = mahasiswa.id
join ujian on ujian.id = nilai.id_ujian
where nilai > 80
	and status_ujian = 'Aktif';

--5
select nama_jurusan as "Nama Jurusan"
from jurusan
where LOWER(nama_jurusan) LIKE LOWER('%sistem%');

--6
select nama_mahasiswa as "Nama Mahasiswa", count(id_ujian) as "Ujian"
from mahasiswa
join nilai on nilai.id_mahasiswa = mahasiswa.id
group by nama_mahasiswa
having count(id_ujian) > 1;

--7
select kode_mahasiswa as "Kode Mahasiswa",
		nama_mahasiswa as "Nama Mahasiswa",
		nama_jurusan as "Nama Jurusan",
		agama.deskripsi as "Agama",
		nama_dosen as "Nama Dosen",
		status_jurusan as "Status Jurusan",
		type_dosen.deskripsi as "Deskripsi"
from mahasiswa
join jurusan on jurusan.id = mahasiswa.id_jurusan
join agama on agama.id = mahasiswa.id_agama
join dosen on dosen.id_jurusan = jurusan.id
join type_dosen on type_dosen.id = dosen.id_type_dosen
where nama_mahasiswa = 'Budi Gunawan';

--8
--skip

--9
select nama_mahasiswa as "Nama Mahasiswa", nilai as "Nilai"
from mahasiswa
full join nilai on nilai.id_mahasiswa = mahasiswa.id;

