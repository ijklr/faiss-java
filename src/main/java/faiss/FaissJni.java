package faiss;

/**
 * Created by scheng on 4/9/17.
 */
public class FaissJni {

  public void Ctor(int dim) {
    System.out.println("ctr called");
    cppCtor(dim, 0);
    System.out.println("end........");
  }

  public boolean isTrained() {
    return is_trained();
  }



  // Native cpp  methods
  private native void cppCtor(int dim, int index_type);
  private native boolean is_trained();
  private native void train(int n, final float[] x);
  private native void add(int n, final float[] x);
  private native void addWithIds(int n, final float[] x, final long[] xids);

  private native void search(int n, final float[] x, int k, float[] distances, int[] labels);
  private native void assign (int n, final float[] x, int[] labels, int k);
  private native void reset();
  private native void reconstruct(int key, final float[] recons);
  private native void reconstruct_n(int i0, int ni, float[] recons);
  private native void display();
  private native void compute_residual(final float[] x, float[] residual);
  private native String get_typename();
}
