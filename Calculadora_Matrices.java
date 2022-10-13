/* PROYECTO 1 ALGEBRA CALCULADORA DE DETERMINANTES
 * ANDRE MARROQUIN, 22266
 * 
 * 
 * 
 */



import java.util.Scanner;
public class Calculadora_Matrices {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("\n\t\tCalculadora de Determinantes de Matrices");
        String menu = "\n1. Matriz 4x4 \n2. Matriz 5x5 \n3. Matriz 6x6 \n4. Matriz 7x7 \n5. Salir\n";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion<5 && opcion>=1){
            switch (opcion){
                case 1:{
                    //PREGUNTA ENTRADAS DE LA MATRIZ
                    float [][] mat4 = new float[4][4];
                    System.out.println("Ingrese C11");
                    float c11 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[0][0]= c11;
                    System.out.println("Ingrese C12");
                    float c12 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[0][1]= c12;
                    System.out.println("Ingrese C13");
                    float c13 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[0][2]= c13;
                    System.out.println("Ingrese C14");
                    float c14 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[0][3]= c14;
                    System.out.println("Ingrese C21");
                    float c21 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[1][0]= c21;
                    System.out.println("Ingrese C22");
                    float c22 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[1][1]= c22;
                    System.out.println("Ingrese C23");
                    float c23 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[1][2]= c23;
                    System.out.println("Ingrese C24");
                    float c24 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[1][3]= c24;
                    System.out.println("Ingrese C31");
                    float c31 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[2][0]= c31;
                    System.out.println("Ingrese C32");
                    float c32 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[2][1]= c32;
                    System.out.println("Ingrese C33");
                    float c33 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[2][2]= c33;
                    System.out.println("Ingrese C34");
                    float c34 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[2][3]= c34;
                    System.out.println("Ingrese C41");
                    float c41 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[3][0]= c41;
                    System.out.println("Ingrese C42");
                    float c42 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[3][1]= c42;
                    System.out.println("Ingrese C43");
                    float c43 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[3][2]= c43;
                    System.out.println("Ingrese C44");
                    float c44 = teclado.nextInt();
                    teclado.nextLine();
                    mat4[3][3]= c44;

                    //IMPRIME LA MATRIZ
                    System.out.println("\nSu matriz es: \n");
                    for ( int fila =0 ; fila < mat4.length ;  fila++ ){
                        for( int  col = 0 ; col < mat4.length ;  col++ ){
                                System.out.print(mat4[fila][col]);
                                System.out.print("\t");
                        }
                        System.out.println();
                    }


                    
                    //VALORES MATRIZ 3X3
                    float r11_3 = (c11*c22)-(c12*c21);
                    float r12_3 = (c12*c23)-(c13*c22);
                    float r13_3 = (c13*c24)-(c14*c23);
                    float r21_3 = (c21*c32)-(c22*c31);
                    float r22_3 = (c22*c33)-(c23*c32);
                    float r23_3 = (c23*c34)-(c24*c33);
                    float r31_3 = (c31*c42)-(c32*c41);
                    float r32_3 = (c32*c43)-(c33*c42);
                    float r33_3 = (c33*c44)-(c34*c43);

                    System.out.println(r11_3+" "+r12_3+" "+r13_3);
                    System.out.println(r21_3+" "+r22_3+" "+r23_3);
                    System.out.println(r31_3+" "+r32_3+" "+ r33_3);

                    //VALORES MATRIZ 2X2
                    float r11_2 = (r11_3*r22_3)-(r12_3*r21_3);
                    float r12_2 = (r12_3*r23_3)-(r13_3*r22_3);
                    float r21_2 = (r21_3*r32_3)-(r22_3*r31_3);
                    float r22_2 = (r22_3*r33_3)-(r23_3*r32_3);

                    System.out.println(r11_2+ " "+r12_2);
                    System.out.println(r21_2+ " "+r22_2);

                    //VALORES YA DIVIDIDOS MATRIZ 2X2
                    float fin11 = r11_2/c22;
                    float fin12 = r12_2/c23;
                    float fin21 = r21_2/c32;
                    float fin22 = r22_2/c33;

                    System.out.println(fin11+" "+fin12);
                    System.out.println(fin21+" "+fin22);

                    ///DETERMINANTE FALTA DIVIDIR
                    float casiDet = (fin11*fin22)-(fin12*fin21);

                    System.out.println(casiDet);

                    //DETERMINANTE
                    float det = casiDet/r22_3;
                    System.out.println("\nSu determiante es: "+ det);
                    

                    break; 
            
                }
                case 2:{

                    //PREGUNTA ENTRADAS DE LA MATRIZ
                    float [][] mat5 = new float[5][5];
                    System.out.println("Ingrese C11");
                    float z11 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][0]= z11;
                    System.out.println("Ingrese C12");
                    float z12 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][1]= z12;
                    System.out.println("Ingrese C13");
                    float z13 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][2]= z13;
                    System.out.println("Ingrese C14");
                    float z14 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][3]= z14;
                    System.out.println("Ingrese C15");
                    float z15 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][4]= z15;

                    System.out.println("Ingrese C21");
                    float z21 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][0]= z21;
                    System.out.println("Ingrese C22");
                    float z22 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][1]= z22;
                    System.out.println("Ingrese C23");
                    float z23 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][2]= z23;
                    System.out.println("Ingrese C24");
                    float z24 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][3]= z24;
                    System.out.println("Ingrese C25");
                    float z25 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][4]= z25;

                    System.out.println("Ingrese C31");
                    float z31 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][0]= z31;
                    System.out.println("Ingrese C32");
                    float z32 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][1]= z32;
                    System.out.println("Ingrese C33");
                    float z33 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][2]= z33;
                    System.out.println("Ingrese C34");
                    float z34 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][3]= z34;
                    System.out.println("Ingrese C35");
                    float z35 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][4]= z35;

                    System.out.println("Ingrese C41");
                    float z41 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][0]= z41;
                    System.out.println("Ingrese C42");
                    float z42 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][1]= z42;
                    System.out.println("Ingrese C43");
                    float z43 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][2]= z43;
                    System.out.println("Ingrese C44");
                    float z44 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][3]= z44;
                    System.out.println("Ingrese C45");
                    float z45 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][4]= z45;

                    System.out.println("Ingrese C51");
                    float z51 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][0]= z51;
                    System.out.println("Ingrese C52");
                    float z52 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][1]= z52;
                    System.out.println("Ingrese C53");
                    float z53 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][2]= z53;
                    System.out.println("Ingrese C54");
                    float z54 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][3]= z54;
                    System.out.println("Ingrese C55");
                    float z55 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][4]= z55;

                    //IMPRIME LA MATRIZ
                    System.out.println("\nSu matriz es: \n");
                    for ( int fila =0 ; fila < mat5.length ;  fila++ ){
                        for( int  col = 0 ; col < mat5.length ;  col++ ){
                                System.out.print(mat5[fila][col]);
                                System.out.print("\t");
                        }
                        System.out.println();
                    }


                    //VALORES MATRIZ 4X4
                    float r11_4 = (z11*z22)-(z12*z21);
                    float r12_4 = (z12*z23)-(z13*z22);
                    float r13_4 = (z13*z24)-(z14*z23);
                    float r14_4 = (z14*z25)-(z15*z24);
                    float r21_4 = (z21*z32)-(z22*z31);
                    float r22_4 = (z22*z33)-(z23*z32);
                    float r23_4 = (z23*z34)-(z24*z33);
                    float r24_4 = (z24*z35)-(z25*z34);
                    float r31_4 = (z31*z42)-(z32*z41);
                    float r32_4 = (z32*z43)-(z33*z42);
                    float r33_4 = (z33*z44)-(z34*z43);
                    float r34_4 = (z34*z45)-(z35*z44);
                    float r41_4 = (z41*z52)-(z42*z51);
                    float r42_4 = (z42*z53)-(z43*z52);
                    float r43_4 = (z43*z54)-(z44*z53);
                    float r44_4 = (z44*z55)-(z45*z54);

                    System.out.println(r11_4+" "+r12_4+" "+r13_4+" "+r14_4);
                    System.out.println(r21_4+" "+r22_4+" "+r23_4+" "+r24_4);
                    System.out.println(r31_4+" "+r32_4+" "+r33_4+" "+r34_4);
                    System.out.println(r41_4+" "+r42_4+" "+r43_4+" "+r44_4);





                    //VALORES MATRIZ 3X3
                    float r11_3 = ((r11_4*r22_4)-(r12_4*r21_4))/z22;
                    float r12_3 = ((r12_4*r23_4)-(r13_4*r22_4))/z23;
                    float r13_3 = ((r13_4*r24_4)-(r14_4*r23_4))/z24;
                    float r21_3 = ((r21_4*r32_4)-(r22_4*r31_4))/z32;
                    float r22_3 = ((r22_4*r33_4)-(r23_4*r32_4))/z33;
                    float r23_3 = ((r23_4*r34_4)-(r24_4*r33_4))/z34;
                    float r31_3 = ((r31_4*r42_4)-(r32_4*r41_4))/z42;
                    float r32_3 = ((r32_4*r43_4)-(r33_4*r42_4))/z43;
                    float r33_3 = ((r33_4*r44_4)-(r34_4*r43_4))/z44;

                    System.out.println(r11_3+" "+r12_3+" "+r13_3);
                    System.out.println(r21_3+" "+r22_3+" "+r23_3);
                    System.out.println(r31_3+" "+r32_3+" "+ r33_3);

                    //VALORES MATRIZ 2X2
                    float r11_2 = (r11_3*r22_3)-(r12_3*r21_3);
                    float r12_2 = (r12_3*r23_3)-(r13_3*r22_3);
                    float r21_2 = (r21_3*r32_3)-(r22_3*r31_3);
                    float r22_2 = (r22_3*r33_3)-(r23_3*r32_3);

                    System.out.println(r11_2+ " "+r12_2);
                    System.out.println(r21_2+ " "+r22_2);

                    //VALORES YA DIVIDIDOS MATRIZ 2X2
                    float fin11 = r11_2/r22_4;
                    float fin12 = r12_2/r23_4;
                    float fin21 = r21_2/r32_4;
                    float fin22 = r22_2/r33_4;

                    System.out.println(fin11+" "+fin12);
                    System.out.println(fin21+" "+fin22);

                    //DETERMINANTE FALTA DIVIDIR
                    float casiDet = (fin11*fin22)-(fin12*fin21);

                    System.out.println(casiDet);

                    //DETERMINANTE
                    float det = casiDet/r22_3;
                    System.out.println("\nSu determiante es: "+ det);
                    


                    break;
                }
                case 3:{


                    //PREGUNTA ENTRADAS DE LA MATRIZ
                    float [][] mat5 = new float[6][6];
                    System.out.println("Ingrese C11");
                    float z11 = teclado.nextFloat();
                    teclado.nextLine();
                    mat5[0][0]= z11;
                    System.out.println("Ingrese C12");
                    float z12 = teclado.nextFloat();
                    teclado.nextLine();
                    mat5[0][1]= z12;
                    System.out.println("Ingrese C13");
                    float z13 = teclado.nextFloat();
                    teclado.nextLine();
                    mat5[0][2]= z13;
                    System.out.println("Ingrese C14");
                    float z14 = teclado.nextFloat();
                    teclado.nextLine();
                    mat5[0][3]= z14;
                    System.out.println("Ingrese C15");
                    float z15 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][4]= z15;
                    System.out.println("Ingrese C16");
                    float z16 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][5]= z16;

                    System.out.println("Ingrese C21");
                    float z21 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][0]= z21;
                    System.out.println("Ingrese C22");
                    float z22 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][1]= z22;
                    System.out.println("Ingrese C23");
                    float z23 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][2]= z23;
                    System.out.println("Ingrese C24");
                    float z24 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][3]= z24;
                    System.out.println("Ingrese C25");
                    float z25 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][4]= z25;
                    System.out.println("Ingrese C26");
                    float z26 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][5]= z26;

                    System.out.println("Ingrese C31");
                    float z31 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][0]= z31;
                    System.out.println("Ingrese C32");
                    float z32 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][1]= z32;
                    System.out.println("Ingrese C33");
                    float z33 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][2]= z33;
                    System.out.println("Ingrese C34");
                    float z34 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][3]= z34;
                    System.out.println("Ingrese C35");
                    float z35 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][4]= z35;
                    System.out.println("Ingrese C36");
                    float z36 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][5]= z36;

                    System.out.println("Ingrese C41");
                    float z41 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][0]= z41;
                    System.out.println("Ingrese C42");
                    float z42 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][1]= z42;
                    System.out.println("Ingrese C43");
                    float z43 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][2]= z43;
                    System.out.println("Ingrese C44");
                    float z44 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][3]= z44;
                    System.out.println("Ingrese C45");
                    float z45 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][4]= z45;
                    System.out.println("Ingrese C46");
                    float z46 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][5]= z46;

                    System.out.println("Ingrese C51");
                    float z51 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][0]= z51;
                    System.out.println("Ingrese C52");
                    float z52 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][1]= z52;
                    System.out.println("Ingrese C53");
                    float z53 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][2]= z53;
                    System.out.println("Ingrese C54");
                    float z54 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][3]= z54;
                    System.out.println("Ingrese C55");
                    float z55 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][4]= z55;
                    System.out.println("Ingrese C56");
                    float z56 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][5]= z56;

                    System.out.println("Ingrese C61");
                    float z61 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][0]= z61;
                    System.out.println("Ingrese C62");
                    float z62 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][1]= z62;
                    System.out.println("Ingrese C63");
                    float z63 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][2]= z63;
                    System.out.println("Ingrese C64");
                    float z64 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][3]= z64;
                    System.out.println("Ingrese C65");
                    float z65 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][4]= z65;
                    System.out.println("Ingrese C66");
                    float z66 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][5]= z66;

                    //IMPRIME LA MATRIZ
                    System.out.println("\nSu matriz es: \n");
                    for ( int fila =0 ; fila < mat5.length ;  fila++ ){
                        for( int  col = 0 ; col < mat5.length ;  col++ ){
                                System.out.print(mat5[fila][col]);
                                System.out.print("\t");
                        }
                        System.out.println();
                    }


                    //VALORES MATRIZ 5X5
                    float r11_5 = (z11*z22)-(z12*z21);
                    float r12_5 = (z12*z23)-(z13*z22);
                    float r13_5 = (z13*z24)-(z14*z23);
                    float r14_5 = (z14*z25)-(z15*z24);
                    float r15_5 = (z15*z26)-(z16*z25);
                    float r21_5 = (z21*z32)-(z22*z31);
                    float r22_5 = (z22*z33)-(z23*z32);
                    float r23_5 = (z23*z34)-(z24*z33);
                    float r24_5 = (z24*z35)-(z25*z34);
                    float r25_5 = (z25*z36)-(z26*z35);
                    float r31_5 = (z31*z42)-(z32*z41);
                    float r32_5 = (z32*z43)-(z33*z42);
                    float r33_5 = (z33*z44)-(z34*z43);
                    float r34_5 = (z34*z45)-(z35*z44);
                    float r35_5 = (z35*z46)-(z36*z45);
                    float r41_5 = (z41*z52)-(z42*z51);
                    float r42_5 = (z42*z53)-(z43*z52);
                    float r43_5 = (z43*z54)-(z44*z53);
                    float r44_5 = (z44*z55)-(z45*z54);
                    float r45_5 = (z45*z56)-(z46*z55);
                    float r51_5 = (z51*z62)-(z52*z61);
                    float r52_5 = (z52*z63)-(z53*z62);
                    float r53_5 = (z53*z64)-(z54*z63);
                    float r54_5 = (z54*z65)-(z55*z64);
                    float r55_5 = (z55*z66)-(z56*z65);

                    System.out.println(r11_5+" "+r12_5+" "+r13_5+" "+r14_5+" "+r15_5);
                    System.out.println(r21_5+" "+r22_5+" "+r23_5+" "+r24_5+" "+r25_5);
                    System.out.println(r31_5+" "+r32_5+" "+r33_5+" "+r34_5+" "+r35_5);
                    System.out.println(r41_5+" "+r42_5+" "+r43_5+" "+r44_5+" "+r45_5);
                    System.out.println(r51_5+" "+r52_5+" "+r53_5+" "+r54_5+" "+r55_5);
                    

                    //VALORES MATRIZ 4X4
                    float r11_4 = ((r11_5*r22_5)-(r12_5*r21_5))/z22;
                    float r12_4 = ((r12_5*r23_5)-(r13_5*r22_5))/z23;
                    float r13_4 = ((r13_5*r24_5)-(r14_5*r23_5))/z24;
                    float r14_4 = ((r14_5*r25_5)-(r15_5*r24_5))/z25;
                    float r21_4 = ((r21_5*r32_5)-(r22_5*r31_5))/z32;
                    float r22_4 = ((r22_5*r33_5)-(r23_5*r32_5))/z33;
                    float r23_4 = ((r23_5*r34_5)-(r24_5*r33_5))/z34;
                    float r24_4 = ((r24_5*r35_5)-(r25_5*r34_5))/z35;
                    float r31_4 = ((r31_5*r42_5)-(r32_5*r41_5))/z42;
                    float r32_4 = ((r32_5*r43_5)-(r33_5*r42_5))/z43;
                    float r33_4 = ((r33_5*r44_5)-(r34_5*r43_5))/z44;
                    float r34_4 = ((r34_5*r45_5)-(r35_5*r44_5))/z45;
                    float r41_4 = ((r41_5*r52_5)-(r42_5*r51_5))/z52;
                    float r42_4 = ((r42_5*r53_5)-(r43_5*r52_5))/z53;
                    float r43_4 = ((r43_5*r54_5)-(r44_5*r53_5))/z54;
                    float r44_4 = ((r44_5*r55_5)-(r45_5*r54_5))/z55;

                    System.out.println(r11_4+" "+r12_4+" "+r13_4+" "+r14_4);
                    System.out.println(r21_4+" "+r22_4+" "+r23_4+" "+r24_4);
                    System.out.println(r31_4+" "+r32_4+" "+r33_4+" "+r34_4);
                    System.out.println(r41_4+" "+r42_4+" "+r43_4+" "+r44_4);





                    //VALORES MATRIZ 3X3
                    float r11_3 = ((r11_4*r22_4)-(r12_4*r21_4))/r22_5;
                    float r12_3 = ((r12_4*r23_4)-(r13_4*r22_4))/r23_5;
                    float r13_3 = ((r13_4*r24_4)-(r14_4*r23_4))/r24_5;
                    float r21_3 = ((r21_4*r32_4)-(r22_4*r31_4))/r32_5;
                    float r22_3 = ((r22_4*r33_4)-(r23_4*r32_4))/r33_5;
                    float r23_3 = ((r23_4*r34_4)-(r24_4*r33_4))/r34_5;
                    float r31_3 = ((r31_4*r42_4)-(r32_4*r41_4))/r42_5;
                    float r32_3 = ((r32_4*r43_4)-(r33_4*r42_4))/r43_5;
                    float r33_3 = ((r33_4*r44_4)-(r34_4*r43_4))/r44_5;

                    System.out.println(r11_3+" "+r12_3+" "+r13_3);
                    System.out.println(r21_3+" "+r22_3+" "+r23_3);
                    System.out.println(r31_3+" "+r32_3+" "+r33_3);

                    //VALORES MATRIZ 2X2
                    float r11_2 = (r11_3*r22_3)-(r12_3*r21_3);
                    float r12_2 = (r12_3*r23_3)-(r13_3*r22_3);
                    float r21_2 = (r21_3*r32_3)-(r22_3*r31_3);
                    float r22_2 = (r22_3*r33_3)-(r23_3*r32_3);

                    System.out.println(r11_2+ " "+r12_2);
                    System.out.println(r21_2+ " "+r22_2);

                    //VALORES YA DIVIDIDOS MATRIZ 2X2
                    float fin11 = r11_2/r22_4;
                    float fin12 = r12_2/r23_4;
                    float fin21 = r21_2/r32_4;
                    float fin22 = r22_2/r33_4;

                    System.out.println(fin11+" "+fin12);
                    System.out.println(fin21+" "+fin22);

                    //DETERMINANTE FALTA DIVIDIR
                    float casiDet = (fin11*fin22)-(fin12*fin21);

                    System.out.println(casiDet);

                    //DETERMINANTE
                    float det = casiDet/r22_3;
                    System.out.println("\nSu determiante es: "+ det);
                    

                    break;
                }
                case 4:{


                    //PREGUNTA ENTRADAS DE LA MATRIZ
                    float [][] mat5 = new float[7][7];
                    System.out.println("Ingrese C11");
                    float z11 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][0]= z11;
                    System.out.println("Ingrese C12");
                    float z12 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][1]= z12;
                    System.out.println("Ingrese C13");
                    float z13 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][2]= z13;
                    System.out.println("Ingrese C14");
                    float z14 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][3]= z14;
                    System.out.println("Ingrese C15");
                    float z15 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][4]= z15;
                    System.out.println("Ingrese C16");
                    float z16 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][5]= z16;
                    System.out.println("Ingrese C17");
                    float z17 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[0][6]= z17;

                    System.out.println("Ingrese C21");
                    float z21 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][0]= z21;
                    System.out.println("Ingrese C22");
                    float z22 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][1]= z22;
                    System.out.println("Ingrese C23");
                    float z23 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][2]= z23;
                    System.out.println("Ingrese C24");
                    float z24 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][3]= z24;
                    System.out.println("Ingrese C25");
                    float z25 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][4]= z25;
                    System.out.println("Ingrese C26");
                    float z26 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][5]= z26;
                    System.out.println("Ingrese C27");
                    float z27 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[1][6]= z27;

                    System.out.println("Ingrese C31");
                    float z31 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][0]= z31;
                    System.out.println("Ingrese C32");
                    float z32 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][1]= z32;
                    System.out.println("Ingrese C33");
                    float z33 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][2]= z33;
                    System.out.println("Ingrese C34");
                    float z34 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][3]= z34;
                    System.out.println("Ingrese C35");
                    float z35 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][4]= z35;
                    System.out.println("Ingrese C36");
                    float z36 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][5]= z36;
                    System.out.println("Ingrese C37");
                    float z37 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[2][6]= z37;

                    System.out.println("Ingrese C41");
                    float z41 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][0]= z41;
                    System.out.println("Ingrese C42");
                    float z42 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][1]= z42;
                    System.out.println("Ingrese C43");
                    float z43 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][2]= z43;
                    System.out.println("Ingrese C44");
                    float z44 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][3]= z44;
                    System.out.println("Ingrese C45");
                    float z45 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][4]= z45;
                    System.out.println("Ingrese C46");
                    float z46 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][5]= z46;
                    System.out.println("Ingrese C47");
                    float z47 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[3][6]= z47;

                    System.out.println("Ingrese C51");
                    float z51 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][0]= z51;
                    System.out.println("Ingrese C52");
                    float z52 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][1]= z52;
                    System.out.println("Ingrese C53");
                    float z53 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][2]= z53;
                    System.out.println("Ingrese C54");
                    float z54 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][3]= z54;
                    System.out.println("Ingrese C55");
                    float z55 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][4]= z55;
                    System.out.println("Ingrese C56");
                    float z56 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][5]= z56;
                    System.out.println("Ingrese C57");
                    float z57 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[4][6]= z57;

                    System.out.println("Ingrese C61");
                    float z61 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][0]= z61;
                    System.out.println("Ingrese C62");
                    float z62 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][1]= z62;
                    System.out.println("Ingrese C63");
                    float z63 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][2]= z63;
                    System.out.println("Ingrese C64");
                    float z64 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][3]= z64;
                    System.out.println("Ingrese C65");
                    float z65 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][4]= z65;
                    System.out.println("Ingrese C66");
                    float z66 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][5]= z66;
                    System.out.println("Ingrese C67");
                    float z67 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[5][6]= z67;

                    System.out.println("Ingrese C71");
                    float z71 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][0]= z71;
                    System.out.println("Ingrese c72");
                    float z72 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][1]= z72;
                    System.out.println("Ingrese C73");
                    float z73 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][2]= z73;
                    System.out.println("Ingrese C74");
                    float z74 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][3]= z74;
                    System.out.println("Ingrese C75");
                    float z75 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][4]= z75;
                    System.out.println("Ingrese C76");
                    float z76 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][5]= z76;
                    System.out.println("Ingrese C77");
                    float z77 = teclado.nextInt();
                    teclado.nextLine();
                    mat5[6][6]= z77;

                    //IMPRIME LA MATRIZ
                    System.out.println("\nSu matriz es: \n");
                    for ( int fila =0 ; fila < mat5.length ;  fila++ ){
                        for( int  col = 0 ; col < mat5.length ;  col++ ){
                                System.out.print(mat5[fila][col]);
                                System.out.print("\t");
                        }
                        System.out.println();
                    }


                    //VALORES MATRIZ 6x6
                    float r11_6 = (z11*z22)-(z12*z21);
                    float r12_6 = (z12*z23)-(z13*z22);
                    float r13_6 = (z13*z24)-(z14*z23);
                    float r14_6 = (z14*z25)-(z15*z24);
                    float r15_6 = (z15*z26)-(z16*z25);
                    float r16_6 = (z16*z27)-(z17*z26);
                    float r21_6 = (z21*z32)-(z22*z31);
                    float r22_6 = (z22*z33)-(z23*z32);
                    float r23_6 = (z23*z34)-(z24*z33);
                    float r24_6 = (z24*z35)-(z25*z34);
                    float r25_6 = (z25*z36)-(z26*z35);
                    float r26_6 = (z26*z37)-(z27*z36);
                    float r31_6 = (z31*z42)-(z32*z41);
                    float r32_6 = (z32*z43)-(z33*z42);
                    float r33_6 = (z33*z44)-(z34*z43);
                    float r34_6 = (z34*z45)-(z35*z44);
                    float r35_6 = (z35*z46)-(z36*z45);
                    float r36_6 = (z36*z47)-(z37*z46);
                    float r41_6 = (z41*z52)-(z42*z51);
                    float r42_6 = (z42*z53)-(z43*z52);
                    float r43_6 = (z43*z54)-(z44*z53);
                    float r44_6 = (z44*z55)-(z45*z54);
                    float r45_6 = (z45*z56)-(z46*z55);
                    float r46_6 = (z46*z57)-(z47*z56);
                    float r51_6 = (z51*z62)-(z52*z61);
                    float r52_6 = (z52*z63)-(z53*z62);
                    float r53_6 = (z53*z64)-(z54*z63);
                    float r54_6 = (z54*z65)-(z55*z64);
                    float r55_6 = (z55*z66)-(z56*z65);
                    float r56_6 = (z56*z67)-(z57*z66);
                    float r61_6 = (z61*z72)-(z62*z71);
                    float r62_6 = (z62*z73)-(z63*z72);
                    float r63_6 = (z63*z74)-(z64*z73);
                    float r64_6 = (z64*z75)-(z65*z74);
                    float r65_6 = (z65*z76)-(z66*z75);
                    float r66_6 = (z66*z77)-(z67*z76);


                    System.out.println(r11_6+"  "+r12_6+"  "+r13_6+"  "+r14_6+"  "+r15_6+"  "+r16_6);
                    System.out.println(r21_6+"  "+r22_6+"  "+r23_6+"  "+r24_6+"  "+r25_6+"  "+r26_6);
                    System.out.println(r31_6+"  "+r32_6+"  "+r33_6+"  "+r34_6+"  "+r35_6+"  "+r36_6);
                    System.out.println(r41_6+"  "+r42_6+"  "+r43_6+"  "+r44_6+"  "+r45_6+"  "+r46_6);
                    System.out.println(r51_6+"  "+r52_6+"  "+r53_6+"  "+r54_6+"  "+r55_6+"  "+r56_6);
                    System.out.println(r61_6+"  "+r62_6+"  "+r63_6+"  "+r64_6+"  "+r65_6+"  "+r66_6);





                    //VALORES MATRIZ 5X5
                    float r11_5 = ((r11_6*r22_6)-(r12_6*r21_6))/z22;
                    float r12_5 = ((r12_6*r23_6)-(r13_6*r22_6))/z23;
                    float r13_5 = ((r13_6*r24_6)-(r14_6*r23_6))/z24;
                    float r14_5 = ((r14_6*r25_6)-(r15_6*r24_6))/z25;
                    float r15_5 = ((r15_6*r26_6)-(r16_6*r25_6))/z26;
                    float r21_5 = ((r21_6*r32_6)-(r22_6*r31_6))/z32;
                    float r22_5 = ((r22_6*r33_6)-(r23_6*r32_6))/z33;
                    float r23_5 = ((r23_6*r34_6)-(r24_6*r33_6))/z34;
                    float r24_5 = ((r24_6*r35_6)-(r25_6*r34_6))/z35;
                    float r25_5 = ((r25_6*r36_6)-(r26_6*r35_6))/z36;
                    float r31_5 = ((r31_6*r42_6)-(r32_6*r41_6))/z42;
                    float r32_5 = ((r32_6*r43_6)-(r33_6*r42_6))/z43;
                    float r33_5 = ((r33_6*r44_6)-(r34_6*r43_6))/z44;
                    float r34_5 = ((r34_6*r45_6)-(r35_6*r44_6))/z45;
                    float r35_5 = ((r35_6*r46_6)-(r36_6*r45_6))/z46;
                    float r41_5 = ((r41_6*r52_6)-(r42_6*r51_6))/z52;
                    float r42_5 = ((r42_6*r53_6)-(r43_6*r52_6))/z53;
                    float r43_5 = ((r43_6*r54_6)-(r44_6*r53_6))/z54;
                    float r44_5 = ((r44_6*r55_6)-(r45_6*r54_6))/z55;
                    float r45_5 = ((r45_6*r56_6)-(r46_6*r55_6))/z56;
                    float r51_5 = ((r51_6*r62_6)-(r52_6*r61_6))/z62;
                    float r52_5 = ((r52_6*r63_6)-(r53_6*r62_6))/z63;
                    float r53_5 = ((r53_6*r64_6)-(r54_6*r63_6))/z64;
                    float r54_5 = ((r54_6*r65_6)-(r55_6*r64_6))/z65;
                    float r55_5 = ((r55_6*r66_6)-(r56_6*r65_6))/z66;

                    System.out.println(r11_5+" "+r12_5+" "+r13_5+" "+r14_5+" "+r15_5);
                    System.out.println(r21_5+" "+r22_5+" "+r23_5+" "+r24_5+" "+r25_5);
                    System.out.println(r31_5+" "+r32_5+" "+r33_5+" "+r34_5+" "+r35_5);
                    System.out.println(r41_5+" "+r42_5+" "+r43_5+" "+r44_5+" "+r45_5);
                    System.out.println(r51_5+" "+r52_5+" "+r53_5+" "+r54_5+" "+r55_5);
                    

                    //VALORES MATRIZ 4X4
                    float r11_4 = ((r11_5*r22_5)-(r12_5*r21_5))/r22_6;
                    float r12_4 = ((r12_5*r23_5)-(r13_5*r22_5))/r23_6;
                    float r13_4 = ((r13_5*r24_5)-(r14_5*r23_5))/r24_6;
                    float r14_4 = ((r14_5*r25_5)-(r15_5*r24_5))/r25_6;
                    float r21_4 = ((r21_5*r32_5)-(r22_5*r31_5))/r32_6;
                    float r22_4 = ((r22_5*r33_5)-(r23_5*r32_5))/r33_6;
                    float r23_4 = ((r23_5*r34_5)-(r24_5*r33_5))/r34_6;
                    float r24_4 = ((r24_5*r35_5)-(r25_5*r34_5))/r35_6;
                    float r31_4 = ((r31_5*r42_5)-(r32_5*r41_5))/r42_6;
                    float r32_4 = ((r32_5*r43_5)-(r33_5*r42_5))/r43_6;
                    float r33_4 = ((r33_5*r44_5)-(r34_5*r43_5))/r44_6;
                    float r34_4 = ((r34_5*r45_5)-(r35_5*r44_5))/r45_6;
                    float r41_4 = ((r41_5*r52_5)-(r42_5*r51_5))/r52_6;
                    float r42_4 = ((r42_5*r53_5)-(r43_5*r52_5))/r53_6;
                    float r43_4 = ((r43_5*r54_5)-(r44_5*r53_5))/r54_6;
                    float r44_4 = ((r44_5*r55_5)-(r45_5*r54_5))/r55_6;

                    System.out.println(r11_4+" "+r12_4+" "+r13_4+" "+r14_4);
                    System.out.println(r21_4+" "+r22_4+" "+r23_4+" "+r24_4);
                    System.out.println(r31_4+" "+r32_4+" "+r33_4+" "+r34_4);
                    System.out.println(r41_4+" "+r42_4+" "+r43_4+" "+r44_4);





                    //VALORES MATRIZ 3X3
                    float r11_3 = ((r11_4*r22_4)-(r12_4*r21_4))/r22_5;
                    float r12_3 = ((r12_4*r23_4)-(r13_4*r22_4))/r23_5;
                    float r13_3 = ((r13_4*r24_4)-(r14_4*r23_4))/r24_5;
                    float r21_3 = ((r21_4*r32_4)-(r22_4*r31_4))/r32_5;
                    float r22_3 = ((r22_4*r33_4)-(r23_4*r32_4))/r33_5;
                    float r23_3 = ((r23_4*r34_4)-(r24_4*r33_4))/r34_5;
                    float r31_3 = ((r31_4*r42_4)-(r32_4*r41_4))/r42_5;
                    float r32_3 = ((r32_4*r43_4)-(r33_4*r42_4))/r43_5;
                    float r33_3 = ((r33_4*r44_4)-(r34_4*r43_4))/r44_5;

                    System.out.println(r11_3+" "+r12_3+" "+r13_3);
                    System.out.println(r21_3+" "+r22_3+" "+r23_3);
                    System.out.println(r31_3+" "+r32_3+" "+ r33_3);

                    //VALORES MATRIZ 2X2
                    float r11_2 = ((r11_3*r22_3)-(r12_3*r21_3));
                    float r12_2 = ((r12_3*r23_3)-(r13_3*r22_3));
                    float r21_2 = ((r21_3*r32_3)-(r22_3*r31_3));
                    float r22_2 = ((r22_3*r33_3)-(r23_3*r32_3));

                    System.out.println(r11_2+ " "+r12_2);
                    System.out.println(r21_2+ " "+r22_2);

                    //VALORES YA DIVIDIDOS MATRIZ 2X2
                    float fin11 = r11_2/r22_4;
                    float fin12 = r12_2/r23_4;
                    float fin21 = r21_2/r32_4;
                    float fin22 = r22_2/r33_4;

                    System.out.println(fin11+" "+fin12);
                    System.out.println(fin21+" "+fin22);

                    //DETERMINANTE FALTA DIVIDIR
                    float casiDet = (fin11*fin22)-(fin12*fin21);

                    System.out.println(casiDet);

                    //DETERMINANTE
                    float det = casiDet/r22_3;
                    System.out.println("\nSu determiante es: "+ det);






                    break;
               
                }


             }
        System.out.println(menu);
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
    }
}
}