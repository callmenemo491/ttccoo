package p185k7;

/* renamed from: k7.b7 */
/* loaded from: classes.dex */
public final class C3746b7 {
    public C3746b7() {
            r0 = this;
            r0.<init>()
            return
    }

    /* renamed from: a */
    public static final int m8226a(int r0, java.lang.Object r1, java.lang.Object r2) {
            k7.a7 r1 = (p185k7.C3732a7) r1
            k7.y6 r2 = (p185k7.C4053y6) r2
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
    public static final java.lang.Object m8227b(java.lang.Object r1, java.lang.Object r2) {
            k7.a7 r1 = (p185k7.C3732a7) r1
            k7.a7 r2 = (p185k7.C3732a7) r2
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2c
            boolean r0 = r1.f16456Y
            if (r0 != 0) goto L20
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L1a
            k7.a7 r1 = new k7.a7
            r1.<init>()
            goto L20
        L1a:
            k7.a7 r0 = new k7.a7
            r0.<init>(r1)
            r1 = r0
        L20:
            r1.m8208b()
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2c
            r1.putAll(r2)
        L2c:
            return r1
    }
}
