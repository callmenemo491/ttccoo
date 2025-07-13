package p285q5;

/* renamed from: q5.b */
/* loaded from: classes.dex */
public final class C5577b implements p143i5.InterfaceC3082f {

    /* renamed from: Z */
    public static final p285q5.C5577b f21726Z = null;

    /* renamed from: Y */
    public final java.util.List<p143i5.C3077a> f21727Y;

    static {
            q5.b r0 = new q5.b
            r0.<init>()
            p285q5.C5577b.f21726Z = r0
            return
    }

    public C5577b() {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.f21727Y = r0
            return
    }

    public C5577b(p143i5.C3077a r1) {
            r0 = this;
            r0.<init>()
            java.util.List r1 = java.util.Collections.singletonList(r1)
            r0.f21727Y = r1
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8
            r4 = 0
            goto L9
        L8:
            r4 = -1
        L9:
            return r4
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r3) {
            r2 = this;
            if (r3 != 0) goto L4
            r3 = 1
            goto L5
        L4:
            r3 = 0
        L5:
            p371v5.C6549a.m13288b(r3)
            r0 = 0
            return r0
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List<p143i5.C3077a> mo7539h(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 < 0) goto L9
            java.util.List<i5.a> r4 = r3.f21727Y
            goto Ld
        L9:
            java.util.List r4 = java.util.Collections.emptyList()
        Ld:
            return r4
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: k */
    public int mo7540k() {
            r1 = this;
            r0 = 1
            return r0
    }
}
