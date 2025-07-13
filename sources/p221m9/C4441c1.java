package p221m9;

/* renamed from: m9.c1 */
/* loaded from: classes.dex */
public final class C4441c1 implements p221m9.InterfaceC4476o0 {

    /* renamed from: a */
    public final p221m9.InterfaceC4482q0 f18114a;

    /* renamed from: b */
    public final java.lang.String f18115b;

    /* renamed from: c */
    public final java.lang.Object[] f18116c;

    /* renamed from: d */
    public final int f18117d;

    public C4441c1(p221m9.InterfaceC4482q0 r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.f18114a = r4
            r3.f18115b = r5
            r3.f18116c = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
        L13:
            r3.f18117d = r4
            goto L2f
        L16:
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r0 = 13
            r1 = 1
        L1b:
            int r2 = r1 + 1
            char r1 = r5.charAt(r1)
            if (r1 < r6) goto L2b
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r0
            r4 = r4 | r1
            int r0 = r0 + 13
            r1 = r2
            goto L1b
        L2b:
            int r5 = r1 << r0
            r4 = r4 | r5
            goto L13
        L2f:
            return
    }

    @Override // p221m9.InterfaceC4476o0
    /* renamed from: a */
    public int mo9912a() {
            r2 = this;
            int r0 = r2.f18117d
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            goto L8
        L7:
            r1 = 2
        L8:
            return r1
    }

    @Override // p221m9.InterfaceC4476o0
    /* renamed from: b */
    public boolean mo9913b() {
            r2 = this;
            int r0 = r2.f18117d
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // p221m9.InterfaceC4476o0
    /* renamed from: c */
    public p221m9.InterfaceC4482q0 mo9914c() {
            r1 = this;
            m9.q0 r0 = r1.f18114a
            return r0
    }
}
