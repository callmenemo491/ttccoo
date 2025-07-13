package p240nj;

/* renamed from: nj.u */
/* loaded from: classes.dex */
public final class C4863u implements p240nj.InterfaceC4855m {

    /* renamed from: a */
    public final /* synthetic */ p240nj.AbstractC4848f.b f19330a;

    /* renamed from: b */
    public final /* synthetic */ byte f19331b;

    public C4863u(p240nj.AbstractC4848f.b r1, byte r2) {
            r0 = this;
            r0.f19330a = r1
            r0.f19331b = r2
            r0.<init>()
            return
    }

    @Override // p240nj.InterfaceC4855m
    /* renamed from: a */
    public p240nj.InterfaceC4856n mo10945a(p240nj.InterfaceC4856n r14) {
            r13 = this;
            boolean r0 = r14 instanceof p240nj.C4865w
            if (r0 == 0) goto L5
            return r14
        L5:
            nj.w r14 = new nj.w
            r14.<init>()
            nj.f$b r0 = r13.f19330a
            byte r1 = r13.f19331b
            if (r1 != 0) goto L13
            byte[][] r1 = p240nj.C4858p.f19310d
            goto L15
        L13:
            byte[][] r1 = p240nj.C4858p.f19312f
        L15:
            int r2 = r1.length
            int r2 = r2 + 1
            int r2 = r2 >>> 1
            nj.f$b[] r2 = new p240nj.AbstractC4848f.b[r2]
            r3 = 0
            r2[r3] = r0
            int r4 = r1.length
            r5 = 3
        L21:
            if (r5 >= r4) goto L5f
            int r6 = r5 >>> 1
            r7 = r1[r5]
            nj.c r8 = r0.f19286a
            nj.f r8 = r8.mo10881n()
            nj.f$b r8 = (p240nj.AbstractC4848f.b) r8
            nj.f r9 = r0.mo10933n()
            nj.f$b r9 = (p240nj.AbstractC4848f.b) r9
            int r10 = r7.length
            int r10 = r10 + (-1)
            r11 = 0
        L39:
            if (r10 < 0) goto L54
            int r11 = r11 + 1
            r12 = r7[r10]
            if (r12 == 0) goto L51
            nj.f$b r8 = r8.m10946z(r11)
            if (r12 <= 0) goto L49
            r11 = r0
            goto L4a
        L49:
            r11 = r9
        L4a:
            nj.f r8 = r8.mo10920a(r11)
            nj.f$b r8 = (p240nj.AbstractC4848f.b) r8
            r11 = 0
        L51:
            int r10 = r10 + (-1)
            goto L39
        L54:
            if (r11 <= 0) goto L5a
            nj.f$b r8 = r8.m10946z(r11)
        L5a:
            r2[r6] = r8
            int r5 = r5 + 2
            goto L21
        L5f:
            nj.c r0 = r0.f19286a
            r0.m10883p(r2)
            r14.f19332a = r2
            return r14
    }
}
