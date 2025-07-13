package p026b9;

/* renamed from: b9.t */
/* loaded from: classes.dex */
public final class C0720t {
    /* renamed from: a */
    public static void m2327a(java.lang.Object r2, java.lang.Object r3) {
            if (r2 == 0) goto L21
            if (r3 == 0) goto L5
            return
        L5:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "null value in entry: "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = "=null"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3.<init>(r2)
            throw r3
        L21:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "null key in entry: null="
            java.lang.String r3 = p214m2.C4338p.m9700a(r0, r3)
            r2.<init>(r3)
            throw r2
    }

    /* renamed from: b */
    public static int m2328b(int r2, java.lang.String r3) {
            if (r2 < 0) goto L3
            return r2
        L3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " cannot be negative but was: "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    /* renamed from: c */
    public static void m2329c(boolean r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "no calls to next() since the last call to remove()"
            r1.<init>(r0)
            throw r1
    }

    /* renamed from: d */
    public static <E> java.util.ArrayList<E> m2330d(java.util.Iterator<? extends E> r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            r1 = r3
            b9.b r1 = (p026b9.AbstractC0690b) r1
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L16
            java.lang.Object r1 = r1.next()
            r0.add(r1)
            goto L5
        L16:
            return r0
    }
}
