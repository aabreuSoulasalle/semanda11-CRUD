package com.poo.controller;


import java.util.ArrayList;
import java.util.List;

import com.poo.dao.AlunoDAO;
import com.poo.model.Aluno;

public class Controller {
	
	public void create(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			dao.create(aluno);
		} 
		catch (Exception e){
			System.out.println("Erro no Controller!!!!!!!!!!!!");
		}
		finally {		
			System.out.println("Fim da inserção!");
		}
	}
	public List<Aluno> readAll(){
		List<Aluno> alunos =new ArrayList<Aluno>();
		try {
			AlunoDAO dao = new AlunoDAO();
			alunos = dao.readAll();
			
					
		}
		catch (Exception e) {
			System.out.println("Erro no controller!!!!!!!!!");
		}
		finally {
			System.out.println("Fim da leitura!");
		}
		return alunos;
	}
	public void update(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			dao.update(aluno);
		}
		catch(Exception e) {
			System.out.println("Erro no Controller!!!!!!!!!!!!");
		}
		finally {		
			System.out.println("Fim da alteração!");
		}
	}
	public void delete(Aluno aluno) {
		try {
			AlunoDAO dao = new AlunoDAO();
			dao.delete(aluno);
		}
		catch(Exception e) {
			System.out.println("Erro no Controller!!!!!!!!!!!!");
		}
		finally {		
			System.out.println("Deletado!");
		}
	}

}
