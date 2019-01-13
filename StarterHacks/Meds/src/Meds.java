import java.util.ArrayList;
import java.util.Arrays;

public class Meds {
//----------------------	
	static class Date {
		int year;
		int month;
		int day;

		Date(int month, int day, int year) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
//----------------------	
	
	static class Prescription {
		
		String nameOfDrug;
		Date expDate;
		Date refillDate;
		int dosageInMg;
		int numOfDoses;
		ArrayList<Integer> timesOfDoses = new ArrayList<Integer>();
		
		Prescription(String nameOfDrug, Date expDate, Date refillDate, int dosageInMg, int numOfDoses, ArrayList<Integer> timesOfDoses) {
			this.nameOfDrug = nameOfDrug;
			this.expDate = expDate;
			this.refillDate = refillDate;
			this.dosageInMg = dosageInMg;
			this.numOfDoses = numOfDoses;
			this.timesOfDoses = timesOfDoses;
		}	
	}

	//----------------------	
	
	public static void addPrescription(ArrayList<Prescription> currrentPrescriptions, String nameOfDrug, Date expDate, Date refillDate, int dosageInMg, int numOfDoses, ArrayList<Integer> timesOfDoses) {
		Prescription newPrescription = new Prescription(nameOfDrug, expDate, refillDate, dosageInMg, numOfDoses, timesOfDoses);
		
		currrentPrescriptions.add(newPrescription);
	}
	
	//----------------------	
	
	public static void removePrescription(ArrayList<Prescription> currrentPrescriptions, String nameOfPrescriptionDelete) {
		for(int i = 0; i < currrentPrescriptions.size(); i++){
			if(currrentPrescriptions.get(i).nameOfDrug.equals(nameOfPrescriptionDelete)){
				currrentPrescriptions.remove(i);
				break;
			}
		}
	}
	
	
	
	
	
	
	public static void main(String args[]){
//Test 1---------------------------	
	
//		Date test1 = new Date(1,2,3);
//		Date test2 = new Date(4,5,6);
//		
//		ArrayList<Integer> timesOfDoses = new ArrayList<Integer>(Arrays.asList(1,2,3));
//
//		Prescription test3 = new Prescription("Drug",test1,test2,20,3,timesOfDoses);
//		System.out.println(test3.nameOfDrug);
//		System.out.println(test3.expDate.month + "/" + test3.expDate.day + "/" + test3.expDate.year);
//		System.out.println(test3.refillDate.month + "/" + test3.refillDate.day + "/" + test3.refillDate.year);
//		System.out.println(test3.dosageInMg);
//		System.out.println(test3.numOfDoses);
//		
//		for (int i=0; i<test3.numOfDoses; i++) {
//			System.out.println(test3.timesOfDoses.get(i));
//		}
		
//Test 1 End ------------------------
		
//		ArrayList<Prescription> list = new ArrayList<Prescription>();
		
//First Item
//		Date date1 = new Date(1,1,1);
//		Date date2 = new Date(2,2,3);
//		ArrayList<Integer> timesOfDoses = new ArrayList<Integer>(Arrays.asList(3,3,3));
//			
//		addPrescription(list, "Drug",date1,date2,20,3,timesOfDoses);
//		
//Second Item
//		Date date1x = new Date(4,5,6);
//		Date date2x = new Date(7,8,9);
//		ArrayList<Integer> timesOfDosesx = new ArrayList<Integer>(Arrays.asList(3,3,3));
//		
//	
//		addPrescription(list, "Meth",date1x,date2x,17,38,timesOfDosesx);
		//-------------------
		
//		removePrescription(list, "Drug");
//		
//
//		System.out.println(list.get(1).dosageInMg);
//		}
}
