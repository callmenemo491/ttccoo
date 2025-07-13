package p421xj;

/* renamed from: xj.a */
/* loaded from: classes.dex */
public class C7085a {

    /* renamed from: a */
    public static final p421xj.InterfaceC7088d f27425a = null;

    static {
            xj.b r0 = new xj.b
            r0.<init>()
            p421xj.C7085a.f27425a = r0
            return
    }

    /* renamed from: a */
    public static byte[] m14188a(java.lang.String r3) {
            int r0 = r3.length()
            int r0 = r0 / 4
            int r0 = r0 * 3
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r1.<init>(r0)
            xj.d r0 = p421xj.C7085a.f27425a     // Catch: java.lang.Exception -> L19
            xj.b r0 = (p421xj.C7086b) r0     // Catch: java.lang.Exception -> L19
            r0.m14190a(r3, r1)     // Catch: java.lang.Exception -> L19
            byte[] r3 = r1.toByteArray()
            return r3
        L19:
            r3 = move-exception
            xj.c r0 = new xj.c
            java.lang.String r1 = "unable to decode base64 string: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r3.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r3)
            throw r0
    }

    /* renamed from: b */
    public static byte[] m14189b(byte[] r4) {
            int r0 = r4.length
            int r1 = r0 + 2
            int r1 = r1 / 3
            int r1 = r1 * 4
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
            xj.d r1 = p421xj.C7085a.f27425a     // Catch: java.lang.Exception -> L19
            xj.b r1 = (p421xj.C7086b) r1     // Catch: java.lang.Exception -> L19
            r3 = 0
            r1.m14191b(r4, r3, r0, r2)     // Catch: java.lang.Exception -> L19
            byte[] r4 = r2.toByteArray()
            return r4
        L19:
            r4 = move-exception
            ri.r r0 = new ri.r
            java.lang.String r1 = "exception encoding base64 string: "
            java.lang.StringBuilder r1 = android.support.v4.media.C0144c.m256a(r1)
            java.lang.String r2 = r4.getMessage()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 1
            r0.<init>(r1, r4, r2)
            throw r0
    }
}
