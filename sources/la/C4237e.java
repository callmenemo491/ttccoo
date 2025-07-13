package la;

/* renamed from: la.e */
/* loaded from: classes.dex */
public class C4237e {

    /* renamed from: a */
    public final java.lang.Object f17398a;

    /* renamed from: b */
    public final java.lang.Object f17399b;

    /* renamed from: c */
    public final java.lang.Object f17400c;

    /* renamed from: d */
    public final java.lang.Object f17401d;

    /* renamed from: e */
    public final java.lang.Object f17402e;

    /* renamed from: f */
    public final java.lang.Object f17403f;

    /* renamed from: g */
    public final java.lang.Object f17404g;

    /* renamed from: h */
    public final java.lang.Object f17405h;

    /* renamed from: i */
    public final int f17406i;

    public C4237e(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, p056da.InterfaceC1363i0 r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, int r9) {
            r0 = this;
            r0.<init>()
            r0.f17398a = r1
            r0.f17399b = r2
            r0.f17400c = r3
            r0.f17401d = r4
            r0.f17402e = r5
            r0.f17403f = r6
            r0.f17404g = r7
            r0.f17405h = r8
            r0.f17406i = r9
            return
    }

    public C4237e(java.math.BigInteger r2, java.math.BigInteger r3, java.math.BigInteger[] r4, java.math.BigInteger[] r5, java.math.BigInteger r6, java.math.BigInteger r7, int r8) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "v1"
            m9544a(r4, r0)
            java.lang.String r0 = "v2"
            m9544a(r5, r0)
            r1.f17398a = r2
            r1.f17399b = r3
            r2 = 0
            r3 = r4[r2]
            r1.f17400c = r3
            r3 = 1
            r4 = r4[r3]
            r1.f17401d = r4
            r2 = r5[r2]
            r1.f17403f = r2
            r2 = r5[r3]
            r1.f17404g = r2
            r1.f17405h = r6
            r1.f17402e = r7
            r1.f17406i = r8
            return
    }

    /* renamed from: a */
    public static void m9544a(java.math.BigInteger[] r2, java.lang.String r3) {
            if (r2 == 0) goto L11
            int r0 = r2.length
            r1 = 2
            if (r0 != r1) goto L11
            r0 = 0
            r0 = r2[r0]
            if (r0 == 0) goto L11
            r0 = 1
            r2 = r2[r0]
            if (r2 == 0) goto L11
            return
        L11:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "'"
            java.lang.String r1 = "' must consist of exactly 2 (non-null) values"
            java.lang.String r3 = android.support.v4.media.C0145d.m257a(r0, r3, r1)
            r2.<init>(r3)
            throw r2
    }
}
