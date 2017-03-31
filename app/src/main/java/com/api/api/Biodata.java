package com.api.api;


public class Biodata extends Koneksi {

    String URL = "http://tugasapi.96.lt/sekolah.php";
    String url = "";
    String response = "";

    public String tampilBiodata() {
        try {
            url = URL + "?tampil=tampilkan";
            System.out.println("URL Tampil Biodata: " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }



    public String inserBiodata(String nama, String alamat) {
        nama=nama.replace(" ","%20");
        alamat=alamat.replace(" ","%20");

        try {
            url = URL + "?tampil=insert&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String getBiodataById(int id) {
        try {
            url = URL + "?tampil=get_biodata_by_id&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String updateBiodata(String id, String nama, String alamat) {
        nama=nama.replace(" ","%20");
        alamat=alamat.replace(" ","%20");
        try {
            url = URL + "?tampil=update&id=" + id + "&nama=" + nama + "&alamat=" + alamat;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }

    public String deleteBiodata(int id) {
        try {
            url = URL + "?tampil=delete&id=" + id;
            System.out.println("URL Insert Biodata : " + url);
            response = call(url);
        } catch (Exception e) {
        }
        return response;
    }
}