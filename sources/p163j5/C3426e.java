package p163j5;

/* renamed from: j5.e */
/* loaded from: classes.dex */
public final class C3426e implements p143i5.InterfaceC3082f {

    /* renamed from: Y */
    public final /* synthetic */ int f14870Y;

    /* renamed from: Z */
    public final java.util.List<p143i5.C3077a> f14871Z;

    public C3426e(java.util.List r2, int r3) {
            r1 = this;
            r1.f14870Y = r3
            r0 = 1
            if (r3 == r0) goto L21
            r0 = 2
            if (r3 == r0) goto L1b
            r0 = 3
            if (r3 == r0) goto L11
            r1.<init>()
            r1.f14871Z = r2
            return
        L11:
            r1.<init>()
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f14871Z = r2
            return
        L1b:
            r1.<init>()
            r1.f14871Z = r2
            return
        L21:
            r1.<init>()
            r1.f14871Z = r2
            return
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: e */
    public int mo7537e(long r6) {
            r5 = this;
            int r0 = r5.f14870Y
            r1 = -1
            r2 = 0
            r3 = 0
            switch(r0) {
                case 0: goto Lb;
                case 1: goto La;
                case 2: goto La;
                default: goto L9;
            }
        L9:
            goto L11
        La:
            return r1
        Lb:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L10
            r1 = 0
        L10:
            return r1
        L11:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 >= 0) goto L16
            r1 = 0
        L16:
            return r1
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: g */
    public long mo7538g(int r6) {
            r5 = this;
            int r0 = r5.f14870Y
            r1 = 0
            r2 = 1
            r3 = 0
            switch(r0) {
                case 0: goto Lb;
                case 1: goto La;
                case 2: goto La;
                default: goto L9;
            }
        L9:
            goto L12
        La:
            return r3
        Lb:
            if (r6 != 0) goto Le
            r1 = 1
        Le:
            p371v5.C6549a.m13288b(r1)
            return r3
        L12:
            if (r6 != 0) goto L15
            r1 = 1
        L15:
            p371v5.C6549a.m13288b(r1)
            return r3
    }

    @Override // p143i5.InterfaceC3082f
    /* renamed from: h */
    public java.util.List mo7539h(long r4) {
            r3 = this;
            int r0 = r3.f14870Y
            r1 = 0
            switch(r0) {
                case 0: goto Le;
                case 1: goto Lb;
                case 2: goto L8;
                default: goto L7;
            }
        L7:
            goto L1a
        L8:
            java.util.List<i5.a> r4 = r3.f14871Z
            return r4
        Lb:
            java.util.List<i5.a> r4 = r3.f14871Z
            return r4
        Le:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L15
            java.util.List<i5.a> r4 = r3.f14871Z
            goto L19
        L15:
            java.util.List r4 = java.util.Collections.emptyList()
        L19:
            return r4
        L1a:
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            java.util.List<i5.a> r4 = r3.f14871Z
            goto L25
        L21:
            java.util.List r4 = java.util.Collections.emptyList()
        L25:
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
