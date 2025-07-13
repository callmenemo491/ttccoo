package p124h7;

/* renamed from: h7.c8 */
/* loaded from: classes.dex */
public final class C2566c8 {

    /* renamed from: a */
    public static final java.lang.ThreadLocal<java.security.SecureRandom> f11415a = null;

    static {
            h7.k7 r0 = new h7.k7
            r1 = 1
            r0.<init>(r1)
            p124h7.C2566c8.f11415a = r0
            return
    }

    /* renamed from: a */
    public static byte[] m6531a(int r1) {
            byte[] r1 = new byte[r1]
            java.lang.ThreadLocal<java.security.SecureRandom> r0 = p124h7.C2566c8.f11415a
            java.lang.Object r0 = r0.get()
            java.security.SecureRandom r0 = (java.security.SecureRandom) r0
            r0.nextBytes(r1)
            return r1
    }
}
