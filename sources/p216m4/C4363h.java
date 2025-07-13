package p216m4;

/* renamed from: m4.h */
/* loaded from: classes.dex */
public final class C4363h implements p216m4.InterfaceC4381z {

    /* renamed from: a */
    public final byte[] f17907a;

    public C4363h() {
            r1 = this;
            r1.<init>()
            r0 = 4096(0x1000, float:5.74E-42)
            byte[] r0 = new byte[r0]
            r1.f17907a = r0
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: a */
    public /* synthetic */ int mo5969a(p352u5.InterfaceC6314f r1, int r2, boolean r3) {
            r0 = this;
            int r1 = p216m4.C4380y.m9830a(r0, r1, r2, r3)
            return r1
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: b */
    public int mo5970b(p352u5.InterfaceC6314f r2, int r3, boolean r4, int r5) {
            r1 = this;
            byte[] r5 = r1.f17907a
            int r5 = r5.length
            int r3 = java.lang.Math.min(r5, r3)
            byte[] r5 = r1.f17907a
            r0 = 0
            int r2 = r2.mo6020b(r5, r0, r3)
            r3 = -1
            if (r2 != r3) goto L1a
            if (r4 == 0) goto L14
            return r3
        L14:
            java.io.EOFException r2 = new java.io.EOFException
            r2.<init>()
            throw r2
        L1a:
            return r2
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: c */
    public void mo5971c(long r1, int r3, int r4, int r5, p216m4.InterfaceC4381z.a r6) {
            r0 = this;
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: d */
    public /* synthetic */ void mo5972d(p371v5.C6571u r1, int r2) {
            r0 = this;
            p216m4.C4380y.m9831b(r0, r1, r2)
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: e */
    public void mo5973e(p088f4.C2003e0 r1) {
            r0 = this;
            return
    }

    @Override // p216m4.InterfaceC4381z
    /* renamed from: f */
    public void mo5974f(p371v5.C6571u r1, int r2, int r3) {
            r0 = this;
            int r3 = r1.f25711b
            int r3 = r3 + r2
            r1.m13396F(r3)
            return
    }
}
