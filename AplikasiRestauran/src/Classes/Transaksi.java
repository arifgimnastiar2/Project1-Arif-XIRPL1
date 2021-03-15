/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import java.util.ArrayList;
public class Transaksi{
	private String noTransaksi;
	private String namaPemesan;
	private String tanggal;
	private String noMeja;
	private ArrayList<Pesanan> pesanan;
	private double uangBayar;
	private double pajak;
	private double totalBayar;

        //Tambah
        private double biayaService;
        
	public Transaksi(String no_transaksi, String nm_pemesan, String tanggal, String no_meja ){
            this.noTransaksi = no_transaksi;
            this.namaPemesan = nm_pemesan;
            this.tanggal = tanggal;
            this.noMeja = no_meja;
        
            pesanan = new ArrayList<>();
        }
        
	public void tambahPesanan(Pesanan pesanan) {
            this.pesanan.add(pesanan);
        }
        
        //hilangkan dari struktur kelas
      //public Pesanan getPesanan() {return null;}
        
	public ArrayList<Pesanan> getSemuaPesanan() {
            return pesanan;
        }
        
	public double hitungTotalBayar() {return 0;}
	public double Kembalian() {return 0;}
	public void cetakStruk() {}
}
