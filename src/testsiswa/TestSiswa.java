/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsiswa;

/**
 *
 * @author ASUS A455L
 */
public class TestSiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    EncapSiswa siswa = new EncapSiswa();
    siswa.setName("agus");
    siswa.setAge(20);
    siswa.setAddress("Malang");
    
        System.out.println("nama: "+siswa.getName()
        + " alamat "+siswa.getAddress()+ " berumur "+siswa.getAge()
        + " tahun");
    }

    }
    

