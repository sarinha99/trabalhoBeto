package br.com.hospital.model;

import java.util.Date;

public class Entrada extends Paciente {
		private int idPaciente;
		private Date DataEntrada;
		private Date DataSaida;
		private String Status_Entrada;
		private String Status_Paciente;
		
		public void Imprimir() {
			System.out.println("Id do Paciente: " +idPaciente);
			System.out.println("Data de Entrada: " +DataEntrada);
			System.out.println("Data de Saida: "+DataSaida);
			System.out.println("Status da Entrada: " +Status_Entrada);
			System.out.println("Status do Paciente: " +Status_Paciente);
			
		}

		public int getIdPaciente() {
			return idPaciente;
		}

		public void setIdPaciente(int idPaciente) {
			this.idPaciente = idPaciente;
		}

		public Date getDataEntrada() {
			return DataEntrada;
		}

		public void setDataEntrada(Date dataEntrada) {
			DataEntrada = dataEntrada;
		}

		public Date getDataSaida() {
			return DataSaida;
		}

		public void setDataSaida(Date dataSaida) {
			DataSaida = dataSaida;
		}

		public String getStatus_Entrada() {
			return Status_Entrada;
		}

		public void setStatus_Entrada(String status_Entrada) {
			Status_Entrada = status_Entrada;
		}

		public String getStatus_Paciente() {
			return Status_Paciente;
		}

		public void setStatus_Paciente(String status_Paciente) {
			Status_Paciente = status_Paciente;
		}
		
}
