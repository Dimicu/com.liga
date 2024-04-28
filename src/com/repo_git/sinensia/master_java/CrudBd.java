package com.repo_git.sinensia.master_java;

public interface CrudBd<T> {

	static String url = "jdbc:mysql://localhost:3306/liga";
	static String user = "root";
	static String pass = "root";

	void create(T objeto);

	void read();


	void delete(T objeto);

	void update(int id, String nombre, int... args);



}
