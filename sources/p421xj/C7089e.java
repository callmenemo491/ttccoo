package p421xj;

/* renamed from: xj.e */
/* loaded from: classes.dex */
public class C7089e {

    /* renamed from: a */
    public static final p421xj.InterfaceC7088d f27429a = null;

    static {
            hb.h r0 = new hb.h
            r1 = 13
            r0.<init>(r1)
            p421xj.C7089e.f27429a = r0
            return
    }

    /* renamed from: a */
    public static byte[] m14194a(java.lang.String r3) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            xj.d r1 = p421xj.C7089e.f27429a     // Catch: java.lang.Exception -> L11
            hb.h r1 = (p128hb.C3003h) r1     // Catch: java.lang.Exception -> L11
            r1.m7380f(r3, r0)     // Catch: java.lang.Exception -> L11
            byte[] r3 = r0.toByteArray()
            return r3
        L11:
            r3 = move-exception
            xj.c r0 = new xj.c
            java.lang.String r1 = "exception decoding Hex string: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r3.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r3)
            throw r0
    }

    /* renamed from: b */
    public static byte[] m14195b(byte[] r2, int r3, int r4) {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            xj.d r1 = p421xj.C7089e.f27429a     // Catch: java.lang.Exception -> L11
            hb.h r1 = (p128hb.C3003h) r1     // Catch: java.lang.Exception -> L11
            r1.m7382h(r2, r3, r4, r0)     // Catch: java.lang.Exception -> L11
            byte[] r2 = r0.toByteArray()
            return r2
        L11:
            r2 = move-exception
            ri.r r3 = new ri.r
            java.lang.String r4 = "exception encoding Hex string: "
            java.lang.StringBuilder r4 = android.support.v4.media.C0144c.m256a(r4)
            java.lang.String r0 = r2.getMessage()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r0 = 1
            r3.<init>(r4, r2, r0)
            throw r3
    }

    /* renamed from: c */
    public static java.lang.String m14196c(byte[] r2) {
            int r0 = r2.length
            r1 = 0
            byte[] r2 = m14195b(r2, r1, r0)
            java.lang.String r2 = p400wj.C6892e.m13958a(r2)
            return r2
    }
}
