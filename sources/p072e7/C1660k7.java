package p072e7;

/* renamed from: e7.k7 */
/* loaded from: classes.dex */
public final class C1660k7 implements p072e7.InterfaceC1793y6 {

    /* renamed from: a */
    public final p072e7.InterfaceC1560a7 f7676a;

    /* renamed from: b */
    public final java.lang.String f7677b;

    /* renamed from: c */
    public final java.lang.Object[] f7678c;

    /* renamed from: d */
    public final int f7679d;

    public C1660k7(p072e7.InterfaceC1560a7 r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.f7676a = r4
            r3.f7677b = r5
            r3.f7678c = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.f7679d = r4
            return
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
            r3.f7679d = r4
            return
    }

    @Override // p072e7.InterfaceC1793y6
    /* renamed from: a */
    public final p072e7.InterfaceC1560a7 mo4317a() {
            r1 = this;
            e7.a7 r0 = r1.f7676a
            return r0
    }

    @Override // p072e7.InterfaceC1793y6
    /* renamed from: b */
    public final boolean mo4318b() {
            r2 = this;
            int r0 = r2.f7679d
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // p072e7.InterfaceC1793y6
    /* renamed from: c */
    public final int mo4319c() {
            r2 = this;
            int r0 = r2.f7679d
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            return r1
        L7:
            r0 = 2
            return r0
    }
}
