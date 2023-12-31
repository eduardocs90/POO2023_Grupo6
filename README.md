<!DOCTYPE html>
<html>


<body>
  <h1 align="center">DéBank - Sistema Bancário</h1>
  <div align="center">
    <img src="https://github.com/eduardocs90/POO2023_Grupo6/assets/141193350/c7901992-2c76-41bb-a458-d61ddcdf4d0d"alt="DéBank">
  </div>

  <p>Este repositório contém a implementação do sistema bancário DéBank desenvolvido como atividade continuada na disciplina de Java. O DéBank é um sistema bancário simples que permite aos clientes realizar   operações bancárias, aos gerentes, diretores e presidentes gerenciar as agências e aos funcionários administrar os clientes e contas.</p>

<h2>O sistema DéBank possui as seguintes classes</h2>
  <li>SistemaInterno (Main)</li>
  <li>TipoFuncionario (Enum)</li>
  <li>TipoConta (Enum)</li>
  <li>JLogin e JCadastro (Frames)</li>
  <li>Cliente</li>
  <li>Conta</li>
  <li>ContaCorrente</li>
  <li>ContaPoupanca</li>
  <li>Funcionario</li>
  <li>Gerente</li>
  <li>Diretor</li>
  <li>Presidente</li>

<h2>Atributos</h2>
  <li><b><i>Cliente</i></b> deve ter os atributos de senha e CPF para login no sistema interno.</li>
  <li><b><i>Conta</i></b> deve conter os atributos de CPF do titular, saldo e um identificador da agência.</li>
  <li><b><i>ContaCorrente e ContaPoupanca</i></b> herdam de Conta e possuem um atributo "tipo" para identificação.</li>
  <li><b><i>Funcionario</i></b> deve conter atributos de CPF, senha e um atributo "cargo" para identificar o tipo de funcionário.</li>
  <li><b><i>Gerente, Diretor e Presidente</i></b> que herda de Funcionario.</li>

<h2>Diagrama de Classes UML</h2>
<img src="https://github.com/eduardocs90/POO2023_Grupo6/assets/141193350/7835e8bc-5f46-44e8-b827-a0f7b636aba5"alt="Diagrama de Classes UML">



<h2>Funcionalidades por Tipo de Usuário</h2>
  <li>Cliente</li>
  1.1 Movimentações da Conta: Saque, Depósito e Transferência.
  <br>
  1.2 Relatórios: Saldo e Tributações.</p>
  <li>Gerente</li>
  1.1 Relatórios: Total de contas da mesma agência.
  <br>
  1.2 Cadastro de Clientes: Cadastrar conta.</p>
  <li>Diretor</li>
  1.1 Relatórios: Lista de clientes das agências sob sua coordenação.
  <br>
  1.2 Cadastro de Clientes e Cadastro de Gerentes.</p>
  <li>Presidente</li>
  1.1 Relatórios: Lista de diretores.
  <br>
  1.2 Cadastro de Clientes, Cadastro de Gerentes e Cadastros de Diretores.

<h2>Tecnologias Utilizadas</h2>
 <img src="https://github.com/eduardocs90/POO2023_Grupo6/assets/141193350/da426343-ad69-4070-af0e-b81ac4303722" height="40" width="40"> <a href="https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html">Java 11 e JFrame</a>
 <br>
 <img src="https://github.com/eduardocs90/POO2023_Grupo6/assets/141193350/0ae95b40-0108-4e12-9b64-b1c8d75ce611" height="30" width="30"> <a href="https://spring.io/tools">Spring Tools Suite 4</a>

<h2>Autores</h2>  
<img src="https://cdn.discordapp.com/attachments/1135262336819679372/1140675577733464254/github-logo-git-hub-icon-with-text-on-white-and-black-background-free-vector_2-removebg-preview.png" height="60" width="60">  <a href="https://github.com/leignel">Cristian Leignel</a> | <a href="https://github.com/eduardocs90">Eduardo Carneiro</a> | <a href="https://github.com/LucasGonRo">Lucas Gonzaga</a> | <a href="https://github.com/FelipeSutter">Felipe Sutter</a> | <a href="https://github.com/sh9bba">Felipe Moura</a>
  
