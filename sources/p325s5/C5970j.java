package p325s5;

/* renamed from: s5.j */
/* loaded from: classes.dex */
public final class C5970j {

    /* renamed from: a */
    public final p325s5.InterfaceC5969i[] f23010a;

    /* renamed from: b */
    public int f23011b;

    public C5970j(p325s5.InterfaceC5969i... r1) {
            r0 = this;
            r0.<init>()
            r0.f23010a = r1
            int r1 = r1.length
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r3 = 1
            return r3
        L4:
            if (r3 == 0) goto L1a
            java.lang.Class<s5.j> r0 = p325s5.C5970j.class
            java.lang.Class r1 = r3.getClass()
            if (r0 == r1) goto Lf
            goto L1a
        Lf:
            s5.j r3 = (p325s5.C5970j) r3
            s5.i[] r0 = r2.f23010a
            s5.i[] r3 = r3.f23010a
            boolean r3 = java.util.Arrays.equals(r0, r3)
            return r3
        L1a:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            int r0 = r2.f23011b
            if (r0 != 0) goto Lf
            r0 = 527(0x20f, float:7.38E-43)
            s5.i[] r1 = r2.f23010a
            int r1 = java.util.Arrays.hashCode(r1)
            int r0 = r0 + r1
            r2.f23011b = r0
        Lf:
            int r0 = r2.f23011b
            return r0
    }
}
