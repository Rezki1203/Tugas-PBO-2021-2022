class Kecoa {
	private static String jenis_unggas = "Kecoa" ;
	
	private static int jumlah_kaki= 4;
	
	public static String getJenisUnggas(){
		return jenis_unggas;
		}
		
	public static int getJumlahKaki(){
		return jumlah_kaki;
		}
		
	private static void bersuara(){
		System.out.println("Aku bersuara");
		}
		
	private static void berlari(){
		System.out.println("Aku berlari");
		}
		
	public static void main(String [] args){
		System.out.println(String.format("jenis unggas: %s",getJenisUnggas()));
		System.out.println(String.format("jumlah kaki: %s",getJumlahKaki()));
		
		bersuara();
		berlari();
		
	}
}	
