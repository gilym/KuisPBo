
package kuisprakpbo;

import kuisprakpbo.beasiswa.BeasiswaPelajar;
import kuisprakpbo.beasiswa.BeasiswaMahasiswa;

public class Seleksi implements BeasiswaPelajar ,BeasiswaMahasiswa {
    double x,y,z;
    double hasil;

    public Seleksi(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
   
//Pelajar
    @Override
    public double visualpel() {
        x = x *0.2;
        return x;
    }

    @Override
    public double designpel() {
        y= y*0.3;
        return y;
    }

    @Override
    public double kontenpel() {
        z=z*0.5;
        return z;
    }

    @Override
    public double hasilpel() {
        hasil = visualpel()+designpel()+kontenpel();
        return hasil;
    }

    //Mahasiswa
    @Override
    public double kontenmah() {
      x=x*0.6;
      return x;
    }

    @Override
    public double datamah() {
           y= y*0.25;
        return y;
    }

    @Override
    public double problemmah() {
         z=z*0.15;
        return z;
    }

    @Override
    public double hasilmah() {
        hasil= kontenmah()+ datamah()+ problemmah();
        return hasil;
    }
    
}
