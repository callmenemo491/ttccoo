package p072e7;

/* renamed from: e7.v6 */
/* loaded from: classes.dex */
public final class C1766v6 {
    public C1766v6() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static final int m4462a(int r0, java.lang.Object r1, java.lang.Object r2) {
            e7.u6 r1 = (p072e7.C1757u6) r1
            e7.t6 r2 = (p072e7.C1748t6) r2
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
}
