package com.example.springmvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

import org.hibernate.annotations.GenericGenerator;

import com.sun.istack.NotNull;

@Entity
public class Mahasiswa {
	@Id
	@GeneratedValue(generator = "uuid2")
	@GenericGenerator(name ="uuid2", strategy="uuid2")
	private String id;
	@NotNull
	@NotBlank
	@Column(unique = true)
	private String nim;
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nim == null) ? 0 : nim.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mahasiswa other = (Mahasiswa) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nim == null) {
			if (other.nim != null)
				return false;
		} else if (!nim.equals(other.nim))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Mahasiswa [id=" + id + ", nim=" + nim + ", nama=" + nama + ", ipk=" + ipk + ", jurusan=" + jurusan
				+ "]";
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNim() {
		return nim;
	}
	public void setNim(String nim) {
		this.nim = nim;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public float getIpk() {
		return ipk;
	}
	public void setIpk(float ipk) {
		this.ipk = ipk;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	@NotNull
	@NotBlank
	private String nama;
	private float ipk;
	@NotNull
	@NotBlank
	private String jurusan;
}
