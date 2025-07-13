package p069e4;

/* renamed from: e4.a */
/* loaded from: classes.dex */
public final class C1515a {

    /* renamed from: a */
    public static android.util.SparseArray<p335t3.EnumC6151d> f7362a;

    /* renamed from: b */
    public static java.util.HashMap<p335t3.EnumC6151d, java.lang.Integer> f7363b;

    static {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            p069e4.C1515a.f7362a = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            p069e4.C1515a.f7363b = r0
            t3.d r1 = p335t3.EnumC6151d.f23742Y
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<t3.d, java.lang.Integer> r0 = p069e4.C1515a.f7363b
            t3.d r1 = p335t3.EnumC6151d.f23743Z
            r2 = 1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<t3.d, java.lang.Integer> r0 = p069e4.C1515a.f7363b
            t3.d r1 = p335t3.EnumC6151d.f23744a0
            r2 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            java.util.HashMap<t3.d, java.lang.Integer> r0 = p069e4.C1515a.f7363b
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L58
            java.lang.Object r1 = r0.next()
            t3.d r1 = (p335t3.EnumC6151d) r1
            android.util.SparseArray<t3.d> r2 = p069e4.C1515a.f7362a
            java.util.HashMap<t3.d, java.lang.Integer> r3 = p069e4.C1515a.f7363b
            java.lang.Object r3 = r3.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2.append(r3, r1)
            goto L3a
        L58:
            return
    }

    /* renamed from: a */
    public static int m4103a(p335t3.EnumC6151d r3) {
            java.util.HashMap<t3.d, java.lang.Integer> r0 = p069e4.C1515a.f7363b
            java.lang.Object r0 = r0.get(r3)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r3 = r0.intValue()
            return r3
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "PriorityMapping is missing known Priority value "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* renamed from: b */
    public static p335t3.EnumC6151d m4104b(int r2) {
            android.util.SparseArray<t3.d> r0 = p069e4.C1515a.f7362a
            java.lang.Object r0 = r0.get(r2)
            t3.d r0 = (p335t3.EnumC6151d) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unknown Priority for value "
            java.lang.String r2 = android.support.v4.media.C0142a.m254a(r1, r2)
            r0.<init>(r2)
            throw r0
    }
}
