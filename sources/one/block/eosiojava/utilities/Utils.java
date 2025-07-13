package one.block.eosiojava.utilities;

/* loaded from: classes.dex */
public class Utils {
    private Utils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T extends java.io.Serializable> T clone(T r2) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream
            r1.<init>(r0)
            r1.writeObject(r2)
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream
            byte[] r0 = r0.toByteArray()
            r2.<init>(r0)
            java.io.ObjectInputStream r0 = new java.io.ObjectInputStream
            r0.<init>(r2)
            java.lang.Object r2 = r0.readObject()
            java.io.Serializable r2 = (java.io.Serializable) r2
            return r2
    }

    public static p169jb.C3467j getGson(java.lang.String r1) {
            jb.k r0 = new jb.k
            r0.<init>()
            r0.f14961h = r1
            r1 = 0
            r0.f14964k = r1
            jb.j r1 = r0.m7939a()
            return r1
    }
}
