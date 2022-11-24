package Fundamentos;

public class CaractereString {
    public static void main(String[] args) {
       // pode ser considera como numero inteiro
       // converte para string
        char letra = 'a';
        System.out.println(letra);

        // pode usar o codigo das palavras ou imagens com unicode
        char valor = 66;
        System.out.println(valor);

        // String não e um tipo primitivo
        // É um tipo referencia armazena varios caracteres;

        String palavra = "Alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra = palavra  +  2020;
        System.out.println(palavra);
    }
}
