package p411x9;

/* renamed from: x9.l */
/* loaded from: classes.dex */
public final class C6993l {

    /* renamed from: a */
    public static final p306r6.C5797a f27287a = null;

    static {
            r6.a r0 = new r6.a
            r1 = 0
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.String r2 = "GetTokenResultFactory"
            r0.<init>(r2, r1)
            p411x9.C6993l.f27287a = r0
            return
    }

    /* renamed from: a */
    public static p375v9.C6616p m14141a(java.lang.String r5) {
            java.util.Map r0 = p411x9.C6994m.m14143b(r5)     // Catch: p124h7.C2638g8 -> L5
            goto L1b
        L5:
            r0 = move-exception
            r6.a r1 = p411x9.C6993l.f27287a
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = r1.f22479a
            java.lang.String r4 = "Error parsing token claims"
            java.lang.String r1 = r1.m12162c(r4, r2)
            android.util.Log.e(r3, r1, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
        L1b:
            v9.p r1 = new v9.p
            r1.<init>(r5, r0)
            return r1
    }
}
