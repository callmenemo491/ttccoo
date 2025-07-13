package p325s5;

/* renamed from: s5.n */
/* loaded from: classes.dex */
public final class C5974n {

    /* renamed from: a */
    public final int f23068a;

    /* renamed from: b */
    public final p088f4.C2010g1[] f23069b;

    /* renamed from: c */
    public final p325s5.InterfaceC5966f[] f23070c;

    /* renamed from: d */
    public final p088f4.C2034o1 f23071d;

    /* renamed from: e */
    public final java.lang.Object f23072e;

    public C5974n(p088f4.C2010g1[] r1, p325s5.InterfaceC5966f[] r2, p088f4.C2034o1 r3, java.lang.Object r4) {
            r0 = this;
            r0.<init>()
            r0.f23069b = r1
            java.lang.Object r2 = r2.clone()
            s5.f[] r2 = (p325s5.InterfaceC5966f[]) r2
            r0.f23070c = r2
            r0.f23071d = r3
            r0.f23072e = r4
            int r1 = r1.length
            r0.f23068a = r1
            return
    }

    /* renamed from: a */
    public boolean m12441a(p325s5.C5974n r4, int r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            f4.g1[] r1 = r3.f23069b
            r1 = r1[r5]
            f4.g1[] r2 = r4.f23069b
            r2 = r2[r5]
            boolean r1 = p371v5.C6552b0.m13308a(r1, r2)
            if (r1 == 0) goto L21
            s5.f[] r1 = r3.f23070c
            r1 = r1[r5]
            s5.f[] r4 = r4.f23070c
            r4 = r4[r5]
            boolean r4 = p371v5.C6552b0.m13308a(r1, r4)
            if (r4 == 0) goto L21
            r0 = 1
        L21:
            return r0
    }

    /* renamed from: b */
    public boolean m12442b(int r2) {
            r1 = this;
            f4.g1[] r0 = r1.f23069b
            r2 = r0[r2]
            if (r2 == 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            return r2
    }
}
