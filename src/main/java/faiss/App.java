package faiss;

/**
 * Hello world!
 *
 */
public class App 
{
   // static final String ANNOY_LIB_PATH = extractAnnoyBinaries();
    static final String libraryName = System.mapLibraryName("faiss");
    static {
        System.load("/home/sc/a/faiss-java/faiss-master/libfaiss.so");
    }
//    private static String extractAnnoyBinaries() {
//        InputStream faissJni = FaissJni.class.getResourceAsStream("/faiss-master/" + libraryName);
//        try {
//            Path tempFaiss = Files.createTempDirectory("").resolve(libraryName);
//
//            Files.copy(faissJni, tempFaiss);
//            tempFaiss.toFile().deleteOnExit();
//            return tempFaiss.toString();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

    public static void main( String[] args ) {
      System.out.println("Hello World..........");
        FaissJni faissJni = new FaissJni();
        faissJni.Ctor(199);


        System.out.println("Hello World!");
    }

}
