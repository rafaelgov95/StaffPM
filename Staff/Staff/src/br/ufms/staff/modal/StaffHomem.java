/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufms.staff.modal;

/**
 *
 * @author rafael
 */
public class StaffHomem {
public double barra(int rep, int idade) {
        double resultado = 0;

        if (idade <= 25) {
            if (rep == 1) {
                resultado = 4.5;
            } else if (rep == 2) {
                resultado = 5.0;
            } else if (rep == 3) {
                resultado = 5.5;
            } else if (rep == 4) {
                resultado = 6.0;
            } else if (rep == 5) {
                resultado = 6.5;
            } else if (rep == 6) {
                resultado = 7.0;
            } else if (rep == 7) {
                resultado = 7.5;
            } else if (rep == 8) {
                resultado = 8.0;
            } else if (rep == 9) {
                resultado = 8.5;
            } else if (rep == 10) {
                resultado = 9;
            } else if (rep == 11) {
                resultado = 9.5;
            } else if (rep >= 12) {
                resultado = 10;
            }

        } else if (idade >= 26 & idade
                <= 30) {
            if (rep == 1) {
                resultado = 5;
            } else if (rep == 2) {
                resultado = 5.5;
            } else if (rep == 3) {
                resultado = 6;
            } else if (rep == 4) {
                resultado = 6.5;
            } else if (rep == 5) {
                resultado = 7;
            } else if (rep == 6) {
                resultado = 7.5;
            } else if (rep == 7) {
                resultado = 8;
            } else if (rep == 8) {
                resultado = 8.5;
            } else if (rep == 9) {
                resultado = 9;
            } else if (rep == 10) {
                resultado = 9.5;
            } else if (rep >= 11) {
                resultado = 10;
            }

        } else if (idade >= 31 & idade
                <= 35) {

            if (rep == 1) {
                resultado = 5.5;
            } else if (rep == 2) {
                resultado = 6.0;
            } else if (rep == 3) {
                resultado = 6.5;
            } else if (rep == 4) {
                resultado = 7.0;
            } else if (rep == 5) {
                resultado = 7.5;
            } else if (rep == 6) {
                resultado = 8.0;
            } else if (rep == 7) {
                resultado = 8.5;
            } else if (rep == 8) {
                resultado = 9;
            } else if (rep == 9) {
                resultado = 9.5;
            } else if (rep >= 10) {
                resultado = 10;
            }

        } else if (idade >= 36 & idade
                <= 40) {
            if (rep == 1) {
                resultado = 6.5;
            } else if (rep == 2) {
                resultado = 7.0;
            } else if (rep == 3) {
                resultado = 7.5;
            } else if (rep == 4) {
                resultado = 8.0;
            } else if (rep == 5) {
                resultado = 8.5;
            } else if (rep == 6) {
                resultado = 9;
            } else if (rep == 7) {
                resultado = 9.5;
            } else if (rep >= 8) {
                resultado = 10;
            }

        } else if (idade >= 41 & idade
                <= 45) {
            if (rep == 1) {
                resultado = 7.0;
            } else if (rep == 2) {
                resultado = 7.5;
            } else if (rep == 3) {
                resultado = 8.0;
            } else if (rep == 4) {
                resultado = 8.5;
            } else if (rep == 5) {
                resultado = 9;
            } else if (rep == 6) {
                resultado = 9.5;
            } else if (rep >= 7) {
                resultado = 10;
            }

        } else if (idade >= 46 & idade
                <= 50) {
            if (rep == 1) {
                resultado = 7.5;
            } else if (rep == 2) {
                resultado = 8.0;
            } else if (rep == 3) {
                resultado = 8.5;
            } else if (rep == 4) {
                resultado = 9;
            } else if (rep == 5) {
                resultado = 9.5;
            } else if (rep >= 6) {
                resultado = 10;
            }

        } else if (idade
                >= 51) {
            if (rep == 1) {
                resultado = 8.0;
            } else if (rep == 2) {
                resultado = 8.5;
            } else if (rep == 3) {
                resultado = 9;
            } else if (rep == 4) {
                resultado = 9.5;
            } else if (rep >= 5) {
                resultado = 10;
            }

        }

        return resultado;

    }

    public double abdom(int rep, int idade) {
        double resultado = 0;

        if (idade <= 25) {
            if (rep < 24) {
                resultado = 0;
            } else if (rep == 24) {
                resultado = 1;
            } else if (rep == 25) {
                resultado = 1.5;
            } else if (rep == 26) {
                resultado = 2.0;
            } else if (rep == 27) {
                resultado = 2.5;
            } else if (rep == 28) {
                resultado = 3;
            } else if (rep == 30) {
                resultado = 3.5;
            } else if (rep == 32) {
                resultado = 4;
            } else if (rep == 34) {
                resultado = 4.5;
            } else if (rep == 36) {
                resultado = 5;
            } else if (rep == 38) {
                resultado = 5.5;
            } else if (rep == 40) {
                resultado = 6;
            }else if (rep == 42) {
                resultado = 6.5;
            } else if (rep == 44) {
                resultado = 7;
            } else if (rep == 46) {
                resultado = 7.5;
            } else if (rep == 48) {
                resultado = 8;
            }else if (rep == 50) {
                resultado = 8.5;
            } else if (rep == 52) {
                resultado = 9;
            } else if (rep == 53) {
                resultado = 9.5;
            } else if (rep >= 54) {
                resultado = 10;
            }

        } else if (idade >= 26 & idade
                <= 30) {
            if (rep < 23) {
                resultado = 0;
            } else if (rep == 23) {
                resultado = 1;
            } else if (rep == 24) {
                resultado = 1.5;
            } else if (rep == 25) {
                resultado = 2.0;
            } else if (rep == 26) {
                resultado = 2.5;
            } else if (rep == 27) {
                resultado = 3;
            } else if (rep == 28) {
                resultado = 3.5;
            } else if (rep == 30) {
                resultado = 4;
            } else if (rep == 32) {
                resultado = 4.5;
            } else if (rep == 34) {
                resultado = 5;
            } else if (rep == 36) {
                resultado = 5.5;
            } else if (rep == 38) {
                resultado = 6;
            }else if (rep == 40) {
                resultado = 6.5;
            } else if (rep == 42) {
                resultado = 7;
            } else if (rep == 44) {
                resultado = 7.5;
            } else if (rep == 46) {
                resultado = 8;
            }else if (rep == 48) {
                resultado = 8.5;
            } else if (rep == 50) {
                resultado = 9;
            } else if (rep == 52) {
                resultado = 9.5;
            } else if (rep >= 53) {
                resultado = 10;
            }
        } else if (idade >= 31 & idade
                <= 35) {

            if (rep < 22) {
                resultado = 0;
            } else if (rep == 22) {
                resultado = 1;
            } else if (rep == 23) {
                resultado = 1.5;
            } else if (rep == 24) {
                resultado = 2.0;
            } else if (rep == 25) {
                resultado = 2.5;
            } else if (rep == 26) {
                resultado = 3;
            } else if (rep == 27) {
                resultado = 3.5;
            } else if (rep == 28) {
                resultado = 4;
            } else if (rep == 30) {
                resultado = 4.5;
            } else if (rep == 32) {
                resultado = 5;
            } else if (rep == 34) {
                resultado = 5.5;
            } else if (rep == 36) {
                resultado = 6;
            }else if (rep == 38) {
                resultado = 6.5;
            } else if (rep == 40) {
                resultado = 7;
            } else if (rep == 42) {
                resultado = 7.5;
            } else if (rep == 44) {
                resultado = 8;
            }else if (rep == 46) {
                resultado = 8.5;
            } else if (rep == 48) {
                resultado = 9;
            } else if (rep == 50) {
                resultado = 9.5;
            } else if (rep >= 52) {
                resultado = 10;
            }
        } else if (idade >= 36 & idade
                <= 40) {
            if (rep < 20) {
                resultado = 0;
            } else if (rep == 20) {
                resultado = 1;
            } else if (rep == 21) {
                resultado = 1.5;
            } else if (rep == 22) {
                resultado = 2.0;
            } else if (rep == 23) {
                resultado = 2.5;
            } else if (rep == 24) {
                resultado = 3;
            } else if (rep == 25) {
                resultado = 3.5;
            } else if (rep == 26) {
                resultado = 4;
            } else if (rep == 27) {
                resultado = 4.5;
            } else if (rep == 28) {
                resultado = 5;
            } else if (rep == 30) {
                resultado = 5.5;
            } else if (rep == 32) {
                resultado = 6;
            }else if (rep == 34) {
                resultado = 6.5;
            } else if (rep == 36) {
                resultado = 7;
            } else if (rep == 38) {
                resultado = 7.5;
            } else if (rep == 40) {
                resultado = 8;
            }else if (rep == 42) {
                resultado = 8.5;
            } else if (rep == 44) {
                resultado = 9;
            } else if (rep == 46) {
                resultado = 9.5;
            } else if (rep >= 48) {
                resultado = 10;
            }

        } else if (idade >= 41 & idade
                <= 45) {
            if (rep < 19) {
                resultado = 0;
            } else if (rep == 19) {
                resultado = 1;
            } else if (rep == 20) {
                resultado = 1.5;
            } else if (rep == 21) {
                resultado = 2.0;
            } else if (rep == 22) {
                resultado = 2.5;
            } else if (rep == 23) {
                resultado = 3;
            } else if (rep == 24) {
                resultado = 3.5;
            } else if (rep == 25) {
                resultado = 4;
            } else if (rep == 26) {
                resultado = 4.5;
            } else if (rep == 27) {
                resultado = 5;
            } else if (rep == 28) {
                resultado = 5.5;
            } else if (rep == 30) {
                resultado = 6;
            }else if (rep == 32) {
                resultado = 6.5;
            } else if (rep == 34) {
                resultado = 7;
            } else if (rep == 36) {
                resultado = 7.5;
            } else if (rep == 38) {
                resultado = 8;
            }else if (rep == 40) {
                resultado = 8.5;
            } else if (rep == 42) {
                resultado = 9;
            } else if (rep == 44) {
                resultado = 9.5;
            } else if (rep >= 46) {
                resultado = 10;
            }

        } else if (idade >= 46 & idade
                <= 50) {
            if (rep < 18) {
                resultado = 0;
            } else if (rep == 18) {
                resultado = 1;
            } else if (rep == 19) {
                resultado = 1.5;
            } else if (rep == 20) {
                resultado = 2.0;
            } else if (rep == 21) {
                resultado = 2.5;
            } else if (rep == 22) {
                resultado = 3;
            } else if (rep == 23) {
                resultado = 3.5;
            } else if (rep == 24) {
                resultado = 4;
            } else if (rep == 26) {
                resultado = 4.5;
            } else if (rep == 27) {
                resultado = 5;
            } else if (rep == 28) {
                resultado = 5.5;
            } else if (rep == 30) {
                resultado = 6;
            }else if (rep == 32) {
                resultado = 6.5;
            } else if (rep == 34) {
                resultado = 7;
            } else if (rep == 36) {
                resultado = 7.5;
            } else if (rep == 38) {
                resultado = 8;
            }else if (rep == 40) {
                resultado = 8.5;
            } else if (rep == 42) {
                resultado = 9;
            } else if (rep == 43) {
                resultado = 9.5;
            } else if (rep >= 44) {
                resultado = 10;
            }

        } else if (idade
                >= 51) {
            if (rep < 17) {
                resultado = 0;
            } else if (rep == 17) {
                resultado = 1;
            } else if (rep == 18) {
                resultado = 2.0;
            } else if (rep == 19) {
                resultado = 2.5;
            } else if (rep == 20) {
                resultado = 3;
            } else if (rep == 21) {
                resultado = 3.5;
            } else if (rep == 22) {
                resultado = 4;
            } else if (rep == 23) {
                resultado = 4.5;
            } else if (rep == 24) {
                resultado = 5;
            } else if (rep == 25) {
                resultado = 5.5;
            } else if (rep == 26) {
                resultado = 6;
            }else if (rep == 27) {
                resultado = 6.5;
            } else if (rep == 28) {
                resultado = 7;
            } else if (rep == 30) {
                resultado = 7.5;
            } else if (rep == 32) {
                resultado = 8;
            }else if (rep == 34) {
                resultado = 8.5;
            } else if (rep == 36) {
                resultado = 9;
            } else if (rep == 38) {
                resultado = 9.5;
            } else if (rep >= 40) {
                resultado = 10;
            }

        }

        return resultado;

    }
    public double Correr(int metros, int idade) {
        double resultado = 0;

        if (idade <= 25) {
            if (metros < 1900) {
                resultado = 0;
            } else if (metros == 1900) {
                resultado = 1;
            } else if (metros == 1950) {
                resultado = 1.5;
            } else if (metros == 2000) {
                resultado = 2;
            } else if (metros == 2050) {
                resultado = 2.5;
            } else if (metros == 2100) {
                resultado = 3;
            } else if (metros == 2150) {
                resultado = 3.5;
            } else if (metros == 2200) {
                resultado = 4.0;
            } else if (metros == 2250) {
                resultado = 4.5;
            } else if (metros == 2300) {
                resultado = 5.0;
            } else if (metros == 2350) {
                resultado = 5.5;
            } else if (metros == 2400) {
                resultado = 6.0;
            } else if (metros == 2450) {
                resultado = 6.5;
            } else if (metros == 2500) {
                resultado = 7.0;
            } else if (metros == 2550) {
                resultado = 7.5;
            } else if (metros == 2600) {
                resultado = 8.0;
            } else if (metros == 2650) {
                resultado = 8.5;
            } else if (metros == 2700) {
                resultado = 9;
            } else if (metros == 2750) {
                resultado = 9.5;
            } else if (metros >= 2800) {
                resultado = 10;
            }

        } else if (idade >= 26 & idade
                <= 30) {
            if (metros < 1850) {
                resultado = 0;
            } else if (metros == 1850) {
                resultado = 1;
            } else if (metros == 1900) {
                resultado = 1.5;
            } else if (metros == 1950) {
                resultado = 2;
            } else if (metros == 2000) {
                resultado = 2.5;
            } else if (metros == 2050) {
                resultado = 3;
            } else if (metros == 2100) {
                resultado = 3.5;
            } else if (metros == 2150) {
                resultado = 4.0;
            } else if (metros == 2200) {
                resultado = 4.5;
            } else if (metros == 2250) {
                resultado = 5.0;
            } else if (metros == 2300) {
                resultado = 5.5;
            } else if (metros == 2350) {
                resultado = 6.0;
            } else if (metros == 2400) {
                resultado = 6.5;
            } else if (metros == 2450) {
                resultado = 7.0;
            } else if (metros == 2500) {
                resultado = 7.5;
            } else if (metros == 2550) {
                resultado = 8.0;
            } else if (metros == 2600) {
                resultado = 8.5;
            } else if (metros == 2650) {
                resultado = 9;
            } else if (metros == 2700) {
                resultado = 9.5;
            } else if (metros >= 2750) {
                resultado = 10;
            }

        } else if (idade >= 31 & idade
                <= 35) {

            if (metros < 1800) {
                resultado = 0;
            } else if (metros == 1800) {
                resultado = 1;
            } else if (metros == 1850) {
                resultado = 1.5;
            } else if (metros == 1900) {
                resultado = 2;
            } else if (metros == 1950) {
                resultado = 2.5;
            } else if (metros == 2000) {
                resultado = 3;
            } else if (metros == 2050) {
                resultado = 3.5;
            } else if (metros == 2100) {
                resultado = 4.0;
            } else if (metros == 2150) {
                resultado = 4.5;
            } else if (metros == 2200) {
                resultado = 5.0;
            } else if (metros == 2250) {
                resultado = 5.5;
            } else if (metros == 2300) {
                resultado = 6.0;
            } else if (metros == 2350) {
                resultado = 6.5;
            } else if (metros == 2400) {
                resultado = 7.0;
            } else if (metros == 2450) {
                resultado = 7.5;
            } else if (metros == 2500) {
                resultado = 8.0;
            } else if (metros == 2550) {
                resultado = 8.5;
            } else if (metros == 2600) {
                resultado = 9;
            } else if (metros == 2650) {
                resultado = 9.5;
            } else if (metros >= 2700) {
                resultado = 10;
            }

        } else if (idade >= 36 & idade
                <= 40) {
            if (metros < 1700) {
                resultado = 0;
            } else if (metros == 1700) {
                resultado = 1;
            } else if (metros == 1750) {
                resultado = 1.5;
            } else if (metros == 1800) {
                resultado = 2;
            } else if (metros == 1850) {
                resultado = 2.5;
            } else if (metros == 1900) {
                resultado = 3;
            } else if (metros == 1950) {
                resultado = 3.5;
            } else if (metros == 2000) {
                resultado = 4.0;
            } else if (metros == 2050) {
                resultado = 4.5;
            } else if (metros == 2100) {
                resultado = 5.0;
            } else if (metros == 2150) {
                resultado = 5.5;
            } else if (metros == 2200) {
                resultado = 6.0;
            } else if (metros == 2250) {
                resultado = 6.5;
            } else if (metros == 2300) {
                resultado = 7.0;
            } else if (metros == 2350) {
                resultado = 7.5;
            } else if (metros == 2400) {
                resultado = 8.0;
            } else if (metros == 2450) {
                resultado = 8.5;
            } else if (metros == 2500) {
                resultado = 9;
            } else if (metros == 2550) {
                resultado = 9.5;
            } else if (metros >= 2600) {
                resultado = 10;
            }

        } else if (idade >= 41 & idade
                <= 45) {
            if (metros < 1650) {
                resultado = 0;
            } else if (metros == 1650) {
                resultado = 1;
            } else if (metros == 1700) {
                resultado = 1.5;
            } else if (metros == 1750) {
                resultado = 2;
            } else if (metros == 1800) {
                resultado = 2.5;
            } else if (metros == 1850) {
                resultado = 3;
            } else if (metros == 1900) {
                resultado = 3.5;
            } else if (metros == 1950) {
                resultado = 4.0;
            } else if (metros == 2000) {
                resultado = 4.5;
            } else if (metros == 2050) {
                resultado = 5.0;
            } else if (metros == 2100) {
                resultado = 5.5;
            } else if (metros == 2150) {
                resultado = 6.0;
            } else if (metros == 2200) {
                resultado = 6.5;
            } else if (metros == 2250) {
                resultado = 7.0;
            } else if (metros == 2300) {
                resultado = 7.5;
            } else if (metros == 2350) {
                resultado = 8.0;
            } else if (metros == 2400) {
                resultado = 8.5;
            } else if (metros == 2450) {
                resultado = 9;
            } else if (metros == 2500) {
                resultado = 9.5;
            } else if (metros >= 2550) {
                resultado = 10;
            }

        } else if (idade >= 46 & idade
                <= 50) {
            if (metros < 1600) {
                resultado = 0;
            } else if (metros == 1600) {
                resultado = 1;
            } else if (metros == 1650) {
                resultado = 1.5;
            } else if (metros == 1700) {
                resultado = 2;
            } else if (metros == 1750) {
                resultado = 2.5;
            } else if (metros == 1800) {
                resultado = 3;
            } else if (metros == 1850) {
                resultado = 3.5;
            } else if (metros == 1900) {
                resultado = 4.0;
            } else if (metros == 1950) {
                resultado = 4.5;
            } else if (metros == 2000) {
                resultado = 5.0;    
            } else if (metros == 2050) {
                resultado = 5.5;
            } else if (metros == 2100) {
                resultado = 6.0;
            } else if (metros == 2150) {
                resultado = 6.5;
            } else if (metros == 2200) {
                resultado = 7.0;
            } else if (metros == 2250) {
                resultado = 7.5;
            } else if (metros == 2300) {
                resultado = 8.0;
            } else if (metros == 2350) {
                resultado = 8.5;
            } else if (metros == 2400) {
                resultado = 9;
            } else if (metros == 2450) {
                resultado = 9.5;
            } else if (metros >= 2500) {
                resultado = 10;
            }

        } else if (idade
                >= 51) {

            if (metros < 1550) {
                resultado = 0;
            } else if (metros == 1550) {
                resultado = 1;
            } else if (metros == 1600) {
                resultado = 2;
            } else if (metros == 1650) {
                resultado = 2.5;
            } else if (metros == 1700) {
                resultado = 3.0;
            } else if (metros == 1750) {
                resultado = 3.5;
            } else if (metros == 1800) {
                resultado = 4.0;
            } else if (metros == 1950) {
                resultado = 4.5;
            } else if (metros == 2000) {
                resultado = 5.0;
            } else if (metros == 2050) {
                resultado = 5.5;
            } else if (metros == 2100) {
                resultado = 6.0;
            } else if (metros == 2150) {
                resultado = 6.5;
            } else if (metros == 2200) {
                resultado = 7.0;
            } else if (metros == 2250) {
                resultado = 8.5;
            } else if (metros == 2300) {
                resultado = 9.0;
            } else if (metros == 2350) {
                resultado = 9.5;
            } else if (metros >= 2400) {
                resultado = 10;
            }

        } else {
            System.out.println("ERRO NA IDADE!!");
        }

        return resultado;

    }

    public double Apio(int rep, int idade) {
        double resultado = 0;

        if (idade <= 25) {
            if (rep < 8) {
                resultado = 0;
            } else if (rep == 8) {
                resultado = 1;
            } else if (rep == 9) {
                resultado = 1.5;
            } else if (rep == 10) {
                resultado = 2;
            } else if (rep == 11) {
                resultado = 2.5;
            } else if (rep == 12) {
                resultado = 3;
            } else if (rep == 13) {
                resultado = 3.5;
            } else if (rep == 14) {
                resultado = 4.0;
            } else if (rep == 15) {
                resultado = 4.5;
            } else if (rep == 16) {
                resultado = 5.0;
            } else if (rep == 17) {
                resultado = 5.5;
            } else if (rep == 18) {
                resultado = 6.0;
            } else if (rep == 19) {
                resultado = 6.5;
            } else if (rep == 20) {
                resultado = 7.0;
            } else if (rep == 21) {
                resultado = 7.5;
            } else if (rep == 22) {
                resultado = 8.0;
            } else if (rep == 23) {
                resultado = 8.5;
            } else if (rep == 24) {
                resultado = 9;
            } else if (rep == 26) {
                resultado = 9.5;
            } else if (rep >= 27) {
                resultado = 10;
            }

        } else if (idade >= 26 & idade
                <= 30) {

            if (rep < 7) {
                resultado = 0;
            } else if (rep == 7) {
                resultado = 1;
            } else if (rep == 8) {
                resultado = 1.5;
            } else if (rep == 9) {
                resultado = 2;
            } else if (rep == 10) {
                resultado = 2.5;
            } else if (rep == 11) {
                resultado = 3;
            } else if (rep == 12) {
                resultado = 3.5;
            } else if (rep == 13) {
                resultado = 4.0;
            } else if (rep == 14) {
                resultado = 4.5;
            } else if (rep == 15) {
                resultado = 5.0;
            } else if (rep == 16) {
                resultado = 5.5;
            } else if (rep == 17) {
                resultado = 6.0;
            } else if (rep == 18) {
                resultado = 6.5;
            } else if (rep == 19) {
                resultado = 7.0;
            } else if (rep == 20) {
                resultado = 7.5;
            } else if (rep == 21) {
                resultado = 8.0;
            } else if (rep == 22) {
                resultado = 8.5;
            } else if (rep == 23) {
                resultado = 9;
            } else if (rep == 24) {
                resultado = 9.5;
            } else if (rep >= 26) {
                resultado = 10;
            }
        } else if (idade >= 31 & idade
                <= 35) {

            if (rep < 6) {
                resultado = 0;
            } else if (rep == 6) {
                resultado = 1;
            } else if (rep == 7) {
                resultado = 1.5;
            } else if (rep == 8) {
                resultado = 2;
            } else if (rep == 9) {
                resultado = 2.5;
            } else if (rep == 10) {
                resultado = 3;
            } else if (rep == 11) {
                resultado = 3.5;
            } else if (rep == 12) {
                resultado = 4.0;
            } else if (rep == 13) {
                resultado = 4.5;
            } else if (rep == 14) {
                resultado = 5.0;
            } else if (rep == 15) {
                resultado = 5.5;
            } else if (rep == 16) {
                resultado = 6.0;
            } else if (rep == 17) {
                resultado = 6.5;
            } else if (rep == 18) {
                resultado = 7.0;
            } else if (rep == 19) {
                resultado = 7.5;
            } else if (rep == 20) {
                resultado = 8.0;
            } else if (rep == 21) {
                resultado = 8.5;
            } else if (rep == 22) {
                resultado = 9;
            } else if (rep == 23) {
                resultado = 9.5;
            } else if (rep >= 24) {
                resultado = 10;
            }

        } else if (idade >= 36 & idade
                <= 40) {

            if (rep < 4) {
                resultado = 0;
            } else if (rep == 4) {
                resultado = 1;
            } else if (rep == 5) {
                resultado = 1.5;
            } else if (rep == 6) {
                resultado = 2;
            } else if (rep == 7) {
                resultado = 2.5;
            } else if (rep == 8) {
                resultado = 3;
            } else if (rep == 9) {
                resultado = 3.5;
            } else if (rep == 10) {
                resultado = 4.0;
            } else if (rep == 11) {
                resultado = 4.5;
            } else if (rep == 12) {
                resultado = 5.0;
            } else if (rep == 13) {
                resultado = 5.5;
            } else if (rep == 14) {
                resultado = 6.0;
            } else if (rep == 15) {
                resultado = 6.5;
            } else if (rep == 16) {
                resultado = 7.0;
            } else if (rep == 17) {
                resultado = 7.5;
            } else if (rep == 18) {
                resultado = 8.0;
            } else if (rep == 19) {
                resultado = 8.5;
            } else if (rep == 20) {
                resultado = 9;
            } else if (rep == 21) {
                resultado = 9.5;
            } else if (rep >= 22) {
                resultado = 10;
            }

        } else if (idade >= 41 & idade
                <= 45) {

            if (rep < 3) {
                resultado = 0;
            } else if (rep == 3) {
                resultado = 1;
            } else if (rep == 4) {
                resultado = 1.5;
            } else if (rep == 5) {
                resultado = 2;
            } else if (rep == 6) {
                resultado = 2.5;
            } else if (rep == 7) {
                resultado = 3;
            } else if (rep == 8) {
                resultado = 3.5;
            } else if (rep == 9) {
                resultado = 4.0;
            } else if (rep == 10) {
                resultado = 4.5;
            } else if (rep == 11) {
                resultado = 5.0;
            } else if (rep == 12) {
                resultado = 5.5;
            } else if (rep == 13) {
                resultado = 6.0;
            } else if (rep == 14) {
                resultado = 6.5;
            } else if (rep == 15) {
                resultado = 7.0;
            } else if (rep == 16) {
                resultado = 7.5;
            } else if (rep == 17) {
                resultado = 8.0;
            } else if (rep == 18) {
                resultado = 8.5;
            } else if (rep == 19) {
                resultado = 9;
            } else if (rep == 20) {
                resultado = 9.5;
            } else if (rep >= 21) {
                resultado = 10;
            }

        } else if (idade >= 46 & idade
                <= 50) {

            if (idade <= 25) {
                if (rep < 2) {
                    resultado = 0;
                } else if (rep == 2) {
                    resultado = 1;
                } else if (rep == 3) {
                    resultado = 1.5;
                } else if (rep == 4) {
                    resultado = 2;
                } else if (rep == 5) {
                    resultado = 2.5;
                } else if (rep == 6) {
                    resultado = 3;
                } else if (rep == 7) {
                    resultado = 3.5;
                } else if (rep == 8) {
                    resultado = 4.0;
                } else if (rep == 9) {
                    resultado = 4.5;
                } else if (rep == 10) {
                    resultado = 5.0;
                } else if (rep == 11) {
                    resultado = 5.5;
                } else if (rep == 12) {
                    resultado = 6.0;
                } else if (rep == 13) {
                    resultado = 6.5;
                } else if (rep == 14) {
                    resultado = 7.0;
                } else if (rep == 15) {
                    resultado = 7.5;
                } else if (rep == 16) {
                    resultado = 8.0;
                } else if (rep == 17) {
                    resultado = 8.5;
                } else if (rep == 18) {
                    resultado = 9;
                } else if (rep == 19) {
                    resultado = 9.5;
                } else if (rep >= 20) {
                    resultado = 10;
                }
            } else if (idade
                    >= 51) {

                if (rep < 1) {
                    resultado = 0;
                } else if (rep == 1) {
                    resultado = 1;
                } else if (rep == 2) {
                    resultado = 2;
                } else if (rep == 3) {
                    resultado = 2.5;
                } else if (rep == 4) {
                    resultado = 3;
                } else if (rep == 5) {
                    resultado = 3.5;
                } else if (rep == 6) {
                    resultado = 4.0;
                } else if (rep == 7) {
                    resultado = 4.5;
                } else if (rep == 8) {
                    resultado = 5.0;
                } else if (rep == 9) {
                    resultado = 5.5;
                } else if (rep == 10) {
                    resultado = 6.0;
                } else if (rep == 11) {
                    resultado = 6.5;
                } else if (rep == 12) {
                    resultado = 7.0;
                } else if (rep == 13) {
                    resultado = 7.5;
                } else if (rep == 14) {
                    resultado = 8.0;
                } else if (rep == 15) {
                    resultado = 8.5;
                } else if (rep == 16) {
                    resultado = 9;
                } else if (rep == 17) {
                    resultado = 9.5;
                } else if (rep >= 18) {
                    resultado = 10;
                }

            }
        } else {
            System.out.println("ERRO NA IDADE!!");
        }

        return resultado;

    }
}
