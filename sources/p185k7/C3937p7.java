package p185k7;

/* renamed from: k7.p7 */
/* loaded from: classes.dex */
public final class C3937p7 implements p185k7.InterfaceC3774d7 {

    /* renamed from: a */
    public final p185k7.InterfaceC3802f7 f16831a;

    /* renamed from: b */
    public final java.lang.String f16832b;

    /* renamed from: c */
    public final java.lang.Object[] f16833c;

    /* renamed from: d */
    public final int f16834d;

    public C3937p7(p185k7.InterfaceC3802f7 r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.<init>()
            r3.f16831a = r4
            r3.f16832b = r5
            r3.f16833c = r6
            r4 = 0
            char r4 = r5.charAt(r4)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 >= r6) goto L16
            r3.f16834d = r4
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
            r3.f16834d = r4
            return
    }

    @Override // p185k7.InterfaceC3774d7
    /* renamed from: a */
    public final p185k7.InterfaceC3802f7 mo8209a() {
            r1 = this;
            k7.f7 r0 = r1.f16831a
            return r0
    }

    @Override // p185k7.InterfaceC3774d7
    /* renamed from: b */
    public final boolean mo8210b() {
            r2 = this;
            int r0 = r2.f16834d
            r1 = 2
            r0 = r0 & r1
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // p185k7.InterfaceC3774d7
    /* renamed from: c */
    public final int mo8211c() {
            r2 = this;
            int r0 = r2.f16834d
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            return r1
        L7:
            r0 = 2
            return r0
    }
}
