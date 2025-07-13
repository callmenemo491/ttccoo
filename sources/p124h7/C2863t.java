package p124h7;

/* renamed from: h7.t */
/* loaded from: classes.dex */
public final class C2863t {
    public C2863t() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static final int m7143a(int r0, java.lang.Object r1, java.lang.Object r2) {
            h7.s r1 = (p124h7.C2845s) r1
            h7.r r2 = (p124h7.C2827r) r2
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lb
            goto L19
        Lb:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
            boolean r1 = r0.hasNext()
            if (r1 != 0) goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            java.lang.Object r0 = r0.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getKey()
            r0.getValue()
            r0 = 0
            throw r0
    }

    /* renamed from: b */
    public static final java.lang.Object m7144b(java.lang.Object r1, java.lang.Object r2) {
            h7.s r1 = (p124h7.C2845s) r1
            h7.s r2 = (p124h7.C2845s) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            boolean r0 = r1.f11894Y
            if (r0 != 0) goto L12
            h7.s r1 = r1.m7111a()
        L12:
            r1.m7112c()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L1e
            r1.putAll(r2)
        L1e:
            return r1
    }
}
