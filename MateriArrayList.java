public class MateriArrayList {
    public static void main(String[] args) {
        int[] angka ={10,20,30,40,50}; //inisialisasi array
        String[] nama ={"Indah", "Putri", "Rahman", "Sandro"}; //inisilaisasi array
        
        //mangakses dan menampilakan array
        System.out.println (angka[0]);
        System.out.println (nama[3]);

        //mengubah elemen dalam array 
        angka[2] = 100;
        System.out.println (angka[2]);

        //menghitung panjang array
        System.out.println (angka.length);
        System.out.println (nama.length);

    }

}
    