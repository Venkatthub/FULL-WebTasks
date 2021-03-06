import java.util.*;

public class CityCodes {

	private final String city;
	public int code = 600000;

	public CityCodes() {
		this.city = "CHENNAI";
	}

//	Overriding toString method to get city name when we print object

	@Override
	public String toString() {

		return "City :" + this.city + "<br>" + "Code :";
	}

//	Method contains codes on each local in chennai city
	public Map<String, Integer> chennaiCodes() {

		TreeMap<String, Integer> pinCodes = new TreeMap<>();

		pinCodes.put("abiramapuram", 18);
		pinCodes.put("adambakkam", 88);
		pinCodes.put("adyar", 20);
		pinCodes.put("agaram", 82);
		pinCodes.put("alandur", 16);
		pinCodes.put("alandur north", 32);
		pinCodes.put("alwar tirunagar", 87);
		pinCodes.put("ambattur bazaar", 53);
		pinCodes.put("ambattur h o", 53);
		pinCodes.put("ambattur industrial estat", 58);
		pinCodes.put("ambattur west", 53);
		pinCodes.put("aminijikarai", 29);
		pinCodes.put("anakaputhur", 70);
		pinCodes.put("angappanaicken street", 1);
		pinCodes.put("anna road h o", 2);
		pinCodes.put("annamalaipuram", 28);
		pinCodes.put("annanagar", 40);
		pinCodes.put("annanagar east", 102);
		pinCodes.put("annanagar western extn", 101);
		pinCodes.put("annaroad sourth", 2);
		pinCodes.put("arcot road", 24);
		pinCodes.put("arumbakkam", 106);
		pinCodes.put("ashok nagar", 83);
		pinCodes.put("ashtabujam road", 112);
		pinCodes.put("avadi", 54);
		pinCodes.put("avadi air force quarters", 55);
		pinCodes.put("avadi camp h o", 54);
		pinCodes.put("avadi iaf", 55);
		pinCodes.put("ayanavaram", 23);
		pinCodes.put("ayanavaram rly colony", 23);
		pinCodes.put("besant nagar", 90);
		pinCodes.put("besantnagat south", 90);
		pinCodes.put("bharathipuram", 44);
		pinCodes.put("broadway", 108);
		pinCodes.put("bullion market", 79);
		pinCodes.put("butt road", 16);
		pinCodes.put("c-in-c road", 105);
		pinCodes.put("cathedral", 6);
		pinCodes.put("cemetry road", 21);
		pinCodes.put("central institute of tech", 20);
		pinCodes.put("central leather research", 20);
		pinCodes.put("central station", 3);
		pinCodes.put("central vehicle depot", 55);
		pinCodes.put("central vehicle research", 54);
		pinCodes.put("chamiers road", 18);
		pinCodes.put("chepauk", 5);
		pinCodes.put("chetput h o", 31);
		pinCodes.put("chinnaiah mudali colony", 11);
		pinCodes.put("chintadripeta", 2);
		pinCodes.put("chitlapakkam", 64);
		pinCodes.put("choolai", 112);
		pinCodes.put("choolaimedu", 94);
		pinCodes.put("choolaimedu mdo", 94);
		pinCodes.put("christian college", 59);
		pinCodes.put("chromepet", 44);
		pinCodes.put("crp camp", 65);
		pinCodes.put("d g vaishnav college", 106);
		pinCodes.put("decoster road", 12);
		pinCodes.put("defence officers colony", 97);
		pinCodes.put("dr ambedkarnagar", 3);
		pinCodes.put("edapalayam", 3);
		pinCodes.put("egmore", 8);
		pinCodes.put("egmore high road", 8);
		pinCodes.put("ekkaduthangal", 32);
		pinCodes.put("eldams road", 18);
		pinCodes.put("engineering college directorat", 25);
		pinCodes.put("ennur r s", 57);
		pinCodes.put("ennur thermal station", 57);
		pinCodes.put("ernavur", 57);
		pinCodes.put("flower bazar", 1);
		pinCodes.put("flowers road", 84);
		pinCodes.put("fore shore estate", 28);
		pinCodes.put("fort st george", 9);
		pinCodes.put("ganapathipuram", 59);
		pinCodes.put("gandhi nagar", 20);
		pinCodes.put("ganesh nagar", 88);
		pinCodes.put("gaugadeeswaran koil", 84);
		pinCodes.put("gollawar agraharam road", 21);
		pinCodes.put("gopalapuram", 86);
		pinCodes.put("goudiyamath road", 14);
		pinCodes.put("government estate", 2);
		pinCodes.put("govt stanely hospital", 1);
		pinCodes.put("greams road", 6);
		pinCodes.put("ground training school", 46);
		pinCodes.put("guindy ind estate", 32);
		pinCodes.put("gunidy north", 15);
		pinCodes.put("habibullah road", 17);
		pinCodes.put("harinarayanapuram", 21);
		pinCodes.put("harrington road", 31);
		pinCodes.put("high court buildings", 104);
		pinCodes.put("hindi prachar sabha", 17);
		pinCodes.put("hindustan teleprinters", 32);
		pinCodes.put("i c f colony", 38);
		pinCodes.put("indian inst of technology", 36);
		pinCodes.put("indra nagar", 20);
		pinCodes.put("jaffarkhanpet", 95);
		pinCodes.put("jam bazaar", 14);
		pinCodes.put("jawahar nagar", 82);
		pinCodes.put("k k nagar", 78);
		pinCodes.put("kadirvedu", 66);
		pinCodes.put("kaladipet", 19);
		pinCodes.put("kalignar karunanidhinagar", 78);
		pinCodes.put("kalinga colony", 78);
		pinCodes.put("kalmandapam", 13);
		pinCodes.put("kamarajanagar", 71);
		pinCodes.put("kasimode", 13);
		pinCodes.put("kasturbanagar", 20);
		pinCodes.put("kilpauk", 10);
		pinCodes.put("kilpauk garden colony", 10);
		pinCodes.put("kilpauk medical college", 10);
		pinCodes.put("kilpauk west", 10);
		pinCodes.put("kodambakkam", 24);
		pinCodes.put("kodambakkam west", 24);
		pinCodes.put("kolathur-cpt", 99);
		pinCodes.put("korattur", 80);
		pinCodes.put("korattur r s", 76);
		pinCodes.put("korukkupet", 21);
		pinCodes.put("kosapet", 12);
		pinCodes.put("kothwal market", 1);
		pinCodes.put("kottur gram", 85);
		pinCodes.put("kottur madras", 85);
		pinCodes.put("koyambedu", 107);
		pinCodes.put("krishnampet", 5);
		pinCodes.put("kudlyiruppur", 89);
		pinCodes.put("kumaran nagar", 33);
		pinCodes.put("kunnathur kanchipuram", 69);
		pinCodes.put("lic colony tambaram", 59);
		pinCodes.put("ligods estate", 14);
		pinCodes.put("ligods road", 14);
		pinCodes.put("loyla college", 34);
		pinCodes.put("luz church road", 4);
		pinCodes.put("m p t admn office", 1);
		pinCodes.put("madhavaram", 60);
		pinCodes.put("madhavaram east", 60);
		pinCodes.put("madhavaram milk colony", 51);
		pinCodes.put("madipakkam", 91);
		pinCodes.put("madras air port", 27);
		pinCodes.put("madras electricity system", 2);
		pinCodes.put("madras gpo", 1);
		pinCodes.put("madras medical college", 3);
		pinCodes.put("madras presidency college", 5);
		pinCodes.put("madras race course", 32);
		pinCodes.put("madras university", 5);
		pinCodes.put("mambalam east", 33);
		pinCodes.put("mambalam r s", 33);
		pinCodes.put("manali madras", 68);
		pinCodes.put("manali new town", 103);
		pinCodes.put("mandavalli", 4);
		pinCodes.put("mannady", 1);
		pinCodes.put("mannurpettai", 50);
		pinCodes.put("medavakkam tank road", 10);
		pinCodes.put("mednambedu", 53);
		pinCodes.put("mettupalayam", 33);
		pinCodes.put("minambakkam", 27);
		pinCodes.put("mint buildings", 1);
		pinCodes.put("monegar choultry", 1);
		pinCodes.put("moolakadai", 60);
		pinCodes.put("mpt staff colony", 81);
		pinCodes.put("ms accountant general", 18);
		pinCodes.put("ms vivekanands college", 4);
		pinCodes.put("muthialpet", 1);
		pinCodes.put("mylopore", 4);
		pinCodes.put("naganallur", 61);
		pinCodes.put("naganallur south", 61);
		pinCodes.put("nandanam", 35);
		pinCodes.put("nandanam bazaar", 35);
		pinCodes.put("nanganallur bazaar", 61);
		pinCodes.put("negelkeni", 44);
		pinCodes.put("new avadi road", 10);
		pinCodes.put("nochikuppam colony", 4);
		pinCodes.put("north thyagarayanagar", 17);
		pinCodes.put("nungambakkam", 34);
		pinCodes.put("nungambakkam bazaar", 34);
		pinCodes.put("nungambakkam high road", 34);
		pinCodes.put("offiers trg school", 37);
		pinCodes.put("old college buildings", 6);
		pinCodes.put("orgadam", 53);
		pinCodes.put("padi", 50);
		pinCodes.put("padi south", 50);
		pinCodes.put("padianallur", 52);
		pinCodes.put("pallavaram", 43);
		pinCodes.put("pallavaram north", 43);
		pinCodes.put("pallavaram south", 43);
		pinCodes.put("palvanthangal", 61);
		pinCodes.put("pammal", 75);
		pinCodes.put("panagal park", 17);
		pinCodes.put("panchiappas college hoste", 30);
		pinCodes.put("park town", 3);
		pinCodes.put("parthasarathy koil", 5);
		pinCodes.put("pattabiram", 72);
		pinCodes.put("pattabiram east", 72);
		pinCodes.put("perambur", 11);
		pinCodes.put("perambur barracks", 12);
		pinCodes.put("perambur high road", 12);
		pinCodes.put("perambur north", 11);
		pinCodes.put("perungudi", 96);
		pinCodes.put("police head quarters", 4);
		pinCodes.put("polichalur", 74);
		pinCodes.put("ponniammanmedu", 110);
		pinCodes.put("poonamallee", 56);
		pinCodes.put("poonamallee east", 56);
		pinCodes.put("pozhal", 60);
		pinCodes.put("prithivipakkam", 53);
		pinCodes.put("pudupakkam", 14);
		pinCodes.put("pudupet", 2);
		pinCodes.put("pulianthope", 12);
		pinCodes.put("purasawakkam", 84);
		pinCodes.put("r a puram colony", 28);
		pinCodes.put("radhanagar", 44);
		pinCodes.put("railway car shed complex", 109);
		pinCodes.put("railway colony", 59);
		pinCodes.put("raj bhavan madras raja", 22);
		pinCodes.put("rajah thottam", 82);
		pinCodes.put("rajainagar", 43);
		pinCodes.put("ramakrishnanagar", 28);
		pinCodes.put("rayapuram madras", 13);
		pinCodes.put("rayapuram market", 13);
		pinCodes.put("red hills", 52);
		pinCodes.put("red hills bazaar", 52);
		pinCodes.put("regional engg college", 52);
		pinCodes.put("rengarajapuram", 24);
		pinCodes.put("ripon buildings", 3);
		pinCodes.put("royapettah", 14);
		pinCodes.put("royapettah high road", 4);
		pinCodes.put("saidapet madras", 15);
		pinCodes.put("saidapet west", 15);
		pinCodes.put("saidhapet north", 15);
		pinCodes.put("saligramam", 93);
		pinCodes.put("saligramam south", 93);
		pinCodes.put("santhome", 4);
		pinCodes.put("sastrinagar", 20);
		pinCodes.put("sathyamurthinagar", 62);
		pinCodes.put("selaiyur", 73);
		pinCodes.put("sembiam", 11);
		pinCodes.put("sembier street", 1);
		pinCodes.put("service centre", 31);
		pinCodes.put("seven wells", 1);
		pinCodes.put("shanmugapuram", 19);
		pinCodes.put("shastri bhavan", 6);
		pinCodes.put("shenoynagar", 30);
		pinCodes.put("sidco estate", 98);
		pinCodes.put("sithathur", 74);
		pinCodes.put("solai street", 23);
		pinCodes.put("solavaram", 67);
		pinCodes.put("sowcarpet", 79);
		pinCodes.put("sri ayyappanagar", 111);
		pinCodes.put("srinivasanagar", 63);
		pinCodes.put("st thomas mount h o", 16);
		pinCodes.put("syrahans road", 12);
		pinCodes.put("tambaram east", 59);
		pinCodes.put("tambaram h o", 45);
		pinCodes.put("tambaram i a f", 46);
		pinCodes.put("tambaram sanitorium", 47);
		pinCodes.put("tambaram west", 45);
		pinCodes.put("taramani", 113);
		pinCodes.put("technical teachers trg in", 20);
		pinCodes.put("teynampet", 18);
		pinCodes.put("teynampet south", 18);
		pinCodes.put("teynampet west", 6);
		pinCodes.put("thandarai", 72);
		pinCodes.put("thayagaranagar h o", 17);
		pinCodes.put("theosophical society", 20);
		pinCodes.put("thillaiganganagar", 61);
		pinCodes.put("thyagarayanagar south", 17);
		pinCodes.put("tirumangalam road", 49);
		pinCodes.put("tiruvaluvar nagar", 16);
		pinCodes.put("tiruvanmiyur", 41);
		pinCodes.put("tiruvellikeni", 5);
		pinCodes.put("tiruverkadu", 77);
		pinCodes.put("tiruvottiur central", 19);
		pinCodes.put("tiruvottiyur", 19);
		pinCodes.put("tiruvottiyur north", 19);
		pinCodes.put("tiruvottiyur west", 19);
		pinCodes.put("tondikarpet", 81);
		pinCodes.put("treaning institute", 113);
		pinCodes.put("triplicane south", 14);
		pinCodes.put("usman road", 17);
		pinCodes.put("vadapalani", 26);
		pinCodes.put("vandalur", 48);
		pinCodes.put("velacheri", 42);
		pinCodes.put("venkatesapuram", 12);
		pinCodes.put("vepery", 7);
		pinCodes.put("vijayalakshmipuram", 53);
		pinCodes.put("villivakkam", 49);
		pinCodes.put("villivakkam north", 49);
		pinCodes.put("villivakkam south", 49);
		pinCodes.put("virugambakkam", 92);
		pinCodes.put("virugambakkam bazar", 92);
		pinCodes.put("virugambakkam north", 92);
		pinCodes.put("vyasarpady", 39);
		pinCodes.put("vysarnagar colony", 39);
		pinCodes.put("vysarpady coop ind estate", 39);
		pinCodes.put("wal tax road", 1);
		pinCodes.put("washermanpeta east", 21);
		pinCodes.put("washermanpetta", 21);
		pinCodes.put("west mambalam", 33);
		pinCodes.put("wimconagar", 19);
		pinCodes.put("world university", 31);

		return pinCodes;
	}

}
